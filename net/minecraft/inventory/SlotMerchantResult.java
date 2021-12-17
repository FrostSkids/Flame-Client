// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.village.MerchantRecipe;
import net.minecraft.stats.StatList;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.IMerchant;

public class SlotMerchantResult extends Slot
{
    private final /* synthetic */ InventoryMerchant theMerchantInventory;
    private /* synthetic */ int field_75231_g;
    private static final /* synthetic */ int[] lllIllllIlIlIl;
    private final /* synthetic */ IMerchant theMerchant;
    private /* synthetic */ EntityPlayer thePlayer;
    
    @Override
    protected void onCrafting(final ItemStack llllllllllllIlIlIlllllllIllIlIII) {
        llllllllllllIlIlIlllllllIllIlIII.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.field_75231_g);
        this.field_75231_g = SlotMerchantResult.lllIllllIlIlIl[0];
    }
    
    static {
        lIlIIllIIIIIlIII();
    }
    
    private static boolean lIlIIllIIIIIllIl(final Object llllllllllllIlIlIlllllllIIIlllll) {
        return llllllllllllIlIlIlllllllIIIlllll != null;
    }
    
    @Override
    public void onPickupFromSlot(final EntityPlayer llllllllllllIlIlIlllllllIlIIIlll, final ItemStack llllllllllllIlIlIlllllllIlIlIIII) {
        this.onCrafting(llllllllllllIlIlIlllllllIlIlIIII);
        final MerchantRecipe llllllllllllIlIlIlllllllIlIIlllI = this.theMerchantInventory.getCurrentRecipe();
        if (lIlIIllIIIIIllIl(llllllllllllIlIlIlllllllIlIIlllI)) {
            ItemStack llllllllllllIlIlIlllllllIlIIllIl = this.theMerchantInventory.getStackInSlot(SlotMerchantResult.lllIllllIlIlIl[0]);
            ItemStack llllllllllllIlIlIlllllllIlIIlIll = this.theMerchantInventory.getStackInSlot(SlotMerchantResult.lllIllllIlIlIl[1]);
            if (!lIlIIllIIIIIlllI(this.doTrade(llllllllllllIlIlIlllllllIlIIlllI, llllllllllllIlIlIlllllllIlIIllIl, llllllllllllIlIlIlllllllIlIIlIll) ? 1 : 0) || lIlIIllIIIIIlIlI(this.doTrade(llllllllllllIlIlIlllllllIlIIlllI, llllllllllllIlIlIlllllllIlIIlIll, llllllllllllIlIlIlllllllIlIIllIl) ? 1 : 0)) {
                this.theMerchant.useRecipe(llllllllllllIlIlIlllllllIlIIlllI);
                llllllllllllIlIlIlllllllIlIIIlll.triggerAchievement(StatList.timesTradedWithVillagerStat);
                if (lIlIIllIIIIIllIl(llllllllllllIlIlIlllllllIlIIllIl) && lIlIIllIIIIIllll(llllllllllllIlIlIlllllllIlIIllIl.stackSize)) {
                    llllllllllllIlIlIlllllllIlIIllIl = null;
                }
                if (lIlIIllIIIIIllIl(llllllllllllIlIlIlllllllIlIIlIll) && lIlIIllIIIIIllll(llllllllllllIlIlIlllllllIlIIlIll.stackSize)) {
                    llllllllllllIlIlIlllllllIlIIlIll = null;
                }
                this.theMerchantInventory.setInventorySlotContents(SlotMerchantResult.lllIllllIlIlIl[0], llllllllllllIlIlIlllllllIlIIllIl);
                this.theMerchantInventory.setInventorySlotContents(SlotMerchantResult.lllIllllIlIlIl[1], llllllllllllIlIlIlllllllIlIIlIll);
            }
        }
    }
    
    private static boolean lIlIIllIIIIlIIII(final Object llllllllllllIlIlIlllllllIIIllIlI, final Object llllllllllllIlIlIlllllllIIIllIII) {
        return llllllllllllIlIlIlllllllIIIllIlI == llllllllllllIlIlIlllllllIIIllIII;
    }
    
    @Override
    protected void onCrafting(final ItemStack llllllllllllIlIlIlllllllIllllIII, final int llllllllllllIlIlIlllllllIlllIIII) {
        this.field_75231_g += llllllllllllIlIlIlllllllIlllIIII;
        this.onCrafting(llllllllllllIlIlIlllllllIllllIII);
    }
    
    private static boolean lIlIIllIIIIlIIIl(final Object llllllllllllIlIlIlllllllIIIlIlIl) {
        return llllllllllllIlIlIlllllllIIIlIlIl == null;
    }
    
    private static boolean lIlIIllIIIIIllll(final int llllllllllllIlIlIlllllllIIIIlIIl) {
        return llllllllllllIlIlIlllllllIIIIlIIl <= 0;
    }
    
    public SlotMerchantResult(final EntityPlayer llllllllllllIlIlIllllllllIIlllll, final IMerchant llllllllllllIlIlIllllllllIIllllI, final InventoryMerchant llllllllllllIlIlIllllllllIIlIIll, final int llllllllllllIlIlIllllllllIIlIIIl, final int llllllllllllIlIlIllllllllIIIllll, final int llllllllllllIlIlIllllllllIIIllIl) {
        super(llllllllllllIlIlIllllllllIIlIIll, llllllllllllIlIlIllllllllIIlIIIl, llllllllllllIlIlIllllllllIIIllll, llllllllllllIlIlIllllllllIIIllIl);
        this.thePlayer = llllllllllllIlIlIllllllllIIlllll;
        this.theMerchant = llllllllllllIlIlIllllllllIIllllI;
        this.theMerchantInventory = llllllllllllIlIlIllllllllIIlIIll;
    }
    
    @Override
    public ItemStack decrStackSize(final int llllllllllllIlIlIllllllllIIIIllI) {
        if (lIlIIllIIIIIlIlI(this.getHasStack() ? 1 : 0)) {
            this.field_75231_g += Math.min(llllllllllllIlIlIllllllllIIIIllI, this.getStack().stackSize);
        }
        return super.decrStackSize(llllllllllllIlIlIllllllllIIIIllI);
    }
    
    private static boolean lIlIIllIIIIIlllI(final int llllllllllllIlIlIlllllllIIIIllII) {
        return llllllllllllIlIlIlllllllIIIIllII == 0;
    }
    
    private boolean doTrade(final MerchantRecipe llllllllllllIlIlIlllllllIIllIIlI, final ItemStack llllllllllllIlIlIlllllllIIllIIII, final ItemStack llllllllllllIlIlIlllllllIIlIlllI) {
        final ItemStack llllllllllllIlIlIlllllllIIlIllII = llllllllllllIlIlIlllllllIIllIIlI.getItemToBuy();
        final ItemStack llllllllllllIlIlIlllllllIIlIlIll = llllllllllllIlIlIlllllllIIllIIlI.getSecondItemToBuy();
        if (lIlIIllIIIIIllIl(llllllllllllIlIlIlllllllIIllIIII) && lIlIIllIIIIlIIII(llllllllllllIlIlIlllllllIIllIIII.getItem(), llllllllllllIlIlIlllllllIIlIllII.getItem())) {
            if (lIlIIllIIIIIllIl(llllllllllllIlIlIlllllllIIlIlIll) && lIlIIllIIIIIllIl(llllllllllllIlIlIlllllllIIlIlllI) && lIlIIllIIIIlIIII(llllllllllllIlIlIlllllllIIlIlIll.getItem(), llllllllllllIlIlIlllllllIIlIlllI.getItem())) {
                llllllllllllIlIlIlllllllIIllIIII.stackSize -= llllllllllllIlIlIlllllllIIlIllII.stackSize;
                llllllllllllIlIlIlllllllIIlIlllI.stackSize -= llllllllllllIlIlIlllllllIIlIlIll.stackSize;
                return SlotMerchantResult.lllIllllIlIlIl[1] != 0;
            }
            if (lIlIIllIIIIlIIIl(llllllllllllIlIlIlllllllIIlIlIll) && lIlIIllIIIIlIIIl(llllllllllllIlIlIlllllllIIlIlllI)) {
                llllllllllllIlIlIlllllllIIllIIII.stackSize -= llllllllllllIlIlIlllllllIIlIllII.stackSize;
                return SlotMerchantResult.lllIllllIlIlIl[1] != 0;
            }
        }
        return SlotMerchantResult.lllIllllIlIlIl[0] != 0;
    }
    
    private static boolean lIlIIllIIIIIlIlI(final int llllllllllllIlIlIlllllllIIIlIIIl) {
        return llllllllllllIlIlIlllllllIIIlIIIl != 0;
    }
    
    private static void lIlIIllIIIIIlIII() {
        (lllIllllIlIlIl = new int[2])[0] = ((0xD4 ^ 0x89) & ~(0x7A ^ 0x27));
        SlotMerchantResult.lllIllllIlIlIl[1] = " ".length();
    }
    
    @Override
    public boolean isItemValid(final ItemStack llllllllllllIlIlIllllllllIIIlIll) {
        return SlotMerchantResult.lllIllllIlIlIl[0] != 0;
    }
}
