// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.inventory.IInventory;
import java.util.Random;
import java.util.Collection;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WeightedRandomChestContent extends WeightedRandom.Item
{
    private static final /* synthetic */ int[] lllIlIIIIIlllI;
    private /* synthetic */ ItemStack theItemId;
    private /* synthetic */ int maxStackSize;
    private /* synthetic */ int minStackSize;
    
    public WeightedRandomChestContent(final ItemStack llllllllllllIlIlllIIllllIIIIIlIl, final int llllllllllllIlIlllIIllllIIIIIlII, final int llllllllllllIlIlllIIllllIIIIlIII, final int llllllllllllIlIlllIIllllIIIIIIlI) {
        super(llllllllllllIlIlllIIllllIIIIIIlI);
        this.theItemId = llllllllllllIlIlllIIllllIIIIIlIl;
        this.minStackSize = llllllllllllIlIlllIIllllIIIIIlII;
        this.maxStackSize = llllllllllllIlIlllIIllllIIIIlIII;
    }
    
    private static boolean lIlIIIIlIlIllIlI(final int llllllllllllIlIlllIIlllIlIlllllI, final int llllllllllllIlIlllIIlllIlIllllIl) {
        return llllllllllllIlIlllIIlllIlIlllllI >= llllllllllllIlIlllIIlllIlIllllIl;
    }
    
    public WeightedRandomChestContent(final net.minecraft.item.Item llllllllllllIlIlllIIllllIIIllIll, final int llllllllllllIlIlllIIllllIIIllIlI, final int llllllllllllIlIlllIIllllIIIllIIl, final int llllllllllllIlIlllIIllllIIIllIII, final int llllllllllllIlIlllIIllllIIIlIIIl) {
        super(llllllllllllIlIlllIIllllIIIlIIIl);
        this.theItemId = new ItemStack(llllllllllllIlIlllIIllllIIIllIll, WeightedRandomChestContent.lllIlIIIIIlllI[0], llllllllllllIlIlllIIllllIIIllIlI);
        this.minStackSize = llllllllllllIlIlllIIllllIIIllIIl;
        this.maxStackSize = llllllllllllIlIlllIIllllIIIllIII;
    }
    
    private static void lIlIIIIlIlIllIIl() {
        (lllIlIIIIIlllI = new int[2])[0] = " ".length();
        WeightedRandomChestContent.lllIlIIIIIlllI[1] = ((0xCF ^ 0x9C) & ~(0xDF ^ 0x8C));
    }
    
    static {
        lIlIIIIlIlIllIIl();
    }
    
    public static List<WeightedRandomChestContent> func_177629_a(final List<WeightedRandomChestContent> llllllllllllIlIlllIIlllIllIIIIll, final WeightedRandomChestContent... llllllllllllIlIlllIIlllIllIIIlIl) {
        final List<WeightedRandomChestContent> llllllllllllIlIlllIIlllIllIIIlII = (List<WeightedRandomChestContent>)Lists.newArrayList((Iterable)llllllllllllIlIlllIIlllIllIIIIll);
        Collections.addAll(llllllllllllIlIlllIIlllIllIIIlII, llllllllllllIlIlllIIlllIllIIIlIl);
        "".length();
        return llllllllllllIlIlllIIlllIllIIIlII;
    }
    
    public static void generateChestContents(final Random llllllllllllIlIlllIIlllIlllIlllI, final List<WeightedRandomChestContent> llllllllllllIlIlllIIlllIlllIllIl, final IInventory llllllllllllIlIlllIIlllIllllIllI, final int llllllllllllIlIlllIIlllIlllIlIll) {
        int llllllllllllIlIlllIIlllIllllIlII = WeightedRandomChestContent.lllIlIIIIIlllI[1];
        "".length();
        if ("   ".length() < " ".length()) {
            return;
        }
        while (!lIlIIIIlIlIllIlI(llllllllllllIlIlllIIlllIllllIlII, llllllllllllIlIlllIIlllIlllIlIll)) {
            final WeightedRandomChestContent llllllllllllIlIlllIIlllIllllIIll = WeightedRandom.getRandomItem(llllllllllllIlIlllIIlllIlllIlllI, llllllllllllIlIlllIIlllIlllIllIl);
            final int llllllllllllIlIlllIIlllIllllIIlI = llllllllllllIlIlllIIlllIllllIIll.minStackSize + llllllllllllIlIlllIIlllIlllIlllI.nextInt(llllllllllllIlIlllIIlllIllllIIll.maxStackSize - llllllllllllIlIlllIIlllIllllIIll.minStackSize + WeightedRandomChestContent.lllIlIIIIIlllI[0]);
            if (lIlIIIIlIlIllIlI(llllllllllllIlIlllIIlllIllllIIll.theItemId.getMaxStackSize(), llllllllllllIlIlllIIlllIllllIIlI)) {
                final ItemStack llllllllllllIlIlllIIlllIllllIIIl = llllllllllllIlIlllIIlllIllllIIll.theItemId.copy();
                llllllllllllIlIlllIIlllIllllIIIl.stackSize = llllllllllllIlIlllIIlllIllllIIlI;
                llllllllllllIlIlllIIlllIllllIllI.setInventorySlotContents(llllllllllllIlIlllIIlllIlllIlllI.nextInt(llllllllllllIlIlllIIlllIllllIllI.getSizeInventory()), llllllllllllIlIlllIIlllIllllIIIl);
                "".length();
                if ((0x30 ^ 0x34) == "  ".length()) {
                    return;
                }
            }
            else {
                int llllllllllllIlIlllIIlllIllllIIII = WeightedRandomChestContent.lllIlIIIIIlllI[1];
                "".length();
                if (((0x63 ^ 0x59) & ~(0x95 ^ 0xAF)) < ((0x92 ^ 0xBF) & ~(0xAB ^ 0x86))) {
                    return;
                }
                while (!lIlIIIIlIlIllIlI(llllllllllllIlIlllIIlllIllllIIII, llllllllllllIlIlllIIlllIllllIIlI)) {
                    final ItemStack llllllllllllIlIlllIIlllIlllIllll = llllllllllllIlIlllIIlllIllllIIll.theItemId.copy();
                    llllllllllllIlIlllIIlllIlllIllll.stackSize = WeightedRandomChestContent.lllIlIIIIIlllI[0];
                    llllllllllllIlIlllIIlllIllllIllI.setInventorySlotContents(llllllllllllIlIlllIIlllIlllIlllI.nextInt(llllllllllllIlIlllIIlllIllllIllI.getSizeInventory()), llllllllllllIlIlllIIlllIlllIllll);
                    ++llllllllllllIlIlllIIlllIllllIIII;
                }
            }
            ++llllllllllllIlIlllIIlllIllllIlII;
        }
    }
    
    public static void generateDispenserContents(final Random llllllllllllIlIlllIIlllIllIlIIlI, final List<WeightedRandomChestContent> llllllllllllIlIlllIIlllIllIllIll, final TileEntityDispenser llllllllllllIlIlllIIlllIllIllIlI, final int llllllllllllIlIlllIIlllIllIIllll) {
        int llllllllllllIlIlllIIlllIllIllIII = WeightedRandomChestContent.lllIlIIIIIlllI[1];
        "".length();
        if (((0x3B ^ 0x24 ^ (0x59 ^ 0x17)) & (171 + 165 - 198 + 54 ^ 130 + 65 - 103 + 53 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIlIIIIlIlIllIlI(llllllllllllIlIlllIIlllIllIllIII, llllllllllllIlIlllIIlllIllIIllll)) {
            final WeightedRandomChestContent llllllllllllIlIlllIIlllIllIlIlll = WeightedRandom.getRandomItem(llllllllllllIlIlllIIlllIllIlIIlI, llllllllllllIlIlllIIlllIllIllIll);
            final int llllllllllllIlIlllIIlllIllIlIllI = llllllllllllIlIlllIIlllIllIlIlll.minStackSize + llllllllllllIlIlllIIlllIllIlIIlI.nextInt(llllllllllllIlIlllIIlllIllIlIlll.maxStackSize - llllllllllllIlIlllIIlllIllIlIlll.minStackSize + WeightedRandomChestContent.lllIlIIIIIlllI[0]);
            if (lIlIIIIlIlIllIlI(llllllllllllIlIlllIIlllIllIlIlll.theItemId.getMaxStackSize(), llllllllllllIlIlllIIlllIllIlIllI)) {
                final ItemStack llllllllllllIlIlllIIlllIllIlIlIl = llllllllllllIlIlllIIlllIllIlIlll.theItemId.copy();
                llllllllllllIlIlllIIlllIllIlIlIl.stackSize = llllllllllllIlIlllIIlllIllIlIllI;
                llllllllllllIlIlllIIlllIllIllIlI.setInventorySlotContents(llllllllllllIlIlllIIlllIllIlIIlI.nextInt(llllllllllllIlIlllIIlllIllIllIlI.getSizeInventory()), llllllllllllIlIlllIIlllIllIlIlIl);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                int llllllllllllIlIlllIIlllIllIlIlII = WeightedRandomChestContent.lllIlIIIIIlllI[1];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIlIIIIlIlIllIlI(llllllllllllIlIlllIIlllIllIlIlII, llllllllllllIlIlllIIlllIllIlIllI)) {
                    final ItemStack llllllllllllIlIlllIIlllIllIlIIll = llllllllllllIlIlllIIlllIllIlIlll.theItemId.copy();
                    llllllllllllIlIlllIIlllIllIlIIll.stackSize = WeightedRandomChestContent.lllIlIIIIIlllI[0];
                    llllllllllllIlIlllIIlllIllIllIlI.setInventorySlotContents(llllllllllllIlIlllIIlllIllIlIIlI.nextInt(llllllllllllIlIlllIIlllIllIllIlI.getSizeInventory()), llllllllllllIlIlllIIlllIllIlIIll);
                    ++llllllllllllIlIlllIIlllIllIlIlII;
                }
            }
            ++llllllllllllIlIlllIIlllIllIllIII;
        }
    }
}
