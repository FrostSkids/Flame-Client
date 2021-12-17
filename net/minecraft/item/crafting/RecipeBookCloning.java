// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemEditableBook;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class RecipeBookCloning implements IRecipe
{
    private static final /* synthetic */ String[] lIIllIIlIlIIlI;
    private static final /* synthetic */ int[] lIIllIIlIllIIl;
    
    private static void llIlIlllIlIIIIl() {
        (lIIllIIlIlIIlI = new String[RecipeBookCloning.lIIllIIlIllIIl[1]])[RecipeBookCloning.lIIllIIlIllIIl[0]] = llIlIlllIlIIIII("y40X3E2iJ1v8vPWqGYFN4w==", "twjmx");
    }
    
    private static String llIlIlllIlIIIII(final String lllllllllllllIIlIllIIIIlIIIlIlII, final String lllllllllllllIIlIllIIIIlIIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIIlIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), RecipeBookCloning.lIIllIIlIllIIl[4]), "DES");
            final Cipher lllllllllllllIIlIllIIIIlIIIllIII = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIIIlIIIllIII.init(RecipeBookCloning.lIIllIIlIllIIl[2], lllllllllllllIIlIllIIIIlIIIllIIl);
            return new String(lllllllllllllIIlIllIIIIlIIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIlIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIIlIIIlIlll) {
            lllllllllllllIIlIllIIIIlIIIlIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIlIlllIlIIlII();
        llIlIlllIlIIIIl();
    }
    
    private static boolean llIlIlllIlIlIII(final Object lllllllllllllIIlIllIIIIlIIIIIllI, final Object lllllllllllllIIlIllIIIIlIIIIIlIl) {
        return lllllllllllllIIlIllIIIIlIIIIIllI != lllllllllllllIIlIllIIIIlIIIIIlIl;
    }
    
    @Override
    public boolean matches(final InventoryCrafting lllllllllllllIIlIllIIIIlIlIIIIlI, final World lllllllllllllIIlIllIIIIlIlIIIlll) {
        int lllllllllllllIIlIllIIIIlIlIIIllI = RecipeBookCloning.lIIllIIlIllIIl[0];
        ItemStack lllllllllllllIIlIllIIIIlIlIIIlIl = null;
        int lllllllllllllIIlIllIIIIlIlIIIlII = RecipeBookCloning.lIIllIIlIllIIl[0];
        "".length();
        if ("  ".length() == " ".length()) {
            return ((0x92 ^ 0x8B ^ (0xCD ^ 0xB7)) & (0x6F ^ 0x1A ^ (0x73 ^ 0x65) ^ -" ".length())) != 0x0;
        }
        while (!llIlIlllIlIlIIl(lllllllllllllIIlIllIIIIlIlIIIlII, lllllllllllllIIlIllIIIIlIlIIIIlI.getSizeInventory())) {
            final ItemStack lllllllllllllIIlIllIIIIlIlIIIIll = lllllllllllllIIlIllIIIIlIlIIIIlI.getStackInSlot(lllllllllllllIIlIllIIIIlIlIIIlII);
            if (llIlIlllIlIIlIl(lllllllllllllIIlIllIIIIlIlIIIIll)) {
                if (llIlIlllIlIIlll(lllllllllllllIIlIllIIIIlIlIIIIll.getItem(), Items.written_book)) {
                    if (llIlIlllIlIIlIl(lllllllllllllIIlIllIIIIlIlIIIlIl)) {
                        return RecipeBookCloning.lIIllIIlIllIIl[0] != 0;
                    }
                    lllllllllllllIIlIllIIIIlIlIIIlIl = lllllllllllllIIlIllIIIIlIlIIIIll;
                    "".length();
                    if ("   ".length() > (0xC5 ^ 0xC1)) {
                        return ((0x12 ^ 0x3D) & ~(0x82 ^ 0xAD)) != 0x0;
                    }
                }
                else {
                    if (llIlIlllIlIlIII(lllllllllllllIIlIllIIIIlIlIIIIll.getItem(), Items.writable_book)) {
                        return RecipeBookCloning.lIIllIIlIllIIl[0] != 0;
                    }
                    ++lllllllllllllIIlIllIIIIlIlIIIllI;
                }
            }
            ++lllllllllllllIIlIllIIIIlIlIIIlII;
        }
        if (llIlIlllIlIIlIl(lllllllllllllIIlIllIIIIlIlIIIlIl) && llIlIlllIlIlIlI(lllllllllllllIIlIllIIIIlIlIIIllI)) {
            return RecipeBookCloning.lIIllIIlIllIIl[1] != 0;
        }
        return RecipeBookCloning.lIIllIIlIllIIl[0] != 0;
    }
    
    private static boolean llIlIlllIlIllII(final int lllllllllllllIIlIllIIIIIllllllIl) {
        return lllllllllllllIIlIllIIIIIllllllIl != 0;
    }
    
    private static boolean llIlIlllIlIIlIl(final Object lllllllllllllIIlIllIIIIlIIIIIIll) {
        return lllllllllllllIIlIllIIIIlIIIIIIll != null;
    }
    
    private static void llIlIlllIlIIlII() {
        (lIIllIIlIllIIl = new int[5])[0] = ((0x33 ^ 0x25) & ~(0x9B ^ 0x8D));
        RecipeBookCloning.lIIllIIlIllIIl[1] = " ".length();
        RecipeBookCloning.lIIllIIlIllIIl[2] = "  ".length();
        RecipeBookCloning.lIIllIIlIllIIl[3] = (0x2 ^ 0xB);
        RecipeBookCloning.lIIllIIlIllIIl[4] = (0x6B ^ 0x2D ^ (0x1D ^ 0x53));
    }
    
    @Override
    public int getRecipeSize() {
        return RecipeBookCloning.lIIllIIlIllIIl[3];
    }
    
    @Override
    public ItemStack[] getRemainingItems(final InventoryCrafting lllllllllllllIIlIllIIIIlIIlIIIIl) {
        final ItemStack[] lllllllllllllIIlIllIIIIlIIlIIlII = new ItemStack[lllllllllllllIIlIllIIIIlIIlIIIIl.getSizeInventory()];
        int lllllllllllllIIlIllIIIIlIIlIIIll = RecipeBookCloning.lIIllIIlIllIIl[0];
        "".length();
        if (((0x96 ^ 0xC3) & ~(0xE2 ^ 0xB7)) != 0x0) {
            return null;
        }
        while (!llIlIlllIlIlIIl(lllllllllllllIIlIllIIIIlIIlIIIll, lllllllllllllIIlIllIIIIlIIlIIlII.length)) {
            final ItemStack lllllllllllllIIlIllIIIIlIIlIIIlI = lllllllllllllIIlIllIIIIlIIlIIIIl.getStackInSlot(lllllllllllllIIlIllIIIIlIIlIIIll);
            if (llIlIlllIlIIlIl(lllllllllllllIIlIllIIIIlIIlIIIlI) && llIlIlllIlIllII((lllllllllllllIIlIllIIIIlIIlIIIlI.getItem() instanceof ItemEditableBook) ? 1 : 0)) {
                lllllllllllllIIlIllIIIIlIIlIIlII[lllllllllllllIIlIllIIIIlIIlIIIll] = lllllllllllllIIlIllIIIIlIIlIIIlI;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIlIllIIIIlIIlIIIll;
            }
        }
        return lllllllllllllIIlIllIIIIlIIlIIlII;
    }
    
    private static boolean llIlIlllIlIIlll(final Object lllllllllllllIIlIllIIIIlIIIIIIII, final Object lllllllllllllIIlIllIIIIIllllllll) {
        return lllllllllllllIIlIllIIIIlIIIIIIII == lllllllllllllIIlIllIIIIIllllllll;
    }
    
    private static boolean llIlIlllIlIlIIl(final int lllllllllllllIIlIllIIIIlIIIIlllI, final int lllllllllllllIIlIllIIIIlIIIIllIl) {
        return lllllllllllllIIlIllIIIIlIIIIlllI >= lllllllllllllIIlIllIIIIlIIIIllIl;
    }
    
    @Override
    public ItemStack getCraftingResult(final InventoryCrafting lllllllllllllIIlIllIIIIlIIllIlll) {
        int lllllllllllllIIlIllIIIIlIIllIllI = RecipeBookCloning.lIIllIIlIllIIl[0];
        ItemStack lllllllllllllIIlIllIIIIlIIllIlIl = null;
        int lllllllllllllIIlIllIIIIlIIllIlII = RecipeBookCloning.lIIllIIlIllIIl[0];
        "".length();
        if (" ".length() > (0xE ^ 0xA)) {
            return null;
        }
        while (!llIlIlllIlIlIIl(lllllllllllllIIlIllIIIIlIIllIlII, lllllllllllllIIlIllIIIIlIIllIlll.getSizeInventory())) {
            final ItemStack lllllllllllllIIlIllIIIIlIIllIIll = lllllllllllllIIlIllIIIIlIIllIlll.getStackInSlot(lllllllllllllIIlIllIIIIlIIllIlII);
            if (llIlIlllIlIIlIl(lllllllllllllIIlIllIIIIlIIllIIll)) {
                if (llIlIlllIlIIlll(lllllllllllllIIlIllIIIIlIIllIIll.getItem(), Items.written_book)) {
                    if (llIlIlllIlIIlIl(lllllllllllllIIlIllIIIIlIIllIlIl)) {
                        return null;
                    }
                    lllllllllllllIIlIllIIIIlIIllIlIl = lllllllllllllIIlIllIIIIlIIllIIll;
                    "".length();
                    if (((0x62 ^ 0x4F) & ~(0x7A ^ 0x57)) != ((0x43 ^ 0x52) & ~(0xA4 ^ 0xB5))) {
                        return null;
                    }
                }
                else {
                    if (llIlIlllIlIlIII(lllllllllllllIIlIllIIIIlIIllIIll.getItem(), Items.writable_book)) {
                        return null;
                    }
                    ++lllllllllllllIIlIllIIIIlIIllIllI;
                }
            }
            ++lllllllllllllIIlIllIIIIlIIllIlII;
        }
        if (llIlIlllIlIIlIl(lllllllllllllIIlIllIIIIlIIllIlIl) && llIlIlllIlIlIIl(lllllllllllllIIlIllIIIIlIIllIllI, RecipeBookCloning.lIIllIIlIllIIl[1]) && llIlIlllIlIlIll(ItemEditableBook.getGeneration(lllllllllllllIIlIllIIIIlIIllIlIl), RecipeBookCloning.lIIllIIlIllIIl[2])) {
            final ItemStack lllllllllllllIIlIllIIIIlIIllIIlI = new ItemStack(Items.written_book, lllllllllllllIIlIllIIIIlIIllIllI);
            lllllllllllllIIlIllIIIIlIIllIIlI.setTagCompound((NBTTagCompound)lllllllllllllIIlIllIIIIlIIllIlIl.getTagCompound().copy());
            lllllllllllllIIlIllIIIIlIIllIIlI.getTagCompound().setInteger(RecipeBookCloning.lIIllIIlIlIIlI[RecipeBookCloning.lIIllIIlIllIIl[0]], ItemEditableBook.getGeneration(lllllllllllllIIlIllIIIIlIIllIlIl) + RecipeBookCloning.lIIllIIlIllIIl[1]);
            if (llIlIlllIlIllII(lllllllllllllIIlIllIIIIlIIllIlIl.hasDisplayName() ? 1 : 0)) {
                lllllllllllllIIlIllIIIIlIIllIIlI.setStackDisplayName(lllllllllllllIIlIllIIIIlIIllIlIl.getDisplayName());
                "".length();
            }
            return lllllllllllllIIlIllIIIIlIIllIIlI;
        }
        return null;
    }
    
    private static boolean llIlIlllIlIlIll(final int lllllllllllllIIlIllIIIIlIIIIlIlI, final int lllllllllllllIIlIllIIIIlIIIIlIIl) {
        return lllllllllllllIIlIllIIIIlIIIIlIlI < lllllllllllllIIlIllIIIIlIIIIlIIl;
    }
    
    private static boolean llIlIlllIlIlIlI(final int lllllllllllllIIlIllIIIIIlllllIll) {
        return lllllllllllllIIlIllIIIIIlllllIll > 0;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }
}
