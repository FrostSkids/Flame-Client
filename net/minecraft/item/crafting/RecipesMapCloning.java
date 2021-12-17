// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;

public class RecipesMapCloning implements IRecipe
{
    private static final /* synthetic */ int[] lIlIlIIIllIllI;
    
    @Override
    public int getRecipeSize() {
        return RecipesMapCloning.lIlIlIIIllIllI[2];
    }
    
    @Override
    public boolean matches(final InventoryCrafting lllllllllllllIIIlIlIlIIIIIlIIIlI, final World lllllllllllllIIIlIlIlIIIIIlIIlll) {
        int lllllllllllllIIIlIlIlIIIIIlIIllI = RecipesMapCloning.lIlIlIIIllIllI[0];
        ItemStack lllllllllllllIIIlIlIlIIIIIlIIlIl = null;
        int lllllllllllllIIIlIlIlIIIIIlIIlII = RecipesMapCloning.lIlIlIIIllIllI[0];
        "".length();
        if (" ".length() < 0) {
            return ((0xDE ^ 0xBD) & ~(0xA7 ^ 0xC4)) != 0x0;
        }
        while (!lllIlIllllIlllI(lllllllllllllIIIlIlIlIIIIIlIIlII, lllllllllllllIIIlIlIlIIIIIlIIIlI.getSizeInventory())) {
            final ItemStack lllllllllllllIIIlIlIlIIIIIlIIIll = lllllllllllllIIIlIlIlIIIIIlIIIlI.getStackInSlot(lllllllllllllIIIlIlIlIIIIIlIIlII);
            if (lllIlIllllIlIll(lllllllllllllIIIlIlIlIIIIIlIIIll)) {
                if (lllIlIllllIllII(lllllllllllllIIIlIlIlIIIIIlIIIll.getItem(), Items.filled_map)) {
                    if (lllIlIllllIlIll(lllllllllllllIIIlIlIlIIIIIlIIlIl)) {
                        return RecipesMapCloning.lIlIlIIIllIllI[0] != 0;
                    }
                    lllllllllllllIIIlIlIlIIIIIlIIlIl = lllllllllllllIIIlIlIlIIIIIlIIIll;
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return ((0x49 ^ 0x7F ^ (0x91 ^ 0xA1)) & (0x99 ^ 0x86 ^ (0x82 ^ 0x9B) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    if (lllIlIllllIllIl(lllllllllllllIIIlIlIlIIIIIlIIIll.getItem(), Items.map)) {
                        return RecipesMapCloning.lIlIlIIIllIllI[0] != 0;
                    }
                    ++lllllllllllllIIIlIlIlIIIIIlIIllI;
                }
            }
            ++lllllllllllllIIIlIlIlIIIIIlIIlII;
        }
        if (lllIlIllllIlIll(lllllllllllllIIIlIlIlIIIIIlIIlIl) && lllIlIllllIllll(lllllllllllllIIIlIlIlIIIIIlIIllI)) {
            return RecipesMapCloning.lIlIlIIIllIllI[1] != 0;
        }
        return RecipesMapCloning.lIlIlIIIllIllI[0] != 0;
    }
    
    private static boolean lllIlIllllIlIll(final Object lllllllllllllIIIlIlIIlllllllIlII) {
        return lllllllllllllIIIlIlIIlllllllIlII != null;
    }
    
    private static boolean lllIlIlllllIIII(final int lllllllllllllIIIlIlIIllllllIlllI) {
        return lllllllllllllIIIlIlIIllllllIlllI != 0;
    }
    
    private static boolean lllIlIllllIlllI(final int lllllllllllllIIIlIlIIllllllllIll, final int lllllllllllllIIIlIlIIllllllllIlI) {
        return lllllllllllllIIIlIlIIllllllllIll >= lllllllllllllIIIlIlIIllllllllIlI;
    }
    
    private static boolean lllIlIllllIllII(final Object lllllllllllllIIIlIlIIlllllllIIIl, final Object lllllllllllllIIIlIlIIlllllllIIII) {
        return lllllllllllllIIIlIlIIlllllllIIIl == lllllllllllllIIIlIlIIlllllllIIII;
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting lllllllllllllIIIlIlIlIIIIIIlIlll) {
        int lllllllllllllIIIlIlIlIIIIIIlIllI = RecipesMapCloning.lIlIlIIIllIllI[0];
        ItemStack lllllllllllllIIIlIlIlIIIIIIlIlIl = null;
        int lllllllllllllIIIlIlIlIIIIIIlIlII = RecipesMapCloning.lIlIlIIIllIllI[0];
        "".length();
        if ("   ".length() >= (0x8F ^ 0x90 ^ (0x4F ^ 0x54))) {
            return null;
        }
        while (!lllIlIllllIlllI(lllllllllllllIIIlIlIlIIIIIIlIlII, lllllllllllllIIIlIlIlIIIIIIlIlll.getSizeInventory())) {
            final ItemStack lllllllllllllIIIlIlIlIIIIIIlIIll = lllllllllllllIIIlIlIlIIIIIIlIlll.getStackInSlot(lllllllllllllIIIlIlIlIIIIIIlIlII);
            if (lllIlIllllIlIll(lllllllllllllIIIlIlIlIIIIIIlIIll)) {
                if (lllIlIllllIllII(lllllllllllllIIIlIlIlIIIIIIlIIll.getItem(), Items.filled_map)) {
                    if (lllIlIllllIlIll(lllllllllllllIIIlIlIlIIIIIIlIlIl)) {
                        return null;
                    }
                    lllllllllllllIIIlIlIlIIIIIIlIlIl = lllllllllllllIIIlIlIlIIIIIIlIIll;
                    "".length();
                    if (((0x69 ^ 0xA ^ (0x86 ^ 0xA3)) & (0xC4 ^ 0xAE ^ (0x69 ^ 0x45) ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
                else {
                    if (lllIlIllllIllIl(lllllllllllllIIIlIlIlIIIIIIlIIll.getItem(), Items.map)) {
                        return null;
                    }
                    ++lllllllllllllIIIlIlIlIIIIIIlIllI;
                }
            }
            ++lllllllllllllIIIlIlIlIIIIIIlIlII;
        }
        if (lllIlIllllIlIll(lllllllllllllIIIlIlIlIIIIIIlIlIl) && lllIlIllllIlllI(lllllllllllllIIIlIlIlIIIIIIlIllI, RecipesMapCloning.lIlIlIIIllIllI[1])) {
            final ItemStack lllllllllllllIIIlIlIlIIIIIIlIIlI = new ItemStack(Items.filled_map, lllllllllllllIIIlIlIlIIIIIIlIllI + RecipesMapCloning.lIlIlIIIllIllI[1], lllllllllllllIIIlIlIlIIIIIIlIlIl.getMetadata());
            if (lllIlIlllllIIII(lllllllllllllIIIlIlIlIIIIIIlIlIl.hasDisplayName() ? 1 : 0)) {
                lllllllllllllIIIlIlIlIIIIIIlIIlI.setStackDisplayName(lllllllllllllIIIlIlIlIIIIIIlIlIl.getDisplayName());
                "".length();
            }
            return lllllllllllllIIIlIlIlIIIIIIlIIlI;
        }
        return null;
    }
    
    private static boolean lllIlIllllIllll(final int lllllllllllllIIIlIlIIllllllIllII) {
        return lllllllllllllIIIlIlIIllllllIllII > 0;
    }
    
    private static void lllIlIllllIlIlI() {
        (lIlIlIIIllIllI = new int[3])[0] = ((0xBB ^ 0x91) & ~(0x1 ^ 0x2B));
        RecipesMapCloning.lIlIlIIIllIllI[1] = " ".length();
        RecipesMapCloning.lIlIlIIIllIllI[2] = (0x2F ^ 0x7E ^ (0xB ^ 0x53));
    }
    
    static {
        lllIlIllllIlIlI();
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }
    
    @Override
    public ItemStack[] getRemainingItems(final InventoryCrafting lllllllllllllIIIlIlIlIIIIIIIIlIl) {
        final ItemStack[] lllllllllllllIIIlIlIlIIIIIIIIlII = new ItemStack[lllllllllllllIIIlIlIlIIIIIIIIlIl.getSizeInventory()];
        int lllllllllllllIIIlIlIlIIIIIIIIIll = RecipesMapCloning.lIlIlIIIllIllI[0];
        "".length();
        if (-" ".length() >= (0x48 ^ 0x4C)) {
            return null;
        }
        while (!lllIlIllllIlllI(lllllllllllllIIIlIlIlIIIIIIIIIll, lllllllllllllIIIlIlIlIIIIIIIIlII.length)) {
            final ItemStack lllllllllllllIIIlIlIlIIIIIIIIIlI = lllllllllllllIIIlIlIlIIIIIIIIlIl.getStackInSlot(lllllllllllllIIIlIlIlIIIIIIIIIll);
            if (lllIlIllllIlIll(lllllllllllllIIIlIlIlIIIIIIIIIlI) && lllIlIlllllIIII(lllllllllllllIIIlIlIlIIIIIIIIIlI.getItem().hasContainerItem() ? 1 : 0)) {
                lllllllllllllIIIlIlIlIIIIIIIIlII[lllllllllllllIIIlIlIlIIIIIIIIIll] = new ItemStack(lllllllllllllIIIlIlIlIIIIIIIIIlI.getItem().getContainerItem());
            }
            ++lllllllllllllIIIlIlIlIIIIIIIIIll;
        }
        return lllllllllllllIIIlIlIlIIIIIIIIlII;
    }
    
    private static boolean lllIlIllllIllIl(final Object lllllllllllllIIIlIlIIlllllllIlll, final Object lllllllllllllIIIlIlIIlllllllIllI) {
        return lllllllllllllIIIlIlIIlllllllIlll != lllllllllllllIIIlIlIIlllllllIllI;
    }
}
