// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Slot
{
    public final /* synthetic */ IInventory inventory;
    private final /* synthetic */ int slotIndex;
    private static final /* synthetic */ int[] lllIIllIIlIIlI;
    public /* synthetic */ int xDisplayPosition;
    public /* synthetic */ int yDisplayPosition;
    
    public String getSlotTexture() {
        return null;
    }
    
    public boolean isItemValid(final ItemStack llllllllllllIlIllllIIIIlllIIIIII) {
        return Slot.lllIIllIIlIIlI[0] != 0;
    }
    
    private static boolean lIlIIIIIIIllIlll(final Object llllllllllllIlIllllIIIIllIIIlllI, final Object llllllllllllIlIllllIIIIllIIIllIl) {
        return llllllllllllIlIllllIIIIllIIIlllI == llllllllllllIlIllllIIIIllIIIllIl;
    }
    
    public void onSlotChanged() {
        this.inventory.markDirty();
    }
    
    public void onSlotChange(final ItemStack llllllllllllIlIllllIIIIlllIIlllI, final ItemStack llllllllllllIlIllllIIIIlllIIllIl) {
        if (lIlIIIIIIIllIllI(llllllllllllIlIllllIIIIlllIIlllI) && lIlIIIIIIIllIllI(llllllllllllIlIllllIIIIlllIIllIl) && lIlIIIIIIIllIlll(llllllllllllIlIllllIIIIlllIIlllI.getItem(), llllllllllllIlIllllIIIIlllIIllIl.getItem())) {
            final int llllllllllllIlIllllIIIIlllIlIIII = llllllllllllIlIllllIIIIlllIIllIl.stackSize - llllllllllllIlIllllIIIIlllIIlllI.stackSize;
            if (lIlIIIIIIIlllIII(llllllllllllIlIllllIIIIlllIlIIII)) {
                this.onCrafting(llllllllllllIlIllllIIIIlllIIlllI, llllllllllllIlIllllIIIIlllIlIIII);
            }
        }
    }
    
    private static boolean lIlIIIIIIIllIllI(final Object llllllllllllIlIllllIIIIllIIlIIIl) {
        return llllllllllllIlIllllIIIIllIIlIIIl != null;
    }
    
    public ItemStack decrStackSize(final int llllllllllllIlIllllIIIIllIlIIlIl) {
        return this.inventory.decrStackSize(this.slotIndex, llllllllllllIlIllllIIIIllIlIIlIl);
    }
    
    public boolean canBeHovered() {
        return Slot.lllIIllIIlIIlI[0] != 0;
    }
    
    private static void lIlIIIIIIIllIlIl() {
        (lllIIllIIlIIlI = new int[2])[0] = " ".length();
        Slot.lllIIllIIlIIlI[1] = ((0x56 ^ 0x11) & ~(0x52 ^ 0x15));
    }
    
    public boolean isHere(final IInventory llllllllllllIlIllllIIIIllIIllllI, final int llllllllllllIlIllllIIIIllIIllIlI) {
        if (lIlIIIIIIIllIlll(llllllllllllIlIllllIIIIllIIllllI, this.inventory) && lIlIIIIIIIlllIIl(llllllllllllIlIllllIIIIllIIllIlI, this.slotIndex)) {
            return Slot.lllIIllIIlIIlI[0] != 0;
        }
        return Slot.lllIIllIIlIIlI[1] != 0;
    }
    
    public boolean canTakeStack(final EntityPlayer llllllllllllIlIllllIIIIllIIllIII) {
        return Slot.lllIIllIIlIIlI[0] != 0;
    }
    
    public void onPickupFromSlot(final EntityPlayer llllllllllllIlIllllIIIIlllIIIlII, final ItemStack llllllllllllIlIllllIIIIlllIIIIll) {
        this.onSlotChanged();
    }
    
    protected void onCrafting(final ItemStack llllllllllllIlIllllIIIIlllIIlIlI, final int llllllllllllIlIllllIIIIlllIIlIIl) {
    }
    
    public int getItemStackLimit(final ItemStack llllllllllllIlIllllIIIIllIlIlIll) {
        return this.getSlotStackLimit();
    }
    
    protected void onCrafting(final ItemStack llllllllllllIlIllllIIIIlllIIIlll) {
    }
    
    private static boolean lIlIIIIIIIlllIII(final int llllllllllllIlIllllIIIIllIIIlIll) {
        return llllllllllllIlIllllIIIIllIIIlIll > 0;
    }
    
    public Slot(final IInventory llllllllllllIlIllllIIIIllllIIIII, final int llllllllllllIlIllllIIIIlllIllIlI, final int llllllllllllIlIllllIIIIlllIllIIl, final int llllllllllllIlIllllIIIIlllIlllIl) {
        this.inventory = llllllllllllIlIllllIIIIllllIIIII;
        this.slotIndex = llllllllllllIlIllllIIIIlllIllIlI;
        this.xDisplayPosition = llllllllllllIlIllllIIIIlllIllIIl;
        this.yDisplayPosition = llllllllllllIlIllllIIIIlllIlllIl;
    }
    
    private static boolean lIlIIIIIIIlllIIl(final int llllllllllllIlIllllIIIIllIIlIlII, final int llllllllllllIlIllllIIIIllIIlIIll) {
        return llllllllllllIlIllllIIIIllIIlIlII == llllllllllllIlIllllIIIIllIIlIIll;
    }
    
    public int getSlotStackLimit() {
        return this.inventory.getInventoryStackLimit();
    }
    
    public void putStack(final ItemStack llllllllllllIlIllllIIIIllIllIlII) {
        this.inventory.setInventorySlotContents(this.slotIndex, llllllllllllIlIllllIIIIllIllIlII);
        this.onSlotChanged();
    }
    
    static {
        lIlIIIIIIIllIlIl();
    }
    
    public ItemStack getStack() {
        return this.inventory.getStackInSlot(this.slotIndex);
    }
    
    public boolean getHasStack() {
        if (lIlIIIIIIIllIllI(this.getStack())) {
            return Slot.lllIIllIIlIIlI[0] != 0;
        }
        return Slot.lllIIllIIlIIlI[1] != 0;
    }
}
