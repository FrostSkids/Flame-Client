// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import com.google.common.collect.Lists;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.List;

public class InventoryBasic implements IInventory
{
    private /* synthetic */ boolean hasCustomName;
    private /* synthetic */ List<IInvBasic> field_70480_d;
    private /* synthetic */ String inventoryTitle;
    private /* synthetic */ int slotsCount;
    private /* synthetic */ ItemStack[] inventoryContents;
    private static final /* synthetic */ int[] lIIlllIlIIIlll;
    
    @Override
    public int getField(final int lllllllllllllIIlIIllllllIIlIIlIl) {
        return InventoryBasic.lIIlllIlIIIlll[1];
    }
    
    private static boolean llIllIlllIIlIIl(final int lllllllllllllIIlIIllllllIIIIllII, final int lllllllllllllIIlIIllllllIIIIlIll) {
        return lllllllllllllIIlIIllllllIIIIllII > lllllllllllllIIlIIllllllIIIIlIll;
    }
    
    private static boolean llIllIlllIIIlII(final int lllllllllllllIIlIIllllllIIIIIlIl) {
        return lllllllllllllIIlIIllllllIIIIIlIl != 0;
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIIlIIllllllIIlIlIlI) {
    }
    
    public InventoryBasic(final String lllllllllllllIIlIIlllllllIIllllI, final boolean lllllllllllllIIlIIlllllllIIllIIl, final int lllllllllllllIIlIIlllllllIIllIII) {
        this.inventoryTitle = lllllllllllllIIlIIlllllllIIllllI;
        this.hasCustomName = lllllllllllllIIlIIlllllllIIllIIl;
        this.slotsCount = lllllllllllllIIlIIlllllllIIllIII;
        this.inventoryContents = new ItemStack[lllllllllllllIIlIIlllllllIIllIII];
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIIlIIllllllIIlIlIII, final ItemStack lllllllllllllIIlIIllllllIIlIIlll) {
        return InventoryBasic.lIIlllIlIIIlll[0] != 0;
    }
    
    private static boolean llIllIlllIIIlll(final int lllllllllllllIIlIIllllllIIIllIII, final int lllllllllllllIIlIIllllllIIIlIlll) {
        return lllllllllllllIIlIIllllllIIIllIII >= lllllllllllllIIlIIllllllIIIlIlll;
    }
    
    private static boolean llIllIlllIIIIIl(final Object lllllllllllllIIlIIllllllIIIIlIIl) {
        return lllllllllllllIIlIIllllllIIIIlIIl != null;
    }
    
    @Override
    public void clear() {
        int lllllllllllllIIlIIllllllIIIlllIl = InventoryBasic.lIIlllIlIIIlll[1];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!llIllIlllIIIlll(lllllllllllllIIlIIllllllIIIlllIl, this.inventoryContents.length)) {
            this.inventoryContents[lllllllllllllIIlIIllllllIIIlllIl] = null;
            ++lllllllllllllIIlIIllllllIIIlllIl;
        }
    }
    
    @Override
    public void markDirty() {
        if (llIllIlllIIIIIl(this.field_70480_d)) {
            int lllllllllllllIIlIIllllllIIllIIlI = InventoryBasic.lIIlllIlIIIlll[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIllIlllIIIlll(lllllllllllllIIlIIllllllIIllIIlI, this.field_70480_d.size())) {
                this.field_70480_d.get(lllllllllllllIIlIIllllllIIllIIlI).onInventoryChanged(this);
                ++lllllllllllllIIlIIllllllIIllIIlI;
            }
        }
    }
    
    @Override
    public int getSizeInventory() {
        return this.slotsCount;
    }
    
    @Override
    public ItemStack getStackInSlot(final int lllllllllllllIIlIIllllllIlllllIl) {
        ItemStack itemStack;
        if (llIllIllIllllll(lllllllllllllIIlIIllllllIlllllIl) && llIllIlllIIIIII(lllllllllllllIIlIIllllllIlllllIl, this.inventoryContents.length)) {
            itemStack = this.inventoryContents[lllllllllllllIIlIIllllllIlllllIl];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else {
            itemStack = null;
        }
        return itemStack;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return InventoryBasic.lIIlllIlIIIlll[2];
    }
    
    @Override
    public String getName() {
        return this.inventoryTitle;
    }
    
    private static boolean llIllIllIllllll(final int lllllllllllllIIlIIllllllIIIIIIIl) {
        return lllllllllllllIIlIIllllllIIIIIIIl >= 0;
    }
    
    public void func_110132_b(final IInvBasic lllllllllllllIIlIIlllllllIIIIIll) {
        this.field_70480_d.remove(lllllllllllllIIlIIlllllllIIIIIll);
        "".length();
    }
    
    private static boolean llIllIlllIIIllI(final int lllllllllllllIIlIIlllllIllllllll) {
        return lllllllllllllIIlIIlllllIllllllll <= 0;
    }
    
    static {
        llIllIllIllllIl();
    }
    
    private static boolean llIllIlllIIIIII(final int lllllllllllllIIlIIllllllIIIlIlII, final int lllllllllllllIIlIIllllllIIIlIIll) {
        return lllllllllllllIIlIIllllllIIIlIlII < lllllllllllllIIlIIllllllIIIlIIll;
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIIlIIllllllIIlIlllI) {
        return InventoryBasic.lIIlllIlIIIlll[0] != 0;
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIIlIIllllllIlllIIlI, final int lllllllllllllIIlIIllllllIlllIllI) {
        if (!llIllIlllIIIIIl(this.inventoryContents[lllllllllllllIIlIIllllllIlllIIlI])) {
            return null;
        }
        if (llIllIlllIIIIlI(this.inventoryContents[lllllllllllllIIlIIllllllIlllIIlI].stackSize, lllllllllllllIIlIIllllllIlllIllI)) {
            final ItemStack lllllllllllllIIlIIllllllIlllIlIl = this.inventoryContents[lllllllllllllIIlIIllllllIlllIIlI];
            this.inventoryContents[lllllllllllllIIlIIllllllIlllIIlI] = null;
            this.markDirty();
            return lllllllllllllIIlIIllllllIlllIlIl;
        }
        final ItemStack lllllllllllllIIlIIllllllIlllIlII = this.inventoryContents[lllllllllllllIIlIIllllllIlllIIlI].splitStack(lllllllllllllIIlIIllllllIlllIllI);
        if (llIllIlllIIIIll(this.inventoryContents[lllllllllllllIIlIIllllllIlllIIlI].stackSize)) {
            this.inventoryContents[lllllllllllllIIlIIllllllIlllIIlI] = null;
        }
        this.markDirty();
        return lllllllllllllIIlIIllllllIlllIlII;
    }
    
    private static boolean llIllIllIlllllI(final Object lllllllllllllIIlIIllllllIIIIIlll) {
        return lllllllllllllIIlIIllllllIIIIIlll == null;
    }
    
    private static boolean llIllIlllIIIlIl(final int lllllllllllllIIlIIlllllIllllllIl) {
        return lllllllllllllIIlIIlllllIllllllIl > 0;
    }
    
    private static boolean llIllIlllIIIIlI(final int lllllllllllllIIlIIllllllIIIlIIII, final int lllllllllllllIIlIIllllllIIIIllll) {
        return lllllllllllllIIlIIllllllIIIlIIII <= lllllllllllllIIlIIllllllIIIIllll;
    }
    
    private static boolean llIllIlllIIIIll(final int lllllllllllllIIlIIllllllIIIIIIll) {
        return lllllllllllllIIlIIllllllIIIIIIll == 0;
    }
    
    @Override
    public void setField(final int lllllllllllllIIlIIllllllIIlIIIll, final int lllllllllllllIIlIIllllllIIlIIIlI) {
    }
    
    @Override
    public void setInventorySlotContents(final int lllllllllllllIIlIIllllllIlIIlIlI, final ItemStack lllllllllllllIIlIIllllllIlIIlIIl) {
        this.inventoryContents[lllllllllllllIIlIIllllllIlIIlIlI] = lllllllllllllIIlIIllllllIlIIlIIl;
        if (llIllIlllIIIIIl(lllllllllllllIIlIIllllllIlIIlIIl) && llIllIlllIIlIIl(lllllllllllllIIlIIllllllIlIIlIIl.stackSize, this.getInventoryStackLimit())) {
            lllllllllllllIIlIIllllllIlIIlIIl.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }
    
    @Override
    public int getFieldCount() {
        return InventoryBasic.lIIlllIlIIIlll[1];
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIIlIIllllllIIlIllII) {
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int lllllllllllllIIlIIllllllIlIlIIll) {
        if (llIllIlllIIIIIl(this.inventoryContents[lllllllllllllIIlIIllllllIlIlIIll])) {
            final ItemStack lllllllllllllIIlIIllllllIlIlIlIl = this.inventoryContents[lllllllllllllIIlIIllllllIlIlIIll];
            this.inventoryContents[lllllllllllllIIlIIllllllIlIlIIll] = null;
            return lllllllllllllIIlIIllllllIlIlIlIl;
        }
        return null;
    }
    
    private static void llIllIllIllllIl() {
        (lIIlllIlIIIlll = new int[3])[0] = " ".length();
        InventoryBasic.lIIlllIlIIIlll[1] = ((52 + 190 - 107 + 98 ^ 71 + 10 - 15 + 108) & (0x66 ^ 0x51 ^ (0x4D ^ 0x3D) ^ -" ".length()));
        InventoryBasic.lIIlllIlIIIlll[2] = (205 + 51 - 71 + 25 ^ 50 + 67 + 28 + 1);
    }
    
    public ItemStack func_174894_a(final ItemStack lllllllllllllIIlIIllllllIllIIlll) {
        final ItemStack lllllllllllllIIlIIllllllIllIIllI = lllllllllllllIIlIIllllllIllIIlll.copy();
        int lllllllllllllIIlIIllllllIllIIlIl = InventoryBasic.lIIlllIlIIIlll[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIllIlllIIIlll(lllllllllllllIIlIIllllllIllIIlIl, this.slotsCount)) {
            final ItemStack lllllllllllllIIlIIllllllIllIIlII = this.getStackInSlot(lllllllllllllIIlIIllllllIllIIlIl);
            if (llIllIllIlllllI(lllllllllllllIIlIIllllllIllIIlII)) {
                this.setInventorySlotContents(lllllllllllllIIlIIllllllIllIIlIl, lllllllllllllIIlIIllllllIllIIllI);
                this.markDirty();
                return null;
            }
            if (llIllIlllIIIlII(ItemStack.areItemsEqual(lllllllllllllIIlIIllllllIllIIlII, lllllllllllllIIlIIllllllIllIIllI) ? 1 : 0)) {
                final int lllllllllllllIIlIIllllllIllIIIll = Math.min(this.getInventoryStackLimit(), lllllllllllllIIlIIllllllIllIIlII.getMaxStackSize());
                final int lllllllllllllIIlIIllllllIllIIIlI = Math.min(lllllllllllllIIlIIllllllIllIIllI.stackSize, lllllllllllllIIlIIllllllIllIIIll - lllllllllllllIIlIIllllllIllIIlII.stackSize);
                if (llIllIlllIIIlIl(lllllllllllllIIlIIllllllIllIIIlI)) {
                    final ItemStack itemStack = lllllllllllllIIlIIllllllIllIIlII;
                    itemStack.stackSize += lllllllllllllIIlIIllllllIllIIIlI;
                    final ItemStack itemStack2 = lllllllllllllIIlIIllllllIllIIllI;
                    itemStack2.stackSize -= lllllllllllllIIlIIllllllIllIIIlI;
                    if (llIllIlllIIIllI(lllllllllllllIIlIIllllllIllIIllI.stackSize)) {
                        this.markDirty();
                        return null;
                    }
                }
            }
            ++lllllllllllllIIlIIllllllIllIIlIl;
        }
        if (llIllIlllIIlIII(lllllllllllllIIlIIllllllIllIIllI.stackSize, lllllllllllllIIlIIllllllIllIIlll.stackSize)) {
            this.markDirty();
        }
        return lllllllllllllIIlIIllllllIllIIllI;
    }
    
    public InventoryBasic(final IChatComponent lllllllllllllIIlIIlllllllIIlIIII, final int lllllllllllllIIlIIlllllllIIIllll) {
        this(lllllllllllllIIlIIlllllllIIlIIII.getUnformattedText(), (boolean)(InventoryBasic.lIIlllIlIIIlll[0] != 0), lllllllllllllIIlIIlllllllIIIllll);
    }
    
    public void func_110134_a(final IInvBasic lllllllllllllIIlIIlllllllIIIlIIl) {
        if (llIllIllIlllllI(this.field_70480_d)) {
            this.field_70480_d = (List<IInvBasic>)Lists.newArrayList();
        }
        this.field_70480_d.add(lllllllllllllIIlIIlllllllIIIlIIl);
        "".length();
    }
    
    public void setCustomName(final String lllllllllllllIIlIIllllllIIlllIlI) {
        this.hasCustomName = (InventoryBasic.lIIlllIlIIIlll[0] != 0);
        this.inventoryTitle = lllllllllllllIIlIIllllllIIlllIlI;
    }
    
    @Override
    public boolean hasCustomName() {
        return this.hasCustomName;
    }
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (llIllIlllIIIlII(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[InventoryBasic.lIIlllIlIIIlll[1]]);
        }
        return chatComponentStyle;
    }
    
    private static boolean llIllIlllIIlIII(final int lllllllllllllIIlIIlllllIlllllIlI, final int lllllllllllllIIlIIlllllIlllllIIl) {
        return lllllllllllllIIlIIlllllIlllllIlI != lllllllllllllIIlIIlllllIlllllIIl;
    }
}
