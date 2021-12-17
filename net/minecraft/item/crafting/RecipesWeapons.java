// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class RecipesWeapons
{
    private static final /* synthetic */ int[] lIIIIllllIIIll;
    private /* synthetic */ String[][] recipePatterns;
    private /* synthetic */ Object[][] recipeItems;
    private static final /* synthetic */ String[] lIIIIllllIIIlI;
    
    private static void lIllllIlIIIlIIl() {
        (lIIIIllllIIIll = new int[13])[0] = " ".length();
        RecipesWeapons.lIIIIllllIIIll[1] = ((0x70 ^ 0x77 ^ (0x9C ^ 0xB0)) & (0x44 ^ 0x5F ^ (0x5B ^ 0x6B) ^ -" ".length()) & (((0x88 ^ 0x9A ^ (0xA9 ^ 0x80)) & (94 + 124 - 100 + 9 ^ (0xD3 ^ 0x97) ^ -" ".length())) ^ -" ".length()));
        RecipesWeapons.lIIIIllllIIIll[2] = "   ".length();
        RecipesWeapons.lIIIIllllIIIll[3] = "  ".length();
        RecipesWeapons.lIIIIllllIIIll[4] = (0 + 33 - 16 + 150 ^ 154 + 67 - 214 + 155);
        RecipesWeapons.lIIIIllllIIIll[5] = (0x64 ^ 0x60);
        RecipesWeapons.lIIIIllllIIIll[6] = (0x3D ^ 0x1E);
        RecipesWeapons.lIIIIllllIIIll[7] = (0x2D ^ 0x75);
        RecipesWeapons.lIIIIllllIIIll[8] = (0x75 ^ 0x72);
        RecipesWeapons.lIIIIllllIIIll[9] = (0x23 ^ 0x65 ^ (0xE3 ^ 0xA3));
        RecipesWeapons.lIIIIllllIIIll[10] = (0x75 ^ 0x26 ^ (0x56 ^ 0xC));
        RecipesWeapons.lIIIIllllIIIll[11] = (170 + 67 - 221 + 186 ^ 32 + 82 - 95 + 175);
        RecipesWeapons.lIIIIllllIIIll[12] = (0x22 ^ 0x7B);
    }
    
    private static String lIllllIlIIIIllI(String lllllllllllllIlIIIllllIIIIlllIll, final String lllllllllllllIlIIIllllIIIIllllll) {
        lllllllllllllIlIIIllllIIIIlllIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIllllIIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIllllIIIIlllllI = new StringBuilder();
        final char[] lllllllllllllIlIIIllllIIIIllllIl = lllllllllllllIlIIIllllIIIIllllll.toCharArray();
        int lllllllllllllIlIIIllllIIIIllllII = RecipesWeapons.lIIIIllllIIIll[1];
        final byte lllllllllllllIlIIIllllIIIIllIllI = (Object)lllllllllllllIlIIIllllIIIIlllIll.toCharArray();
        final short lllllllllllllIlIIIllllIIIIllIlIl = (short)lllllllllllllIlIIIllllIIIIllIllI.length;
        boolean lllllllllllllIlIIIllllIIIIllIlII = RecipesWeapons.lIIIIllllIIIll[1] != 0;
        while (lIllllIlIIIlIll(lllllllllllllIlIIIllllIIIIllIlII ? 1 : 0, lllllllllllllIlIIIllllIIIIllIlIl)) {
            final char lllllllllllllIlIIIllllIIIlIIIIIl = lllllllllllllIlIIIllllIIIIllIllI[lllllllllllllIlIIIllllIIIIllIlII];
            lllllllllllllIlIIIllllIIIIlllllI.append((char)(lllllllllllllIlIIIllllIIIlIIIIIl ^ lllllllllllllIlIIIllllIIIIllllIl[lllllllllllllIlIIIllllIIIIllllII % lllllllllllllIlIIIllllIIIIllllIl.length]));
            "".length();
            ++lllllllllllllIlIIIllllIIIIllllII;
            ++lllllllllllllIlIIIllllIIIIllIlII;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIllllIIIIlllllI);
    }
    
    private static String lIllllIlIIIIlII(final String lllllllllllllIlIIIllllIIIIlIlIll, final String lllllllllllllIlIIIllllIIIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllllIIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), RecipesWeapons.lIIIIllllIIIll[11]), "DES");
            final Cipher lllllllllllllIlIIIllllIIIIlIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIllllIIIIlIllIl.init(RecipesWeapons.lIIIIllllIIIll[3], lllllllllllllIlIIIllllIIIIlIlllI);
            return new String(lllllllllllllIlIIIllllIIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllllIIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllllIIIIlIllII) {
            lllllllllllllIlIIIllllIIIIlIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllIlIIIlIlI(final int lllllllllllllIlIIIllllIIIIIlIllI, final int lllllllllllllIlIIIllllIIIIIlIlIl) {
        return lllllllllllllIlIIIllllIIIIIlIllI >= lllllllllllllIlIIIllllIIIIIlIlIl;
    }
    
    private static boolean lIllllIlIIIlIll(final int lllllllllllllIlIIIllllIIIIIlIIlI, final int lllllllllllllIlIIIllllIIIIIlIIIl) {
        return lllllllllllllIlIIIllllIIIIIlIIlI < lllllllllllllIlIIIllllIIIIIlIIIl;
    }
    
    private static void lIllllIlIIIIlll() {
        (lIIIIllllIIIlI = new String[RecipesWeapons.lIIIIllllIIIll[10]])[RecipesWeapons.lIIIIllllIIIll[1]] = lIllllIlIIIIlII("djd6962Fa60=", "hespN");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[0]] = lIllllIlIIIIlIl("OaPbFmraHU4=", "MSvhY");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[3]] = lIllllIlIIIIlII("jppsUQzsdwU=", "GOQYK");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[2]] = lIllllIlIIIIllI("RlYs", "futrm");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[5]] = lIllllIlIIIIllI("aHoB", "KZYoZ");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[4]] = lIllllIlIIIIllI("UVsa", "qxBXA");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[9]] = lIllllIlIIIIlII("Wfc/eaLtjZ8=", "YOJnr");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[8]] = lIllllIlIIIIlII("Qkaa377RTBI=", "ujyKT");
        RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[11]] = lIllllIlIIIIllI("AQ==", "XvbAC");
    }
    
    public RecipesWeapons() {
        final String[][] recipePatterns = new String[RecipesWeapons.lIIIIllllIIIll[0]][];
        final int n = RecipesWeapons.lIIIIllllIIIll[1];
        final String[] array = new String[RecipesWeapons.lIIIIllllIIIll[2]];
        array[RecipesWeapons.lIIIIllllIIIll[1]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[1]];
        array[RecipesWeapons.lIIIIllllIIIll[0]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[0]];
        array[RecipesWeapons.lIIIIllllIIIll[3]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[3]];
        recipePatterns[n] = array;
        this.recipePatterns = recipePatterns;
        final Object[][] recipeItems = new Object[RecipesWeapons.lIIIIllllIIIll[3]][];
        final int n2 = RecipesWeapons.lIIIIllllIIIll[1];
        final Object[] array2 = new Object[RecipesWeapons.lIIIIllllIIIll[4]];
        array2[RecipesWeapons.lIIIIllllIIIll[1]] = Blocks.planks;
        array2[RecipesWeapons.lIIIIllllIIIll[0]] = Blocks.cobblestone;
        array2[RecipesWeapons.lIIIIllllIIIll[3]] = Items.iron_ingot;
        array2[RecipesWeapons.lIIIIllllIIIll[2]] = Items.diamond;
        array2[RecipesWeapons.lIIIIllllIIIll[5]] = Items.gold_ingot;
        recipeItems[n2] = array2;
        final int n3 = RecipesWeapons.lIIIIllllIIIll[0];
        final Object[] array3 = new Object[RecipesWeapons.lIIIIllllIIIll[4]];
        array3[RecipesWeapons.lIIIIllllIIIll[1]] = Items.wooden_sword;
        array3[RecipesWeapons.lIIIIllllIIIll[0]] = Items.stone_sword;
        array3[RecipesWeapons.lIIIIllllIIIll[3]] = Items.iron_sword;
        array3[RecipesWeapons.lIIIIllllIIIll[2]] = Items.diamond_sword;
        array3[RecipesWeapons.lIIIIllllIIIll[5]] = Items.golden_sword;
        recipeItems[n3] = array3;
        this.recipeItems = recipeItems;
    }
    
    private static String lIllllIlIIIIlIl(final String lllllllllllllIlIIIllllIIIIIllllI, final String lllllllllllllIlIIIllllIIIIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllllIIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllllIIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIllllIIIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIllllIIIIlIIIII.init(RecipesWeapons.lIIIIllllIIIll[3], lllllllllllllIlIIIllllIIIIlIIIIl);
            return new String(lllllllllllllIlIIIllllIIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllllIIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllllIIIIIlllll) {
            lllllllllllllIlIIIllllIIIIIlllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllllIlIIIlIIl();
        lIllllIlIIIIlll();
    }
    
    public void addRecipes(final CraftingManager lllllllllllllIlIIIllllIIIlIIllll) {
        int lllllllllllllIlIIIllllIIIlIlIlII = RecipesWeapons.lIIIIllllIIIll[1];
        "".length();
        if ((0xBD ^ 0x8B ^ (0x51 ^ 0x63)) <= 0) {
            return;
        }
        while (!lIllllIlIIIlIlI(lllllllllllllIlIIIllllIIIlIlIlII, this.recipeItems[RecipesWeapons.lIIIIllllIIIll[1]].length)) {
            final Object lllllllllllllIlIIIllllIIIlIlIIll = this.recipeItems[RecipesWeapons.lIIIIllllIIIll[1]][lllllllllllllIlIIIllllIIIlIlIlII];
            int lllllllllllllIlIIIllllIIIlIlIIlI = RecipesWeapons.lIIIIllllIIIll[1];
            "".length();
            if ((0x16 ^ 0x6E ^ (0xEA ^ 0x96)) == ((0x14 ^ 0x13 ^ (0x3B ^ 0x7B)) & (0x37 ^ 0x72 ^ "  ".length() ^ -" ".length()))) {
                return;
            }
            while (!lIllllIlIIIlIlI(lllllllllllllIlIIIllllIIIlIlIIlI, this.recipeItems.length - RecipesWeapons.lIIIIllllIIIll[0])) {
                final Item lllllllllllllIlIIIllllIIIlIlIIIl = (Item)this.recipeItems[lllllllllllllIlIIIllllIIIlIlIIlI + RecipesWeapons.lIIIIllllIIIll[0]][lllllllllllllIlIIIllllIIIlIlIlII];
                final ItemStack llllllllllllIlllllllIIlIIIlIllII = new ItemStack(lllllllllllllIlIIIllllIIIlIlIIIl);
                final Object[] llllllllllllIlllllllIIlIIIllllIl = new Object[RecipesWeapons.lIIIIllllIIIll[4]];
                llllllllllllIlllllllIIlIIIllllIl[RecipesWeapons.lIIIIllllIIIll[1]] = this.recipePatterns[lllllllllllllIlIIIllllIIIlIlIIlI];
                llllllllllllIlllllllIIlIIIllllIl[RecipesWeapons.lIIIIllllIIIll[0]] = (char)RecipesWeapons.lIIIIllllIIIll[6];
                llllllllllllIlllllllIIlIIIllllIl[RecipesWeapons.lIIIIllllIIIll[3]] = Items.stick;
                llllllllllllIlllllllIIlIIIllllIl[RecipesWeapons.lIIIIllllIIIll[2]] = (char)RecipesWeapons.lIIIIllllIIIll[7];
                llllllllllllIlllllllIIlIIIllllIl[RecipesWeapons.lIIIIllllIIIll[5]] = lllllllllllllIlIIIllllIIIlIlIIll;
                lllllllllllllIlIIIllllIIIlIIllll.addRecipe(llllllllllllIlllllllIIlIIIlIllII, llllllllllllIlllllllIIlIIIllllIl);
                "".length();
                ++lllllllllllllIlIIIllllIIIlIlIIlI;
            }
            ++lllllllllllllIlIIIllllIIIlIlIlII;
        }
        final ItemStack llllllllllllIlllllllIIlIIIlIllII2 = new ItemStack(Items.bow, RecipesWeapons.lIIIIllllIIIll[0]);
        final Object[] llllllllllllIlllllllIIlIIIllllIl2 = new Object[RecipesWeapons.lIIIIllllIIIll[8]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesWeapons.lIIIIllllIIIll[1]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[2]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesWeapons.lIIIIllllIIIll[0]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[5]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesWeapons.lIIIIllllIIIll[3]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[4]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesWeapons.lIIIIllllIIIll[2]] = (char)RecipesWeapons.lIIIIllllIIIll[7];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesWeapons.lIIIIllllIIIll[5]] = Items.string;
        llllllllllllIlllllllIIlIIIllllIl2[RecipesWeapons.lIIIIllllIIIll[4]] = (char)RecipesWeapons.lIIIIllllIIIll[6];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesWeapons.lIIIIllllIIIll[9]] = Items.stick;
        lllllllllllllIlIIIllllIIIlIIllll.addRecipe(llllllllllllIlllllllIIlIIIlIllII2, llllllllllllIlllllllIIlIIIllllIl2);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIlIllII3 = new ItemStack(Items.arrow, RecipesWeapons.lIIIIllllIIIll[5]);
        final Object[] llllllllllllIlllllllIIlIIIllllIl3 = new Object[RecipesWeapons.lIIIIllllIIIll[10]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[1]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[9]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[0]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[8]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[3]] = RecipesWeapons.lIIIIllllIIIlI[RecipesWeapons.lIIIIllllIIIll[11]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[2]] = (char)RecipesWeapons.lIIIIllllIIIll[12];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[5]] = Items.feather;
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[4]] = (char)RecipesWeapons.lIIIIllllIIIll[7];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[9]] = Items.flint;
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[8]] = (char)RecipesWeapons.lIIIIllllIIIll[6];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesWeapons.lIIIIllllIIIll[11]] = Items.stick;
        lllllllllllllIlIIIllllIIIlIIllll.addRecipe(llllllllllllIlllllllIIlIIIlIllII3, llllllllllllIlllllllIIlIIIllllIl3);
        "".length();
    }
}
