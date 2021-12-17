// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumDyeColor;
import java.util.List;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import com.google.common.collect.Lists;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.InventoryCrafting;

public class RecipesArmorDyes implements IRecipe
{
    private static final /* synthetic */ int[] lIlIlllIIIIIlI;
    
    @Override
    public int getRecipeSize() {
        return RecipesArmorDyes.lIlIlllIIIIIlI[7];
    }
    
    private static boolean llllIIlIlllIIlI(final int lllllllllllllIIIIlIlllllIlIIlIll) {
        return lllllllllllllIIIIlIlllllIlIIlIll == 0;
    }
    
    @Override
    public ItemStack[] getRemainingItems(final InventoryCrafting lllllllllllllIIIIlIlllllIlllllIl) {
        final ItemStack[] lllllllllllllIIIIlIllllllIIIIIll = new ItemStack[lllllllllllllIIIIlIlllllIlllllIl.getSizeInventory()];
        int lllllllllllllIIIIlIllllllIIIIIIl = RecipesArmorDyes.lIlIlllIIIIIlI[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llllIIlIlllIIIl(lllllllllllllIIIIlIllllllIIIIIIl, lllllllllllllIIIIlIllllllIIIIIll.length)) {
            final ItemStack lllllllllllllIIIIlIlllllIlllllll = lllllllllllllIIIIlIlllllIlllllIl.getStackInSlot(lllllllllllllIIIIlIllllllIIIIIIl);
            if (llllIIlIllIllIl(lllllllllllllIIIIlIlllllIlllllll) && llllIIlIllIlllI(lllllllllllllIIIIlIlllllIlllllll.getItem().hasContainerItem() ? 1 : 0)) {
                lllllllllllllIIIIlIllllllIIIIIll[lllllllllllllIIIIlIllllllIIIIIIl] = new ItemStack(lllllllllllllIIIIlIlllllIlllllll.getItem().getContainerItem());
            }
            ++lllllllllllllIIIIlIllllllIIIIIIl;
        }
        return lllllllllllllIIIIlIllllllIIIIIll;
    }
    
    private static boolean llllIIlIllIllIl(final Object lllllllllllllIIIIlIlllllIllIIIIl) {
        return lllllllllllllIIIIlIlllllIllIIIIl != null;
    }
    
    private static boolean llllIIlIlllIIIl(final int lllllllllllllIIIIlIlllllIllIlIll, final int lllllllllllllIIIIlIlllllIllIlIIl) {
        return lllllllllllllIIIIlIlllllIllIlIll >= lllllllllllllIIIIlIlllllIllIlIIl;
    }
    
    static {
        llllIIlIllIllII();
    }
    
    private static boolean llllIIlIllIlllI(final int lllllllllllllIIIIlIlllllIlIIllll) {
        return lllllllllllllIIIIlIlllllIlIIllll != 0;
    }
    
    private static void llllIIlIllIllII() {
        (lIlIlllIIIIIlI = new int[8])[0] = ((0x68 ^ 0x6 ^ (0x6E ^ 0x3B)) & (232 + 212 - 218 + 28 ^ 146 + 24 - 149 + 176 ^ -" ".length()));
        RecipesArmorDyes.lIlIlllIIIIIlI[1] = " ".length();
        RecipesArmorDyes.lIlIlllIIIIIlI[2] = "   ".length();
        RecipesArmorDyes.lIlIlllIIIIIlI[3] = (0x1D ^ 0xD);
        RecipesArmorDyes.lIlIlllIIIIIlI[4] = (0xD0 ^ 0x90) + (74 + 79 - 144 + 131) - (0xD9 ^ 0x97) + (97 + 37 - 56 + 51);
        RecipesArmorDyes.lIlIlllIIIIIlI[5] = (43 + 137 - 8 + 30 ^ 18 + 155 + 2 + 19);
        RecipesArmorDyes.lIlIlllIIIIIlI[6] = "  ".length();
        RecipesArmorDyes.lIlIlllIIIIIlI[7] = (0x9 ^ 0x71 ^ (0xB ^ 0x79));
    }
    
    @Override
    public boolean matches(final InventoryCrafting lllllllllllllIIIIlIllllllllIllII, final World lllllllllllllIIIIlIllllllllIlIll) {
        ItemStack lllllllllllllIIIIlIllllllllIlIlI = null;
        final List<ItemStack> lllllllllllllIIIIlIllllllllIlIIl = (List<ItemStack>)Lists.newArrayList();
        int lllllllllllllIIIIlIllllllllIlIII = RecipesArmorDyes.lIlIlllIIIIIlI[0];
        "".length();
        if (((0xEE ^ 0xA8) & ~(0x9 ^ 0x4F)) < 0) {
            return ((0xBF ^ 0xA2) & ~(0x4C ^ 0x51)) != 0x0;
        }
        while (!llllIIlIlllIIIl(lllllllllllllIIIIlIllllllllIlIII, lllllllllllllIIIIlIllllllllIllII.getSizeInventory())) {
            final ItemStack lllllllllllllIIIIlIllllllllIIlll = lllllllllllllIIIIlIllllllllIllII.getStackInSlot(lllllllllllllIIIIlIllllllllIlIII);
            if (llllIIlIllIllIl(lllllllllllllIIIIlIllllllllIIlll)) {
                if (llllIIlIllIlllI((lllllllllllllIIIIlIllllllllIIlll.getItem() instanceof ItemArmor) ? 1 : 0)) {
                    final ItemArmor lllllllllllllIIIIlIllllllllIIllI = (ItemArmor)lllllllllllllIIIIlIllllllllIIlll.getItem();
                    if (!llllIIlIllIllll(lllllllllllllIIIIlIllllllllIIllI.getArmorMaterial(), ItemArmor.ArmorMaterial.LEATHER) || llllIIlIllIllIl(lllllllllllllIIIIlIllllllllIlIlI)) {
                        return RecipesArmorDyes.lIlIlllIIIIIlI[0] != 0;
                    }
                    lllllllllllllIIIIlIllllllllIlIlI = lllllllllllllIIIIlIllllllllIIlll;
                    "".length();
                    if (null != null) {
                        return ((0x1 ^ 0x1F) & ~(0xA4 ^ 0xBA)) != 0x0;
                    }
                }
                else {
                    if (llllIIlIlllIIII(lllllllllllllIIIIlIllllllllIIlll.getItem(), Items.dye)) {
                        return RecipesArmorDyes.lIlIlllIIIIIlI[0] != 0;
                    }
                    lllllllllllllIIIIlIllllllllIlIIl.add(lllllllllllllIIIIlIllllllllIIlll);
                    "".length();
                }
            }
            ++lllllllllllllIIIIlIllllllllIlIII;
        }
        if (llllIIlIllIllIl(lllllllllllllIIIIlIllllllllIlIlI) && llllIIlIlllIIlI(lllllllllllllIIIIlIllllllllIlIIl.isEmpty() ? 1 : 0)) {
            return RecipesArmorDyes.lIlIlllIIIIIlI[1] != 0;
        }
        return RecipesArmorDyes.lIlIlllIIIIIlI[0] != 0;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }
    
    private static boolean llllIIlIlllIIII(final Object lllllllllllllIIIIlIlllllIllIIlIl, final Object lllllllllllllIIIIlIlllllIllIIlII) {
        return lllllllllllllIIIIlIlllllIllIIlIl != lllllllllllllIIIIlIlllllIllIIlII;
    }
    
    private static boolean llllIIlIllIllll(final Object lllllllllllllIIIIlIlllllIlIllIll, final Object lllllllllllllIIIIlIlllllIlIllIIl) {
        return lllllllllllllIIIIlIlllllIlIllIll == lllllllllllllIIIIlIlllllIlIllIIl;
    }
    
    private static boolean llllIIlIlllIlII(final Object lllllllllllllIIIIlIlllllIlIlIlII) {
        return lllllllllllllIIIIlIlllllIlIlIlII == null;
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting lllllllllllllIIIIlIllllllIlIllII) {
        ItemStack lllllllllllllIIIIlIlllllllIIllIl = null;
        final int[] lllllllllllllIIIIlIlllllllIIllII = new int[RecipesArmorDyes.lIlIlllIIIIIlI[2]];
        int lllllllllllllIIIIlIlllllllIIlIll = RecipesArmorDyes.lIlIlllIIIIIlI[0];
        int lllllllllllllIIIIlIlllllllIIlIlI = RecipesArmorDyes.lIlIlllIIIIIlI[0];
        ItemArmor lllllllllllllIIIIlIlllllllIIlIIl = null;
        int lllllllllllllIIIIlIlllllllIIlIII = RecipesArmorDyes.lIlIlllIIIIIlI[0];
        "".length();
        if (" ".length() < " ".length()) {
            return null;
        }
        while (!llllIIlIlllIIIl(lllllllllllllIIIIlIlllllllIIlIII, lllllllllllllIIIIlIllllllIlIllII.getSizeInventory())) {
            final ItemStack lllllllllllllIIIIlIlllllllIIIllI = lllllllllllllIIIIlIllllllIlIllII.getStackInSlot(lllllllllllllIIIIlIlllllllIIlIII);
            if (llllIIlIllIllIl(lllllllllllllIIIIlIlllllllIIIllI)) {
                if (llllIIlIllIlllI((lllllllllllllIIIIlIlllllllIIIllI.getItem() instanceof ItemArmor) ? 1 : 0)) {
                    lllllllllllllIIIIlIlllllllIIlIIl = (ItemArmor)lllllllllllllIIIIlIlllllllIIIllI.getItem();
                    if (!llllIIlIllIllll(lllllllllllllIIIIlIlllllllIIlIIl.getArmorMaterial(), ItemArmor.ArmorMaterial.LEATHER) || llllIIlIllIllIl(lllllllllllllIIIIlIlllllllIIllIl)) {
                        return null;
                    }
                    lllllllllllllIIIIlIlllllllIIllIl = lllllllllllllIIIIlIlllllllIIIllI.copy();
                    lllllllllllllIIIIlIlllllllIIllIl.stackSize = RecipesArmorDyes.lIlIlllIIIIIlI[1];
                    if (llllIIlIllIlllI(lllllllllllllIIIIlIlllllllIIlIIl.hasColor(lllllllllllllIIIIlIlllllllIIIllI) ? 1 : 0)) {
                        final int lllllllllllllIIIIlIlllllllIIIlII = lllllllllllllIIIIlIlllllllIIlIIl.getColor(lllllllllllllIIIIlIlllllllIIllIl);
                        final float lllllllllllllIIIIlIlllllllIIIIlI = (lllllllllllllIIIIlIlllllllIIIlII >> RecipesArmorDyes.lIlIlllIIIIIlI[3] & RecipesArmorDyes.lIlIlllIIIIIlI[4]) / 255.0f;
                        final float lllllllllllllIIIIlIlllllllIIIIII = (lllllllllllllIIIIlIlllllllIIIlII >> RecipesArmorDyes.lIlIlllIIIIIlI[5] & RecipesArmorDyes.lIlIlllIIIIIlI[4]) / 255.0f;
                        final float lllllllllllllIIIIlIllllllIlllllI = (lllllllllllllIIIIlIlllllllIIIlII & RecipesArmorDyes.lIlIlllIIIIIlI[4]) / 255.0f;
                        lllllllllllllIIIIlIlllllllIIlIll += (int)(Math.max(lllllllllllllIIIIlIlllllllIIIIlI, Math.max(lllllllllllllIIIIlIlllllllIIIIII, lllllllllllllIIIIlIllllllIlllllI)) * 255.0f);
                        lllllllllllllIIIIlIlllllllIIllII[RecipesArmorDyes.lIlIlllIIIIIlI[0]] += (int)(lllllllllllllIIIIlIlllllllIIIIlI * 255.0f);
                        lllllllllllllIIIIlIlllllllIIllII[RecipesArmorDyes.lIlIlllIIIIIlI[1]] += (int)(lllllllllllllIIIIlIlllllllIIIIII * 255.0f);
                        lllllllllllllIIIIlIlllllllIIllII[RecipesArmorDyes.lIlIlllIIIIIlI[6]] += (int)(lllllllllllllIIIIlIllllllIlllllI * 255.0f);
                        ++lllllllllllllIIIIlIlllllllIIlIlI;
                        "".length();
                        if ("   ".length() == " ".length()) {
                            return null;
                        }
                    }
                }
                else {
                    if (llllIIlIlllIIII(lllllllllllllIIIIlIlllllllIIIllI.getItem(), Items.dye)) {
                        return null;
                    }
                    final float[] lllllllllllllIIIIlIllllllIllllII = EntitySheep.func_175513_a(EnumDyeColor.byDyeDamage(lllllllllllllIIIIlIlllllllIIIllI.getMetadata()));
                    final int lllllllllllllIIIIlIllllllIlllIll = (int)(lllllllllllllIIIIlIllllllIllllII[RecipesArmorDyes.lIlIlllIIIIIlI[0]] * 255.0f);
                    final int lllllllllllllIIIIlIllllllIlllIIl = (int)(lllllllllllllIIIIlIllllllIllllII[RecipesArmorDyes.lIlIlllIIIIIlI[1]] * 255.0f);
                    final int lllllllllllllIIIIlIllllllIllIlll = (int)(lllllllllllllIIIIlIllllllIllllII[RecipesArmorDyes.lIlIlllIIIIIlI[6]] * 255.0f);
                    lllllllllllllIIIIlIlllllllIIlIll += Math.max(lllllllllllllIIIIlIllllllIlllIll, Math.max(lllllllllllllIIIIlIllllllIlllIIl, lllllllllllllIIIIlIllllllIllIlll));
                    final int[] array = lllllllllllllIIIIlIlllllllIIllII;
                    final int n = RecipesArmorDyes.lIlIlllIIIIIlI[0];
                    array[n] += lllllllllllllIIIIlIllllllIlllIll;
                    final int[] array2 = lllllllllllllIIIIlIlllllllIIllII;
                    final int n2 = RecipesArmorDyes.lIlIlllIIIIIlI[1];
                    array2[n2] += lllllllllllllIIIIlIllllllIlllIIl;
                    final int[] array3 = lllllllllllllIIIIlIlllllllIIllII;
                    final int n3 = RecipesArmorDyes.lIlIlllIIIIIlI[6];
                    array3[n3] += lllllllllllllIIIIlIllllllIllIlll;
                    ++lllllllllllllIIIIlIlllllllIIlIlI;
                }
            }
            ++lllllllllllllIIIIlIlllllllIIlIII;
        }
        if (llllIIlIlllIlII(lllllllllllllIIIIlIlllllllIIlIIl)) {
            return null;
        }
        int lllllllllllllIIIIlIllllllIllIlIl = lllllllllllllIIIIlIlllllllIIllII[RecipesArmorDyes.lIlIlllIIIIIlI[0]] / lllllllllllllIIIIlIlllllllIIlIlI;
        int lllllllllllllIIIIlIllllllIllIlII = lllllllllllllIIIIlIlllllllIIllII[RecipesArmorDyes.lIlIlllIIIIIlI[1]] / lllllllllllllIIIIlIlllllllIIlIlI;
        int lllllllllllllIIIIlIllllllIllIIll = lllllllllllllIIIIlIlllllllIIllII[RecipesArmorDyes.lIlIlllIIIIIlI[6]] / lllllllllllllIIIIlIlllllllIIlIlI;
        final float lllllllllllllIIIIlIllllllIllIIIl = lllllllllllllIIIIlIlllllllIIlIll / (float)lllllllllllllIIIIlIlllllllIIlIlI;
        final float lllllllllllllIIIIlIllllllIlIllll = (float)Math.max(lllllllllllllIIIIlIllllllIllIlIl, Math.max(lllllllllllllIIIIlIllllllIllIlII, lllllllllllllIIIIlIllllllIllIIll));
        lllllllllllllIIIIlIllllllIllIlIl = (int)(lllllllllllllIIIIlIllllllIllIlIl * lllllllllllllIIIIlIllllllIllIIIl / lllllllllllllIIIIlIllllllIlIllll);
        lllllllllllllIIIIlIllllllIllIlII = (int)(lllllllllllllIIIIlIllllllIllIlII * lllllllllllllIIIIlIllllllIllIIIl / lllllllllllllIIIIlIllllllIlIllll);
        lllllllllllllIIIIlIllllllIllIIll = (int)(lllllllllllllIIIIlIllllllIllIIll * lllllllllllllIIIIlIllllllIllIIIl / lllllllllllllIIIIlIllllllIlIllll);
        int lllllllllllllIIIIlIllllllIlIllIl = (lllllllllllllIIIIlIllllllIllIlIl << RecipesArmorDyes.lIlIlllIIIIIlI[5]) + lllllllllllllIIIIlIllllllIllIlII;
        lllllllllllllIIIIlIllllllIlIllIl = (lllllllllllllIIIIlIllllllIlIllIl << RecipesArmorDyes.lIlIlllIIIIIlI[5]) + lllllllllllllIIIIlIllllllIllIIll;
        lllllllllllllIIIIlIlllllllIIlIIl.setColor(lllllllllllllIIIIlIlllllllIIllIl, lllllllllllllIIIIlIllllllIlIllIl);
        return lllllllllllllIIIIlIlllllllIIllIl;
    }
}
