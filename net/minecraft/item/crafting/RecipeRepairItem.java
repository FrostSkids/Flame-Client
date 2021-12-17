// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.InventoryCrafting;

public class RecipeRepairItem implements IRecipe
{
    private static final /* synthetic */ int[] lllIIlllllllII;
    
    private static boolean lIlIIIIlIIlIIlll(final Object llllllllllllIlIlllIlIIllIlIIIlIl) {
        return llllllllllllIlIlllIlIIllIlIIIlIl != null;
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting llllllllllllIlIlllIlIIlllIlIIlII) {
        final List<ItemStack> llllllllllllIlIlllIlIIlllIlIIIlI = (List<ItemStack>)Lists.newArrayList();
        int llllllllllllIlIlllIlIIlllIlIIIII = RecipeRepairItem.lllIIlllllllII[0];
        "".length();
        if ((0x85 ^ 0x81) <= "  ".length()) {
            return null;
        }
        while (!lIlIIIIlIIlIllIl(llllllllllllIlIlllIlIIlllIlIIIII, llllllllllllIlIlllIlIIlllIlIIlII.getSizeInventory())) {
            final ItemStack llllllllllllIlIlllIlIIlllIIllllI = llllllllllllIlIlllIlIIlllIlIIlII.getStackInSlot(llllllllllllIlIlllIlIIlllIlIIIII);
            if (lIlIIIIlIIlIIlll(llllllllllllIlIlllIlIIlllIIllllI)) {
                llllllllllllIlIlllIlIIlllIlIIIlI.add(llllllllllllIlIlllIlIIlllIIllllI);
                "".length();
                if (lIlIIIIlIIlIlIIl(llllllllllllIlIlllIlIIlllIlIIIlI.size(), RecipeRepairItem.lllIIlllllllII[1])) {
                    final ItemStack llllllllllllIlIlllIlIIlllIIlllII = llllllllllllIlIlllIlIIlllIlIIIlI.get(RecipeRepairItem.lllIIlllllllII[0]);
                    if (!lIlIIIIlIIlIlIlI(llllllllllllIlIlllIlIIlllIIllllI.getItem(), llllllllllllIlIlllIlIIlllIIlllII.getItem()) || !lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIlllIIlllII.stackSize, RecipeRepairItem.lllIIlllllllII[1]) || !lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIlllIIllllI.stackSize, RecipeRepairItem.lllIIlllllllII[1]) || lIlIIIIlIIlIllII(llllllllllllIlIlllIlIIlllIIlllII.getItem().isDamageable() ? 1 : 0)) {
                        return null;
                    }
                }
            }
            ++llllllllllllIlIlllIlIIlllIlIIIII;
        }
        if (lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIlllIlIIIlI.size(), RecipeRepairItem.lllIIlllllllII[2])) {
            final ItemStack llllllllllllIlIlllIlIIlllIIllIlI = llllllllllllIlIlllIlIIlllIlIIIlI.get(RecipeRepairItem.lllIIlllllllII[0]);
            final ItemStack llllllllllllIlIlllIlIIlllIIllIIl = llllllllllllIlIlllIlIIlllIlIIIlI.get(RecipeRepairItem.lllIIlllllllII[1]);
            if (lIlIIIIlIIlIlIlI(llllllllllllIlIlllIlIIlllIIllIlI.getItem(), llllllllllllIlIlllIlIIlllIIllIIl.getItem()) && lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIlllIIllIlI.stackSize, RecipeRepairItem.lllIIlllllllII[1]) && lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIlllIIllIIl.stackSize, RecipeRepairItem.lllIIlllllllII[1]) && lIlIIIIlIIlIllll(llllllllllllIlIlllIlIIlllIIllIlI.getItem().isDamageable() ? 1 : 0)) {
                final Item llllllllllllIlIlllIlIIlllIIllIII = llllllllllllIlIlllIlIIlllIIllIlI.getItem();
                final int llllllllllllIlIlllIlIIlllIIlIlll = llllllllllllIlIlllIlIIlllIIllIII.getMaxDamage() - llllllllllllIlIlllIlIIlllIIllIlI.getItemDamage();
                final int llllllllllllIlIlllIlIIlllIIlIllI = llllllllllllIlIlllIlIIlllIIllIII.getMaxDamage() - llllllllllllIlIlllIlIIlllIIllIIl.getItemDamage();
                final int llllllllllllIlIlllIlIIlllIIlIlII = llllllllllllIlIlllIlIIlllIIlIlll + llllllllllllIlIlllIlIIlllIIlIllI + llllllllllllIlIlllIlIIlllIIllIII.getMaxDamage() * RecipeRepairItem.lllIIlllllllII[3] / RecipeRepairItem.lllIIlllllllII[4];
                int llllllllllllIlIlllIlIIlllIIlIIll = llllllllllllIlIlllIlIIlllIIllIII.getMaxDamage() - llllllllllllIlIlllIlIIlllIIlIlII;
                if (lIlIIIIlIIllIIII(llllllllllllIlIlllIlIIlllIIlIIll)) {
                    llllllllllllIlIlllIlIIlllIIlIIll = RecipeRepairItem.lllIIlllllllII[0];
                }
                return new ItemStack(llllllllllllIlIlllIlIIlllIIllIlI.getItem(), RecipeRepairItem.lllIIlllllllII[1], llllllllllllIlIlllIlIIlllIIlIIll);
            }
        }
        return null;
    }
    
    private static boolean lIlIIIIlIIlIlIlI(final Object llllllllllllIlIlllIlIIllIIlllllI, final Object llllllllllllIlIlllIlIIllIIllllIl) {
        return llllllllllllIlIlllIlIIllIIlllllI == llllllllllllIlIlllIlIIllIIllllIl;
    }
    
    private static boolean lIlIIIIlIIlIllIl(final int llllllllllllIlIlllIlIIllIlIlIIll, final int llllllllllllIlIlllIlIIllIlIlIIIl) {
        return llllllllllllIlIlllIlIIllIlIlIIll >= llllllllllllIlIlllIlIIllIlIlIIIl;
    }
    
    private static boolean lIlIIIIlIIlIllll(final int llllllllllllIlIlllIlIIllIIlllIlI) {
        return llllllllllllIlIlllIlIIllIIlllIlI != 0;
    }
    
    static {
        lIlIIIIlIIlIIlII();
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }
    
    private static void lIlIIIIlIIlIIlII() {
        (lllIIlllllllII = new int[6])[0] = ((0x3D ^ 0x25) & ~(0x49 ^ 0x51));
        RecipeRepairItem.lllIIlllllllII[1] = " ".length();
        RecipeRepairItem.lllIIlllllllII[2] = "  ".length();
        RecipeRepairItem.lllIIlllllllII[3] = (0xB ^ 0x61 ^ (0xE3 ^ 0x8C));
        RecipeRepairItem.lllIIlllllllII[4] = (0x70 ^ 0x14);
        RecipeRepairItem.lllIIlllllllII[5] = (0x57 ^ 0x53);
    }
    
    private static boolean lIlIIIIlIIlIllII(final int llllllllllllIlIlllIlIIllIIllIllI) {
        return llllllllllllIlIlllIlIIllIIllIllI == 0;
    }
    
    private static boolean lIlIIIIlIIlIlIll(final int llllllllllllIlIlllIlIIllIlIllIIl, final int llllllllllllIlIlllIlIIllIlIlIllI) {
        return llllllllllllIlIlllIlIIllIlIllIIl == llllllllllllIlIlllIlIIllIlIlIllI;
    }
    
    @Override
    public boolean matches(final InventoryCrafting llllllllllllIlIlllIlIIllllIIlIIl, final World llllllllllllIlIlllIlIIllllIIllll) {
        final List<ItemStack> llllllllllllIlIlllIlIIllllIIlllI = (List<ItemStack>)Lists.newArrayList();
        int llllllllllllIlIlllIlIIllllIIllIl = RecipeRepairItem.lllIIlllllllII[0];
        "".length();
        if (-"  ".length() > 0) {
            return ((66 + 155 - 168 + 158 ^ 36 + 22 + 15 + 69) & (0x3D ^ 0x33 ^ (0x50 ^ 0x3) ^ -" ".length())) != 0x0;
        }
        while (!lIlIIIIlIIlIllIl(llllllllllllIlIlllIlIIllllIIllIl, llllllllllllIlIlllIlIIllllIIlIIl.getSizeInventory())) {
            final ItemStack llllllllllllIlIlllIlIIllllIIllII = llllllllllllIlIlllIlIIllllIIlIIl.getStackInSlot(llllllllllllIlIlllIlIIllllIIllIl);
            if (lIlIIIIlIIlIIlll(llllllllllllIlIlllIlIIllllIIllII)) {
                llllllllllllIlIlllIlIIllllIIlllI.add(llllllllllllIlIlllIlIIllllIIllII);
                "".length();
                if (lIlIIIIlIIlIlIIl(llllllllllllIlIlllIlIIllllIIlllI.size(), RecipeRepairItem.lllIIlllllllII[1])) {
                    final ItemStack llllllllllllIlIlllIlIIllllIIlIll = llllllllllllIlIlllIlIIllllIIlllI.get(RecipeRepairItem.lllIIlllllllII[0]);
                    if (!lIlIIIIlIIlIlIlI(llllllllllllIlIlllIlIIllllIIllII.getItem(), llllllllllllIlIlllIlIIllllIIlIll.getItem()) || !lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIllllIIlIll.stackSize, RecipeRepairItem.lllIIlllllllII[1]) || !lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIllllIIllII.stackSize, RecipeRepairItem.lllIIlllllllII[1]) || lIlIIIIlIIlIllII(llllllllllllIlIlllIlIIllllIIlIll.getItem().isDamageable() ? 1 : 0)) {
                        return RecipeRepairItem.lllIIlllllllII[0] != 0;
                    }
                }
            }
            ++llllllllllllIlIlllIlIIllllIIllIl;
        }
        if (lIlIIIIlIIlIlIll(llllllllllllIlIlllIlIIllllIIlllI.size(), RecipeRepairItem.lllIIlllllllII[2])) {
            return RecipeRepairItem.lllIIlllllllII[1] != 0;
        }
        return RecipeRepairItem.lllIIlllllllII[0] != 0;
    }
    
    @Override
    public ItemStack[] getRemainingItems(final InventoryCrafting llllllllllllIlIlllIlIIllIllIIlIl) {
        final ItemStack[] llllllllllllIlIlllIlIIllIllIlIll = new ItemStack[llllllllllllIlIlllIlIIllIllIIlIl.getSizeInventory()];
        int llllllllllllIlIlllIlIIllIllIlIIl = RecipeRepairItem.lllIIlllllllII[0];
        "".length();
        if (-" ".length() > ((0x2C ^ 0x78) & ~(0x5E ^ 0xA))) {
            return null;
        }
        while (!lIlIIIIlIIlIllIl(llllllllllllIlIlllIlIIllIllIlIIl, llllllllllllIlIlllIlIIllIllIlIll.length)) {
            final ItemStack llllllllllllIlIlllIlIIllIllIIlll = llllllllllllIlIlllIlIIllIllIIlIl.getStackInSlot(llllllllllllIlIlllIlIIllIllIlIIl);
            if (lIlIIIIlIIlIIlll(llllllllllllIlIlllIlIIllIllIIlll) && lIlIIIIlIIlIllll(llllllllllllIlIlllIlIIllIllIIlll.getItem().hasContainerItem() ? 1 : 0)) {
                llllllllllllIlIlllIlIIllIllIlIll[llllllllllllIlIlllIlIIllIllIlIIl] = new ItemStack(llllllllllllIlIlllIlIIllIllIIlll.getItem().getContainerItem());
            }
            ++llllllllllllIlIlllIlIIllIllIlIIl;
        }
        return llllllllllllIlIlllIlIIllIllIlIll;
    }
    
    private static boolean lIlIIIIlIIlIlIIl(final int llllllllllllIlIlllIlIIllIlIIlIIl, final int llllllllllllIlIlllIlIIllIlIIlIII) {
        return llllllllllllIlIlllIlIIllIlIIlIIl > llllllllllllIlIlllIlIIllIlIIlIII;
    }
    
    private static boolean lIlIIIIlIIllIIII(final int llllllllllllIlIlllIlIIllIIllIIll) {
        return llllllllllllIlIlllIlIIllIIllIIll < 0;
    }
    
    @Override
    public int getRecipeSize() {
        return RecipeRepairItem.lllIIlllllllII[5];
    }
}
