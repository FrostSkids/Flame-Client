// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.nbt.NBTTagCompound;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.storage.MapData;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipesMapExtending extends ShapedRecipes
{
    private static final /* synthetic */ String[] lIlIlIIlIIlIIl;
    private static final /* synthetic */ int[] lIlIlIIlIIlIll;
    
    private static void lllIllIIIIllIIl() {
        (lIlIlIIlIIlIIl = new String[RecipesMapExtending.lIlIlIIlIIlIll[3]])[RecipesMapExtending.lIlIlIIlIIlIll[2]] = lllIllIIIIllIII("LDUEBSQyCwc5LC09Gj0=", "ATtZM");
    }
    
    private static void lllIllIIIIllllI() {
        (lIlIlIIlIIlIll = new int[11])[0] = "   ".length();
        RecipesMapExtending.lIlIlIIlIIlIll[1] = (0x33 ^ 0x21 ^ (0xA6 ^ 0xBD));
        RecipesMapExtending.lIlIlIIlIIlIll[2] = ((0xE5 ^ 0xB3) & ~(0x37 ^ 0x61));
        RecipesMapExtending.lIlIlIIlIIlIll[3] = " ".length();
        RecipesMapExtending.lIlIlIIlIIlIll[4] = "  ".length();
        RecipesMapExtending.lIlIlIIlIIlIll[5] = (0xA ^ 0x72 ^ (0x3F ^ 0x43));
        RecipesMapExtending.lIlIlIIlIIlIll[6] = (-" ".length() & (-1 & 0x7FFF));
        RecipesMapExtending.lIlIlIIlIIlIll[7] = (0x29 ^ 0x25 ^ (0x44 ^ 0x4D));
        RecipesMapExtending.lIlIlIIlIIlIll[8] = (0x72 ^ 0x78 ^ (0x6C ^ 0x60));
        RecipesMapExtending.lIlIlIIlIIlIll[9] = (125 + 77 - 170 + 159 ^ 76 + 175 - 88 + 21);
        RecipesMapExtending.lIlIlIIlIIlIll[10] = (0xAD ^ 0x94 ^ (0x37 ^ 0x6));
    }
    
    private static boolean lllIllIIIIlllll(final int lllllllllllllIIIlIlIIIllIIlIllll) {
        return lllllllllllllIIIlIlIIIllIIlIllll == 0;
    }
    
    public RecipesMapExtending() {
        final int lllllllllllllIlIlIllIIIllllIIIlI = RecipesMapExtending.lIlIlIIlIIlIll[0];
        final int lllllllllllllIlIlIllIIIllllIIIIl = RecipesMapExtending.lIlIlIIlIIlIll[0];
        final ItemStack[] lllllllllllllIlIlIllIIIllllIIlIl = new ItemStack[RecipesMapExtending.lIlIlIIlIIlIll[1]];
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[2]] = new ItemStack(Items.paper);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[3]] = new ItemStack(Items.paper);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[4]] = new ItemStack(Items.paper);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[0]] = new ItemStack(Items.paper);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[5]] = new ItemStack(Items.filled_map, RecipesMapExtending.lIlIlIIlIIlIll[2], RecipesMapExtending.lIlIlIIlIIlIll[6]);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[7]] = new ItemStack(Items.paper);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[8]] = new ItemStack(Items.paper);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[9]] = new ItemStack(Items.paper);
        lllllllllllllIlIlIllIIIllllIIlIl[RecipesMapExtending.lIlIlIIlIIlIll[10]] = new ItemStack(Items.paper);
        super(lllllllllllllIlIlIllIIIllllIIIlI, lllllllllllllIlIlIllIIIllllIIIIl, lllllllllllllIlIlIllIIIllllIIlIl, new ItemStack(Items.map, RecipesMapExtending.lIlIlIIlIIlIll[2], RecipesMapExtending.lIlIlIIlIIlIll[2]));
    }
    
    private static boolean lllIllIIIlIIIlI(final int lllllllllllllIIIlIlIIIllIIlllIlI, final int lllllllllllllIIIlIlIIIllIIlllIIl) {
        return lllllllllllllIIIlIlIIIllIIlllIlI < lllllllllllllIIIlIlIIIllIIlllIIl;
    }
    
    @Override
    public boolean matches(final InventoryCrafting lllllllllllllIIIlIlIIIllIllIIllI, final World lllllllllllllIIIlIlIIIllIllIllII) {
        if (lllIllIIIIlllll(super.matches(lllllllllllllIIIlIlIIIllIllIIllI, lllllllllllllIIIlIlIIIllIllIllII) ? 1 : 0)) {
            return RecipesMapExtending.lIlIlIIlIIlIll[2] != 0;
        }
        ItemStack lllllllllllllIIIlIlIIIllIllIlIll = null;
        int lllllllllllllIIIlIlIIIllIllIlIlI = RecipesMapExtending.lIlIlIIlIIlIll[2];
        "".length();
        if ((0xAE ^ 0xAA) == 0x0) {
            return ((0x23 ^ 0x30) & ~(0x2C ^ 0x3F)) != 0x0;
        }
        while (lllIllIIIlIIIlI(lllllllllllllIIIlIlIIIllIllIlIlI, lllllllllllllIIIlIlIIIllIllIIllI.getSizeInventory()) && !lllIllIIIlIIIII(lllllllllllllIIIlIlIIIllIllIlIll)) {
            final ItemStack lllllllllllllIIIlIlIIIllIllIlIIl = lllllllllllllIIIlIlIIIllIllIIllI.getStackInSlot(lllllllllllllIIIlIlIIIllIllIlIlI);
            if (lllIllIIIlIIIII(lllllllllllllIIIlIlIIIllIllIlIIl) && lllIllIIIlIIIIl(lllllllllllllIIIlIlIIIllIllIlIIl.getItem(), Items.filled_map)) {
                lllllllllllllIIIlIlIIIllIllIlIll = lllllllllllllIIIlIlIIIllIllIlIIl;
            }
            ++lllllllllllllIIIlIlIIIllIllIlIlI;
        }
        if (lllIllIIIlIIIll(lllllllllllllIIIlIlIIIllIllIlIll)) {
            return RecipesMapExtending.lIlIlIIlIIlIll[2] != 0;
        }
        final MapData lllllllllllllIIIlIlIIIllIllIlIII = Items.filled_map.getMapData(lllllllllllllIIIlIlIIIllIllIlIll, lllllllllllllIIIlIlIIIllIllIllII);
        int n;
        if (lllIllIIIlIIIll(lllllllllllllIIIlIlIIIllIllIlIII)) {
            n = RecipesMapExtending.lIlIlIIlIIlIll[2];
            "".length();
            if (null != null) {
                return ((0x50 ^ 0x2 ^ (0x6E ^ 0x31)) & (58 + 5 + 67 + 12 ^ 25 + 52 + 1 + 53 ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIIIlIIIlI(lllllllllllllIIIlIlIIIllIllIlIII.scale, RecipesMapExtending.lIlIlIIlIIlIll[5])) {
            n = RecipesMapExtending.lIlIlIIlIIlIll[3];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0xF5 ^ 0xAD) & ~(0xB ^ 0x53)) != 0x0;
            }
        }
        else {
            n = RecipesMapExtending.lIlIlIIlIIlIll[2];
        }
        return n != 0;
    }
    
    static {
        lllIllIIIIllllI();
        lllIllIIIIllIIl();
    }
    
    private static boolean lllIllIIIlIIIII(final Object lllllllllllllIIIlIlIIIllIIllIlll) {
        return lllllllllllllIIIlIlIIIllIIllIlll != null;
    }
    
    private static String lllIllIIIIllIII(String lllllllllllllIIIlIlIIIllIlIIIlIl, final String lllllllllllllIIIlIlIIIllIlIIlIIl) {
        lllllllllllllIIIlIlIIIllIlIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIIllIlIIlIII = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIIllIlIIIlll = lllllllllllllIIIlIlIIIllIlIIlIIl.toCharArray();
        int lllllllllllllIIIlIlIIIllIlIIIllI = RecipesMapExtending.lIlIlIIlIIlIll[2];
        final short lllllllllllllIIIlIlIIIllIlIIIIII = (Object)lllllllllllllIIIlIlIIIllIlIIIlIl.toCharArray();
        final byte lllllllllllllIIIlIlIIIllIIllllll = (byte)lllllllllllllIIIlIlIIIllIlIIIIII.length;
        String lllllllllllllIIIlIlIIIllIIlllllI = (String)RecipesMapExtending.lIlIlIIlIIlIll[2];
        while (lllIllIIIlIIIlI((int)lllllllllllllIIIlIlIIIllIIlllllI, lllllllllllllIIIlIlIIIllIIllllll)) {
            final char lllllllllllllIIIlIlIIIllIlIIlIll = lllllllllllllIIIlIlIIIllIlIIIIII[lllllllllllllIIIlIlIIIllIIlllllI];
            lllllllllllllIIIlIlIIIllIlIIlIII.append((char)(lllllllllllllIIIlIlIIIllIlIIlIll ^ lllllllllllllIIIlIlIIIllIlIIIlll[lllllllllllllIIIlIlIIIllIlIIIllI % lllllllllllllIIIlIlIIIllIlIIIlll.length]));
            "".length();
            ++lllllllllllllIIIlIlIIIllIlIIIllI;
            ++lllllllllllllIIIlIlIIIllIIlllllI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIIllIlIIlIII);
    }
    
    private static boolean lllIllIIIlIIIIl(final Object lllllllllllllIIIlIlIIIllIIllIlII, final Object lllllllllllllIIIlIlIIIllIIllIIll) {
        return lllllllllllllIIIlIlIIIllIIllIlII == lllllllllllllIIIlIlIIIllIIllIIll;
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting lllllllllllllIIIlIlIIIllIlIlllII) {
        ItemStack lllllllllllllIIIlIlIIIllIlIllIll = null;
        int lllllllllllllIIIlIlIIIllIlIllIlI = RecipesMapExtending.lIlIlIIlIIlIll[2];
        "".length();
        if (" ".length() > " ".length()) {
            return null;
        }
        while (lllIllIIIlIIIlI(lllllllllllllIIIlIlIIIllIlIllIlI, lllllllllllllIIIlIlIIIllIlIlllII.getSizeInventory()) && !lllIllIIIlIIIII(lllllllllllllIIIlIlIIIllIlIllIll)) {
            final ItemStack lllllllllllllIIIlIlIIIllIlIllIIl = lllllllllllllIIIlIlIIIllIlIlllII.getStackInSlot(lllllllllllllIIIlIlIIIllIlIllIlI);
            if (lllIllIIIlIIIII(lllllllllllllIIIlIlIIIllIlIllIIl) && lllIllIIIlIIIIl(lllllllllllllIIIlIlIIIllIlIllIIl.getItem(), Items.filled_map)) {
                lllllllllllllIIIlIlIIIllIlIllIll = lllllllllllllIIIlIlIIIllIlIllIIl;
            }
            ++lllllllllllllIIIlIlIIIllIlIllIlI;
        }
        lllllllllllllIIIlIlIIIllIlIllIll = lllllllllllllIIIlIlIIIllIlIllIll.copy();
        lllllllllllllIIIlIlIIIllIlIllIll.stackSize = RecipesMapExtending.lIlIlIIlIIlIll[3];
        if (lllIllIIIlIIIll(lllllllllllllIIIlIlIIIllIlIllIll.getTagCompound())) {
            lllllllllllllIIIlIlIIIllIlIllIll.setTagCompound(new NBTTagCompound());
        }
        lllllllllllllIIIlIlIIIllIlIllIll.getTagCompound().setBoolean(RecipesMapExtending.lIlIlIIlIIlIIl[RecipesMapExtending.lIlIlIIlIIlIll[2]], (boolean)(RecipesMapExtending.lIlIlIIlIIlIll[3] != 0));
        return lllllllllllllIIIlIlIIIllIlIllIll;
    }
    
    private static boolean lllIllIIIlIIIll(final Object lllllllllllllIIIlIlIIIllIIllIIIl) {
        return lllllllllllllIIIlIlIIIllIIllIIIl == null;
    }
}
