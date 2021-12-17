// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerPlayer extends Container
{
    public /* synthetic */ IInventory craftResult;
    public /* synthetic */ boolean isLocalWorld;
    private final /* synthetic */ EntityPlayer thePlayer;
    public /* synthetic */ InventoryCrafting craftMatrix;
    private static final /* synthetic */ int[] lIIlIlIlIllIll;
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIIllIIllllIlIIllIII) {
        return ContainerPlayer.lIIlIlIlIllIll[7] != 0;
    }
    
    @Override
    public boolean canMergeSlot(final ItemStack lllllllllllllIIllIIllllIIllllIll, final Slot lllllllllllllIIllIIllllIIllllIlI) {
        if (llIlIIIIllIIllI(lllllllllllllIIllIIllllIIllllIlI.inventory, this.craftResult) && llIlIIIIllIIIlI(super.canMergeSlot(lllllllllllllIIllIIllllIIllllIll, lllllllllllllIIllIIllllIIllllIlI) ? 1 : 0)) {
            return ContainerPlayer.lIIlIlIlIllIll[7] != 0;
        }
        return ContainerPlayer.lIIlIlIlIllIll[1] != 0;
    }
    
    private static boolean llIlIIIIllIIlIl(final int lllllllllllllIIllIIllllIIlllIlll, final int lllllllllllllIIllIIllllIIlllIllI) {
        return lllllllllllllIIllIIllllIIlllIlll == lllllllllllllIIllIIllllIIlllIllI;
    }
    
    private static boolean llIlIIIIllIIIlI(final int lllllllllllllIIllIIllllIIllIIllI) {
        return lllllllllllllIIllIIllllIIllIIllI != 0;
    }
    
    private static boolean llIlIIIIllIIllI(final Object lllllllllllllIIllIIllllIIllIlIll, final Object lllllllllllllIIllIIllllIIllIlIlI) {
        return lllllllllllllIIllIIllllIIllIlIll != lllllllllllllIIllIIllllIIllIlIlI;
    }
    
    private static boolean llIlIIIIllIIIIl(final Object lllllllllllllIIllIIllllIIllIlIII) {
        return lllllllllllllIIllIIllllIIllIlIII != null;
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIIllIIllllIlIIIlIII, final int lllllllllllllIIllIIllllIlIIIlllI) {
        ItemStack lllllllllllllIIllIIllllIlIIIllIl = null;
        final Slot lllllllllllllIIllIIllllIlIIIllII = this.inventorySlots.get(lllllllllllllIIllIIllllIlIIIlllI);
        if (llIlIIIIllIIIIl(lllllllllllllIIllIIllllIlIIIllII) && llIlIIIIllIIIlI(lllllllllllllIIllIIllllIlIIIllII.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIIllIIllllIlIIIlIll = lllllllllllllIIllIIllllIlIIIllII.getStack();
            lllllllllllllIIllIIllllIlIIIllIl = lllllllllllllIIllIIllllIlIIIlIll.copy();
            if (llIlIIIIllIIIll(lllllllllllllIIllIIllllIlIIIlllI)) {
                if (llIlIIIIllIIIll(this.mergeItemStack(lllllllllllllIIllIIllllIlIIIlIll, ContainerPlayer.lIIlIlIlIllIll[10], ContainerPlayer.lIIlIlIlIllIll[14], (boolean)(ContainerPlayer.lIIlIlIlIllIll[7] != 0)) ? 1 : 0)) {
                    return null;
                }
                lllllllllllllIIllIIllllIlIIIllII.onSlotChange(lllllllllllllIIllIIllllIlIIIlIll, lllllllllllllIIllIIllllIlIIIllIl);
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            else if (llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[7]) && llIlIIIIllIIlII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[15])) {
                if (llIlIIIIllIIIll(this.mergeItemStack(lllllllllllllIIllIIllllIlIIIlIll, ContainerPlayer.lIIlIlIlIllIll[10], ContainerPlayer.lIIlIlIlIllIll[14], (boolean)(ContainerPlayer.lIIlIlIlIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[15]) && llIlIIIIllIIlII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[10])) {
                if (llIlIIIIllIIIll(this.mergeItemStack(lllllllllllllIIllIIllllIlIIIlIll, ContainerPlayer.lIIlIlIlIllIll[10], ContainerPlayer.lIIlIlIlIllIll[14], (boolean)(ContainerPlayer.lIIlIlIlIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIlIIIIllIIIlI((lllllllllllllIIllIIllllIlIIIllIl.getItem() instanceof ItemArmor) ? 1 : 0) && llIlIIIIllIIIll(this.inventorySlots.get(ContainerPlayer.lIIlIlIlIllIll[15] + ((ItemArmor)lllllllllllllIIllIIllllIlIIIllIl.getItem()).armorType).getHasStack() ? 1 : 0)) {
                final int lllllllllllllIIllIIllllIlIIIlIlI = ContainerPlayer.lIIlIlIlIllIll[15] + ((ItemArmor)lllllllllllllIIllIIllllIlIIIllIl.getItem()).armorType;
                if (llIlIIIIllIIIll(this.mergeItemStack(lllllllllllllIIllIIllllIlIIIlIll, lllllllllllllIIllIIllllIlIIIlIlI, lllllllllllllIIllIIllllIlIIIlIlI + ContainerPlayer.lIIlIlIlIllIll[7], (boolean)(ContainerPlayer.lIIlIlIlIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[10]) && llIlIIIIllIIlII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[3])) {
                if (llIlIIIIllIIIll(this.mergeItemStack(lllllllllllllIIllIIllllIlIIIlIll, ContainerPlayer.lIIlIlIlIllIll[3], ContainerPlayer.lIIlIlIlIllIll[14], (boolean)(ContainerPlayer.lIIlIlIlIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[3]) && llIlIIIIllIIlII(lllllllllllllIIllIIllllIlIIIlllI, ContainerPlayer.lIIlIlIlIllIll[14])) {
                if (llIlIIIIllIIIll(this.mergeItemStack(lllllllllllllIIllIIllllIlIIIlIll, ContainerPlayer.lIIlIlIlIllIll[10], ContainerPlayer.lIIlIlIlIllIll[3], (boolean)(ContainerPlayer.lIIlIlIlIllIll[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIlIIIIllIIIll(this.mergeItemStack(lllllllllllllIIllIIllllIlIIIlIll, ContainerPlayer.lIIlIlIlIllIll[10], ContainerPlayer.lIIlIlIlIllIll[14], (boolean)(ContainerPlayer.lIIlIlIlIllIll[1] != 0)) ? 1 : 0)) {
                return null;
            }
            if (llIlIIIIllIIIll(lllllllllllllIIllIIllllIlIIIlIll.stackSize)) {
                lllllllllllllIIllIIllllIlIIIllII.putStack(null);
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIIllllIlIIIllII.onSlotChanged();
            }
            if (llIlIIIIllIIlIl(lllllllllllllIIllIIllllIlIIIlIll.stackSize, lllllllllllllIIllIIllllIlIIIllIl.stackSize)) {
                return null;
            }
            lllllllllllllIIllIIllllIlIIIllII.onPickupFromSlot(lllllllllllllIIllIIllllIlIIIlIII, lllllllllllllIIllIIllllIlIIIlIll);
        }
        return lllllllllllllIIllIIllllIlIIIllIl;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer lllllllllllllIIllIIllllIlIlIIIII) {
        super.onContainerClosed(lllllllllllllIIllIIllllIlIlIIIII);
        int lllllllllllllIIllIIllllIlIIlllll = ContainerPlayer.lIIlIlIlIllIll[1];
        "".length();
        if (-(0xAC ^ 0xA9) >= 0) {
            return;
        }
        while (!llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIIlllll, ContainerPlayer.lIIlIlIlIllIll[9])) {
            final ItemStack lllllllllllllIIllIIllllIlIIllllI = this.craftMatrix.removeStackFromSlot(lllllllllllllIIllIIllllIlIIlllll);
            if (llIlIIIIllIIIIl(lllllllllllllIIllIIllllIlIIllllI)) {
                lllllllllllllIIllIIllllIlIlIIIII.dropPlayerItemWithRandomChoice(lllllllllllllIIllIIllllIlIIllllI, (boolean)(ContainerPlayer.lIIlIlIlIllIll[1] != 0));
                "".length();
            }
            ++lllllllllllllIIllIIllllIlIIlllll;
        }
        this.craftResult.setInventorySlotContents(ContainerPlayer.lIIlIlIlIllIll[1], null);
    }
    
    static {
        llIlIIIIlIlllll();
    }
    
    private static boolean llIlIIIIllIIIII(final int lllllllllllllIIllIIllllIIlllIIll, final int lllllllllllllIIllIIllllIIlllIIlI) {
        return lllllllllllllIIllIIllllIIlllIIll >= lllllllllllllIIllIIllllIIlllIIlI;
    }
    
    private static boolean llIlIIIIllIIlII(final int lllllllllllllIIllIIllllIIllIllll, final int lllllllllllllIIllIIllllIIllIlllI) {
        return lllllllllllllIIllIIllllIIllIllll < lllllllllllllIIllIIllllIIllIlllI;
    }
    
    public ContainerPlayer(final InventoryPlayer lllllllllllllIIllIIllllIlIlllIIl, final boolean lllllllllllllIIllIIllllIlIlllIII, final EntityPlayer lllllllllllllIIllIIllllIlIlIllII) {
        this.craftMatrix = new InventoryCrafting(this, ContainerPlayer.lIIlIlIlIllIll[0], ContainerPlayer.lIIlIlIlIllIll[0]);
        this.craftResult = new InventoryCraftResult();
        this.isLocalWorld = lllllllllllllIIllIIllllIlIlllIII;
        this.thePlayer = lllllllllllllIIllIIllllIlIlIllII;
        this.addSlotToContainer(new SlotCrafting(lllllllllllllIIllIIllllIlIlllIIl.player, this.craftMatrix, this.craftResult, ContainerPlayer.lIIlIlIlIllIll[1], ContainerPlayer.lIIlIlIlIllIll[2], ContainerPlayer.lIIlIlIlIllIll[3]));
        "".length();
        int lllllllllllllIIllIIllllIlIllIllI = ContainerPlayer.lIIlIlIlIllIll[1];
        "".length();
        if (-" ".length() == " ".length()) {
            throw null;
        }
        while (!llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIllIllI, ContainerPlayer.lIIlIlIlIllIll[0])) {
            int lllllllllllllIIllIIllllIlIllIlIl = ContainerPlayer.lIIlIlIlIllIll[1];
            "".length();
            if (-(0x3 ^ 0x6) >= 0) {
                throw null;
            }
            while (!llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIllIlIl, ContainerPlayer.lIIlIlIlIllIll[0])) {
                this.addSlotToContainer(new Slot(this.craftMatrix, lllllllllllllIIllIIllllIlIllIlIl + lllllllllllllIIllIIllllIlIllIllI * ContainerPlayer.lIIlIlIlIllIll[0], ContainerPlayer.lIIlIlIlIllIll[4] + lllllllllllllIIllIIllllIlIllIlIl * ContainerPlayer.lIIlIlIlIllIll[5], ContainerPlayer.lIIlIlIlIllIll[6] + lllllllllllllIIllIIllllIlIllIllI * ContainerPlayer.lIIlIlIlIllIll[5]));
                "".length();
                ++lllllllllllllIIllIIllllIlIllIlIl;
            }
            ++lllllllllllllIIllIIllllIlIllIllI;
        }
        int lllllllllllllIIllIIllllIlIllIlII = ContainerPlayer.lIIlIlIlIllIll[1];
        "".length();
        if ("   ".length() == 0) {
            throw null;
        }
        while (!llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIllIlII, ContainerPlayer.lIIlIlIlIllIll[9])) {
            final int lllllllllllllIIllIIllllIlIllIIll = lllllllllllllIIllIIllllIlIllIlII;
            this.addSlotToContainer(new Slot(lllllllllllllIIllIIllllIlIlllIIl, lllllllllllllIIllIIllllIlIlllIIl.getSizeInventory() - ContainerPlayer.lIIlIlIlIllIll[7] - lllllllllllllIIllIIllllIlIllIlII, ContainerPlayer.lIIlIlIlIllIll[8], ContainerPlayer.lIIlIlIlIllIll[8] + lllllllllllllIIllIIllllIlIllIlII * ContainerPlayer.lIIlIlIlIllIll[5]) {
                private static final /* synthetic */ int[] llllIlllIllIl;
                
                private static boolean lIlIllIIIlIIlIl(final int lllllllllllllIlIllIIIlllllIlIllI, final int lllllllllllllIlIllIIIlllllIlIlIl) {
                    return lllllllllllllIlIllIIIlllllIlIllI == lllllllllllllIlIllIIIlllllIlIlIl;
                }
                
                @Override
                public boolean isItemValid(final ItemStack lllllllllllllIlIllIIIlllllIllllI) {
                    int n;
                    if (lIlIllIIIlIIIll(lllllllllllllIlIllIIIlllllIllllI)) {
                        n = ContainerPlayer$1.llllIlllIllIl[1];
                        "".length();
                        if (-(0x7D ^ 0x13 ^ (0x5E ^ 0x35)) >= 0) {
                            return ((0xDB ^ 0xBB ^ (0x6B ^ 0x37)) & (0x3A ^ 0xF ^ (0x9C ^ 0x95) ^ -" ".length())) != 0x0;
                        }
                    }
                    else if (lIlIllIIIlIIlII((lllllllllllllIlIllIIIlllllIllllI.getItem() instanceof ItemArmor) ? 1 : 0)) {
                        if (lIlIllIIIlIIlIl(((ItemArmor)lllllllllllllIlIllIIIlllllIllllI.getItem()).armorType, lllllllllllllIIllIIllllIlIllIIll)) {
                            n = ContainerPlayer$1.llllIlllIllIl[0];
                            "".length();
                            if (null != null) {
                                return ((0x48 ^ 0x46 ^ (0x60 ^ 0x7F)) & (0x5A ^ 0x60 ^ (0xA8 ^ 0x83) ^ -" ".length()) & (((0x79 ^ 0x3D ^ (0x25 ^ 0x56)) & (0x2F ^ 0x69 ^ (0x17 ^ 0x66) ^ -" ".length())) ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            n = ContainerPlayer$1.llllIlllIllIl[1];
                            "".length();
                            if ("   ".length() == 0) {
                                return ((0x7A ^ 0x6E ^ (0xEC ^ 0xB4)) & (225 + 119 - 329 + 240 ^ 73 + 30 - 25 + 101 ^ -" ".length())) != 0x0;
                            }
                        }
                    }
                    else if (lIlIllIIIlIIllI(lllllllllllllIlIllIIIlllllIllllI.getItem(), Item.getItemFromBlock(Blocks.pumpkin)) && lIlIllIIIlIIllI(lllllllllllllIlIllIIIlllllIllllI.getItem(), Items.skull)) {
                        n = ContainerPlayer$1.llllIlllIllIl[1];
                        "".length();
                        if (-"   ".length() > 0) {
                            return ((0xB0 ^ 0xA8) & ~(0x50 ^ 0x48)) != 0x0;
                        }
                    }
                    else if (lIlIllIIIlIIlll(lllllllllllllIIllIIllllIlIllIIll)) {
                        n = ContainerPlayer$1.llllIlllIllIl[0];
                        "".length();
                        if ((28 + 65 - 59 + 94 ^ 46 + 11 - 19 + 94) < 0) {
                            return ((47 + 179 - 137 + 157 ^ 87 + 26 - 46 + 81) & (89 + 95 - 138 + 200 ^ 21 + 48 + 37 + 42 ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        n = ContainerPlayer$1.llllIlllIllIl[1];
                    }
                    return n != 0;
                }
                
                private static void lIlIllIIIlIIIlI() {
                    (llllIlllIllIl = new int[2])[0] = " ".length();
                    ContainerPlayer$1.llllIlllIllIl[1] = ((0x49 ^ 0x7D) & ~(0x57 ^ 0x63));
                }
                
                private static boolean lIlIllIIIlIIllI(final Object lllllllllllllIlIllIIIlllllIlIIlI, final Object lllllllllllllIlIllIIIlllllIlIIIl) {
                    return lllllllllllllIlIllIIIlllllIlIIlI != lllllllllllllIlIllIIIlllllIlIIIl;
                }
                
                private static boolean lIlIllIIIlIIlll(final int lllllllllllllIlIllIIIlllllIIlIll) {
                    return lllllllllllllIlIllIIIlllllIIlIll == 0;
                }
                
                @Override
                public int getSlotStackLimit() {
                    return ContainerPlayer$1.llllIlllIllIl[0];
                }
                
                @Override
                public String getSlotTexture() {
                    return ItemArmor.EMPTY_SLOT_NAMES[lllllllllllllIIllIIllllIlIllIIll];
                }
                
                static {
                    lIlIllIIIlIIIlI();
                }
                
                private static boolean lIlIllIIIlIIIll(final Object lllllllllllllIlIllIIIlllllIIllll) {
                    return lllllllllllllIlIllIIIlllllIIllll == null;
                }
                
                private static boolean lIlIllIIIlIIlII(final int lllllllllllllIlIllIIIlllllIIllIl) {
                    return lllllllllllllIlIllIIIlllllIIllIl != 0;
                }
            });
            "".length();
            ++lllllllllllllIIllIIllllIlIllIlII;
        }
        int lllllllllllllIIllIIllllIlIllIIlI = ContainerPlayer.lIIlIlIlIllIll[1];
        "".length();
        if ((0xE ^ 0xA) == 0x0) {
            throw null;
        }
        while (!llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIllIIlI, ContainerPlayer.lIIlIlIlIllIll[12])) {
            int lllllllllllllIIllIIllllIlIllIIIl = ContainerPlayer.lIIlIlIlIllIll[1];
            "".length();
            if (null != null) {
                throw null;
            }
            while (!llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIllIIIl, ContainerPlayer.lIIlIlIlIllIll[10])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIllIIllllIlIlllIIl, lllllllllllllIIllIIllllIlIllIIIl + (lllllllllllllIIllIIllllIlIllIIlI + ContainerPlayer.lIIlIlIlIllIll[7]) * ContainerPlayer.lIIlIlIlIllIll[10], ContainerPlayer.lIIlIlIlIllIll[8] + lllllllllllllIIllIIllllIlIllIIIl * ContainerPlayer.lIIlIlIlIllIll[5], ContainerPlayer.lIIlIlIlIllIll[11] + lllllllllllllIIllIIllllIlIllIIlI * ContainerPlayer.lIIlIlIlIllIll[5]));
                "".length();
                ++lllllllllllllIIllIIllllIlIllIIIl;
            }
            ++lllllllllllllIIllIIllllIlIllIIlI;
        }
        int lllllllllllllIIllIIllllIlIllIIII = ContainerPlayer.lIIlIlIlIllIll[1];
        "".length();
        if (((165 + 135 - 148 + 61 ^ 99 + 24 - 102 + 113) & (0x1F ^ 0x0 ^ (0x42 ^ 0xE) ^ -" ".length())) != 0x0) {
            throw null;
        }
        while (!llIlIIIIllIIIII(lllllllllllllIIllIIllllIlIllIIII, ContainerPlayer.lIIlIlIlIllIll[10])) {
            this.addSlotToContainer(new Slot(lllllllllllllIIllIIllllIlIlllIIl, lllllllllllllIIllIIllllIlIllIIII, ContainerPlayer.lIIlIlIlIllIll[8] + lllllllllllllIIllIIllllIlIllIIII * ContainerPlayer.lIIlIlIlIllIll[5], ContainerPlayer.lIIlIlIlIllIll[13]));
            "".length();
            ++lllllllllllllIIllIIllllIlIllIIII;
        }
        this.onCraftMatrixChanged(this.craftMatrix);
    }
    
    private static void llIlIIIIlIlllll() {
        (lIIlIlIlIllIll = new int[16])[0] = "  ".length();
        ContainerPlayer.lIIlIlIlIllIll[1] = ((0x6B ^ 0x6C) & ~(0x97 ^ 0x90));
        ContainerPlayer.lIIlIlIlIllIll[2] = 124 + 4 - 74 + 90;
        ContainerPlayer.lIIlIlIlIllIll[3] = (0x2E ^ 0x67 ^ (0x6A ^ 0x7));
        ContainerPlayer.lIIlIlIlIllIll[4] = (238 + 137 - 334 + 212 ^ 154 + 66 - 194 + 139);
        ContainerPlayer.lIIlIlIlIllIll[5] = (0xAE ^ 0xA8 ^ (0x2 ^ 0x16));
        ContainerPlayer.lIIlIlIlIllIll[6] = (0x6B ^ 0x71);
        ContainerPlayer.lIIlIlIlIllIll[7] = " ".length();
        ContainerPlayer.lIIlIlIlIllIll[8] = (0xB1 ^ 0xB9);
        ContainerPlayer.lIIlIlIlIllIll[9] = (0xBA ^ 0xBE);
        ContainerPlayer.lIIlIlIlIllIll[10] = (0x85 ^ 0x8C);
        ContainerPlayer.lIIlIlIlIllIll[11] = (0x9F ^ 0xC3 ^ (0x16 ^ 0x1E));
        ContainerPlayer.lIIlIlIlIllIll[12] = "   ".length();
        ContainerPlayer.lIIlIlIlIllIll[13] = 134 + 12 - 46 + 42;
        ContainerPlayer.lIIlIlIlIllIll[14] = (0x99 ^ 0xB4);
        ContainerPlayer.lIIlIlIlIllIll[15] = (0x76 ^ 0x73);
    }
    
    private static boolean llIlIIIIllIIIll(final int lllllllllllllIIllIIllllIIllIIlII) {
        return lllllllllllllIIllIIllllIIllIIlII == 0;
    }
    
    @Override
    public void onCraftMatrixChanged(final IInventory lllllllllllllIIllIIllllIlIlIIlll) {
        this.craftResult.setInventorySlotContents(ContainerPlayer.lIIlIlIlIllIll[1], CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.thePlayer.worldObj));
    }
}
