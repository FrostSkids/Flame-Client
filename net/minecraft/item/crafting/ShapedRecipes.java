// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;

public class ShapedRecipes implements IRecipe
{
    private final /* synthetic */ ItemStack recipeOutput;
    private /* synthetic */ boolean copyIngredientNBT;
    private static final /* synthetic */ int[] lllllIllllIIl;
    private final /* synthetic */ int recipeWidth;
    private final /* synthetic */ ItemStack[] recipeItems;
    private final /* synthetic */ int recipeHeight;
    
    private static boolean lIlIllllIlIIllI(final int lllllllllllllIlIlIllIIIllIIIllII, final int lllllllllllllIlIlIllIIIllIIIlIll) {
        return lllllllllllllIlIlIllIIIllIIIllII >= lllllllllllllIlIlIllIIIllIIIlIll;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return this.recipeOutput;
    }
    
    private static boolean lIlIllllIlIIlll(final int lllllllllllllIlIlIllIIIllIIIIlII, final int lllllllllllllIlIlIllIIIllIIIIIll) {
        return lllllllllllllIlIlIllIIIllIIIIlII > lllllllllllllIlIlIllIIIllIIIIIll;
    }
    
    private static boolean lIlIllllIlIlIIl(final int lllllllllllllIlIlIllIIIllIIIlIII, final int lllllllllllllIlIlIllIIIllIIIIlll) {
        return lllllllllllllIlIlIllIIIllIIIlIII < lllllllllllllIlIlIllIIIllIIIIlll;
    }
    
    private static boolean lIlIllllIlIlIII(final int lllllllllllllIlIlIllIIIlIlllIlll) {
        return lllllllllllllIlIlIllIIIlIlllIlll >= 0;
    }
    
    static {
        lIlIllllIlIIIll();
    }
    
    private static boolean lIlIllllIlIIlII(final Object lllllllllllllIlIlIllIIIlIlllllIl) {
        return lllllllllllllIlIlIllIIIlIlllllIl != null;
    }
    
    private static boolean lIlIllllIlIllII(final int lllllllllllllIlIlIllIIIlIlllIlII, final int lllllllllllllIlIlIllIIIlIlllIIll) {
        return lllllllllllllIlIlIllIIIlIlllIlII != lllllllllllllIlIlIllIIIlIlllIIll;
    }
    
    private static void lIlIllllIlIIIll() {
        (lllllIllllIIl = new int[4])[0] = ((0xF6 ^ 0xA6) & ~(0x42 ^ 0x12));
        ShapedRecipes.lllllIllllIIl[1] = " ".length();
        ShapedRecipes.lllllIllllIIl[2] = "   ".length();
        ShapedRecipes.lllllIllllIIl[3] = (-" ".length() & (-1 & 0x7FFF));
    }
    
    private static boolean lIlIllllIlIlIlI(final Object lllllllllllllIlIlIllIIIlIllllIll) {
        return lllllllllllllIlIlIllIIIlIllllIll == null;
    }
    
    @Override
    public boolean matches(final InventoryCrafting lllllllllllllIlIlIllIIIlllIIlIIl, final World lllllllllllllIlIlIllIIIlllIIlIII) {
        int lllllllllllllIlIlIllIIIlllIIIlll = ShapedRecipes.lllllIllllIIl[0];
        "".length();
        if (-" ".length() >= "   ".length()) {
            return ((0xAC ^ 0xA7) & ~(0xCB ^ 0xC0)) != 0x0;
        }
        while (!lIlIllllIlIIlll(lllllllllllllIlIlIllIIIlllIIIlll, ShapedRecipes.lllllIllllIIl[2] - this.recipeWidth)) {
            int lllllllllllllIlIlIllIIIlllIIIllI = ShapedRecipes.lllllIllllIIl[0];
            "".length();
            if (-(0xF5 ^ 0x8E ^ 34 + 93 - 125 + 125) > 0) {
                return ((74 + 68 + 23 + 24 ^ 8 + 111 - 52 + 102) & (0x2F ^ 0x49 ^ (0xD5 ^ 0xA7) ^ -" ".length())) != 0x0;
            }
            while (!lIlIllllIlIIlll(lllllllllllllIlIlIllIIIlllIIIllI, ShapedRecipes.lllllIllllIIl[2] - this.recipeHeight)) {
                if (lIlIllllIlIIlIl(this.checkMatch(lllllllllllllIlIlIllIIIlllIIlIIl, lllllllllllllIlIlIllIIIlllIIIlll, lllllllllllllIlIlIllIIIlllIIIllI, (boolean)(ShapedRecipes.lllllIllllIIl[1] != 0)) ? 1 : 0)) {
                    return ShapedRecipes.lllllIllllIIl[1] != 0;
                }
                if (lIlIllllIlIIlIl(this.checkMatch(lllllllllllllIlIlIllIIIlllIIlIIl, lllllllllllllIlIlIllIIIlllIIIlll, lllllllllllllIlIlIllIIIlllIIIllI, (boolean)(ShapedRecipes.lllllIllllIIl[0] != 0)) ? 1 : 0)) {
                    return ShapedRecipes.lllllIllllIIl[1] != 0;
                }
                ++lllllllllllllIlIlIllIIIlllIIIllI;
            }
            ++lllllllllllllIlIlIllIIIlllIIIlll;
        }
        return ShapedRecipes.lllllIllllIIl[0] != 0;
    }
    
    private static boolean lIlIllllIlIlIll(final Object lllllllllllllIlIlIllIIIllIIIIIII, final Object lllllllllllllIlIlIllIIIlIlllllll) {
        return lllllllllllllIlIlIllIIIllIIIIIII != lllllllllllllIlIlIllIIIlIlllllll;
    }
    
    public ShapedRecipes(final int lllllllllllllIlIlIllIIIllllIIIlI, final int lllllllllllllIlIlIllIIIllllIIIIl, final ItemStack[] lllllllllllllIlIlIllIIIllllIIlIl, final ItemStack lllllllllllllIlIlIllIIIllllIIlII) {
        this.recipeWidth = lllllllllllllIlIlIllIIIllllIIIlI;
        this.recipeHeight = lllllllllllllIlIlIllIIIllllIIIIl;
        this.recipeItems = lllllllllllllIlIlIllIIIllllIIlIl;
        this.recipeOutput = lllllllllllllIlIlIllIIIllllIIlII;
    }
    
    @Override
    public ItemStack[] getRemainingItems(final InventoryCrafting lllllllllllllIlIlIllIIIlllIlIIlI) {
        final ItemStack[] lllllllllllllIlIlIllIIIlllIlIlIl = new ItemStack[lllllllllllllIlIlIllIIIlllIlIIlI.getSizeInventory()];
        int lllllllllllllIlIlIllIIIlllIlIlII = ShapedRecipes.lllllIllllIIl[0];
        "".length();
        if ((58 + 2 + 2 + 70 ^ 33 + 127 - 116 + 84) <= 0) {
            return null;
        }
        while (!lIlIllllIlIIllI(lllllllllllllIlIlIllIIIlllIlIlII, lllllllllllllIlIlIllIIIlllIlIlIl.length)) {
            final ItemStack lllllllllllllIlIlIllIIIlllIlIIll = lllllllllllllIlIlIllIIIlllIlIIlI.getStackInSlot(lllllllllllllIlIlIllIIIlllIlIlII);
            if (lIlIllllIlIIlII(lllllllllllllIlIlIllIIIlllIlIIll) && lIlIllllIlIIlIl(lllllllllllllIlIlIllIIIlllIlIIll.getItem().hasContainerItem() ? 1 : 0)) {
                lllllllllllllIlIlIllIIIlllIlIlIl[lllllllllllllIlIlIllIIIlllIlIlII] = new ItemStack(lllllllllllllIlIlIllIIIlllIlIIll.getItem().getContainerItem());
            }
            ++lllllllllllllIlIlIllIIIlllIlIlII;
        }
        return lllllllllllllIlIlIllIIIlllIlIlIl;
    }
    
    @Override
    public int getRecipeSize() {
        return this.recipeWidth * this.recipeHeight;
    }
    
    private boolean checkMatch(final InventoryCrafting lllllllllllllIlIlIllIIIllIlIlIlI, final int lllllllllllllIlIlIllIIIllIlIlIIl, final int lllllllllllllIlIlIllIIIllIllIIll, final boolean lllllllllllllIlIlIllIIIllIllIIlI) {
        int lllllllllllllIlIlIllIIIllIllIIIl = ShapedRecipes.lllllIllllIIl[0];
        "".length();
        if ("   ".length() < 0) {
            return ((48 + 43 - 46 + 128 ^ 59 + 26 + 53 + 10) & (0xF8 ^ 0xC3 ^ "  ".length() ^ -" ".length())) != 0x0;
        }
        while (!lIlIllllIlIIllI(lllllllllllllIlIlIllIIIllIllIIIl, ShapedRecipes.lllllIllllIIl[2])) {
            int lllllllllllllIlIlIllIIIllIllIIII = ShapedRecipes.lllllIllllIIl[0];
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0x35 ^ 0x73) & ~(0x20 ^ 0x66)) != 0x0;
            }
            while (!lIlIllllIlIIllI(lllllllllllllIlIlIllIIIllIllIIII, ShapedRecipes.lllllIllllIIl[2])) {
                final int lllllllllllllIlIlIllIIIllIlIllll = lllllllllllllIlIlIllIIIllIllIIIl - lllllllllllllIlIlIllIIIllIlIlIIl;
                final int lllllllllllllIlIlIllIIIllIlIlllI = lllllllllllllIlIlIllIIIllIllIIII - lllllllllllllIlIlIllIIIllIllIIll;
                ItemStack lllllllllllllIlIlIllIIIllIlIllIl = null;
                if (lIlIllllIlIlIII(lllllllllllllIlIlIllIIIllIlIllll) && lIlIllllIlIlIII(lllllllllllllIlIlIllIIIllIlIlllI) && lIlIllllIlIlIIl(lllllllllllllIlIlIllIIIllIlIllll, this.recipeWidth) && lIlIllllIlIlIIl(lllllllllllllIlIlIllIIIllIlIlllI, this.recipeHeight)) {
                    if (lIlIllllIlIIlIl(lllllllllllllIlIlIllIIIllIllIIlI ? 1 : 0)) {
                        lllllllllllllIlIlIllIIIllIlIllIl = this.recipeItems[this.recipeWidth - lllllllllllllIlIlIllIIIllIlIllll - ShapedRecipes.lllllIllllIIl[1] + lllllllllllllIlIlIllIIIllIlIlllI * this.recipeWidth];
                        "".length();
                        if (" ".length() < 0) {
                            return ((0x92 ^ 0xB0) & ~(0x22 ^ 0x0)) != 0x0;
                        }
                    }
                    else {
                        lllllllllllllIlIlIllIIIllIlIllIl = this.recipeItems[lllllllllllllIlIlIllIIIllIlIllll + lllllllllllllIlIlIllIIIllIlIlllI * this.recipeWidth];
                    }
                }
                final ItemStack lllllllllllllIlIlIllIIIllIlIllII = lllllllllllllIlIlIllIIIllIlIlIlI.getStackInRowAndColumn(lllllllllllllIlIlIllIIIllIllIIIl, lllllllllllllIlIlIllIIIllIllIIII);
                if (!lIlIllllIlIlIlI(lllllllllllllIlIlIllIIIllIlIllII) || lIlIllllIlIIlII(lllllllllllllIlIlIllIIIllIlIllIl)) {
                    if ((lIlIllllIlIlIlI(lllllllllllllIlIlIllIIIllIlIllII) && !lIlIllllIlIlIlI(lllllllllllllIlIlIllIIIllIlIllIl)) || (lIlIllllIlIIlII(lllllllllllllIlIlIllIIIllIlIllII) && lIlIllllIlIlIlI(lllllllllllllIlIlIllIIIllIlIllIl))) {
                        return ShapedRecipes.lllllIllllIIl[0] != 0;
                    }
                    if (lIlIllllIlIlIll(lllllllllllllIlIlIllIIIllIlIllIl.getItem(), lllllllllllllIlIlIllIIIllIlIllII.getItem())) {
                        return ShapedRecipes.lllllIllllIIl[0] != 0;
                    }
                    if (lIlIllllIlIllII(lllllllllllllIlIlIllIIIllIlIllIl.getMetadata(), ShapedRecipes.lllllIllllIIl[3]) && lIlIllllIlIllII(lllllllllllllIlIlIllIIIllIlIllIl.getMetadata(), lllllllllllllIlIlIllIIIllIlIllII.getMetadata())) {
                        return ShapedRecipes.lllllIllllIIl[0] != 0;
                    }
                }
                ++lllllllllllllIlIlIllIIIllIllIIII;
            }
            ++lllllllllllllIlIlIllIIIllIllIIIl;
        }
        return ShapedRecipes.lllllIllllIIl[1] != 0;
    }
    
    private static boolean lIlIllllIlIIlIl(final int lllllllllllllIlIlIllIIIlIllllIIl) {
        return lllllllllllllIlIlIllIIIlIllllIIl != 0;
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting lllllllllllllIlIlIllIIIllIIlIlIl) {
        final ItemStack lllllllllllllIlIlIllIIIllIIllIIl = this.getRecipeOutput().copy();
        if (lIlIllllIlIIlIl(this.copyIngredientNBT ? 1 : 0)) {
            int lllllllllllllIlIlIllIIIllIIllIII = ShapedRecipes.lllllIllllIIl[0];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
            while (!lIlIllllIlIIllI(lllllllllllllIlIlIllIIIllIIllIII, lllllllllllllIlIlIllIIIllIIlIlIl.getSizeInventory())) {
                final ItemStack lllllllllllllIlIlIllIIIllIIlIlll = lllllllllllllIlIlIllIIIllIIlIlIl.getStackInSlot(lllllllllllllIlIlIllIIIllIIllIII);
                if (lIlIllllIlIIlII(lllllllllllllIlIlIllIIIllIIlIlll) && lIlIllllIlIIlIl(lllllllllllllIlIlIllIIIllIIlIlll.hasTagCompound() ? 1 : 0)) {
                    lllllllllllllIlIlIllIIIllIIllIIl.setTagCompound((NBTTagCompound)lllllllllllllIlIlIllIIIllIIlIlll.getTagCompound().copy());
                }
                ++lllllllllllllIlIlIllIIIllIIllIII;
            }
        }
        return lllllllllllllIlIlIllIIIllIIllIIl;
    }
}
