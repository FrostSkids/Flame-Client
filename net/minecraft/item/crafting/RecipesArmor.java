// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.Item;

public class RecipesArmor
{
    private /* synthetic */ Item[][] recipeItems;
    private static final /* synthetic */ String[] lIllIIlIlIllII;
    private /* synthetic */ String[][] recipePatterns;
    private static final /* synthetic */ int[] lIllIIlIlIlllI;
    
    private static String lllllIlIIIIIlll(final String lllllllllllllIIIIIIlllIlIllllIll, final String lllllllllllllIIIIIIlllIlIllllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlllIlIllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlllIlIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIlllIlIlllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIlllIlIlllllIl.init(RecipesArmor.lIllIIlIlIlllI[2], lllllllllllllIIIIIIlllIlIllllllI);
            return new String(lllllllllllllIIIIIIlllIlIlllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlllIlIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlllIlIlllllII) {
            lllllllllllllIIIIIIlllIlIlllllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lllllIlIIIlIllI();
        lllllIlIIIIlIIl();
    }
    
    private static void lllllIlIIIIlIIl() {
        (lIllIIlIlIllII = new String[RecipesArmor.lIllIIlIlIlllI[11]])[RecipesArmor.lIllIIlIlIlllI[1]] = lllllIlIIIIIllI("hFN6TH5kC80=", "OetuM");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[3]] = lllllIlIIIIIllI("SHhwxLvNbO8=", "uxWtV");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[2]] = lllllIlIIIIIlll("apJWrjJopGY=", "bhWUl");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[4]] = lllllIlIIIIIllI("4gDhpWuusJs=", "OkSFF");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[0]] = lllllIlIIIIlIII("Mg8a", "jWBUf");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[5]] = lllllIlIIIIIlll("fp1aIaP1zoU=", "GIYBi");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[6]] = lllllIlIIIIlIII("HVg2", "ExnEX");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[7]] = lllllIlIIIIIlll("Uu9WPZSAsAY=", "LlCUg");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[8]] = lllllIlIIIIlIII("CnAb", "RPCDK");
        RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[9]] = lllllIlIIIIIlll("qYNmABAwXds=", "LPTtJ");
    }
    
    private static String lllllIlIIIIIllI(final String lllllllllllllIIIIIIlllIlIlIlIlII, final String lllllllllllllIIIIIIlllIlIlIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlllIlIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlllIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), RecipesArmor.lIllIIlIlIlllI[8]), "DES");
            final Cipher lllllllllllllIIIIIIlllIlIlIllIII = Cipher.getInstance("DES");
            lllllllllllllIIIIIIlllIlIlIllIII.init(RecipesArmor.lIllIIlIlIlllI[2], lllllllllllllIIIIIIlllIlIlIllIIl);
            return new String(lllllllllllllIIIIIIlllIlIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlllIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlllIlIlIlIlll) {
            lllllllllllllIIIIIIlllIlIlIlIlll.printStackTrace();
            return null;
        }
    }
    
    public void addRecipes(final CraftingManager lllllllllllllIIIIIIlllIllIIIllIl) {
        int lllllllllllllIIIIIIlllIllIIIllII = RecipesArmor.lIllIIlIlIlllI[1];
        "".length();
        if (-" ".length() >= "  ".length()) {
            return;
        }
        while (!lllllIlIIIlIlll(lllllllllllllIIIIIIlllIllIIIllII, this.recipeItems[RecipesArmor.lIllIIlIlIlllI[1]].length)) {
            final Item lllllllllllllIIIIIIlllIllIIIlIll = this.recipeItems[RecipesArmor.lIllIIlIlIlllI[1]][lllllllllllllIIIIIIlllIllIIIllII];
            int lllllllllllllIIIIIIlllIllIIIlIlI = RecipesArmor.lIllIIlIlIlllI[1];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
            while (!lllllIlIIIlIlll(lllllllllllllIIIIIIlllIllIIIlIlI, this.recipeItems.length - RecipesArmor.lIllIIlIlIlllI[3])) {
                final Item lllllllllllllIIIIIIlllIllIIIlIIl = this.recipeItems[lllllllllllllIIIIIIlllIllIIIlIlI + RecipesArmor.lIllIIlIlIlllI[3]][lllllllllllllIIIIIIlllIllIIIllII];
                final ItemStack llllllllllllIlllllllIIlIIIlIllII = new ItemStack(lllllllllllllIIIIIIlllIllIIIlIIl);
                final Object[] llllllllllllIlllllllIIlIIIllllIl = new Object[RecipesArmor.lIllIIlIlIlllI[4]];
                llllllllllllIlllllllIIlIIIllllIl[RecipesArmor.lIllIIlIlIlllI[1]] = this.recipePatterns[lllllllllllllIIIIIIlllIllIIIlIlI];
                llllllllllllIlllllllIIlIIIllllIl[RecipesArmor.lIllIIlIlIlllI[3]] = (char)RecipesArmor.lIllIIlIlIlllI[10];
                llllllllllllIlllllllIIlIIIllllIl[RecipesArmor.lIllIIlIlIlllI[2]] = lllllllllllllIIIIIIlllIllIIIlIll;
                lllllllllllllIIIIIIlllIllIIIllIl.addRecipe(llllllllllllIlllllllIIlIIIlIllII, llllllllllllIlllllllIIlIIIllllIl);
                "".length();
                ++lllllllllllllIIIIIIlllIllIIIlIlI;
            }
            ++lllllllllllllIIIIIIlllIllIIIllII;
        }
    }
    
    private static boolean lllllIlIIIlIlll(final int lllllllllllllIIIIIIlllIlIlIIlllI, final int lllllllllllllIIIIIIlllIlIlIIllIl) {
        return lllllllllllllIIIIIIlllIlIlIIlllI >= lllllllllllllIIIIIIlllIlIlIIllIl;
    }
    
    private static void lllllIlIIIlIllI() {
        (lIllIIlIlIlllI = new int[12])[0] = (0x1F ^ 0x37 ^ (0x7 ^ 0x2B));
        RecipesArmor.lIllIIlIlIlllI[1] = (("  ".length() ^ (0x14 ^ 0x5E)) & (0xE ^ 0x38 ^ (0x19 ^ 0x67) ^ -" ".length()));
        RecipesArmor.lIllIIlIlIlllI[2] = "  ".length();
        RecipesArmor.lIllIIlIlIlllI[3] = " ".length();
        RecipesArmor.lIllIIlIlIlllI[4] = "   ".length();
        RecipesArmor.lIllIIlIlIlllI[5] = (0x38 ^ 0x3D);
        RecipesArmor.lIllIIlIlIlllI[6] = (0xFE ^ 0xB7 ^ (0xC1 ^ 0x8E));
        RecipesArmor.lIllIIlIlIlllI[7] = (0x21 ^ 0x26);
        RecipesArmor.lIllIIlIlIlllI[8] = (0x12 ^ 0x59 ^ (0x5A ^ 0x19));
        RecipesArmor.lIllIIlIlIlllI[9] = (0x6C ^ 0x65);
        RecipesArmor.lIllIIlIlIlllI[10] = (0xEC ^ 0xB4);
        RecipesArmor.lIllIIlIlIlllI[11] = (31 + 118 - 81 + 59 ^ (0xDC ^ 0xA9));
    }
    
    private static boolean lllllIlIIIllIII(final int lllllllllllllIIIIIIlllIlIlIIlIlI, final int lllllllllllllIIIIIIlllIlIlIIlIIl) {
        return lllllllllllllIIIIIIlllIlIlIIlIlI < lllllllllllllIIIIIIlllIlIlIIlIIl;
    }
    
    private static String lllllIlIIIIlIII(String lllllllllllllIIIIIIlllIlIllIIllI, final String lllllllllllllIIIIIIlllIlIllIlIlI) {
        lllllllllllllIIIIIIlllIlIllIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIlllIlIllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIlllIlIllIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIlllIlIllIlIII = lllllllllllllIIIIIIlllIlIllIlIlI.toCharArray();
        int lllllllllllllIIIIIIlllIlIllIIlll = RecipesArmor.lIllIIlIlIlllI[1];
        final String lllllllllllllIIIIIIlllIlIllIIIIl = (Object)lllllllllllllIIIIIIlllIlIllIIllI.toCharArray();
        final long lllllllllllllIIIIIIlllIlIllIIIII = lllllllllllllIIIIIIlllIlIllIIIIl.length;
        float lllllllllllllIIIIIIlllIlIlIlllll = RecipesArmor.lIllIIlIlIlllI[1];
        while (lllllIlIIIllIII((int)lllllllllllllIIIIIIlllIlIlIlllll, (int)lllllllllllllIIIIIIlllIlIllIIIII)) {
            final char lllllllllllllIIIIIIlllIlIllIllII = lllllllllllllIIIIIIlllIlIllIIIIl[lllllllllllllIIIIIIlllIlIlIlllll];
            lllllllllllllIIIIIIlllIlIllIlIIl.append((char)(lllllllllllllIIIIIIlllIlIllIllII ^ lllllllllllllIIIIIIlllIlIllIlIII[lllllllllllllIIIIIIlllIlIllIIlll % lllllllllllllIIIIIIlllIlIllIlIII.length]));
            "".length();
            ++lllllllllllllIIIIIIlllIlIllIIlll;
            ++lllllllllllllIIIIIIlllIlIlIlllll;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIlllIlIllIlIIl);
    }
    
    public RecipesArmor() {
        final String[][] recipePatterns = new String[RecipesArmor.lIllIIlIlIlllI[0]][];
        final int n = RecipesArmor.lIllIIlIlIlllI[1];
        final String[] array = new String[RecipesArmor.lIllIIlIlIlllI[2]];
        array[RecipesArmor.lIllIIlIlIlllI[1]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[1]];
        array[RecipesArmor.lIllIIlIlIlllI[3]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[3]];
        recipePatterns[n] = array;
        final int n2 = RecipesArmor.lIllIIlIlIlllI[3];
        final String[] array2 = new String[RecipesArmor.lIllIIlIlIlllI[4]];
        array2[RecipesArmor.lIllIIlIlIlllI[1]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[2]];
        array2[RecipesArmor.lIllIIlIlIlllI[3]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[4]];
        array2[RecipesArmor.lIllIIlIlIlllI[2]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[0]];
        recipePatterns[n2] = array2;
        final int n3 = RecipesArmor.lIllIIlIlIlllI[2];
        final String[] array3 = new String[RecipesArmor.lIllIIlIlIlllI[4]];
        array3[RecipesArmor.lIllIIlIlIlllI[1]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[5]];
        array3[RecipesArmor.lIllIIlIlIlllI[3]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[6]];
        array3[RecipesArmor.lIllIIlIlIlllI[2]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[7]];
        recipePatterns[n3] = array3;
        final int n4 = RecipesArmor.lIllIIlIlIlllI[4];
        final String[] array4 = new String[RecipesArmor.lIllIIlIlIlllI[2]];
        array4[RecipesArmor.lIllIIlIlIlllI[1]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[8]];
        array4[RecipesArmor.lIllIIlIlIlllI[3]] = RecipesArmor.lIllIIlIlIllII[RecipesArmor.lIllIIlIlIlllI[9]];
        recipePatterns[n4] = array4;
        this.recipePatterns = recipePatterns;
        final Item[][] recipeItems = new Item[RecipesArmor.lIllIIlIlIlllI[5]][];
        final int n5 = RecipesArmor.lIllIIlIlIlllI[1];
        final Item[] array5 = new Item[RecipesArmor.lIllIIlIlIlllI[0]];
        array5[RecipesArmor.lIllIIlIlIlllI[1]] = Items.leather;
        array5[RecipesArmor.lIllIIlIlIlllI[3]] = Items.iron_ingot;
        array5[RecipesArmor.lIllIIlIlIlllI[2]] = Items.diamond;
        array5[RecipesArmor.lIllIIlIlIlllI[4]] = Items.gold_ingot;
        recipeItems[n5] = array5;
        final int n6 = RecipesArmor.lIllIIlIlIlllI[3];
        final Item[] array6 = new Item[RecipesArmor.lIllIIlIlIlllI[0]];
        array6[RecipesArmor.lIllIIlIlIlllI[1]] = Items.leather_helmet;
        array6[RecipesArmor.lIllIIlIlIlllI[3]] = Items.iron_helmet;
        array6[RecipesArmor.lIllIIlIlIlllI[2]] = Items.diamond_helmet;
        array6[RecipesArmor.lIllIIlIlIlllI[4]] = Items.golden_helmet;
        recipeItems[n6] = array6;
        final int n7 = RecipesArmor.lIllIIlIlIlllI[2];
        final Item[] array7 = new Item[RecipesArmor.lIllIIlIlIlllI[0]];
        array7[RecipesArmor.lIllIIlIlIlllI[1]] = Items.leather_chestplate;
        array7[RecipesArmor.lIllIIlIlIlllI[3]] = Items.iron_chestplate;
        array7[RecipesArmor.lIllIIlIlIlllI[2]] = Items.diamond_chestplate;
        array7[RecipesArmor.lIllIIlIlIlllI[4]] = Items.golden_chestplate;
        recipeItems[n7] = array7;
        final int n8 = RecipesArmor.lIllIIlIlIlllI[4];
        final Item[] array8 = new Item[RecipesArmor.lIllIIlIlIlllI[0]];
        array8[RecipesArmor.lIllIIlIlIlllI[1]] = Items.leather_leggings;
        array8[RecipesArmor.lIllIIlIlIlllI[3]] = Items.iron_leggings;
        array8[RecipesArmor.lIllIIlIlIlllI[2]] = Items.diamond_leggings;
        array8[RecipesArmor.lIllIIlIlIlllI[4]] = Items.golden_leggings;
        recipeItems[n8] = array8;
        final int n9 = RecipesArmor.lIllIIlIlIlllI[0];
        final Item[] array9 = new Item[RecipesArmor.lIllIIlIlIlllI[0]];
        array9[RecipesArmor.lIllIIlIlIlllI[1]] = Items.leather_boots;
        array9[RecipesArmor.lIllIIlIlIlllI[3]] = Items.iron_boots;
        array9[RecipesArmor.lIllIIlIlIlllI[2]] = Items.diamond_boots;
        array9[RecipesArmor.lIllIIlIlIlllI[4]] = Items.golden_boots;
        recipeItems[n9] = array9;
        this.recipeItems = recipeItems;
    }
}
