// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.MathHelper;
import net.minecraft.item.Item;
import java.util.Iterator;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Set;

public abstract class Container
{
    private final /* synthetic */ Set<Slot> dragSlots;
    public /* synthetic */ List<Slot> inventorySlots;
    private /* synthetic */ int dragEvent;
    private /* synthetic */ short transactionID;
    private static final /* synthetic */ int[] lIIIllIIlllIIl;
    public /* synthetic */ List<ItemStack> inventoryItemStacks;
    private static final /* synthetic */ String[] lIIIllIIlllIII;
    private /* synthetic */ Set<EntityPlayer> playerList;
    private /* synthetic */ int dragMode;
    protected /* synthetic */ List<ICrafting> crafters;
    
    public Container() {
        this.inventoryItemStacks = (List<ItemStack>)Lists.newArrayList();
        this.inventorySlots = (List<Slot>)Lists.newArrayList();
        this.dragMode = Container.lIIIllIIlllIIl[0];
        this.dragSlots = (Set<Slot>)Sets.newHashSet();
        this.crafters = (List<ICrafting>)Lists.newArrayList();
        this.playerList = (Set<EntityPlayer>)Sets.newHashSet();
    }
    
    private static boolean llIIIIllllIIlII(final int lllllllllllllIlIIIIIIlllIIlIIIll, final int lllllllllllllIlIIIIIIlllIIlIIIlI) {
        return lllllllllllllIlIIIIIIlllIIlIIIll >= lllllllllllllIlIIIIIIlllIIlIIIlI;
    }
    
    public boolean getCanCraft(final EntityPlayer lllllllllllllIlIIIIIIllllIlIlllI) {
        int n;
        if (llIIIIllllIIIll(this.playerList.contains(lllllllllllllIlIIIIIIllllIlIlllI) ? 1 : 0)) {
            n = Container.lIIIllIIlllIIl[1];
            "".length();
            if (null != null) {
                return ((0x74 ^ 0x3A) & ~(0x40 ^ 0xE)) != 0x0;
            }
        }
        else {
            n = Container.lIIIllIIlllIIl[3];
        }
        return n != 0;
    }
    
    private static boolean llIIIIllllIIIll(final int lllllllllllllIlIIIIIIlllIIIIllII) {
        return lllllllllllllIlIIIIIIlllIIIIllII != 0;
    }
    
    private static boolean llIIIIllllIlIII(final int lllllllllllllIlIIIIIIlllIIlIIlll, final int lllllllllllllIlIIIIIIlllIIlIIllI) {
        return lllllllllllllIlIIIIIIlllIIlIIlll == lllllllllllllIlIIIIIIlllIIlIIllI;
    }
    
    public abstract boolean canInteractWith(final EntityPlayer p0);
    
    public static boolean isValidDragMode(final int lllllllllllllIlIIIIIIlllIlllIlII, final EntityPlayer lllllllllllllIlIIIIIIlllIlllIIll) {
        int n;
        if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllIlllIlII)) {
            n = Container.lIIIllIIlllIIl[3];
            "".length();
            if (" ".length() <= 0) {
                return ((0xC7 ^ 0x93 ^ (0x45 ^ 0x38)) & (0x3C ^ 0x10 ^ (0x23 ^ 0x26) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllIlllIlII, Container.lIIIllIIlllIIl[3])) {
            n = Container.lIIIllIIlllIIl[3];
            "".length();
            if (((0x53 ^ 0x72) & ~(0x2E ^ 0xF)) == -" ".length()) {
                return ((0x91 ^ 0x9E) & ~(0x87 ^ 0x88)) != 0x0;
            }
        }
        else if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllIlllIlII, Container.lIIIllIIlllIIl[4]) && llIIIIllllIIIll(lllllllllllllIlIIIIIIlllIlllIIll.capabilities.isCreativeMode ? 1 : 0)) {
            n = Container.lIIIllIIlllIIl[3];
            "".length();
            if (((88 + 34 + 10 + 111 ^ 24 + 136 - 144 + 174) & (149 + 158 - 249 + 192 ^ 10 + 40 + 12 + 121 ^ -" ".length())) != 0x0) {
                return ((168 + 67 - 111 + 47 ^ 0 + 33 + 67 + 31) & (0x48 ^ 0x3 ^ (0x1C ^ 0x7F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Container.lIIIllIIlllIIl[1];
        }
        return n != 0;
    }
    
    public void putStacksInSlots(final ItemStack[] lllllllllllllIlIIIIIIllllIllllIl) {
        int lllllllllllllIlIIIIIIllllIllllII = Container.lIIIllIIlllIIl[1];
        "".length();
        if ("  ".length() <= (" ".length() & ~" ".length())) {
            return;
        }
        while (!llIIIIllllIIlII(lllllllllllllIlIIIIIIllllIllllII, lllllllllllllIlIIIIIIllllIllllIl.length)) {
            this.getSlot(lllllllllllllIlIIIIIIllllIllllII).putStack(lllllllllllllIlIIIIIIllllIllllIl[lllllllllllllIlIIIIIIllllIllllII]);
            ++lllllllllllllIlIIIIIIllllIllllII;
        }
    }
    
    public static int calcRedstone(final TileEntity lllllllllllllIlIIIIIIlllIlIlIIIl) {
        int calcRedstoneFromInventory;
        if (llIIIIllllIIIll((lllllllllllllIlIIIIIIlllIlIlIIIl instanceof IInventory) ? 1 : 0)) {
            calcRedstoneFromInventory = calcRedstoneFromInventory((IInventory)lllllllllllllIlIIIIIIlllIlIlIIIl);
            "".length();
            if ("   ".length() < 0) {
                return (0x9A ^ 0xC0) & ~(0xC0 ^ 0x9A);
            }
        }
        else {
            calcRedstoneFromInventory = Container.lIIIllIIlllIIl[1];
        }
        return calcRedstoneFromInventory;
    }
    
    public ItemStack slotClick(final int lllllllllllllIlIIIIIlIIIIIIlllll, final int lllllllllllllIlIIIIIIlllllllIIll, final int lllllllllllllIlIIIIIIlllllllIIlI, final EntityPlayer lllllllllllllIlIIIIIlIIIIIIlllII) {
        ItemStack lllllllllllllIlIIIIIlIIIIIIllIll = null;
        final InventoryPlayer lllllllllllllIlIIIIIlIIIIIIllIlI = lllllllllllllIlIIIIIlIIIIIIlllII.inventory;
        if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIlI, Container.lIIIllIIlllIIl[2])) {
            final int lllllllllllllIlIIIIIlIIIIIIllIIl = this.dragEvent;
            this.dragEvent = getDragEvent(lllllllllllllIlIIIIIIlllllllIIll);
            if ((!llIIIIllllIlIII(lllllllllllllIlIIIIIlIIIIIIllIIl, Container.lIIIllIIlllIIl[3]) || llIIIIllllIlIIl(this.dragEvent, Container.lIIIllIIlllIIl[4])) && llIIIIllllIlIIl(lllllllllllllIlIIIIIlIIIIIIllIIl, this.dragEvent)) {
                this.resetDrag();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (llIIIIllllIIllI(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack())) {
                this.resetDrag();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (llIIIIllllIIlIl(this.dragEvent)) {
                this.dragMode = extractDragMode(lllllllllllllIlIIIIIIlllllllIIll);
                if (llIIIIllllIIIll(isValidDragMode(this.dragMode, lllllllllllllIlIIIIIlIIIIIIlllII) ? 1 : 0)) {
                    this.dragEvent = Container.lIIIllIIlllIIl[3];
                    this.dragSlots.clear();
                    "".length();
                    if (-" ".length() >= 0) {
                        return null;
                    }
                }
                else {
                    this.resetDrag();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
            }
            else if (llIIIIllllIlIII(this.dragEvent, Container.lIIIllIIlllIIl[3])) {
                final Slot lllllllllllllIlIIIIIlIIIIIIllIII = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIIlllll);
                if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIllIII) && llIIIIllllIIIll(canAddItemToSlot(lllllllllllllIlIIIIIlIIIIIIllIII, lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack(), (boolean)(Container.lIIIllIIlllIIl[3] != 0)) ? 1 : 0) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIllIII.isItemValid(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack()) ? 1 : 0) && llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack().stackSize, this.dragSlots.size()) && llIIIIllllIIIll(this.canDragIntoSlot(lllllllllllllIlIIIIIlIIIIIIllIII) ? 1 : 0)) {
                    this.dragSlots.add(lllllllllllllIlIIIIIlIIIIIIllIII);
                    "".length();
                    "".length();
                    if (" ".length() < 0) {
                        return null;
                    }
                }
            }
            else if (llIIIIllllIlIII(this.dragEvent, Container.lIIIllIIlllIIl[4])) {
                if (llIIIIllllIIlIl(this.dragSlots.isEmpty() ? 1 : 0)) {
                    ItemStack lllllllllllllIlIIIIIlIIIIIIlIlll = lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack().copy();
                    int lllllllllllllIlIIIIIlIIIIIIlIllI = lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack().stackSize;
                    final Iterator<Slot> iterator = this.dragSlots.iterator();
                    "".length();
                    if (((0x42 ^ 0x29 ^ (0x8D ^ 0xA6)) & (175 + 93 - 232 + 172 ^ 67 + 23 - 58 + 112 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    while (!llIIIIllllIIlIl(iterator.hasNext() ? 1 : 0)) {
                        final Slot lllllllllllllIlIIIIIlIIIIIIlIlIl = iterator.next();
                        if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIlIlIl) && llIIIIllllIIIll(canAddItemToSlot(lllllllllllllIlIIIIIlIIIIIIlIlIl, lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack(), (boolean)(Container.lIIIllIIlllIIl[3] != 0)) ? 1 : 0) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIlIlIl.isItemValid(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack()) ? 1 : 0) && llIIIIllllIIlII(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack().stackSize, this.dragSlots.size()) && llIIIIllllIIIll(this.canDragIntoSlot(lllllllllllllIlIIIIIlIIIIIIlIlIl) ? 1 : 0)) {
                            final ItemStack lllllllllllllIlIIIIIlIIIIIIlIlII = lllllllllllllIlIIIIIlIIIIIIlIlll.copy();
                            int stackSize;
                            if (llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIlIlIl.getHasStack() ? 1 : 0)) {
                                stackSize = lllllllllllllIlIIIIIlIIIIIIlIlIl.getStack().stackSize;
                                "".length();
                                if (-" ".length() >= (0x9F ^ 0xBE ^ (0x7C ^ 0x59))) {
                                    return null;
                                }
                            }
                            else {
                                stackSize = Container.lIIIllIIlllIIl[1];
                            }
                            final int lllllllllllllIlIIIIIlIIIIIIlIIll = stackSize;
                            computeStackSize(this.dragSlots, this.dragMode, lllllllllllllIlIIIIIlIIIIIIlIlII, lllllllllllllIlIIIIIlIIIIIIlIIll);
                            if (llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIlIlII.stackSize, lllllllllllllIlIIIIIlIIIIIIlIlII.getMaxStackSize())) {
                                lllllllllllllIlIIIIIlIIIIIIlIlII.stackSize = lllllllllllllIlIIIIIlIIIIIIlIlII.getMaxStackSize();
                            }
                            if (llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIlIlII.stackSize, lllllllllllllIlIIIIIlIIIIIIlIlIl.getItemStackLimit(lllllllllllllIlIIIIIlIIIIIIlIlII))) {
                                lllllllllllllIlIIIIIlIIIIIIlIlII.stackSize = lllllllllllllIlIIIIIlIIIIIIlIlIl.getItemStackLimit(lllllllllllllIlIIIIIlIIIIIIlIlII);
                            }
                            lllllllllllllIlIIIIIlIIIIIIlIllI -= lllllllllllllIlIIIIIlIIIIIIlIlII.stackSize - lllllllllllllIlIIIIIlIIIIIIlIIll;
                            lllllllllllllIlIIIIIlIIIIIIlIlIl.putStack(lllllllllllllIlIIIIIlIIIIIIlIlII);
                        }
                    }
                    lllllllllllllIlIIIIIlIIIIIIlIlll.stackSize = lllllllllllllIlIIIIIlIIIIIIlIllI;
                    if (llIIIIllllIlIll(lllllllllllllIlIIIIIlIIIIIIlIlll.stackSize)) {
                        lllllllllllllIlIIIIIlIIIIIIlIlll = null;
                    }
                    lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(lllllllllllllIlIIIIIlIIIIIIlIlll);
                }
                this.resetDrag();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                this.resetDrag();
                "".length();
                if (((0x4E ^ 0x2E) & ~(0x70 ^ 0x10)) != ((0x1 ^ 0x4A) & ~(0x49 ^ 0x2))) {
                    return null;
                }
            }
        }
        else if (llIIIIllllIIIll(this.dragEvent)) {
            this.resetDrag();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if ((!llIIIIllllIIIll(lllllllllllllIlIIIIIIlllllllIIlI) || llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIlI, Container.lIIIllIIlllIIl[3])) && (!llIIIIllllIIIll(lllllllllllllIlIIIIIIlllllllIIll) || llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIll, Container.lIIIllIIlllIIl[3]))) {
            if (llIIIIllllIlIII(lllllllllllllIlIIIIIlIIIIIIlllll, Container.lIIIllIIlllIIl[5])) {
                if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack())) {
                    if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllllllIIll)) {
                        lllllllllllllIlIIIIIlIIIIIIlllII.dropPlayerItemWithRandomChoice(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack(), (boolean)(Container.lIIIllIIlllIIl[3] != 0));
                        "".length();
                        lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(null);
                    }
                    if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIll, Container.lIIIllIIlllIIl[3])) {
                        lllllllllllllIlIIIIIlIIIIIIlllII.dropPlayerItemWithRandomChoice(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack().splitStack(Container.lIIIllIIlllIIl[3]), (boolean)(Container.lIIIllIIlllIIl[3] != 0));
                        "".length();
                        if (llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack().stackSize)) {
                            lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(null);
                            "".length();
                            if (-" ".length() > 0) {
                                return null;
                            }
                        }
                    }
                }
            }
            else if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIlI, Container.lIIIllIIlllIIl[3])) {
                if (llIIIIllllIllII(lllllllllllllIlIIIIIlIIIIIIlllll)) {
                    return null;
                }
                final Slot lllllllllllllIlIIIIIlIIIIIIlIIlI = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIIlllll);
                if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIlIIlI) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIlIIlI.canTakeStack(lllllllllllllIlIIIIIlIIIIIIlllII) ? 1 : 0)) {
                    final ItemStack lllllllllllllIlIIIIIlIIIIIIlIIIl = this.transferStackInSlot(lllllllllllllIlIIIIIlIIIIIIlllII, lllllllllllllIlIIIIIlIIIIIIlllll);
                    if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIlIIIl)) {
                        final Item lllllllllllllIlIIIIIlIIIIIIlIIII = lllllllllllllIlIIIIIlIIIIIIlIIIl.getItem();
                        lllllllllllllIlIIIIIlIIIIIIllIll = lllllllllllllIlIIIIIlIIIIIIlIIIl.copy();
                        if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIlIIlI.getStack()) && llIIIIllllIllIl(lllllllllllllIlIIIIIlIIIIIIlIIlI.getStack().getItem(), lllllllllllllIlIIIIIlIIIIIIlIIII)) {
                            this.retrySlotClick(lllllllllllllIlIIIIIlIIIIIIlllll, lllllllllllllIlIIIIIIlllllllIIll, (boolean)(Container.lIIIllIIlllIIl[3] != 0), lllllllllllllIlIIIIIlIIIIIIlllII);
                            "".length();
                            if (" ".length() == 0) {
                                return null;
                            }
                        }
                    }
                }
            }
            else {
                if (llIIIIllllIllII(lllllllllllllIlIIIIIlIIIIIIlllll)) {
                    return null;
                }
                final Slot lllllllllllllIlIIIIIlIIIIIIIllll = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIIlllll);
                if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIllll)) {
                    ItemStack lllllllllllllIlIIIIIlIIIIIIIlllI = lllllllllllllIlIIIIIlIIIIIIIllll.getStack();
                    final ItemStack lllllllllllllIlIIIIIlIIIIIIIllIl = lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack();
                    if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIlllI)) {
                        lllllllllllllIlIIIIIlIIIIIIllIll = lllllllllllllIlIIIIIlIIIIIIIlllI.copy();
                    }
                    if (llIIIIllllIIllI(lllllllllllllIlIIIIIlIIIIIIIlllI)) {
                        if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIllIl) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIllll.isItemValid(lllllllllllllIlIIIIIlIIIIIIIllIl) ? 1 : 0)) {
                            int stackSize2;
                            if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllllllIIll)) {
                                stackSize2 = lllllllllllllIlIIIIIlIIIIIIIllIl.stackSize;
                                "".length();
                                if (((0x5E ^ 0x7F) & ~(0x56 ^ 0x77)) != 0x0) {
                                    return null;
                                }
                            }
                            else {
                                stackSize2 = Container.lIIIllIIlllIIl[3];
                            }
                            int lllllllllllllIlIIIIIlIIIIIIIllII = stackSize2;
                            if (llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIIllII, lllllllllllllIlIIIIIlIIIIIIIllll.getItemStackLimit(lllllllllllllIlIIIIIlIIIIIIIllIl))) {
                                lllllllllllllIlIIIIIlIIIIIIIllII = lllllllllllllIlIIIIIlIIIIIIIllll.getItemStackLimit(lllllllllllllIlIIIIIlIIIIIIIllIl);
                            }
                            if (llIIIIllllIIlII(lllllllllllllIlIIIIIlIIIIIIIllIl.stackSize, lllllllllllllIlIIIIIlIIIIIIIllII)) {
                                lllllllllllllIlIIIIIlIIIIIIIllll.putStack(lllllllllllllIlIIIIIlIIIIIIIllIl.splitStack(lllllllllllllIlIIIIIlIIIIIIIllII));
                            }
                            if (llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIllIl.stackSize)) {
                                lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(null);
                                "".length();
                                if (-"  ".length() > 0) {
                                    return null;
                                }
                            }
                        }
                    }
                    else if (llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIllll.canTakeStack(lllllllllllllIlIIIIIlIIIIIIlllII) ? 1 : 0)) {
                        if (llIIIIllllIIllI(lllllllllllllIlIIIIIlIIIIIIIllIl)) {
                            int stackSize3;
                            if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllllllIIll)) {
                                stackSize3 = lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize;
                                "".length();
                                if ("   ".length() == 0) {
                                    return null;
                                }
                            }
                            else {
                                stackSize3 = (lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize + Container.lIIIllIIlllIIl[3]) / Container.lIIIllIIlllIIl[4];
                            }
                            final int lllllllllllllIlIIIIIlIIIIIIIlIll = stackSize3;
                            final ItemStack lllllllllllllIlIIIIIlIIIIIIIlIlI = lllllllllllllIlIIIIIlIIIIIIIllll.decrStackSize(lllllllllllllIlIIIIIlIIIIIIIlIll);
                            lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(lllllllllllllIlIIIIIlIIIIIIIlIlI);
                            if (llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize)) {
                                lllllllllllllIlIIIIIlIIIIIIIllll.putStack(null);
                            }
                            lllllllllllllIlIIIIIlIIIIIIIllll.onPickupFromSlot(lllllllllllllIlIIIIIlIIIIIIlllII, lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack());
                            "".length();
                            if (-(0x69 ^ 0x3B ^ (0x55 ^ 0x2)) >= 0) {
                                return null;
                            }
                        }
                        else if (llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIllll.isItemValid(lllllllllllllIlIIIIIlIIIIIIIllIl) ? 1 : 0)) {
                            if (llIIIIllllIllIl(lllllllllllllIlIIIIIlIIIIIIIlllI.getItem(), lllllllllllllIlIIIIIlIIIIIIIllIl.getItem()) && llIIIIllllIlIII(lllllllllllllIlIIIIIlIIIIIIIlllI.getMetadata(), lllllllllllllIlIIIIIlIIIIIIIllIl.getMetadata()) && llIIIIllllIIIll(ItemStack.areItemStackTagsEqual(lllllllllllllIlIIIIIlIIIIIIIlllI, lllllllllllllIlIIIIIlIIIIIIIllIl) ? 1 : 0)) {
                                int stackSize4;
                                if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllllllIIll)) {
                                    stackSize4 = lllllllllllllIlIIIIIlIIIIIIIllIl.stackSize;
                                    "".length();
                                    if (((0x34 ^ 0x60) & ~(0xD3 ^ 0x87)) < 0) {
                                        return null;
                                    }
                                }
                                else {
                                    stackSize4 = Container.lIIIllIIlllIIl[3];
                                }
                                int lllllllllllllIlIIIIIlIIIIIIIlIIl = stackSize4;
                                if (llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIIlIIl, lllllllllllllIlIIIIIlIIIIIIIllll.getItemStackLimit(lllllllllllllIlIIIIIlIIIIIIIllIl) - lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize)) {
                                    lllllllllllllIlIIIIIlIIIIIIIlIIl = lllllllllllllIlIIIIIlIIIIIIIllll.getItemStackLimit(lllllllllllllIlIIIIIlIIIIIIIllIl) - lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize;
                                }
                                if (llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIIlIIl, lllllllllllllIlIIIIIlIIIIIIIllIl.getMaxStackSize() - lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize)) {
                                    lllllllllllllIlIIIIIlIIIIIIIlIIl = lllllllllllllIlIIIIIlIIIIIIIllIl.getMaxStackSize() - lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize;
                                }
                                lllllllllllllIlIIIIIlIIIIIIIllIl.splitStack(lllllllllllllIlIIIIIlIIIIIIIlIIl);
                                "".length();
                                if (llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIllIl.stackSize)) {
                                    lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(null);
                                }
                                final ItemStack itemStack = lllllllllllllIlIIIIIlIIIIIIIlllI;
                                itemStack.stackSize += lllllllllllllIlIIIIIlIIIIIIIlIIl;
                                "".length();
                                if (null != null) {
                                    return null;
                                }
                            }
                            else if (llIIIIllllIlllI(lllllllllllllIlIIIIIlIIIIIIIllIl.stackSize, lllllllllllllIlIIIIIlIIIIIIIllll.getItemStackLimit(lllllllllllllIlIIIIIlIIIIIIIllIl))) {
                                lllllllllllllIlIIIIIlIIIIIIIllll.putStack(lllllllllllllIlIIIIIlIIIIIIIllIl);
                                lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(lllllllllllllIlIIIIIlIIIIIIIlllI);
                                "".length();
                                if (-" ".length() == "   ".length()) {
                                    return null;
                                }
                            }
                        }
                        else if (llIIIIllllIllIl(lllllllllllllIlIIIIIlIIIIIIIlllI.getItem(), lllllllllllllIlIIIIIlIIIIIIIllIl.getItem()) && llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIIllIl.getMaxStackSize(), Container.lIIIllIIlllIIl[3]) && (!llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIlllI.getHasSubtypes() ? 1 : 0) || llIIIIllllIlIII(lllllllllllllIlIIIIIlIIIIIIIlllI.getMetadata(), lllllllllllllIlIIIIIlIIIIIIIllIl.getMetadata())) && llIIIIllllIIIll(ItemStack.areItemStackTagsEqual(lllllllllllllIlIIIIIlIIIIIIIlllI, lllllllllllllIlIIIIIlIIIIIIIllIl) ? 1 : 0)) {
                            final int lllllllllllllIlIIIIIlIIIIIIIlIII = lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize;
                            if (llIIIIllllIllll(lllllllllllllIlIIIIIlIIIIIIIlIII) && llIIIIllllIlllI(lllllllllllllIlIIIIIlIIIIIIIlIII + lllllllllllllIlIIIIIlIIIIIIIllIl.stackSize, lllllllllllllIlIIIIIlIIIIIIIllIl.getMaxStackSize())) {
                                final ItemStack itemStack2 = lllllllllllllIlIIIIIlIIIIIIIllIl;
                                itemStack2.stackSize += lllllllllllllIlIIIIIlIIIIIIIlIII;
                                lllllllllllllIlIIIIIlIIIIIIIlllI = lllllllllllllIlIIIIIlIIIIIIIllll.decrStackSize(lllllllllllllIlIIIIIlIIIIIIIlIII);
                                if (llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIlllI.stackSize)) {
                                    lllllllllllllIlIIIIIlIIIIIIIllll.putStack(null);
                                }
                                lllllllllllllIlIIIIIlIIIIIIIllll.onPickupFromSlot(lllllllllllllIlIIIIIlIIIIIIlllII, lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack());
                            }
                        }
                    }
                    lllllllllllllIlIIIIIlIIIIIIIllll.onSlotChanged();
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
            }
        }
        else if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIlI, Container.lIIIllIIlllIIl[4]) && llIIIIlllllIIII(lllllllllllllIlIIIIIIlllllllIIll) && llIIIIlllllIIIl(lllllllllllllIlIIIIIIlllllllIIll, Container.lIIIllIIlllIIl[6])) {
            final Slot lllllllllllllIlIIIIIlIIIIIIIIlll = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIIlllll);
            if (llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIIlll.canTakeStack(lllllllllllllIlIIIIIlIIIIIIlllII) ? 1 : 0)) {
                final ItemStack lllllllllllllIlIIIIIlIIIIIIIIllI = lllllllllllllIlIIIIIlIIIIIIllIlI.getStackInSlot(lllllllllllllIlIIIIIIlllllllIIll);
                int n;
                if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIIllI) && (!llIIIIllllIllIl(lllllllllllllIlIIIIIlIIIIIIIIlll.inventory, lllllllllllllIlIIIIIlIIIIIIllIlI) || llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIIlll.isItemValid(lllllllllllllIlIIIIIlIIIIIIIIllI) ? 1 : 0))) {
                    n = Container.lIIIllIIlllIIl[1];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return null;
                    }
                }
                else {
                    n = Container.lIIIllIIlllIIl[3];
                }
                boolean lllllllllllllIlIIIIIlIIIIIIIIlIl = n != 0;
                int lllllllllllllIlIIIIIlIIIIIIIIlII = Container.lIIIllIIlllIIl[0];
                if (llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIIlIl ? 1 : 0)) {
                    lllllllllllllIlIIIIIlIIIIIIIIlII = lllllllllllllIlIIIIIlIIIIIIllIlI.getFirstEmptyStack();
                    final int n2 = lllllllllllllIlIIIIIlIIIIIIIIlIl ? 1 : 0;
                    int n3;
                    if (llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIIIlII, Container.lIIIllIIlllIIl[0])) {
                        n3 = Container.lIIIllIIlllIIl[3];
                        "".length();
                        if (-"   ".length() >= 0) {
                            return null;
                        }
                    }
                    else {
                        n3 = Container.lIIIllIIlllIIl[1];
                    }
                    lllllllllllllIlIIIIIlIIIIIIIIlIl = ((n2 | n3) != 0x0);
                }
                if (llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIIlll.getHasStack() ? 1 : 0) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIIlIl ? 1 : 0)) {
                    final ItemStack lllllllllllllIlIIIIIlIIIIIIIIIll = lllllllllllllIlIIIIIlIIIIIIIIlll.getStack();
                    lllllllllllllIlIIIIIlIIIIIIllIlI.setInventorySlotContents(lllllllllllllIlIIIIIIlllllllIIll, lllllllllllllIlIIIIIlIIIIIIIIIll.copy());
                    if ((!llIIIIllllIllIl(lllllllllllllIlIIIIIlIIIIIIIIlll.inventory, lllllllllllllIlIIIIIlIIIIIIllIlI) || llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIIlll.isItemValid(lllllllllllllIlIIIIIlIIIIIIIIllI) ? 1 : 0)) && llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIIllI)) {
                        if (llIIIIllllIlIlI(lllllllllllllIlIIIIIlIIIIIIIIlII, Container.lIIIllIIlllIIl[0])) {
                            lllllllllllllIlIIIIIlIIIIIIllIlI.addItemStackToInventory(lllllllllllllIlIIIIIlIIIIIIIIllI);
                            "".length();
                            lllllllllllllIlIIIIIlIIIIIIIIlll.decrStackSize(lllllllllllllIlIIIIIlIIIIIIIIIll.stackSize);
                            "".length();
                            lllllllllllllIlIIIIIlIIIIIIIIlll.putStack(null);
                            lllllllllllllIlIIIIIlIIIIIIIIlll.onPickupFromSlot(lllllllllllllIlIIIIIlIIIIIIlllII, lllllllllllllIlIIIIIlIIIIIIIIIll);
                            "".length();
                            if ("  ".length() > "  ".length()) {
                                return null;
                            }
                        }
                    }
                    else {
                        lllllllllllllIlIIIIIlIIIIIIIIlll.decrStackSize(lllllllllllllIlIIIIIlIIIIIIIIIll.stackSize);
                        "".length();
                        lllllllllllllIlIIIIIlIIIIIIIIlll.putStack(lllllllllllllIlIIIIIlIIIIIIIIllI);
                        lllllllllllllIlIIIIIlIIIIIIIIlll.onPickupFromSlot(lllllllllllllIlIIIIIlIIIIIIlllII, lllllllllllllIlIIIIIlIIIIIIIIIll);
                        "".length();
                        if ("  ".length() > "  ".length()) {
                            return null;
                        }
                    }
                }
                else if (llIIIIllllIIlIl(lllllllllllllIlIIIIIlIIIIIIIIlll.getHasStack() ? 1 : 0) && llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIIllI) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIIlll.isItemValid(lllllllllllllIlIIIIIlIIIIIIIIllI) ? 1 : 0)) {
                    lllllllllllllIlIIIIIlIIIIIIllIlI.setInventorySlotContents(lllllllllllllIlIIIIIIlllllllIIll, null);
                    lllllllllllllIlIIIIIlIIIIIIIIlll.putStack(lllllllllllllIlIIIIIlIIIIIIIIllI);
                    "".length();
                    if (" ".length() < 0) {
                        return null;
                    }
                }
            }
        }
        else if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIlI, Container.lIIIllIIlllIIl[7]) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIlllII.capabilities.isCreativeMode ? 1 : 0) && llIIIIllllIIllI(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack()) && llIIIIlllllIIII(lllllllllllllIlIIIIIlIIIIIIlllll)) {
            final Slot lllllllllllllIlIIIIIlIIIIIIIIIlI = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIIlllll);
            if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIIIlI) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIIIlI.getHasStack() ? 1 : 0)) {
                final ItemStack lllllllllllllIlIIIIIlIIIIIIIIIIl = lllllllllllllIlIIIIIlIIIIIIIIIlI.getStack().copy();
                lllllllllllllIlIIIIIlIIIIIIIIIIl.stackSize = lllllllllllllIlIIIIIlIIIIIIIIIIl.getMaxStackSize();
                lllllllllllllIlIIIIIlIIIIIIllIlI.setItemStack(lllllllllllllIlIIIIIlIIIIIIIIIIl);
                "".length();
                if ("   ".length() < ((0xE5 ^ 0x97 ^ (0xF2 ^ 0xA3)) & (100 + 35 - 99 + 138 ^ 110 + 138 - 188 + 81 ^ -" ".length()))) {
                    return null;
                }
            }
        }
        else if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIlI, Container.lIIIllIIlllIIl[8]) && llIIIIllllIIllI(lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack()) && llIIIIlllllIIII(lllllllllllllIlIIIIIlIIIIIIlllll)) {
            final Slot lllllllllllllIlIIIIIlIIIIIIIIIII = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIIlllll);
            if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIIIIIII) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIIIII.getHasStack() ? 1 : 0) && llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIIIIIIII.canTakeStack(lllllllllllllIlIIIIIlIIIIIIlllII) ? 1 : 0)) {
                final Slot slot = lllllllllllllIlIIIIIlIIIIIIIIIII;
                int stackSize5;
                if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllllllIIll)) {
                    stackSize5 = Container.lIIIllIIlllIIl[3];
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                else {
                    stackSize5 = lllllllllllllIlIIIIIlIIIIIIIIIII.getStack().stackSize;
                }
                final ItemStack lllllllllllllIlIIIIIIlllllllllll = slot.decrStackSize(stackSize5);
                lllllllllllllIlIIIIIlIIIIIIIIIII.onPickupFromSlot(lllllllllllllIlIIIIIlIIIIIIlllII, lllllllllllllIlIIIIIIlllllllllll);
                lllllllllllllIlIIIIIlIIIIIIlllII.dropPlayerItemWithRandomChoice(lllllllllllllIlIIIIIIlllllllllll, (boolean)(Container.lIIIllIIlllIIl[3] != 0));
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        else if (llIIIIllllIlIII(lllllllllllllIlIIIIIIlllllllIIlI, Container.lIIIllIIlllIIl[9]) && llIIIIlllllIIII(lllllllllllllIlIIIIIlIIIIIIlllll)) {
            final Slot lllllllllllllIlIIIIIIllllllllllI = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIIlllll);
            final ItemStack lllllllllllllIlIIIIIIlllllllllIl = lllllllllllllIlIIIIIlIIIIIIllIlI.getItemStack();
            if (llIIIIllllIIlll(lllllllllllllIlIIIIIIlllllllllIl) && (!llIIIIllllIIlll(lllllllllllllIlIIIIIIllllllllllI) || !llIIIIllllIIIll(lllllllllllllIlIIIIIIllllllllllI.getHasStack() ? 1 : 0) || llIIIIllllIIlIl(lllllllllllllIlIIIIIIllllllllllI.canTakeStack(lllllllllllllIlIIIIIlIIIIIIlllII) ? 1 : 0))) {
                int n4;
                if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllllllIIll)) {
                    n4 = Container.lIIIllIIlllIIl[1];
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                }
                else {
                    n4 = this.inventorySlots.size() - Container.lIIIllIIlllIIl[3];
                }
                final int lllllllllllllIlIIIIIIlllllllllII = n4;
                int n5;
                if (llIIIIllllIIlIl(lllllllllllllIlIIIIIIlllllllIIll)) {
                    n5 = Container.lIIIllIIlllIIl[3];
                    "".length();
                    if (-(87 + 98 - 128 + 97 ^ 131 + 152 - 148 + 23) >= 0) {
                        return null;
                    }
                }
                else {
                    n5 = Container.lIIIllIIlllIIl[0];
                }
                final int lllllllllllllIlIIIIIIllllllllIll = n5;
                int lllllllllllllIlIIIIIIllllllllIlI = Container.lIIIllIIlllIIl[1];
                "".length();
                if ((0x32 ^ 0x44 ^ (0x27 ^ 0x55)) < ((39 + 75 + 60 + 56 ^ 142 + 107 - 248 + 159) & (80 + 85 - 3 + 56 ^ 106 + 102 - 57 + 5 ^ -" ".length()))) {
                    return null;
                }
                while (!llIIIIllllIIlII(lllllllllllllIlIIIIIIllllllllIlI, Container.lIIIllIIlllIIl[4])) {
                    int lllllllllllllIlIIIIIIllllllllIIl = lllllllllllllIlIIIIIIlllllllllII;
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return null;
                    }
                    while (llIIIIlllllIIII(lllllllllllllIlIIIIIIllllllllIIl) && llIIIIlllllIIIl(lllllllllllllIlIIIIIIllllllllIIl, this.inventorySlots.size()) && !llIIIIllllIIlII(lllllllllllllIlIIIIIIlllllllllIl.stackSize, lllllllllllllIlIIIIIIlllllllllIl.getMaxStackSize())) {
                        final Slot lllllllllllllIlIIIIIIllllllllIII = this.inventorySlots.get(lllllllllllllIlIIIIIIllllllllIIl);
                        if (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllllllIII.getHasStack() ? 1 : 0) && llIIIIllllIIIll(canAddItemToSlot(lllllllllllllIlIIIIIIllllllllIII, lllllllllllllIlIIIIIIlllllllllIl, (boolean)(Container.lIIIllIIlllIIl[3] != 0)) ? 1 : 0) && llIIIIllllIIIll(lllllllllllllIlIIIIIIllllllllIII.canTakeStack(lllllllllllllIlIIIIIlIIIIIIlllII) ? 1 : 0) && llIIIIllllIIIll(this.canMergeSlot(lllllllllllllIlIIIIIIlllllllllIl, lllllllllllllIlIIIIIIllllllllIII) ? 1 : 0) && (!llIIIIllllIIlIl(lllllllllllllIlIIIIIIllllllllIlI) || llIIIIllllIlIIl(lllllllllllllIlIIIIIIllllllllIII.getStack().stackSize, lllllllllllllIlIIIIIIllllllllIII.getStack().getMaxStackSize()))) {
                            final int lllllllllllllIlIIIIIIlllllllIlll = Math.min(lllllllllllllIlIIIIIIlllllllllIl.getMaxStackSize() - lllllllllllllIlIIIIIIlllllllllIl.stackSize, lllllllllllllIlIIIIIIllllllllIII.getStack().stackSize);
                            final ItemStack lllllllllllllIlIIIIIIlllllllIllI = lllllllllllllIlIIIIIIllllllllIII.decrStackSize(lllllllllllllIlIIIIIIlllllllIlll);
                            final ItemStack itemStack3 = lllllllllllllIlIIIIIIlllllllllIl;
                            itemStack3.stackSize += lllllllllllllIlIIIIIIlllllllIlll;
                            if (llIIIIllllIlIll(lllllllllllllIlIIIIIIlllllllIllI.stackSize)) {
                                lllllllllllllIlIIIIIIllllllllIII.putStack(null);
                            }
                            lllllllllllllIlIIIIIIllllllllIII.onPickupFromSlot(lllllllllllllIlIIIIIlIIIIIIlllII, lllllllllllllIlIIIIIIlllllllIllI);
                        }
                        lllllllllllllIlIIIIIIllllllllIIl += lllllllllllllIlIIIIIIllllllllIll;
                    }
                    ++lllllllllllllIlIIIIIIllllllllIlI;
                }
            }
            this.detectAndSendChanges();
        }
        return lllllllllllllIlIIIIIlIIIIIIllIll;
    }
    
    protected void resetDrag() {
        this.dragEvent = Container.lIIIllIIlllIIl[1];
        this.dragSlots.clear();
    }
    
    private static boolean llIIIIlllllIIII(final int lllllllllllllIlIIIIIIlllIIIIlIII) {
        return lllllllllllllIlIIIIIIlllIIIIlIII >= 0;
    }
    
    private static boolean llIIIIllllIlIll(final int lllllllllllllIlIIIIIIlllIIIIIlII) {
        return lllllllllllllIlIIIIIIlllIIIIIlII <= 0;
    }
    
    public static int calcRedstoneFromInventory(final IInventory lllllllllllllIlIIIIIIlllIlIIlIll) {
        if (llIIIIllllIIllI(lllllllllllllIlIIIIIIlllIlIIlIll)) {
            return Container.lIIIllIIlllIIl[1];
        }
        int lllllllllllllIlIIIIIIlllIlIIlIlI = Container.lIIIllIIlllIIl[1];
        float lllllllllllllIlIIIIIIlllIlIIlIIl = 0.0f;
        int lllllllllllllIlIIIIIIlllIlIIlIII = Container.lIIIllIIlllIIl[1];
        "".length();
        if (((0x65 ^ 0x62) & ~(0x39 ^ 0x3E)) < 0) {
            return (0xAB ^ 0x9A) & ~(0x99 ^ 0xA8);
        }
        while (!llIIIIllllIIlII(lllllllllllllIlIIIIIIlllIlIIlIII, lllllllllllllIlIIIIIIlllIlIIlIll.getSizeInventory())) {
            final ItemStack lllllllllllllIlIIIIIIlllIlIIIlll = lllllllllllllIlIIIIIIlllIlIIlIll.getStackInSlot(lllllllllllllIlIIIIIIlllIlIIlIII);
            if (llIIIIllllIIlll(lllllllllllllIlIIIIIIlllIlIIIlll)) {
                lllllllllllllIlIIIIIIlllIlIIlIIl += lllllllllllllIlIIIIIIlllIlIIIlll.stackSize / (float)Math.min(lllllllllllllIlIIIIIIlllIlIIlIll.getInventoryStackLimit(), lllllllllllllIlIIIIIIlllIlIIIlll.getMaxStackSize());
                ++lllllllllllllIlIIIIIIlllIlIIlIlI;
            }
            ++lllllllllllllIlIIIIIIlllIlIIlIII;
        }
        lllllllllllllIlIIIIIIlllIlIIlIIl /= lllllllllllllIlIIIIIIlllIlIIlIll.getSizeInventory();
        final int floor_float = MathHelper.floor_float(lllllllllllllIlIIIIIIlllIlIIlIIl * 14.0f);
        int n;
        if (llIIIIllllIllll(lllllllllllllIlIIIIIIlllIlIIlIlI)) {
            n = Container.lIIIllIIlllIIl[3];
            "".length();
            if (null != null) {
                return (0xCC ^ 0x8D) & ~(0xD2 ^ 0x93);
            }
        }
        else {
            n = Container.lIIIllIIlllIIl[1];
        }
        return floor_float + n;
    }
    
    private static boolean llIIIIllllIIlll(final Object lllllllllllllIlIIIIIIlllIIIlIlII) {
        return lllllllllllllIlIIIIIIlllIIIlIlII != null;
    }
    
    private static void llIIIIllllIIIlI() {
        (lIIIllIIlllIIl = new int[10])[0] = -" ".length();
        Container.lIIIllIIlllIIl[1] = ("  ".length() & ("  ".length() ^ -" ".length()));
        Container.lIIIllIIlllIIl[2] = (62 + 133 - 4 + 2 ^ 92 + 14 + 55 + 35);
        Container.lIIIllIIlllIIl[3] = " ".length();
        Container.lIIIllIIlllIIl[4] = "  ".length();
        Container.lIIIllIIlllIIl[5] = -(0xFFFFF3E7 & 0xFFF);
        Container.lIIIllIIlllIIl[6] = (0x45 ^ 0x59 ^ (0x58 ^ 0x4D));
        Container.lIIIllIIlllIIl[7] = "   ".length();
        Container.lIIIllIIlllIIl[8] = (0x48 ^ 0x4C);
        Container.lIIIllIIlllIIl[9] = (0x52 ^ 0x54);
    }
    
    private static boolean llIIIIllllIlIlI(final int lllllllllllllIlIIIIIIlllIIIlIlll, final int lllllllllllllIlIIIIIIlllIIIlIllI) {
        return lllllllllllllIlIIIIIIlllIIIlIlll > lllllllllllllIlIIIIIIlllIIIlIllI;
    }
    
    public List<ItemStack> getInventory() {
        final List<ItemStack> lllllllllllllIlIIIIIlIIIIllIIllI = (List<ItemStack>)Lists.newArrayList();
        int lllllllllllllIlIIIIIlIIIIllIIlIl = Container.lIIIllIIlllIIl[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIIIIllllIIlII(lllllllllllllIlIIIIIlIIIIllIIlIl, this.inventorySlots.size())) {
            lllllllllllllIlIIIIIlIIIIllIIllI.add(this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIllIIlIl).getStack());
            "".length();
            ++lllllllllllllIlIIIIIlIIIIllIIlIl;
        }
        return lllllllllllllIlIIIIIlIIIIllIIllI;
    }
    
    public void updateProgressBar(final int lllllllllllllIlIIIIIIllllIllIlll, final int lllllllllllllIlIIIIIIllllIllIllI) {
    }
    
    public static void computeStackSize(final Set<Slot> lllllllllllllIlIIIIIIlllIlIllIIl, final int lllllllllllllIlIIIIIIlllIlIllIII, final ItemStack lllllllllllllIlIIIIIIlllIlIlIlll, final int lllllllllllllIlIIIIIIlllIlIllIlI) {
        switch (lllllllllllllIlIIIIIIlllIlIllIII) {
            case 0: {
                lllllllllllllIlIIIIIIlllIlIlIlll.stackSize = MathHelper.floor_float(lllllllllllllIlIIIIIIlllIlIlIlll.stackSize / (float)lllllllllllllIlIIIIIIlllIlIllIIl.size());
                "".length();
                if (((0xEE ^ 0xB2 ^ (0x49 ^ 0x44)) & (0x7D ^ 0x65 ^ (0x35 ^ 0x7C) ^ -" ".length())) < 0) {
                    return;
                }
                break;
            }
            case 1: {
                lllllllllllllIlIIIIIIlllIlIlIlll.stackSize = Container.lIIIllIIlllIIl[3];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                break;
            }
            case 2: {
                lllllllllllllIlIIIIIIlllIlIlIlll.stackSize = lllllllllllllIlIIIIIIlllIlIlIlll.getItem().getItemStackLimit();
                break;
            }
        }
        lllllllllllllIlIIIIIIlllIlIlIlll.stackSize += lllllllllllllIlIIIIIIlllIlIllIlI;
    }
    
    public boolean canDragIntoSlot(final Slot lllllllllllllIlIIIIIIlllIlIlIlII) {
        return Container.lIIIllIIlllIIl[3] != 0;
    }
    
    private static boolean llIIIIllllIlllI(final int lllllllllllllIlIIIIIIlllIIIllIll, final int lllllllllllllIlIIIIIIlllIIIllIlI) {
        return lllllllllllllIlIIIIIIlllIIIllIll <= lllllllllllllIlIIIIIIlllIIIllIlI;
    }
    
    public void setCanCraft(final EntityPlayer lllllllllllllIlIIIIIIllllIlIIlII, final boolean lllllllllllllIlIIIIIIllllIlIIIll) {
        if (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIlIIIll ? 1 : 0)) {
            this.playerList.remove(lllllllllllllIlIIIIIIllllIlIIlII);
            "".length();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            this.playerList.add(lllllllllllllIlIIIIIIllllIlIIlII);
            "".length();
        }
    }
    
    public short getNextTransactionID(final InventoryPlayer lllllllllllllIlIIIIIIllllIllIIll) {
        this.transactionID += (short)Container.lIIIllIIlllIIl[3];
        return this.transactionID;
    }
    
    public void putStackInSlot(final int lllllllllllllIlIIIIIIlllllIIIIll, final ItemStack lllllllllllllIlIIIIIIlllllIIIlIl) {
        this.getSlot(lllllllllllllIlIIIIIIlllllIIIIll).putStack(lllllllllllllIlIIIIIIlllllIIIlIl);
    }
    
    private static boolean llIIIIllllIllII(final int lllllllllllllIlIIIIIIlllIIIIIllI) {
        return lllllllllllllIlIIIIIIlllIIIIIllI < 0;
    }
    
    private static boolean llIIIIllllIlIIl(final int lllllllllllllIlIIIIIIllIllllllll, final int lllllllllllllIlIIIIIIllIlllllllI) {
        return lllllllllllllIlIIIIIIllIllllllll != lllllllllllllIlIIIIIIllIlllllllI;
    }
    
    private static boolean llIIIIllllIllll(final int lllllllllllllIlIIIIIIlllIIIIIIlI) {
        return lllllllllllllIlIIIIIIlllIIIIIIlI > 0;
    }
    
    public Slot getSlotFromInventory(final IInventory lllllllllllllIlIIIIIlIIIIlIIlIIl, final int lllllllllllllIlIIIIIlIIIIlIIlIII) {
        int lllllllllllllIlIIIIIlIIIIlIIIlll = Container.lIIIllIIlllIIl[1];
        "".length();
        if ((0x1F ^ 0x1A) == 0x0) {
            return null;
        }
        while (!llIIIIllllIIlII(lllllllllllllIlIIIIIlIIIIlIIIlll, this.inventorySlots.size())) {
            final Slot lllllllllllllIlIIIIIlIIIIlIIIllI = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIlIIIlll);
            if (llIIIIllllIIIll(lllllllllllllIlIIIIIlIIIIlIIIllI.isHere(lllllllllllllIlIIIIIlIIIIlIIlIIl, lllllllllllllIlIIIIIlIIIIlIIlIII) ? 1 : 0)) {
                return lllllllllllllIlIIIIIlIIIIlIIIllI;
            }
            ++lllllllllllllIlIIIIIlIIIIlIIIlll;
        }
        return null;
    }
    
    public static int getDragEvent(final int lllllllllllllIlIIIIIIlllIllllllI) {
        return lllllllllllllIlIIIIIIlllIllllllI & Container.lIIIllIIlllIIl[7];
    }
    
    public Slot getSlot(final int lllllllllllllIlIIIIIlIIIIIlllIll) {
        return this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIlllIll);
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIlIIIIIlIIIIIllIllI, final int lllllllllllllIlIIIIIlIIIIIllIIlI) {
        final Slot lllllllllllllIlIIIIIlIIIIIllIlII = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIIllIIlI);
        ItemStack stack;
        if (llIIIIllllIIlll(lllllllllllllIlIIIIIlIIIIIllIlII)) {
            stack = lllllllllllllIlIIIIIlIIIIIllIlII.getStack();
            "".length();
            if (((0x32 ^ 0x6B ^ (0x1D ^ 0x42)) & (97 + 156 - 126 + 34 ^ 42 + 8 + 26 + 91 ^ -" ".length()) & (((0x1E ^ 0x19 ^ (0xBD ^ 0xAD)) & (0xC3 ^ 0x93 ^ (0xC9 ^ 0x8E) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            stack = null;
        }
        return stack;
    }
    
    public static int extractDragMode(final int lllllllllllllIlIIIIIIllllIIIIIII) {
        return lllllllllllllIlIIIIIIllllIIIIIII >> Container.lIIIllIIlllIIl[4] & Container.lIIIllIIlllIIl[7];
    }
    
    public void onCraftMatrixChanged(final IInventory lllllllllllllIlIIIIIIlllllIIllII) {
        this.detectAndSendChanges();
    }
    
    public void detectAndSendChanges() {
        int lllllllllllllIlIIIIIlIIIIlIllIll = Container.lIIIllIIlllIIl[1];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!llIIIIllllIIlII(lllllllllllllIlIIIIIlIIIIlIllIll, this.inventorySlots.size())) {
            final ItemStack lllllllllllllIlIIIIIlIIIIlIllIlI = this.inventorySlots.get(lllllllllllllIlIIIIIlIIIIlIllIll).getStack();
            ItemStack lllllllllllllIlIIIIIlIIIIlIllIIl = this.inventoryItemStacks.get(lllllllllllllIlIIIIIlIIIIlIllIll);
            if (llIIIIllllIIlIl(ItemStack.areItemStacksEqual(lllllllllllllIlIIIIIlIIIIlIllIIl, lllllllllllllIlIIIIIlIIIIlIllIlI) ? 1 : 0)) {
                ItemStack copy;
                if (llIIIIllllIIllI(lllllllllllllIlIIIIIlIIIIlIllIlI)) {
                    copy = null;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else {
                    copy = lllllllllllllIlIIIIIlIIIIlIllIlI.copy();
                }
                lllllllllllllIlIIIIIlIIIIlIllIIl = copy;
                this.inventoryItemStacks.set(lllllllllllllIlIIIIIlIIIIlIllIll, lllllllllllllIlIIIIIlIIIIlIllIIl);
                "".length();
                int lllllllllllllIlIIIIIlIIIIlIllIII = Container.lIIIllIIlllIIl[1];
                "".length();
                if (-(0x33 ^ 0x6E ^ (0x0 ^ 0x59)) >= 0) {
                    return;
                }
                while (!llIIIIllllIIlII(lllllllllllllIlIIIIIlIIIIlIllIII, this.crafters.size())) {
                    this.crafters.get(lllllllllllllIlIIIIIlIIIIlIllIII).sendSlotContents(this, lllllllllllllIlIIIIIlIIIIlIllIll, lllllllllllllIlIIIIIlIIIIlIllIIl);
                    ++lllllllllllllIlIIIIIlIIIIlIllIII;
                }
            }
            ++lllllllllllllIlIIIIIlIIIIlIllIll;
        }
    }
    
    private static boolean llIIIIllllIllIl(final Object lllllllllllllIlIIIIIIlllIIIlIIIl, final Object lllllllllllllIlIIIIIIlllIIIlIIII) {
        return lllllllllllllIlIIIIIIlllIIIlIIIl == lllllllllllllIlIIIIIIlllIIIlIIII;
    }
    
    public static int func_94534_d(final int lllllllllllllIlIIIIIIlllIllllIII, final int lllllllllllllIlIIIIIIlllIllllIIl) {
        return (lllllllllllllIlIIIIIIlllIllllIII & Container.lIIIllIIlllIIl[7]) | (lllllllllllllIlIIIIIIlllIllllIIl & Container.lIIIllIIlllIIl[7]) << Container.lIIIllIIlllIIl[4];
    }
    
    public void onContainerClosed(final EntityPlayer lllllllllllllIlIIIIIIlllllIlIIlI) {
        final InventoryPlayer lllllllllllllIlIIIIIIlllllIlIIIl = lllllllllllllIlIIIIIIlllllIlIIlI.inventory;
        if (llIIIIllllIIlll(lllllllllllllIlIIIIIIlllllIlIIIl.getItemStack())) {
            lllllllllllllIlIIIIIIlllllIlIIlI.dropPlayerItemWithRandomChoice(lllllllllllllIlIIIIIIlllllIlIIIl.getItemStack(), (boolean)(Container.lIIIllIIlllIIl[1] != 0));
            "".length();
            lllllllllllllIlIIIIIIlllllIlIIIl.setItemStack(null);
        }
    }
    
    protected void retrySlotClick(final int lllllllllllllIlIIIIIIlllllIlllIl, final int lllllllllllllIlIIIIIIlllllIlllII, final boolean lllllllllllllIlIIIIIIlllllIllIll, final EntityPlayer lllllllllllllIlIIIIIIlllllIlIllI) {
        this.slotClick(lllllllllllllIlIIIIIIlllllIlllIl, lllllllllllllIlIIIIIIlllllIlllII, Container.lIIIllIIlllIIl[3], lllllllllllllIlIIIIIIlllllIlIllI);
        "".length();
    }
    
    public boolean enchantItem(final EntityPlayer lllllllllllllIlIIIIIlIIIIlIlIIIl, final int lllllllllllllIlIIIIIlIIIIlIlIIII) {
        return Container.lIIIllIIlllIIl[1] != 0;
    }
    
    public void onCraftGuiOpened(final ICrafting lllllllllllllIlIIIIIlIIIIlllIIIl) {
        if (llIIIIllllIIIll(this.crafters.contains(lllllllllllllIlIIIIIlIIIIlllIIIl) ? 1 : 0)) {
            throw new IllegalArgumentException(Container.lIIIllIIlllIII[Container.lIIIllIIlllIIl[1]]);
        }
        this.crafters.add(lllllllllllllIlIIIIIlIIIIlllIIIl);
        "".length();
        lllllllllllllIlIIIIIlIIIIlllIIIl.updateCraftingInventory(this, this.getInventory());
        this.detectAndSendChanges();
    }
    
    private static String llIIIIllllIIIII(String lllllllllllllIlIIIIIIlllIIllIIlI, final String lllllllllllllIlIIIIIIlllIIllIllI) {
        lllllllllllllIlIIIIIIlllIIllIIlI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIIlllIIllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIlllIIllIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIlllIIllIlII = lllllllllllllIlIIIIIIlllIIllIllI.toCharArray();
        int lllllllllllllIlIIIIIIlllIIllIIll = Container.lIIIllIIlllIIl[1];
        final String lllllllllllllIlIIIIIIlllIIlIllIl = (Object)((String)lllllllllllllIlIIIIIIlllIIllIIlI).toCharArray();
        final char lllllllllllllIlIIIIIIlllIIlIllII = (char)lllllllllllllIlIIIIIIlllIIlIllIl.length;
        byte lllllllllllllIlIIIIIIlllIIlIlIll = (byte)Container.lIIIllIIlllIIl[1];
        while (llIIIIlllllIIIl(lllllllllllllIlIIIIIIlllIIlIlIll, lllllllllllllIlIIIIIIlllIIlIllII)) {
            final char lllllllllllllIlIIIIIIlllIIlllIII = lllllllllllllIlIIIIIIlllIIlIllIl[lllllllllllllIlIIIIIIlllIIlIlIll];
            lllllllllllllIlIIIIIIlllIIllIlIl.append((char)(lllllllllllllIlIIIIIIlllIIlllIII ^ lllllllllllllIlIIIIIIlllIIllIlII[lllllllllllllIlIIIIIIlllIIllIIll % lllllllllllllIlIIIIIIlllIIllIlII.length]));
            "".length();
            ++lllllllllllllIlIIIIIIlllIIllIIll;
            ++lllllllllllllIlIIIIIIlllIIlIlIll;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIlllIIllIlIl);
    }
    
    public void removeCraftingFromCrafters(final ICrafting lllllllllllllIlIIIIIlIIIIllIlIll) {
        this.crafters.remove(lllllllllllllIlIIIIIlIIIIllIlIll);
        "".length();
    }
    
    private static boolean llIIIIllllIIllI(final Object lllllllllllllIlIIIIIIlllIIIIlllI) {
        return lllllllllllllIlIIIIIIlllIIIIlllI == null;
    }
    
    private static void llIIIIllllIIIIl() {
        (lIIIllIIlllIII = new String[Container.lIIIllIIlllIIl[3]])[Container.lIIIllIIlllIIl[1]] = llIIIIllllIIIII("HwExPD89DTBoOz8aJyk+KkguISknDSwhNDQ=", "ShBHZ");
    }
    
    private static boolean llIIIIllllIIlIl(final int lllllllllllllIlIIIIIIlllIIIIlIlI) {
        return lllllllllllllIlIIIIIIlllIIIIlIlI == 0;
    }
    
    protected boolean mergeItemStack(final ItemStack lllllllllllllIlIIIIIIllllIIlIlll, final int lllllllllllllIlIIIIIIllllIIlIllI, final int lllllllllllllIlIIIIIIllllIIIlIIl, final boolean lllllllllllllIlIIIIIIllllIIIlIII) {
        boolean lllllllllllllIlIIIIIIllllIIlIIll = Container.lIIIllIIlllIIl[1] != 0;
        int lllllllllllllIlIIIIIIllllIIlIIlI = lllllllllllllIlIIIIIIllllIIlIllI;
        if (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0)) {
            lllllllllllllIlIIIIIIllllIIlIIlI = lllllllllllllIlIIIIIIllllIIIlIIl - Container.lIIIllIIlllIIl[3];
        }
        if (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIlIlll.isStackable() ? 1 : 0)) {
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x7A ^ 0x41 ^ (0x53 ^ 0x4F)) & (0xE7 ^ 0x9F ^ (0x99 ^ 0xC6) ^ -" ".length())) != 0x0;
            }
            while (llIIIIllllIllll(lllllllllllllIlIIIIIIllllIIlIlll.stackSize) && ((llIIIIllllIIlIl(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0) && !llIIIIllllIIlII(lllllllllllllIlIIIIIIllllIIlIIlI, lllllllllllllIlIIIIIIllllIIIlIIl)) || (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0) && !llIIIIlllllIIIl(lllllllllllllIlIIIIIIllllIIlIIlI, lllllllllllllIlIIIIIIllllIIlIllI)))) {
                final Slot lllllllllllllIlIIIIIIllllIIlIIIl = this.inventorySlots.get(lllllllllllllIlIIIIIIllllIIlIIlI);
                final ItemStack lllllllllllllIlIIIIIIllllIIlIIII = lllllllllllllIlIIIIIIllllIIlIIIl.getStack();
                if (llIIIIllllIIlll(lllllllllllllIlIIIIIIllllIIlIIII) && llIIIIllllIllIl(lllllllllllllIlIIIIIIllllIIlIIII.getItem(), lllllllllllllIlIIIIIIllllIIlIlll.getItem()) && (!llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIlIlll.getHasSubtypes() ? 1 : 0) || llIIIIllllIlIII(lllllllllllllIlIIIIIIllllIIlIlll.getMetadata(), lllllllllllllIlIIIIIIllllIIlIIII.getMetadata())) && llIIIIllllIIIll(ItemStack.areItemStackTagsEqual(lllllllllllllIlIIIIIIllllIIlIlll, lllllllllllllIlIIIIIIllllIIlIIII) ? 1 : 0)) {
                    final int lllllllllllllIlIIIIIIllllIIIllll = lllllllllllllIlIIIIIIllllIIlIIII.stackSize + lllllllllllllIlIIIIIIllllIIlIlll.stackSize;
                    if (llIIIIllllIlllI(lllllllllllllIlIIIIIIllllIIIllll, lllllllllllllIlIIIIIIllllIIlIlll.getMaxStackSize())) {
                        lllllllllllllIlIIIIIIllllIIlIlll.stackSize = Container.lIIIllIIlllIIl[1];
                        lllllllllllllIlIIIIIIllllIIlIIII.stackSize = lllllllllllllIlIIIIIIllllIIIllll;
                        lllllllllllllIlIIIIIIllllIIlIIIl.onSlotChanged();
                        lllllllllllllIlIIIIIIllllIIlIIll = (Container.lIIIllIIlllIIl[3] != 0);
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return ((0x59 ^ 0x71) & ~(0x45 ^ 0x6D)) != 0x0;
                        }
                    }
                    else if (llIIIIlllllIIIl(lllllllllllllIlIIIIIIllllIIlIIII.stackSize, lllllllllllllIlIIIIIIllllIIlIlll.getMaxStackSize())) {
                        lllllllllllllIlIIIIIIllllIIlIlll.stackSize -= lllllllllllllIlIIIIIIllllIIlIlll.getMaxStackSize() - lllllllllllllIlIIIIIIllllIIlIIII.stackSize;
                        lllllllllllllIlIIIIIIllllIIlIIII.stackSize = lllllllllllllIlIIIIIIllllIIlIlll.getMaxStackSize();
                        lllllllllllllIlIIIIIIllllIIlIIIl.onSlotChanged();
                        lllllllllllllIlIIIIIIllllIIlIIll = (Container.lIIIllIIlllIIl[3] != 0);
                    }
                }
                if (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0)) {
                    --lllllllllllllIlIIIIIIllllIIlIIlI;
                    "".length();
                    if ((78 + 31 - 0 + 19 ^ 40 + 24 + 17 + 52) <= 0) {
                        return ((34 + 51 + 42 + 42 ^ 55 + 113 - 90 + 51) & (4 + 110 + 40 + 1 ^ 133 + 73 - 182 + 155 ^ -" ".length())) != 0x0;
                    }
                    continue;
                }
                else {
                    ++lllllllllllllIlIIIIIIllllIIlIIlI;
                }
            }
        }
        if (llIIIIllllIllll(lllllllllllllIlIIIIIIllllIIlIlll.stackSize)) {
            if (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0)) {
                lllllllllllllIlIIIIIIllllIIlIIlI = lllllllllllllIlIIIIIIllllIIIlIIl - Container.lIIIllIIlllIIl[3];
                "".length();
                if (null != null) {
                    return ((0x20 ^ 0x18 ^ (0x2E ^ 0x37)) & (0x5F ^ 0x7B ^ (0x56 ^ 0x53) ^ -" ".length())) != 0x0;
                }
            }
            else {
                lllllllllllllIlIIIIIIllllIIlIIlI = lllllllllllllIlIIIIIIllllIIlIllI;
                "".length();
                if ("  ".length() < 0) {
                    return ((0x2 ^ 0x38) & ~(0xA8 ^ 0x92)) != 0x0;
                }
            }
            while ((llIIIIllllIIlIl(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0) && !llIIIIllllIIlII(lllllllllllllIlIIIIIIllllIIlIIlI, lllllllllllllIlIIIIIIllllIIIlIIl)) || (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0) && !llIIIIlllllIIIl(lllllllllllllIlIIIIIIllllIIlIIlI, lllllllllllllIlIIIIIIllllIIlIllI))) {
                final Slot lllllllllllllIlIIIIIIllllIIIlllI = this.inventorySlots.get(lllllllllllllIlIIIIIIllllIIlIIlI);
                final ItemStack lllllllllllllIlIIIIIIllllIIIllIl = lllllllllllllIlIIIIIIllllIIIlllI.getStack();
                if (llIIIIllllIIllI(lllllllllllllIlIIIIIIllllIIIllIl)) {
                    lllllllllllllIlIIIIIIllllIIIlllI.putStack(lllllllllllllIlIIIIIIllllIIlIlll.copy());
                    lllllllllllllIlIIIIIIllllIIIlllI.onSlotChanged();
                    lllllllllllllIlIIIIIIllllIIlIlll.stackSize = Container.lIIIllIIlllIIl[1];
                    lllllllllllllIlIIIIIIllllIIlIIll = (Container.lIIIllIIlllIIl[3] != 0);
                    "".length();
                    if ((0xC0 ^ 0xA1 ^ (0x48 ^ 0x2D)) < ((0xD ^ 0x10 ^ (0x29 ^ 0x63)) & (0x1A ^ 0x68 ^ (0xE2 ^ 0xC7) ^ -" ".length()) & (((30 + 60 - 34 + 79 ^ 52 + 113 - 131 + 149) & (0x6C ^ 0x15 ^ (0x57 ^ 0x1E) ^ -" ".length())) ^ -" ".length()))) {
                        return ((0x1 ^ 0x6F ^ (0x46 ^ 0x23)) & (0x5A ^ 0x63 ^ (0x4C ^ 0x7E) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else if (llIIIIllllIIIll(lllllllllllllIlIIIIIIllllIIIlIII ? 1 : 0)) {
                    --lllllllllllllIlIIIIIIllllIIlIIlI;
                    "".length();
                    if ((0x41 ^ 0x44) == 0x0) {
                        return ((0xA7 ^ 0xB6) & ~(0x2C ^ 0x3D)) != 0x0;
                    }
                    continue;
                }
                else {
                    ++lllllllllllllIlIIIIIIllllIIlIIlI;
                }
            }
        }
        return lllllllllllllIlIIIIIIllllIIlIIll;
    }
    
    public boolean canMergeSlot(final ItemStack lllllllllllllIlIIIIIIllllllIIlII, final Slot lllllllllllllIlIIIIIIllllllIIIll) {
        return Container.lIIIllIIlllIIl[3] != 0;
    }
    
    static {
        llIIIIllllIIIlI();
        llIIIIllllIIIIl();
    }
    
    protected Slot addSlotToContainer(final Slot lllllllllllllIlIIIIIlIIIIlllIlll) {
        lllllllllllllIlIIIIIlIIIIlllIlll.slotNumber = this.inventorySlots.size();
        this.inventorySlots.add(lllllllllllllIlIIIIIlIIIIlllIlll);
        "".length();
        this.inventoryItemStacks.add(null);
        "".length();
        return lllllllllllllIlIIIIIlIIIIlllIlll;
    }
    
    public static boolean canAddItemToSlot(final Slot lllllllllllllIlIIIIIIlllIllIIlIl, final ItemStack lllllllllllllIlIIIIIIlllIllIlIII, final boolean lllllllllllllIlIIIIIIlllIllIIlll) {
        int n;
        if (llIIIIllllIIlll(lllllllllllllIlIIIIIIlllIllIIlIl) && llIIIIllllIIIll(lllllllllllllIlIIIIIIlllIllIIlIl.getHasStack() ? 1 : 0)) {
            n = Container.lIIIllIIlllIIl[1];
            "".length();
            if ((0x3 ^ 0x2A ^ (0x22 ^ 0xE)) == 0x0) {
                return ((11 + 154 - 147 + 169 ^ 78 + 64 - 44 + 52) & (227 + 57 - 94 + 47 ^ 73 + 65 + 9 + 45 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Container.lIIIllIIlllIIl[3];
        }
        boolean lllllllllllllIlIIIIIIlllIllIIllI = n != 0;
        if (llIIIIllllIIlll(lllllllllllllIlIIIIIIlllIllIIlIl) && llIIIIllllIIIll(lllllllllllllIlIIIIIIlllIllIIlIl.getHasStack() ? 1 : 0) && llIIIIllllIIlll(lllllllllllllIlIIIIIIlllIllIlIII) && llIIIIllllIIIll(lllllllllllllIlIIIIIIlllIllIlIII.isItemEqual(lllllllllllllIlIIIIIIlllIllIIlIl.getStack()) ? 1 : 0) && llIIIIllllIIIll(ItemStack.areItemStackTagsEqual(lllllllllllllIlIIIIIIlllIllIIlIl.getStack(), lllllllllllllIlIIIIIIlllIllIlIII) ? 1 : 0)) {
            final boolean b = lllllllllllllIlIIIIIIlllIllIIllI;
            final int stackSize = lllllllllllllIlIIIIIIlllIllIIlIl.getStack().stackSize;
            int stackSize2;
            if (llIIIIllllIIIll(lllllllllllllIlIIIIIIlllIllIIlll ? 1 : 0)) {
                stackSize2 = Container.lIIIllIIlllIIl[1];
                "".length();
                if (-" ".length() >= 0) {
                    return ((0xB4 ^ 0x92 ^ (0x55 ^ 0x39)) & (0xC8 ^ 0xB6 ^ (0x62 ^ 0x56) ^ -" ".length())) != 0x0;
                }
            }
            else {
                stackSize2 = lllllllllllllIlIIIIIIlllIllIlIII.stackSize;
            }
            int n2;
            if (llIIIIllllIlllI(stackSize + stackSize2, lllllllllllllIlIIIIIIlllIllIlIII.getMaxStackSize())) {
                n2 = Container.lIIIllIIlllIIl[3];
                "".length();
                if ((0x83 ^ 0xAE ^ (0x2B ^ 0x2)) != (75 + 1 - 4 + 78 ^ 1 + 95 - 29 + 79)) {
                    return ((106 + 104 - 137 + 54 ^ (0x8 ^ 0x57)) & (0x8A ^ 0xB6 ^ (0xA8 ^ 0xB4) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n2 = Container.lIIIllIIlllIIl[1];
            }
            lllllllllllllIlIIIIIIlllIllIIllI = (((b ? 1 : 0) | n2) != 0x0);
        }
        return lllllllllllllIlIIIIIIlllIllIIllI;
    }
    
    private static boolean llIIIIlllllIIIl(final int lllllllllllllIlIIIIIIlllIIIlllll, final int lllllllllllllIlIIIIIIlllIIIllllI) {
        return lllllllllllllIlIIIIIIlllIIIlllll < lllllllllllllIlIIIIIIlllIIIllllI;
    }
}
