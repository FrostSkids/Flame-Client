// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import java.util.List;

public class ShapelessRecipes implements IRecipe
{
    private final /* synthetic */ List<ItemStack> recipeItems;
    private final /* synthetic */ ItemStack recipeOutput;
    private static final /* synthetic */ int[] lIlllllIIlIllI;
    
    private static boolean lIIIIlIlIIlIlllI(final int llllllllllllIllllIIlllIlIIlIlIll) {
        return llllllllllllIllllIIlllIlIIlIlIll != 0;
    }
    
    @Override
    public int getRecipeSize() {
        return this.recipeItems.size();
    }
    
    static {
        lIIIIlIlIIlIllII();
    }
    
    @Override
    public ItemStack[] getRemainingItems(final InventoryCrafting llllllllllllIllllIIlllIlIllIIIII) {
        final ItemStack[] llllllllllllIllllIIlllIlIllIIIll = new ItemStack[llllllllllllIllllIIlllIlIllIIIII.getSizeInventory()];
        int llllllllllllIllllIIlllIlIllIIIlI = ShapelessRecipes.lIlllllIIlIllI[0];
        "".length();
        if (((0x64 ^ 0x4F) & ~(0x6A ^ 0x41)) >= " ".length()) {
            return null;
        }
        while (!lIIIIlIlIIlIllll(llllllllllllIllllIIlllIlIllIIIlI, llllllllllllIllllIIlllIlIllIIIll.length)) {
            final ItemStack llllllllllllIllllIIlllIlIllIIIIl = llllllllllllIllllIIlllIlIllIIIII.getStackInSlot(llllllllllllIllllIIlllIlIllIIIlI);
            if (lIIIIlIlIIlIllIl(llllllllllllIllllIIlllIlIllIIIIl) && lIIIIlIlIIlIlllI(llllllllllllIllllIIlllIlIllIIIIl.getItem().hasContainerItem() ? 1 : 0)) {
                llllllllllllIllllIIlllIlIllIIIll[llllllllllllIllllIIlllIlIllIIIlI] = new ItemStack(llllllllllllIllllIIlllIlIllIIIIl.getItem().getContainerItem());
            }
            ++llllllllllllIllllIIlllIlIllIIIlI;
        }
        return llllllllllllIllllIIlllIlIllIIIll;
    }
    
    public ShapelessRecipes(final ItemStack llllllllllllIllllIIlllIlIllIlllI, final List<ItemStack> llllllllllllIllllIIlllIlIlllIIII) {
        this.recipeOutput = llllllllllllIllllIIlllIlIllIlllI;
        this.recipeItems = llllllllllllIllllIIlllIlIlllIIII;
    }
    
    private static boolean lIIIIlIlIIlIllIl(final Object llllllllllllIllllIIlllIlIIllIIIl) {
        return llllllllllllIllllIIlllIlIIllIIIl != null;
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting llllllllllllIllllIIlllIlIIllllll) {
        return this.recipeOutput.copy();
    }
    
    private static boolean lIIIIlIlIIllIIll(final int llllllllllllIllllIIlllIlIIlIlIIl) {
        return llllllllllllIllllIIlllIlIIlIlIIl == 0;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return this.recipeOutput;
    }
    
    @Override
    public boolean matches(final InventoryCrafting llllllllllllIllllIIlllIlIlIIlIIl, final World llllllllllllIllllIIlllIlIlIlIIIl) {
        final List<ItemStack> llllllllllllIllllIIlllIlIlIlIIII = (List<ItemStack>)Lists.newArrayList((Iterable)this.recipeItems);
        int llllllllllllIllllIIlllIlIlIIllll = ShapelessRecipes.lIlllllIIlIllI[0];
        "".length();
        if (-" ".length() == " ".length()) {
            return ((0x65 ^ 0x3C ^ (0x81 ^ 0x97)) & (0x28 ^ 0x7C ^ (0x14 ^ 0xF) ^ -" ".length())) != 0x0;
        }
        while (!lIIIIlIlIIlIllll(llllllllllllIllllIIlllIlIlIIllll, llllllllllllIllllIIlllIlIlIIlIIl.getHeight())) {
            int llllllllllllIllllIIlllIlIlIIlllI = ShapelessRecipes.lIlllllIIlIllI[0];
            "".length();
            if (null != null) {
                return ((0x3B ^ 0xE) & ~(0x15 ^ 0x20)) != 0x0;
            }
            while (!lIIIIlIlIIlIllll(llllllllllllIllllIIlllIlIlIIlllI, llllllllllllIllllIIlllIlIlIIlIIl.getWidth())) {
                final ItemStack llllllllllllIllllIIlllIlIlIIllIl = llllllllllllIllllIIlllIlIlIIlIIl.getStackInRowAndColumn(llllllllllllIllllIIlllIlIlIIlllI, llllllllllllIllllIIlllIlIlIIllll);
                if (lIIIIlIlIIlIllIl(llllllllllllIllllIIlllIlIlIIllIl)) {
                    boolean llllllllllllIllllIIlllIlIlIIllII = ShapelessRecipes.lIlllllIIlIllI[0] != 0;
                    final Exception llllllllllllIllllIIlllIlIlIIIIlI = (Exception)llllllllllllIllllIIlllIlIlIlIIII.iterator();
                    "".length();
                    if ("   ".length() < 0) {
                        return ((0x6A ^ 0xA ^ (0x3E ^ 0x62)) & (0x8E ^ 0x9C ^ (0x79 ^ 0x57) ^ -" ".length())) != 0x0;
                    }
                    while (!lIIIIlIlIIllIIll(((Iterator)llllllllllllIllllIIlllIlIlIIIIlI).hasNext() ? 1 : 0)) {
                        final ItemStack llllllllllllIllllIIlllIlIlIIlIll = ((Iterator<ItemStack>)llllllllllllIllllIIlllIlIlIIIIlI).next();
                        if (lIIIIlIlIIllIIII(llllllllllllIllllIIlllIlIlIIllIl.getItem(), llllllllllllIllllIIlllIlIlIIlIll.getItem()) && (!lIIIIlIlIIllIIIl(llllllllllllIllllIIlllIlIlIIlIll.getMetadata(), ShapelessRecipes.lIlllllIIlIllI[1]) || lIIIIlIlIIllIIlI(llllllllllllIllllIIlllIlIlIIllIl.getMetadata(), llllllllllllIllllIIlllIlIlIIlIll.getMetadata()))) {
                            llllllllllllIllllIIlllIlIlIIllII = (ShapelessRecipes.lIlllllIIlIllI[2] != 0);
                            llllllllllllIllllIIlllIlIlIlIIII.remove(llllllllllllIllllIIlllIlIlIIlIll);
                            "".length();
                            "".length();
                            if ("   ".length() < 0) {
                                return ((0x4A ^ 0x53) & ~(0x52 ^ 0x4B)) != 0x0;
                            }
                            break;
                        }
                    }
                    if (lIIIIlIlIIllIIll(llllllllllllIllllIIlllIlIlIIllII ? 1 : 0)) {
                        return ShapelessRecipes.lIlllllIIlIllI[0] != 0;
                    }
                }
                ++llllllllllllIllllIIlllIlIlIIlllI;
            }
            ++llllllllllllIllllIIlllIlIlIIllll;
        }
        return llllllllllllIllllIIlllIlIlIlIIII.isEmpty();
    }
    
    private static void lIIIIlIlIIlIllII() {
        (lIlllllIIlIllI = new int[3])[0] = ((0x22 ^ 0x30 ^ (0x2D ^ 0x35)) & (129 + 61 - 177 + 120 ^ 131 + 20 - 111 + 103 ^ -" ".length()));
        ShapelessRecipes.lIlllllIIlIllI[1] = (-" ".length() & (-1 & 0x7FFF));
        ShapelessRecipes.lIlllllIIlIllI[2] = " ".length();
    }
    
    private static boolean lIIIIlIlIIllIIIl(final int llllllllllllIllllIIlllIlIIlIIllI, final int llllllllllllIllllIIlllIlIIlIIlIl) {
        return llllllllllllIllllIIlllIlIIlIIllI != llllllllllllIllllIIlllIlIIlIIlIl;
    }
    
    private static boolean lIIIIlIlIIlIllll(final int llllllllllllIllllIIlllIlIIllIlII, final int llllllllllllIllllIIlllIlIIllIIll) {
        return llllllllllllIllllIIlllIlIIllIlII >= llllllllllllIllllIIlllIlIIllIIll;
    }
    
    private static boolean lIIIIlIlIIllIIlI(final int llllllllllllIllllIIlllIlIIlllIII, final int llllllllllllIllllIIlllIlIIllIlll) {
        return llllllllllllIllllIIlllIlIIlllIII == llllllllllllIllllIIlllIlIIllIlll;
    }
    
    private static boolean lIIIIlIlIIllIIII(final Object llllllllllllIllllIIlllIlIIlIlllI, final Object llllllllllllIllllIIlllIlIIlIllIl) {
        return llllllllllllIllllIIlllIlIIlIlllI == llllllllllllIllllIIlllIlIIlIllIl;
    }
}
