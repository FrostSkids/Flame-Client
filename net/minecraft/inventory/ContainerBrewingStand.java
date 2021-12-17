// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.init.Items;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerBrewingStand extends Container
{
    private static final /* synthetic */ int[] lIIIlIlIIIlIII;
    private /* synthetic */ int brewTime;
    private /* synthetic */ IInventory tileBrewingStand;
    private final /* synthetic */ Slot theSlot;
    
    private static boolean llIIIIIIIlIIIIl(final int lllllllllllllIlIIIlIIIIllIIlllll) {
        return lllllllllllllIlIIIlIIIIllIIlllll >= 0;
    }
    
    private static boolean llIIIIIIIIllllI(final int lllllllllllllIlIIIlIIIIllIIlllII, final int lllllllllllllIlIIIlIIIIllIIllIll) {
        return lllllllllllllIlIIIlIIIIllIIlllII != lllllllllllllIlIIIlIIIIllIIllIll;
    }
    
    private static boolean llIIIIIIIlIIIII(final int lllllllllllllIlIIIlIIIIllIlIIIll) {
        return lllllllllllllIlIIIlIIIIllIlIIIll != 0;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIlIIIlIIIIlllIIlIll) {
        return this.tileBrewingStand.isUseableByPlayer(lllllllllllllIlIIIlIIIIlllIIlIll);
    }
    
    private static boolean llIIIIIIIIlllll(final Object lllllllllllllIlIIIlIIIIllIlIIlIl) {
        return lllllllllllllIlIIIlIIIIllIlIIlIl != null;
    }
    
    static {
        llIIIIIIIIlllII();
    }
    
    private static boolean llIIIIIIIlIIIlI(final int lllllllllllllIlIIIlIIIIllIlIlIII, final int lllllllllllllIlIIIlIIIIllIlIIlll) {
        return lllllllllllllIlIIIlIIIIllIlIlIII > lllllllllllllIlIIIlIIIIllIlIIlll;
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIlIIIlIIIIlllIIIIIl, final int lllllllllllllIlIIIlIIIIllIlllIlI) {
        ItemStack lllllllllllllIlIIIlIIIIllIllllll = null;
        final Slot lllllllllllllIlIIIlIIIIllIlllllI = this.inventorySlots.get(lllllllllllllIlIIIlIIIIllIlllIlI);
        if (llIIIIIIIIlllll(lllllllllllllIlIIIlIIIIllIlllllI) && llIIIIIIIlIIIII(lllllllllllllIlIIIlIIIIllIlllllI.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIlIIIlIIIIllIllllIl = lllllllllllllIlIIIlIIIIllIlllllI.getStack();
            lllllllllllllIlIIIlIIIIllIllllll = lllllllllllllIlIIIlIIIIllIllllIl.copy();
            if ((!llIIIIIIIlIIIIl(lllllllllllllIlIIIlIIIIllIlllIlI) || llIIIIIIIlIIIlI(lllllllllllllIlIIIlIIIIllIlllIlI, ContainerBrewingStand.lIIIlIlIIIlIII[6])) && llIIIIIIIIllllI(lllllllllllllIlIIIlIIIIllIlllIlI, ContainerBrewingStand.lIIIlIlIIIlIII[8])) {
                if (llIIIIIIIlIIIll(this.theSlot.getHasStack() ? 1 : 0) && llIIIIIIIlIIIII(this.theSlot.isItemValid(lllllllllllllIlIIIlIIIIllIllllIl) ? 1 : 0)) {
                    if (llIIIIIIIlIIIll(this.mergeItemStack(lllllllllllllIlIIIlIIIIllIllllIl, ContainerBrewingStand.lIIIlIlIIIlIII[8], ContainerBrewingStand.lIIIlIlIIIlIII[15], (boolean)(ContainerBrewingStand.lIIIlIlIIIlIII[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (llIIIIIIIlIIIII(Potion.canHoldPotion(lllllllllllllIlIIIlIIIIllIllllll) ? 1 : 0)) {
                    if (llIIIIIIIlIIIll(this.mergeItemStack(lllllllllllllIlIIIlIIIIllIllllIl, ContainerBrewingStand.lIIIlIlIIIlIII[0], ContainerBrewingStand.lIIIlIlIIIlIII[8], (boolean)(ContainerBrewingStand.lIIIlIlIIIlIII[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (llIIIIIIIIlllIl(lllllllllllllIlIIIlIIIIllIlllIlI, ContainerBrewingStand.lIIIlIlIIIlIII[15]) && llIIIIIIIlIIlII(lllllllllllllIlIIIlIIIIllIlllIlI, ContainerBrewingStand.lIIIlIlIIIlIII[16])) {
                    if (llIIIIIIIlIIIll(this.mergeItemStack(lllllllllllllIlIIIlIIIIllIllllIl, ContainerBrewingStand.lIIIlIlIIIlIII[16], ContainerBrewingStand.lIIIlIlIIIlIII[17], (boolean)(ContainerBrewingStand.lIIIlIlIIIlIII[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (llIIIIIIIIlllIl(lllllllllllllIlIIIlIIIIllIlllIlI, ContainerBrewingStand.lIIIlIlIIIlIII[16]) && llIIIIIIIlIIlII(lllllllllllllIlIIIlIIIIllIlllIlI, ContainerBrewingStand.lIIIlIlIIIlIII[17])) {
                    if (llIIIIIIIlIIIll(this.mergeItemStack(lllllllllllllIlIIIlIIIIllIllllIl, ContainerBrewingStand.lIIIlIlIIIlIII[15], ContainerBrewingStand.lIIIlIlIIIlIII[16], (boolean)(ContainerBrewingStand.lIIIlIlIIIlIII[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (llIIIIIIIlIIIll(this.mergeItemStack(lllllllllllllIlIIIlIIIIllIllllIl, ContainerBrewingStand.lIIIlIlIIIlIII[15], ContainerBrewingStand.lIIIlIlIIIlIII[17], (boolean)(ContainerBrewingStand.lIIIlIlIIIlIII[0] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else {
                if (llIIIIIIIlIIIll(this.mergeItemStack(lllllllllllllIlIIIlIIIIllIllllIl, ContainerBrewingStand.lIIIlIlIIIlIII[15], ContainerBrewingStand.lIIIlIlIIIlIII[17], (boolean)(ContainerBrewingStand.lIIIlIlIIIlIII[3] != 0)) ? 1 : 0)) {
                    return null;
                }
                lllllllllllllIlIIIlIIIIllIlllllI.onSlotChange(lllllllllllllIlIIIlIIIIllIllllIl, lllllllllllllIlIIIlIIIIllIllllll);
            }
            if (llIIIIIIIlIIIll(lllllllllllllIlIIIlIIIIllIllllIl.stackSize)) {
                lllllllllllllIlIIIlIIIIllIlllllI.putStack(null);
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIIIlIIIIllIlllllI.onSlotChanged();
            }
            if (llIIIIIIIlIIlIl(lllllllllllllIlIIIlIIIIllIllllIl.stackSize, lllllllllllllIlIIIlIIIIllIllllll.stackSize)) {
                return null;
            }
            lllllllllllllIlIIIlIIIIllIlllllI.onPickupFromSlot(lllllllllllllIlIIIlIIIIlllIIIIIl, lllllllllllllIlIIIlIIIIllIllllIl);
        }
        return lllllllllllllIlIIIlIIIIllIllllll;
    }
    
    @Override
    public void onCraftGuiOpened(final ICrafting lllllllllllllIlIIIlIIIIllllIIIll) {
        super.onCraftGuiOpened(lllllllllllllIlIIIlIIIIllllIIIll);
        lllllllllllllIlIIIlIIIIllllIIIll.func_175173_a(this, this.tileBrewingStand);
    }
    
    private static void llIIIIIIIIlllII() {
        (lIIIlIlIIIlIII = new int[18])[0] = ((4 + 60 + 56 + 11 ^ 128 + 56 - 82 + 39) & (165 + 144 - 246 + 109 ^ 128 + 42 - 84 + 76 ^ -" ".length()));
        ContainerBrewingStand.lIIIlIlIIIlIII[1] = (31 + 98 - 70 + 116 ^ 99 + 23 - 41 + 70);
        ContainerBrewingStand.lIIIlIlIIIlIII[2] = (0x72 ^ 0x17 ^ (0xD8 ^ 0x93));
        ContainerBrewingStand.lIIIlIlIIIlIII[3] = " ".length();
        ContainerBrewingStand.lIIIlIlIIIlIII[4] = (0x11 ^ 0xF ^ (0x2E ^ 0x7F));
        ContainerBrewingStand.lIIIlIlIIIlIII[5] = (0xD6 ^ 0x9C ^ 43 + 6 + 34 + 44);
        ContainerBrewingStand.lIIIlIlIIIlIII[6] = "  ".length();
        ContainerBrewingStand.lIIIlIlIIIlIII[7] = (0xA1 ^ 0xC7);
        ContainerBrewingStand.lIIIlIlIIIlIII[8] = "   ".length();
        ContainerBrewingStand.lIIIlIlIIIlIII[9] = (0x10 ^ 0x3E ^ (0x3C ^ 0x3));
        ContainerBrewingStand.lIIIlIlIIIlIII[10] = (0x65 ^ 0x6C);
        ContainerBrewingStand.lIIIlIlIIIlIII[11] = (0x63 ^ 0x6B);
        ContainerBrewingStand.lIIIlIlIIIlIII[12] = (114 + 36 - 27 + 4 ^ (0x5 ^ 0x68));
        ContainerBrewingStand.lIIIlIlIIIlIII[13] = (0xC5 ^ 0x91);
        ContainerBrewingStand.lIIIlIlIIIlIII[14] = (0x7A ^ 0xA) + (0x68 ^ 0x71) - (0xC ^ 0x50) + (0x2B ^ 0x4A);
        ContainerBrewingStand.lIIIlIlIIIlIII[15] = (0x4E ^ 0x38 ^ (0xE9 ^ 0x9B));
        ContainerBrewingStand.lIIIlIlIIIlIII[16] = (0x72 ^ 0x6A ^ (0x20 ^ 0x27));
        ContainerBrewingStand.lIIIlIlIIIlIII[17] = (226 + 8 - 107 + 105 ^ 82 + 19 - 57 + 148);
    }
    
    public ContainerBrewingStand(final InventoryPlayer lllllllllllllIlIIIlIIIIlllllIIII, final IInventory lllllllllllllIlIIIlIIIIllllIllll) {
        this.tileBrewingStand = lllllllllllllIlIIIlIIIIllllIllll;
        this.addSlotToContainer(new Potion(lllllllllllllIlIIIlIIIIlllllIIII.player, lllllllllllllIlIIIlIIIIllllIllll, ContainerBrewingStand.lIIIlIlIIIlIII[0], ContainerBrewingStand.lIIIlIlIIIlIII[1], ContainerBrewingStand.lIIIlIlIIIlIII[2]));
        "".length();
        this.addSlotToContainer(new Potion(lllllllllllllIlIIIlIIIIlllllIIII.player, lllllllllllllIlIIIlIIIIllllIllll, ContainerBrewingStand.lIIIlIlIIIlIII[3], ContainerBrewingStand.lIIIlIlIIIlIII[4], ContainerBrewingStand.lIIIlIlIIIlIII[5]));
        "".length();
        this.addSlotToContainer(new Potion(lllllllllllllIlIIIlIIIIlllllIIII.player, lllllllllllllIlIIIlIIIIllllIllll, ContainerBrewingStand.lIIIlIlIIIlIII[6], ContainerBrewingStand.lIIIlIlIIIlIII[7], ContainerBrewingStand.lIIIlIlIIIlIII[2]));
        "".length();
        this.theSlot = this.addSlotToContainer(new Ingredient(lllllllllllllIlIIIlIIIIllllIllll, ContainerBrewingStand.lIIIlIlIIIlIII[8], ContainerBrewingStand.lIIIlIlIIIlIII[4], ContainerBrewingStand.lIIIlIlIIIlIII[9]));
        int lllllllllllllIlIIIlIIIIllllIlllI = ContainerBrewingStand.lIIIlIlIIIlIII[0];
        "".length();
        if ((2 + 12 + 80 + 60 ^ 50 + 154 - 167 + 121) == "   ".length()) {
            throw null;
        }
        while (!llIIIIIIIIlllIl(lllllllllllllIlIIIlIIIIllllIlllI, ContainerBrewingStand.lIIIlIlIIIlIII[8])) {
            int lllllllllllllIlIIIlIIIIllllIllIl = ContainerBrewingStand.lIIIlIlIIIlIII[0];
            "".length();
            if (((0x56 ^ 0x64 ^ (0x2D ^ 0x7C)) & (0x3D ^ 0x11 ^ (0xF ^ 0x40) ^ -" ".length())) < ((40 + 9 + 60 + 39 ^ 10 + 16 + 87 + 43) & (147 + 94 - 105 + 44 ^ 38 + 59 - 8 + 99 ^ -" ".length()))) {
                throw null;
            }
            while (!llIIIIIIIIlllIl(lllllllllllllIlIIIlIIIIllllIllIl, ContainerBrewingStand.lIIIlIlIIIlIII[10])) {
                this.addSlotToContainer(new Slot(lllllllllllllIlIIIlIIIIlllllIIII, lllllllllllllIlIIIlIIIIllllIllIl + lllllllllllllIlIIIlIIIIllllIlllI * ContainerBrewingStand.lIIIlIlIIIlIII[10] + ContainerBrewingStand.lIIIlIlIIIlIII[10], ContainerBrewingStand.lIIIlIlIIIlIII[11] + lllllllllllllIlIIIlIIIIllllIllIl * ContainerBrewingStand.lIIIlIlIIIlIII[12], ContainerBrewingStand.lIIIlIlIIIlIII[13] + lllllllllllllIlIIIlIIIIllllIlllI * ContainerBrewingStand.lIIIlIlIIIlIII[12]));
                "".length();
                ++lllllllllllllIlIIIlIIIIllllIllIl;
            }
            ++lllllllllllllIlIIIlIIIIllllIlllI;
        }
        int lllllllllllllIlIIIlIIIIllllIllII = ContainerBrewingStand.lIIIlIlIIIlIII[0];
        "".length();
        if (((0x76 ^ 0x46) & ~(0x82 ^ 0xB2)) != 0x0) {
            throw null;
        }
        while (!llIIIIIIIIlllIl(lllllllllllllIlIIIlIIIIllllIllII, ContainerBrewingStand.lIIIlIlIIIlIII[10])) {
            this.addSlotToContainer(new Slot(lllllllllllllIlIIIlIIIIlllllIIII, lllllllllllllIlIIIlIIIIllllIllII, ContainerBrewingStand.lIIIlIlIIIlIII[11] + lllllllllllllIlIIIlIIIIllllIllII * ContainerBrewingStand.lIIIlIlIIIlIII[12], ContainerBrewingStand.lIIIlIlIIIlIII[14]));
            "".length();
            ++lllllllllllllIlIIIlIIIIllllIllII;
        }
    }
    
    private static boolean llIIIIIIIIlllIl(final int lllllllllllllIlIIIlIIIIllIllIIII, final int lllllllllllllIlIIIlIIIIllIlIllll) {
        return lllllllllllllIlIIIlIIIIllIllIIII >= lllllllllllllIlIIIlIIIIllIlIllll;
    }
    
    private static boolean llIIIIIIIlIIlIl(final int lllllllllllllIlIIIlIIIIllIllIlII, final int lllllllllllllIlIIIlIIIIllIllIIll) {
        return lllllllllllllIlIIIlIIIIllIllIlII == lllllllllllllIlIIIlIIIIllIllIIll;
    }
    
    private static boolean llIIIIIIIlIIlII(final int lllllllllllllIlIIIlIIIIllIlIllII, final int lllllllllllllIlIIIlIIIIllIlIlIll) {
        return lllllllllllllIlIIIlIIIIllIlIllII < lllllllllllllIlIIIlIIIIllIlIlIll;
    }
    
    @Override
    public void updateProgressBar(final int lllllllllllllIlIIIlIIIIlllIlIIll, final int lllllllllllllIlIIIlIIIIlllIlIIlI) {
        this.tileBrewingStand.setField(lllllllllllllIlIIIlIIIIlllIlIIll, lllllllllllllIlIIIlIIIIlllIlIIlI);
    }
    
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        int lllllllllllllIlIIIlIIIIlllIlllII = ContainerBrewingStand.lIIIlIlIIIlIII[0];
        "".length();
        if (-(0xA7 ^ 0x99 ^ (0xF8 ^ 0xC2)) > 0) {
            return;
        }
        while (!llIIIIIIIIlllIl(lllllllllllllIlIIIlIIIIlllIlllII, this.crafters.size())) {
            final ICrafting lllllllllllllIlIIIlIIIIlllIllIll = this.crafters.get(lllllllllllllIlIIIlIIIIlllIlllII);
            if (llIIIIIIIIllllI(this.brewTime, this.tileBrewingStand.getField(ContainerBrewingStand.lIIIlIlIIIlIII[0]))) {
                lllllllllllllIlIIIlIIIIlllIllIll.sendProgressBarUpdate(this, ContainerBrewingStand.lIIIlIlIIIlIII[0], this.tileBrewingStand.getField(ContainerBrewingStand.lIIIlIlIIIlIII[0]));
            }
            ++lllllllllllllIlIIIlIIIIlllIlllII;
        }
        this.brewTime = this.tileBrewingStand.getField(ContainerBrewingStand.lIIIlIlIIIlIII[0]);
    }
    
    private static boolean llIIIIIIIlIIIll(final int lllllllllllllIlIIIlIIIIllIlIIIIl) {
        return lllllllllllllIlIIIlIIIIllIlIIIIl == 0;
    }
    
    class Ingredient extends Slot
    {
        private static final /* synthetic */ int[] llIIIllllIllII;
        
        @Override
        public boolean isItemValid(final ItemStack llllllllllllIlllIIllllIllIIIIlII) {
            int potionIngredient;
            if (lIIIlIllIIllIllI(llllllllllllIlllIIllllIllIIIIlII)) {
                potionIngredient = (llllllllllllIlllIIllllIllIIIIlII.getItem().isPotionIngredient(llllllllllllIlllIIllllIllIIIIlII) ? 1 : 0);
                "".length();
                if (" ".length() == 0) {
                    return ((0x1B ^ 0x78) & ~(0x44 ^ 0x27)) != 0x0;
                }
            }
            else {
                potionIngredient = Ingredient.llIIIllllIllII[0];
            }
            return potionIngredient != 0;
        }
        
        private static void lIIIlIllIIllIlIl() {
            (llIIIllllIllII = new int[2])[0] = ((0xE6 ^ 0xBE ^ (0x20 ^ 0x4C)) & (0x7 ^ 0x24 ^ (0x2C ^ 0x3B) ^ -" ".length()));
            Ingredient.llIIIllllIllII[1] = (0xEB ^ 0xB1 ^ (0x17 ^ 0xD));
        }
        
        private static boolean lIIIlIllIIllIllI(final Object llllllllllllIlllIIllllIlIlllllII) {
            return llllllllllllIlllIIllllIlIlllllII != null;
        }
        
        @Override
        public int getSlotStackLimit() {
            return Ingredient.llIIIllllIllII[1];
        }
        
        public Ingredient(final IInventory llllllllllllIlllIIllllIllIIlIlII, final int llllllllllllIlllIIllllIllIIlIIlI, final int llllllllllllIlllIIllllIllIIIlIll, final int llllllllllllIlllIIllllIllIIIlIlI) {
            super(llllllllllllIlllIIllllIllIIlIlII, llllllllllllIlllIIllllIllIIlIIlI, llllllllllllIlllIIllllIllIIIlIll, llllllllllllIlllIIllllIllIIIlIlI);
        }
        
        static {
            lIIIlIllIIllIlIl();
        }
    }
    
    static class Potion extends Slot
    {
        private static final /* synthetic */ int[] llIIlIlIlIllll;
        private /* synthetic */ EntityPlayer player;
        
        static {
            lIIIllIlIIlllIll();
        }
        
        @Override
        public boolean isItemValid(final ItemStack llllllllllllIlllIIIllIIllIllIlll) {
            return canHoldPotion(llllllllllllIlllIIIllIIllIllIlll);
        }
        
        private static boolean lIIIllIlIIlllllI(final Object llllllllllllIlllIIIllIIllIlIIIII) {
            return llllllllllllIlllIIIllIIllIlIIIII != null;
        }
        
        @Override
        public int getSlotStackLimit() {
            return Potion.llIIlIlIlIllll[0];
        }
        
        private static void lIIIllIlIIlllIll() {
            (llIIlIlIlIllll = new int[2])[0] = " ".length();
            Potion.llIIlIlIlIllll[1] = ((0x6 ^ 0x1B) & ~(0x92 ^ 0x8F));
        }
        
        private static boolean lIIIllIlIIllllII(final Object llllllllllllIlllIIIllIIllIlIIIll, final Object llllllllllllIlllIIIllIIllIlIIIlI) {
            return llllllllllllIlllIIIllIIllIlIIIll == llllllllllllIlllIIIllIIllIlIIIlI;
        }
        
        @Override
        public void onPickupFromSlot(final EntityPlayer llllllllllllIlllIIIllIIllIlIlllI, final ItemStack llllllllllllIlllIIIllIIllIlIllIl) {
            if (lIIIllIlIIllllII(llllllllllllIlllIIIllIIllIlIllIl.getItem(), Items.potionitem) && lIIIllIlIIllllIl(llllllllllllIlllIIIllIIllIlIllIl.getMetadata())) {
                this.player.triggerAchievement(AchievementList.potion);
            }
            super.onPickupFromSlot(llllllllllllIlllIIIllIIllIlIlllI, llllllllllllIlllIIIllIIllIlIllIl);
        }
        
        public Potion(final EntityPlayer llllllllllllIlllIIIllIIlllIIIlIl, final IInventory llllllllllllIlllIIIllIIlllIIIlII, final int llllllllllllIlllIIIllIIllIllllIl, final int llllllllllllIlllIIIllIIlllIIIIlI, final int llllllllllllIlllIIIllIIlllIIIIIl) {
            super(llllllllllllIlllIIIllIIlllIIIlII, llllllllllllIlllIIIllIIllIllllIl, llllllllllllIlllIIIllIIlllIIIIlI, llllllllllllIlllIIIllIIlllIIIIIl);
            this.player = llllllllllllIlllIIIllIIlllIIIlIl;
        }
        
        private static boolean lIIIllIlIIllllIl(final int llllllllllllIlllIIIllIIllIIllllI) {
            return llllllllllllIlllIIIllIIllIIllllI > 0;
        }
        
        private static boolean lIIIllIlIIllllll(final Object llllllllllllIlllIIIllIIllIlIIlll, final Object llllllllllllIlllIIIllIIllIlIIllI) {
            return llllllllllllIlllIIIllIIllIlIIlll != llllllllllllIlllIIIllIIllIlIIllI;
        }
        
        public static boolean canHoldPotion(final ItemStack llllllllllllIlllIIIllIIllIlIlIlI) {
            if (lIIIllIlIIlllllI(llllllllllllIlllIIIllIIllIlIlIlI) && (!lIIIllIlIIllllll(llllllllllllIlllIIIllIIllIlIlIlI.getItem(), Items.potionitem) || lIIIllIlIIllllII(llllllllllllIlllIIIllIIllIlIlIlI.getItem(), Items.glass_bottle))) {
                return Potion.llIIlIlIlIllll[0] != 0;
            }
            return Potion.llIIlIlIlIllll[1] != 0;
        }
    }
}
