// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.inventory.InventoryCrafting;
import java.util.Arrays;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class RecipesBanners
{
    private static final /* synthetic */ int[] lIlIlIlIlIllII;
    private static final /* synthetic */ String[] lIlIlIlIlIlIIl;
    
    private static String lllIlllIIllIlIl(final String lllllllllllllIIIIlllIIIlIllllllI, final String lllllllllllllIIIIlllIIIlIlllllll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIIIllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlllIIIllIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlllIIIllIIIIIlI.init(RecipesBanners.lIlIlIlIlIllII[3], lllllllllllllIIIIlllIIIllIIIIIll);
            return new String(lllllllllllllIIIIlllIIIllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIIIllIIIIIIl) {
            lllllllllllllIIIIlllIIIllIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlllIlIIIIlI(final int lllllllllllllIIIIlllIIIlIllIIIII, final int lllllllllllllIIIIlllIIIlIlIlllll) {
        return lllllllllllllIIIIlllIIIlIllIIIII >= lllllllllllllIIIIlllIIIlIlIlllll;
    }
    
    private static void lllIlllIlIIIIIl() {
        (lIlIlIlIlIllII = new int[11])[0] = ((0x88 ^ 0xA5) & ~(0xA5 ^ 0x88));
        RecipesBanners.lIlIlIlIlIllII[1] = " ".length();
        RecipesBanners.lIlIlIlIlIllII[2] = (0x2C ^ 0x50 ^ (0x66 ^ 0x1D));
        RecipesBanners.lIlIlIlIlIllII[3] = "  ".length();
        RecipesBanners.lIlIlIlIlIllII[4] = "   ".length();
        RecipesBanners.lIlIlIlIlIllII[5] = (0x6E ^ 0x4D);
        RecipesBanners.lIlIlIlIlIllII[6] = (0x9C ^ 0x98);
        RecipesBanners.lIlIlIlIlIllII[7] = (0x52 ^ 0x57);
        RecipesBanners.lIlIlIlIlIllII[8] = (0xEF ^ 0x93);
        RecipesBanners.lIlIlIlIlIllII[9] = (12 + 23 + 146 + 13 ^ 133 + 68 - 159 + 154);
        RecipesBanners.lIlIlIlIlIllII[10] = (0x19 ^ 0x11);
    }
    
    void addRecipes(final CraftingManager lllllllllllllIIIIlllIIIllIIllIll) {
        final char lllllllllllllIIIIlllIIIllIIlIlIl;
        final char lllllllllllllIIIIlllIIIllIIlIllI = (char)((EnumDyeColor[])(Object)(lllllllllllllIIIIlllIIIllIIlIlIl = (char)(Object)EnumDyeColor.values())).length;
        short lllllllllllllIIIIlllIIIllIIlIlll = (short)RecipesBanners.lIlIlIlIlIllII[0];
        "".length();
        if (-(0x5C ^ 0x58) > 0) {
            return;
        }
        while (!lllIlllIlIIIIlI(lllllllllllllIIIIlllIIIllIIlIlll, lllllllllllllIIIIlllIIIllIIlIllI)) {
            final EnumDyeColor lllllllllllllIIIIlllIIIllIIllIlI = lllllllllllllIIIIlllIIIllIIlIlIl[lllllllllllllIIIIlllIIIllIIlIlll];
            final ItemStack llllllllllllIlllllllIIlIIIlIllII = new ItemStack(Items.banner, RecipesBanners.lIlIlIlIlIllII[1], lllllllllllllIIIIlllIIIllIIllIlI.getDyeDamage());
            final Object[] llllllllllllIlllllllIIlIIIllllIl = new Object[RecipesBanners.lIlIlIlIlIllII[2]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesBanners.lIlIlIlIlIllII[0]] = RecipesBanners.lIlIlIlIlIlIIl[RecipesBanners.lIlIlIlIlIllII[0]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesBanners.lIlIlIlIlIllII[1]] = RecipesBanners.lIlIlIlIlIlIIl[RecipesBanners.lIlIlIlIlIllII[1]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesBanners.lIlIlIlIlIllII[3]] = RecipesBanners.lIlIlIlIlIlIIl[RecipesBanners.lIlIlIlIlIllII[3]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesBanners.lIlIlIlIlIllII[4]] = (char)RecipesBanners.lIlIlIlIlIllII[5];
            llllllllllllIlllllllIIlIIIllllIl[RecipesBanners.lIlIlIlIlIllII[6]] = new ItemStack(Blocks.wool, RecipesBanners.lIlIlIlIlIllII[1], lllllllllllllIIIIlllIIIllIIllIlI.getMetadata());
            llllllllllllIlllllllIIlIIIllllIl[RecipesBanners.lIlIlIlIlIllII[7]] = (char)RecipesBanners.lIlIlIlIlIllII[8];
            llllllllllllIlllllllIIlIIIllllIl[RecipesBanners.lIlIlIlIlIllII[9]] = Items.stick;
            lllllllllllllIIIIlllIIIllIIllIll.addRecipe(llllllllllllIlllllllIIlIIIlIllII, llllllllllllIlllllllIIlIIIllllIl);
            "".length();
            ++lllllllllllllIIIIlllIIIllIIlIlll;
        }
        lllllllllllllIIIIlllIIIllIIllIll.addRecipe(new RecipeDuplicatePattern(null));
        lllllllllllllIIIIlllIIIllIIllIll.addRecipe(new RecipeAddPattern(null));
    }
    
    static {
        lllIlllIlIIIIIl();
        lllIlllIIllllII();
    }
    
    private static String lllIlllIIlllIll(final String lllllllllllllIIIIlllIIIllIIIlIll, final String lllllllllllllIIIIlllIIIllIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIIIllIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIllIIIllII.getBytes(StandardCharsets.UTF_8)), RecipesBanners.lIlIlIlIlIllII[10]), "DES");
            final Cipher lllllllllllllIIIIlllIIIllIIIllll = Cipher.getInstance("DES");
            lllllllllllllIIIIlllIIIllIIIllll.init(RecipesBanners.lIlIlIlIlIllII[3], lllllllllllllIIIIlllIIIllIIlIIII);
            return new String(lllllllllllllIIIIlllIIIllIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIIIllIIIlllI) {
            lllllllllllllIIIIlllIIIllIIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static String lllIlllIIlllIlI(String lllllllllllllIIIIlllIIIlIllIlIll, final String lllllllllllllIIIIlllIIIlIllIlIlI) {
        lllllllllllllIIIIlllIIIlIllIlIll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlllIIIlIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllIIIlIllIlllI = new StringBuilder();
        final char[] lllllllllllllIIIIlllIIIlIllIllIl = lllllllllllllIIIIlllIIIlIllIlIlI.toCharArray();
        int lllllllllllllIIIIlllIIIlIllIllII = RecipesBanners.lIlIlIlIlIllII[0];
        final int lllllllllllllIIIIlllIIIlIllIIllI = (Object)((String)lllllllllllllIIIIlllIIIlIllIlIll).toCharArray();
        final double lllllllllllllIIIIlllIIIlIllIIlIl = lllllllllllllIIIIlllIIIlIllIIllI.length;
        long lllllllllllllIIIIlllIIIlIllIIlII = RecipesBanners.lIlIlIlIlIllII[0];
        while (lllIlllIlIIIIll((int)lllllllllllllIIIIlllIIIlIllIIlII, (int)lllllllllllllIIIIlllIIIlIllIIlIl)) {
            final char lllllllllllllIIIIlllIIIlIlllIIIl = lllllllllllllIIIIlllIIIlIllIIllI[lllllllllllllIIIIlllIIIlIllIIlII];
            lllllllllllllIIIIlllIIIlIllIlllI.append((char)(lllllllllllllIIIIlllIIIlIlllIIIl ^ lllllllllllllIIIIlllIIIlIllIllIl[lllllllllllllIIIIlllIIIlIllIllII % lllllllllllllIIIIlllIIIlIllIllIl.length]));
            "".length();
            ++lllllllllllllIIIIlllIIIlIllIllII;
            ++lllllllllllllIIIIlllIIIlIllIIlII;
            "".length();
            if ((0x44 ^ 0x7D ^ (0xFC ^ 0xC1)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllIIIlIllIlllI);
    }
    
    private static void lllIlllIIllllII() {
        (lIlIlIlIlIlIIl = new String[RecipesBanners.lIlIlIlIlIllII[4]])[RecipesBanners.lIlIlIlIlIllII[0]] = lllIlllIIllIlIl("fuu/G6Tmo9c=", "MjhTP");
        RecipesBanners.lIlIlIlIlIlIIl[RecipesBanners.lIlIlIlIlIllII[1]] = lllIlllIIlllIlI("elBu", "YsMvB");
        RecipesBanners.lIlIlIlIlIlIIl[RecipesBanners.lIlIlIlIlIllII[3]] = lllIlllIIlllIll("KpUWRY//TFw=", "SMmqb");
    }
    
    private static boolean lllIlllIlIIIIll(final int lllllllllllllIIIIlllIIIlIlIlllII, final int lllllllllllllIIIIlllIIIlIlIllIll) {
        return lllllllllllllIIIIlllIIIlIlIlllII < lllllllllllllIIIIlllIIIlIlIllIll;
    }
    
    static class RecipeDuplicatePattern implements IRecipe
    {
        private static final /* synthetic */ int[] llIIIIIIllIlll;
        
        static {
            lIIIIlllIIIIIlll();
        }
        
        @Override
        public int getRecipeSize() {
            return RecipeDuplicatePattern.llIIIIIIllIlll[2];
        }
        
        @Override
        public ItemStack getRecipeOutput() {
            return null;
        }
        
        @Override
        public ItemStack[] getRemainingItems(final InventoryCrafting llllllllllllIlllIllllIllIllIlIIl) {
            final ItemStack[] llllllllllllIlllIllllIllIllIlllI = new ItemStack[llllllllllllIlllIllllIllIllIlIIl.getSizeInventory()];
            int llllllllllllIlllIllllIllIllIllII = RecipeDuplicatePattern.llIIIIIIllIlll[0];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
            while (!lIIIIlllIIIIlllI(llllllllllllIlllIllllIllIllIllII, llllllllllllIlllIllllIllIllIlllI.length)) {
                final ItemStack llllllllllllIlllIllllIllIllIlIlI = llllllllllllIlllIllllIllIllIlIIl.getStackInSlot(llllllllllllIlllIllllIllIllIllII);
                if (lIIIIlllIIIIlIII(llllllllllllIlllIllllIllIllIlIlI)) {
                    if (lIIIIlllIIIIlIll(llllllllllllIlllIllllIllIllIlIlI.getItem().hasContainerItem() ? 1 : 0)) {
                        llllllllllllIlllIllllIllIllIlllI[llllllllllllIlllIllllIllIllIllII] = new ItemStack(llllllllllllIlllIllllIllIllIlIlI.getItem().getContainerItem());
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return null;
                        }
                    }
                    else if (lIIIIlllIIIIlIll(llllllllllllIlllIllllIllIllIlIlI.hasTagCompound() ? 1 : 0) && lIIIIlllIIIIlIlI(TileEntityBanner.getPatterns(llllllllllllIlllIllllIllIllIlIlI))) {
                        llllllllllllIlllIllllIllIllIlllI[llllllllllllIlllIllllIllIllIllII] = llllllllllllIlllIllllIllIllIlIlI.copy();
                        llllllllllllIlllIllllIllIllIlllI[llllllllllllIlllIllllIllIllIllII].stackSize = RecipeDuplicatePattern.llIIIIIIllIlll[1];
                    }
                }
                ++llllllllllllIlllIllllIllIllIllII;
            }
            return llllllllllllIlllIllllIllIllIlllI;
        }
        
        private static boolean lIIIIlllIIIIlIll(final int llllllllllllIlllIllllIllIlIIllll) {
            return llllllllllllIlllIllllIllIlIIllll != 0;
        }
        
        private RecipeDuplicatePattern() {
        }
        
        @Override
        public boolean matches(final InventoryCrafting llllllllllllIlllIllllIlllIlIllII, final World llllllllllllIlllIllllIlllIlIlIll) {
            ItemStack llllllllllllIlllIllllIlllIlIlIlI = null;
            ItemStack llllllllllllIlllIllllIlllIlIlIIl = null;
            int llllllllllllIlllIllllIlllIlIlIII = RecipeDuplicatePattern.llIIIIIIllIlll[0];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((0x19 ^ 0x20 ^ (0x2E ^ 0x5E)) & (0x3 ^ 0x28 ^ (0xEC ^ 0x8E) ^ -" ".length())) != 0x0;
            }
            while (!lIIIIlllIIIIlllI(llllllllllllIlllIllllIlllIlIlIII, llllllllllllIlllIllllIlllIlIllII.getSizeInventory())) {
                final ItemStack llllllllllllIlllIllllIlllIlIIlll = llllllllllllIlllIllllIlllIlIllII.getStackInSlot(llllllllllllIlllIllllIlllIlIlIII);
                if (lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIlIIlll)) {
                    if (lIIIIlllIIIIlIIl(llllllllllllIlllIllllIlllIlIIlll.getItem(), Items.banner)) {
                        return RecipeDuplicatePattern.llIIIIIIllIlll[0] != 0;
                    }
                    if (lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIlIlIlI) && lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIlIlIIl)) {
                        return RecipeDuplicatePattern.llIIIIIIllIlll[0] != 0;
                    }
                    final int llllllllllllIlllIllllIlllIlIIllI = TileEntityBanner.getBaseColor(llllllllllllIlllIllllIlllIlIIlll);
                    int n;
                    if (lIIIIlllIIIIlIlI(TileEntityBanner.getPatterns(llllllllllllIlllIllllIlllIlIIlll))) {
                        n = RecipeDuplicatePattern.llIIIIIIllIlll[1];
                        "".length();
                        if (((0x63 ^ 0x0 ^ " ".length()) & (0x63 ^ 0x71 ^ (0x2B ^ 0x5B) ^ -" ".length())) < 0) {
                            return ((0x1D ^ 0x8 ^ (0xD5 ^ 0x99)) & (0xC7 ^ 0xB5 ^ (0x4F ^ 0x64) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        n = RecipeDuplicatePattern.llIIIIIIllIlll[0];
                    }
                    final boolean llllllllllllIlllIllllIlllIlIIlIl = n != 0;
                    if (lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIlIlIlI)) {
                        if (lIIIIlllIIIIlIll(llllllllllllIlllIllllIlllIlIIlIl ? 1 : 0)) {
                            return RecipeDuplicatePattern.llIIIIIIllIlll[0] != 0;
                        }
                        if (lIIIIlllIIIIllII(llllllllllllIlllIllllIlllIlIIllI, TileEntityBanner.getBaseColor(llllllllllllIlllIllllIlllIlIlIlI))) {
                            return RecipeDuplicatePattern.llIIIIIIllIlll[0] != 0;
                        }
                        llllllllllllIlllIllllIlllIlIlIIl = llllllllllllIlllIllllIlllIlIIlll;
                        "".length();
                        if ("  ".length() < 0) {
                            return ((36 + 25 + 56 + 10 ^ (0x32 ^ 0x5A)) & (0x10 ^ 0xE ^ (0x65 ^ 0x6C) ^ -" ".length())) != 0x0;
                        }
                    }
                    else if (lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIlIlIIl)) {
                        if (lIIIIlllIIIIllIl(llllllllllllIlllIllllIlllIlIIlIl ? 1 : 0)) {
                            return RecipeDuplicatePattern.llIIIIIIllIlll[0] != 0;
                        }
                        if (lIIIIlllIIIIllII(llllllllllllIlllIllllIlllIlIIllI, TileEntityBanner.getBaseColor(llllllllllllIlllIllllIlllIlIlIIl))) {
                            return RecipeDuplicatePattern.llIIIIIIllIlll[0] != 0;
                        }
                        llllllllllllIlllIllllIlllIlIlIlI = llllllllllllIlllIllllIlllIlIIlll;
                        "".length();
                        if (null != null) {
                            return ((0xC9 ^ 0x82) & ~(0x39 ^ 0x72)) != 0x0;
                        }
                    }
                    else if (lIIIIlllIIIIlIll(llllllllllllIlllIllllIlllIlIIlIl ? 1 : 0)) {
                        llllllllllllIlllIllllIlllIlIlIlI = llllllllllllIlllIllllIlllIlIIlll;
                        "".length();
                        if (((0x3C ^ 0x75) & ~(0xE7 ^ 0xAE)) != 0x0) {
                            return ((0xA0 ^ 0x86) & ~(0x43 ^ 0x65)) != 0x0;
                        }
                    }
                    else {
                        llllllllllllIlllIllllIlllIlIlIIl = llllllllllllIlllIllllIlllIlIIlll;
                    }
                }
                ++llllllllllllIlllIllllIlllIlIlIII;
            }
            if (lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIlIlIlI) && lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIlIlIIl)) {
                return RecipeDuplicatePattern.llIIIIIIllIlll[1] != 0;
            }
            return RecipeDuplicatePattern.llIIIIIIllIlll[0] != 0;
        }
        
        private static boolean lIIIIlllIIIIllII(final int llllllllllllIlllIllllIllIlIIlIII, final int llllllllllllIlllIllllIllIlIIIlll) {
            return llllllllllllIlllIllllIllIlIIlIII != llllllllllllIlllIllllIllIlIIIlll;
        }
        
        private static boolean lIIIIlllIIIIlIIl(final Object llllllllllllIlllIllllIllIlIlIlII, final Object llllllllllllIlllIllllIllIlIlIIll) {
            return llllllllllllIlllIllllIllIlIlIlII != llllllllllllIlllIllllIllIlIlIIll;
        }
        
        @Override
        public ItemStack getCraftingResult(final InventoryCrafting llllllllllllIlllIllllIlllIIIlIII) {
            int llllllllllllIlllIllllIlllIIIlIll = RecipeDuplicatePattern.llIIIIIIllIlll[0];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIIIIlllIIIIlllI(llllllllllllIlllIllllIlllIIIlIll, llllllllllllIlllIllllIlllIIIlIII.getSizeInventory())) {
                final ItemStack llllllllllllIlllIllllIlllIIIlIlI = llllllllllllIlllIllllIlllIIIlIII.getStackInSlot(llllllllllllIlllIllllIlllIIIlIll);
                if (lIIIIlllIIIIlIII(llllllllllllIlllIllllIlllIIIlIlI) && lIIIIlllIIIIlIlI(TileEntityBanner.getPatterns(llllllllllllIlllIllllIlllIIIlIlI))) {
                    final ItemStack llllllllllllIlllIllllIlllIIIlIIl = llllllllllllIlllIllllIlllIIIlIlI.copy();
                    llllllllllllIlllIllllIlllIIIlIIl.stackSize = RecipeDuplicatePattern.llIIIIIIllIlll[1];
                    return llllllllllllIlllIllllIlllIIIlIIl;
                }
                ++llllllllllllIlllIllllIlllIIIlIll;
            }
            return null;
        }
        
        private static boolean lIIIIlllIIIIllIl(final int llllllllllllIlllIllllIllIlIIllIl) {
            return llllllllllllIlllIllllIllIlIIllIl == 0;
        }
        
        private static boolean lIIIIlllIIIIlIlI(final int llllllllllllIlllIllllIllIlIIlIll) {
            return llllllllllllIlllIllllIllIlIIlIll > 0;
        }
        
        private static boolean lIIIIlllIIIIlIII(final Object llllllllllllIlllIllllIllIlIlIIIl) {
            return llllllllllllIlllIllllIllIlIlIIIl != null;
        }
        
        private static void lIIIIlllIIIIIlll() {
            (llIIIIIIllIlll = new int[3])[0] = ((0x56 ^ 0x70 ^ (0x7B ^ 0x4D)) & (0xA6 ^ 0xB0 ^ (0x5E ^ 0x58) ^ -" ".length()));
            RecipeDuplicatePattern.llIIIIIIllIlll[1] = " ".length();
            RecipeDuplicatePattern.llIIIIIIllIlll[2] = "  ".length();
        }
        
        private static boolean lIIIIlllIIIIlllI(final int llllllllllllIlllIllllIllIlIllIIl, final int llllllllllllIlllIllllIllIlIlIlll) {
            return llllllllllllIlllIllllIllIlIllIIl >= llllllllllllIlllIllllIllIlIlIlll;
        }
    }
    
    static class RecipeAddPattern implements IRecipe
    {
        private static final /* synthetic */ int[] lllIIIlIIIIIlI;
        private static final /* synthetic */ String[] lllIIIIllllllI;
        
        @Override
        public ItemStack getCraftingResult(final InventoryCrafting llllllllllllIllIIIIIlllIIlIlIllI) {
            ItemStack llllllllllllIllIIIIIlllIIlIlIlIl = null;
            int llllllllllllIllIIIIIlllIIlIlIlII = RecipeAddPattern.lllIIIlIIIIIlI[0];
            "".length();
            if ((0xAE ^ 0xAB) <= 0) {
                return null;
            }
            while (!lIIlllIlIIIlIlII(llllllllllllIllIIIIIlllIIlIlIlII, llllllllllllIllIIIIIlllIIlIlIllI.getSizeInventory())) {
                final ItemStack llllllllllllIllIIIIIlllIIlIlIIll = llllllllllllIllIIIIIlllIIlIlIllI.getStackInSlot(llllllllllllIllIIIIIlllIIlIlIlII);
                if (lIIlllIlIIIlIIIl(llllllllllllIllIIIIIlllIIlIlIIll) && lIIlllIlIIIlIIlI(llllllllllllIllIIIIIlllIIlIlIIll.getItem(), Items.banner)) {
                    llllllllllllIllIIIIIlllIIlIlIlIl = llllllllllllIllIIIIIlllIIlIlIIll.copy();
                    llllllllllllIllIIIIIlllIIlIlIlIl.stackSize = RecipeAddPattern.lllIIIlIIIIIlI[2];
                    "".length();
                    if ((0xF5 ^ 0x8C ^ (0x48 ^ 0x35)) == "   ".length()) {
                        return null;
                    }
                    break;
                }
                else {
                    ++llllllllllllIllIIIIIlllIIlIlIlII;
                }
            }
            final TileEntityBanner.EnumBannerPattern llllllllllllIllIIIIIlllIIlIlIIlI = this.func_179533_c(llllllllllllIllIIIIIlllIIlIlIllI);
            if (lIIlllIlIIIlIIIl(llllllllllllIllIIIIIlllIIlIlIIlI)) {
                int llllllllllllIllIIIIIlllIIlIlIIIl = RecipeAddPattern.lllIIIlIIIIIlI[0];
                int llllllllllllIllIIIIIlllIIlIlIIII = RecipeAddPattern.lllIIIlIIIIIlI[0];
                "".length();
                if (null != null) {
                    return null;
                }
                while (!lIIlllIlIIIlIlII(llllllllllllIllIIIIIlllIIlIlIIII, llllllllllllIllIIIIIlllIIlIlIllI.getSizeInventory())) {
                    final ItemStack llllllllllllIllIIIIIlllIIlIIllll = llllllllllllIllIIIIIlllIIlIlIllI.getStackInSlot(llllllllllllIllIIIIIlllIIlIlIIII);
                    if (lIIlllIlIIIlIIIl(llllllllllllIllIIIIIlllIIlIIllll) && lIIlllIlIIIlIIlI(llllllllllllIllIIIIIlllIIlIIllll.getItem(), Items.dye)) {
                        llllllllllllIllIIIIIlllIIlIlIIIl = llllllllllllIllIIIIIlllIIlIIllll.getMetadata();
                        "".length();
                        if (-" ".length() > 0) {
                            return null;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIllIIIIIlllIIlIlIIII;
                    }
                }
                final NBTTagCompound llllllllllllIllIIIIIlllIIlIIlllI = llllllllllllIllIIIIIlllIIlIlIlIl.getSubCompound(RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[0]], (boolean)(RecipeAddPattern.lllIIIlIIIIIlI[2] != 0));
                NBTTagList llllllllllllIllIIIIIlllIIlIIllIl = null;
                if (lIIlllIlIIIlIIll(llllllllllllIllIIIIIlllIIlIIlllI.hasKey(RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[2]], RecipeAddPattern.lllIIIlIIIIIlI[3]) ? 1 : 0)) {
                    llllllllllllIllIIIIIlllIIlIIllIl = llllllllllllIllIIIIIlllIIlIIlllI.getTagList(RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[4]], RecipeAddPattern.lllIIIlIIIIIlI[5]);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    llllllllllllIllIIIIIlllIIlIIllIl = new NBTTagList();
                    llllllllllllIllIIIIIlllIIlIIlllI.setTag(RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[6]], llllllllllllIllIIIIIlllIIlIIllIl);
                }
                final NBTTagCompound llllllllllllIllIIIIIlllIIlIIllII = new NBTTagCompound();
                llllllllllllIllIIIIIlllIIlIIllII.setString(RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[7]], llllllllllllIllIIIIIlllIIlIlIIlI.getPatternID());
                llllllllllllIllIIIIIlllIIlIIllII.setInteger(RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[8]], llllllllllllIllIIIIIlllIIlIlIIIl);
                llllllllllllIllIIIIIlllIIlIIllIl.appendTag(llllllllllllIllIIIIIlllIIlIIllII);
            }
            return llllllllllllIllIIIIIlllIIlIlIlIl;
        }
        
        private static boolean lIIlllIlIIIllIII(final int llllllllllllIllIIIIIllIlllIllIll, final int llllllllllllIllIIIIIllIlllIllIlI) {
            return llllllllllllIllIIIIIllIlllIllIll == llllllllllllIllIIIIIllIlllIllIlI;
        }
        
        private static String lIIlllIlIIIIlIlI(String llllllllllllIllIIIIIlllIIIIIIIII, final String llllllllllllIllIIIIIllIlllllllll) {
            llllllllllllIllIIIIIlllIIIIIIIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIIlllIIIIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIIIlllIIIIIIIll = new StringBuilder();
            final char[] llllllllllllIllIIIIIlllIIIIIIIlI = llllllllllllIllIIIIIllIlllllllll.toCharArray();
            int llllllllllllIllIIIIIlllIIIIIIIIl = RecipeAddPattern.lllIIIlIIIIIlI[0];
            final Exception llllllllllllIllIIIIIllIllllllIll = (Object)((String)llllllllllllIllIIIIIlllIIIIIIIII).toCharArray();
            final String llllllllllllIllIIIIIllIllllllIlI = (String)llllllllllllIllIIIIIllIllllllIll.length;
            float llllllllllllIllIIIIIllIllllllIIl = RecipeAddPattern.lllIIIlIIIIIlI[0];
            while (lIIlllIlIIIlIlll((int)llllllllllllIllIIIIIllIllllllIIl, (int)llllllllllllIllIIIIIllIllllllIlI)) {
                final char llllllllllllIllIIIIIlllIIIIIIllI = llllllllllllIllIIIIIllIllllllIll[llllllllllllIllIIIIIllIllllllIIl];
                llllllllllllIllIIIIIlllIIIIIIIll.append((char)(llllllllllllIllIIIIIlllIIIIIIllI ^ llllllllllllIllIIIIIlllIIIIIIIlI[llllllllllllIllIIIIIlllIIIIIIIIl % llllllllllllIllIIIIIlllIIIIIIIlI.length]));
                "".length();
                ++llllllllllllIllIIIIIlllIIIIIIIIl;
                ++llllllllllllIllIIIIIllIllllllIIl;
                "".length();
                if ("   ".length() < "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIIIlllIIIIIIIll);
        }
        
        private static boolean lIIlllIlIIIlIIll(final int llllllllllllIllIIIIIllIlllIIIllI) {
            return llllllllllllIllIIIIIllIlllIIIllI != 0;
        }
        
        private static boolean lIIlllIlIIIlIllI(final Object llllllllllllIllIIIIIllIlllIIllll, final Object llllllllllllIllIIIIIllIlllIIlllI) {
            return llllllllllllIllIIIIIllIlllIIllll != llllllllllllIllIIIIIllIlllIIlllI;
        }
        
        @Override
        public ItemStack[] getRemainingItems(final InventoryCrafting llllllllllllIllIIIIIlllIIIlllIII) {
            final ItemStack[] llllllllllllIllIIIIIlllIIIlllIll = new ItemStack[llllllllllllIllIIIIIlllIIIlllIII.getSizeInventory()];
            int llllllllllllIllIIIIIlllIIIlllIlI = RecipeAddPattern.lllIIIlIIIIIlI[0];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIIlllIlIIIlIlII(llllllllllllIllIIIIIlllIIIlllIlI, llllllllllllIllIIIIIlllIIIlllIll.length)) {
                final ItemStack llllllllllllIllIIIIIlllIIIlllIIl = llllllllllllIllIIIIIlllIIIlllIII.getStackInSlot(llllllllllllIllIIIIIlllIIIlllIlI);
                if (lIIlllIlIIIlIIIl(llllllllllllIllIIIIIlllIIIlllIIl) && lIIlllIlIIIlIIll(llllllllllllIllIIIIIlllIIIlllIIl.getItem().hasContainerItem() ? 1 : 0)) {
                    llllllllllllIllIIIIIlllIIIlllIll[llllllllllllIllIIIIIlllIIIlllIlI] = new ItemStack(llllllllllllIllIIIIIlllIIIlllIIl.getItem().getContainerItem());
                }
                ++llllllllllllIllIIIIIlllIIIlllIlI;
            }
            return llllllllllllIllIIIIIlllIIIlllIll;
        }
        
        private TileEntityBanner.EnumBannerPattern func_179533_c(final InventoryCrafting llllllllllllIllIIIIIlllIIIIlllII) {
            final Exception llllllllllllIllIIIIIlllIIIIllIII;
            final double llllllllllllIllIIIIIlllIIIIllIIl = ((TileEntityBanner.EnumBannerPattern[])(Object)(llllllllllllIllIIIIIlllIIIIllIII = (Exception)(Object)TileEntityBanner.EnumBannerPattern.values())).length;
            String llllllllllllIllIIIIIlllIIIIllIlI = (String)RecipeAddPattern.lllIIIlIIIIIlI[0];
            "".length();
            if ((101 + 87 - 168 + 120 ^ 133 + 19 - 64 + 48) <= -" ".length()) {
                return null;
            }
            while (!lIIlllIlIIIlIlII((int)llllllllllllIllIIIIIlllIIIIllIlI, (int)llllllllllllIllIIIIIlllIIIIllIIl)) {
                final TileEntityBanner.EnumBannerPattern llllllllllllIllIIIIIlllIIIlIIlll = llllllllllllIllIIIIIlllIIIIllIII[llllllllllllIllIIIIIlllIIIIllIlI];
                if (lIIlllIlIIIlIIll(llllllllllllIllIIIIIlllIIIlIIlll.hasValidCrafting() ? 1 : 0)) {
                    boolean llllllllllllIllIIIIIlllIIIlIIllI = RecipeAddPattern.lllIIIlIIIIIlI[2] != 0;
                    if (lIIlllIlIIIlIIll(llllllllllllIllIIIIIlllIIIlIIlll.hasCraftingStack() ? 1 : 0)) {
                        boolean llllllllllllIllIIIIIlllIIIlIIlIl = RecipeAddPattern.lllIIIlIIIIIlI[0] != 0;
                        boolean llllllllllllIllIIIIIlllIIIlIIlII = RecipeAddPattern.lllIIIlIIIIIlI[0] != 0;
                        int llllllllllllIllIIIIIlllIIIlIIIll = RecipeAddPattern.lllIIIlIIIIIlI[0];
                        "".length();
                        if ((154 + 158 - 192 + 40 ^ 140 + 84 - 136 + 76) == (("   ".length() ^ (0x99 ^ 0xBA)) & (0x2B ^ 0x1F ^ (0xA3 ^ 0xB7) ^ -" ".length()))) {
                            return null;
                        }
                        while (lIIlllIlIIIlIlll(llllllllllllIllIIIIIlllIIIlIIIll, llllllllllllIllIIIIIlllIIIIlllII.getSizeInventory()) && !lIIlllIlIIIlIlIl(llllllllllllIllIIIIIlllIIIlIIllI ? 1 : 0)) {
                            final ItemStack llllllllllllIllIIIIIlllIIIlIIIlI = llllllllllllIllIIIIIlllIIIIlllII.getStackInSlot(llllllllllllIllIIIIIlllIIIlIIIll);
                            if (lIIlllIlIIIlIIIl(llllllllllllIllIIIIIlllIIIlIIIlI) && lIIlllIlIIIlIllI(llllllllllllIllIIIIIlllIIIlIIIlI.getItem(), Items.banner)) {
                                if (lIIlllIlIIIlIIlI(llllllllllllIllIIIIIlllIIIlIIIlI.getItem(), Items.dye)) {
                                    if (lIIlllIlIIIlIIll(llllllllllllIllIIIIIlllIIIlIIlII ? 1 : 0)) {
                                        llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                                        "".length();
                                        if (((0x44 ^ 0x6B) & ~(0x8A ^ 0xA5)) != 0x0) {
                                            return null;
                                        }
                                        break;
                                    }
                                    else {
                                        llllllllllllIllIIIIIlllIIIlIIlII = (RecipeAddPattern.lllIIIlIIIIIlI[2] != 0);
                                        "".length();
                                        if (-" ".length() < -" ".length()) {
                                            return null;
                                        }
                                    }
                                }
                                else if (!lIIlllIlIIIlIlIl(llllllllllllIllIIIIIlllIIIlIIlIl ? 1 : 0) || lIIlllIlIIIlIlIl(llllllllllllIllIIIIIlllIIIlIIIlI.isItemEqual(llllllllllllIllIIIIIlllIIIlIIlll.getCraftingStack()) ? 1 : 0)) {
                                    llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                                    "".length();
                                    if (null != null) {
                                        return null;
                                    }
                                    break;
                                }
                                else {
                                    llllllllllllIllIIIIIlllIIIlIIlIl = (RecipeAddPattern.lllIIIlIIIIIlI[2] != 0);
                                }
                            }
                            ++llllllllllllIllIIIIIlllIIIlIIIll;
                        }
                        if (lIIlllIlIIIlIlIl(llllllllllllIllIIIIIlllIIIlIIlIl ? 1 : 0)) {
                            llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                            "".length();
                            if (-" ".length() >= "  ".length()) {
                                return null;
                            }
                        }
                    }
                    else if (lIIlllIlIIIllIII(llllllllllllIllIIIIIlllIIIIlllII.getSizeInventory(), llllllllllllIllIIIIIlllIIIlIIlll.getCraftingLayers().length * llllllllllllIllIIIIIlllIIIlIIlll.getCraftingLayers()[RecipeAddPattern.lllIIIlIIIIIlI[0]].length())) {
                        int llllllllllllIllIIIIIlllIIIlIIIIl = RecipeAddPattern.lllIIIlIIIIIlI[9];
                        int llllllllllllIllIIIIIlllIIIlIIIII = RecipeAddPattern.lllIIIlIIIIIlI[0];
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return null;
                        }
                        while (lIIlllIlIIIlIlll(llllllllllllIllIIIIIlllIIIlIIIII, llllllllllllIllIIIIIlllIIIIlllII.getSizeInventory())) {
                            if (lIIlllIlIIIlIlIl(llllllllllllIllIIIIIlllIIIlIIllI ? 1 : 0)) {
                                "".length();
                                if (-" ".length() >= 0) {
                                    return null;
                                }
                                break;
                            }
                            else {
                                final int llllllllllllIllIIIIIlllIIIIlllll = llllllllllllIllIIIIIlllIIIlIIIII / RecipeAddPattern.lllIIIlIIIIIlI[6];
                                final int llllllllllllIllIIIIIlllIIIIllllI = llllllllllllIllIIIIIlllIIIlIIIII % RecipeAddPattern.lllIIIlIIIIIlI[6];
                                final ItemStack llllllllllllIllIIIIIlllIIIIlllIl = llllllllllllIllIIIIIlllIIIIlllII.getStackInSlot(llllllllllllIllIIIIIlllIIIlIIIII);
                                if (lIIlllIlIIIlIIIl(llllllllllllIllIIIIIlllIIIIlllIl) && lIIlllIlIIIlIllI(llllllllllllIllIIIIIlllIIIIlllIl.getItem(), Items.banner)) {
                                    if (lIIlllIlIIIlIllI(llllllllllllIllIIIIIlllIIIIlllIl.getItem(), Items.dye)) {
                                        llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                                        "".length();
                                        if (-" ".length() >= "  ".length()) {
                                            return null;
                                        }
                                        break;
                                    }
                                    else if (lIIlllIlIIIllIIl(llllllllllllIllIIIIIlllIIIlIIIIl, RecipeAddPattern.lllIIIlIIIIIlI[9]) && lIIlllIlIIIllIIl(llllllllllllIllIIIIIlllIIIlIIIIl, llllllllllllIllIIIIIlllIIIIlllIl.getMetadata())) {
                                        llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                                        "".length();
                                        if ("   ".length() >= (0x12 ^ 0x16)) {
                                            return null;
                                        }
                                        break;
                                    }
                                    else if (lIIlllIlIIIllIII(llllllllllllIllIIIIIlllIIIlIIlll.getCraftingLayers()[llllllllllllIllIIIIIlllIIIIlllll].charAt(llllllllllllIllIIIIIlllIIIIllllI), RecipeAddPattern.lllIIIlIIIIIlI[10])) {
                                        llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                                        "".length();
                                        if ("  ".length() <= 0) {
                                            return null;
                                        }
                                        break;
                                    }
                                    else {
                                        llllllllllllIllIIIIIlllIIIlIIIIl = llllllllllllIllIIIIIlllIIIIlllIl.getMetadata();
                                        "".length();
                                        if (-(74 + 49 - 75 + 103 ^ 85 + 140 - 143 + 64) >= 0) {
                                            return null;
                                        }
                                    }
                                }
                                else if (lIIlllIlIIIllIIl(llllllllllllIllIIIIIlllIIIlIIlll.getCraftingLayers()[llllllllllllIllIIIIIlllIIIIlllll].charAt(llllllllllllIllIIIIIlllIIIIllllI), RecipeAddPattern.lllIIIlIIIIIlI[10])) {
                                    llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                                    "".length();
                                    if (((150 + 108 - 130 + 26 ^ 113 + 39 - 40 + 44) & (0xCD ^ 0xAC ^ (0x2 ^ 0x65) ^ -" ".length())) != 0x0) {
                                        return null;
                                    }
                                    break;
                                }
                                ++llllllllllllIllIIIIIlllIIIlIIIII;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIIIIIlllIIIlIIllI = (RecipeAddPattern.lllIIIlIIIIIlI[0] != 0);
                    }
                    if (lIIlllIlIIIlIIll(llllllllllllIllIIIIIlllIIIlIIllI ? 1 : 0)) {
                        return llllllllllllIllIIIIIlllIIIlIIlll;
                    }
                }
                ++llllllllllllIllIIIIIlllIIIIllIlI;
            }
            return null;
        }
        
        @Override
        public ItemStack getRecipeOutput() {
            return null;
        }
        
        @Override
        public int getRecipeSize() {
            return RecipeAddPattern.lllIIIlIIIIIlI[5];
        }
        
        private static String lIIlllIlIIIIllIl(final String llllllllllllIllIIIIIllIllllIIIll, final String llllllllllllIllIIIIIllIllllIIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIIIIllIllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllIllllIIIlI.getBytes(StandardCharsets.UTF_8)), RecipeAddPattern.lllIIIlIIIIIlI[11]), "DES");
                final Cipher llllllllllllIllIIIIIllIllllIIlIl = Cipher.getInstance("DES");
                llllllllllllIllIIIIIllIllllIIlIl.init(RecipeAddPattern.lllIIIlIIIIIlI[4], llllllllllllIllIIIIIllIllllIIllI);
                return new String(llllllllllllIllIIIIIllIllllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIIllIllllIIlII) {
                llllllllllllIllIIIIIllIllllIIlII.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIlllIlIIIlIIII();
            lIIlllIlIIIIlllI();
        }
        
        private static boolean lIIlllIlIIIlIlll(final int llllllllllllIllIIIIIllIlllIlIIll, final int llllllllllllIllIIIIIllIlllIlIIlI) {
            return llllllllllllIllIIIIIllIlllIlIIll < llllllllllllIllIIIIIllIlllIlIIlI;
        }
        
        private static boolean lIIlllIlIIIlIIlI(final Object llllllllllllIllIIIIIllIlllIIlIIl, final Object llllllllllllIllIIIIIllIlllIIlIII) {
            return llllllllllllIllIIIIIllIlllIIlIIl == llllllllllllIllIIIIIllIlllIIlIII;
        }
        
        private static boolean lIIlllIlIIIllIIl(final int llllllllllllIllIIIIIllIlllIIIIIl, final int llllllllllllIllIIIIIllIlllIIIIII) {
            return llllllllllllIllIIIIIllIlllIIIIIl != llllllllllllIllIIIIIllIlllIIIIII;
        }
        
        private RecipeAddPattern() {
        }
        
        @Override
        public boolean matches(final InventoryCrafting llllllllllllIllIIIIIlllIIllIlIIl, final World llllllllllllIllIIIIIlllIIllIlIII) {
            boolean llllllllllllIllIIIIIlllIIllIIlll = RecipeAddPattern.lllIIIlIIIIIlI[0] != 0;
            int llllllllllllIllIIIIIlllIIllIIllI = RecipeAddPattern.lllIIIlIIIIIlI[0];
            "".length();
            if (-(97 + 5 - 8 + 49 ^ 20 + 112 - 22 + 29) > 0) {
                return ((0x3A ^ 0xE ^ (0xF ^ 0x58)) & (0x4F ^ 0x5C ^ (0x2C ^ 0x5C) ^ -" ".length())) != 0x0;
            }
            while (!lIIlllIlIIIlIlII(llllllllllllIllIIIIIlllIIllIIllI, llllllllllllIllIIIIIlllIIllIlIIl.getSizeInventory())) {
                final ItemStack llllllllllllIllIIIIIlllIIllIIlIl = llllllllllllIllIIIIIlllIIllIlIIl.getStackInSlot(llllllllllllIllIIIIIlllIIllIIllI);
                if (lIIlllIlIIIlIIIl(llllllllllllIllIIIIIlllIIllIIlIl) && lIIlllIlIIIlIIlI(llllllllllllIllIIIIIlllIIllIIlIl.getItem(), Items.banner)) {
                    if (lIIlllIlIIIlIIll(llllllllllllIllIIIIIlllIIllIIlll ? 1 : 0)) {
                        return RecipeAddPattern.lllIIIlIIIIIlI[0] != 0;
                    }
                    if (lIIlllIlIIIlIlII(TileEntityBanner.getPatterns(llllllllllllIllIIIIIlllIIllIIlIl), RecipeAddPattern.lllIIIlIIIIIlI[1])) {
                        return RecipeAddPattern.lllIIIlIIIIIlI[0] != 0;
                    }
                    llllllllllllIllIIIIIlllIIllIIlll = (RecipeAddPattern.lllIIIlIIIIIlI[2] != 0);
                }
                ++llllllllllllIllIIIIIlllIIllIIllI;
            }
            if (lIIlllIlIIIlIlIl(llllllllllllIllIIIIIlllIIllIIlll ? 1 : 0)) {
                return RecipeAddPattern.lllIIIlIIIIIlI[0] != 0;
            }
            if (lIIlllIlIIIlIIIl(this.func_179533_c(llllllllllllIllIIIIIlllIIllIlIIl))) {
                return RecipeAddPattern.lllIIIlIIIIIlI[2] != 0;
            }
            return RecipeAddPattern.lllIIIlIIIIIlI[0] != 0;
        }
        
        private static boolean lIIlllIlIIIlIlIl(final int llllllllllllIllIIIIIllIlllIIIlII) {
            return llllllllllllIllIIIIIllIlllIIIlII == 0;
        }
        
        private static boolean lIIlllIlIIIlIIIl(final Object llllllllllllIllIIIIIllIlllIIllII) {
            return llllllllllllIllIIIIIllIlllIIllII != null;
        }
        
        private static boolean lIIlllIlIIIlIlII(final int llllllllllllIllIIIIIllIlllIlIlll, final int llllllllllllIllIIIIIllIlllIlIllI) {
            return llllllllllllIllIIIIIllIlllIlIlll >= llllllllllllIllIIIIIllIlllIlIllI;
        }
        
        private static void lIIlllIlIIIIlllI() {
            (lllIIIIllllllI = new String[RecipeAddPattern.lllIIIlIIIIIlI[1]])[RecipeAddPattern.lllIIIlIIIIIlI[0]] = lIIlllIlIIIIlIlI("LgUADD0pBxsGIhU9Dgg=", "liooV");
            RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[2]] = lIIlllIlIIIIllII("JJOONtdDFSowCMKPEZztBQ==", "pPbwB");
            RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[4]] = lIIlllIlIIIIlIlI("HzslNy49NCI=", "OZQCK");
            RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[6]] = lIIlllIlIIIIllII("W7G6ZoJqN3yyT+AAuHsJEA==", "zUAiN");
            RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[7]] = lIIlllIlIIIIllIl("TJuV91TIHOs=", "HqIft");
            RecipeAddPattern.lllIIIIllllllI[RecipeAddPattern.lllIIIlIIIIIlI[8]] = lIIlllIlIIIIllII("PKLst2ZwKBA=", "SsrKy");
        }
        
        private static void lIIlllIlIIIlIIII() {
            (lllIIIlIIIIIlI = new int[12])[0] = ((0xF ^ 0x2) & ~(0x7D ^ 0x70));
            RecipeAddPattern.lllIIIlIIIIIlI[1] = (0x6E ^ 0x68);
            RecipeAddPattern.lllIIIlIIIIIlI[2] = " ".length();
            RecipeAddPattern.lllIIIlIIIIIlI[3] = (0x39 ^ 0x30);
            RecipeAddPattern.lllIIIlIIIIIlI[4] = "  ".length();
            RecipeAddPattern.lllIIIlIIIIIlI[5] = (0x72 ^ 0x78);
            RecipeAddPattern.lllIIIlIIIIIlI[6] = "   ".length();
            RecipeAddPattern.lllIIIlIIIIIlI[7] = (0x59 ^ 0x5D);
            RecipeAddPattern.lllIIIlIIIIIlI[8] = (0x64 ^ 0x7C ^ (0xA5 ^ 0xB8));
            RecipeAddPattern.lllIIIlIIIIIlI[9] = -" ".length();
            RecipeAddPattern.lllIIIlIIIIIlI[10] = (0x65 ^ 0x2A ^ (0x31 ^ 0x5E));
            RecipeAddPattern.lllIIIlIIIIIlI[11] = (0x22 ^ 0x2A);
        }
        
        private static String lIIlllIlIIIIllII(final String llllllllllllIllIIIIIllIlllllIIII, final String llllllllllllIllIIIIIllIllllIllll) {
            try {
                final SecretKeySpec llllllllllllIllIIIIIllIlllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIIllIlllllIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIIllIlllllIIlI.init(RecipeAddPattern.lllIIIlIIIIIlI[4], llllllllllllIllIIIIIllIlllllIIll);
                return new String(llllllllllllIllIIIIIllIlllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIIllIlllllIIIl) {
                llllllllllllIllIIIIIllIlllllIIIl.printStackTrace();
                return null;
            }
        }
    }
}
