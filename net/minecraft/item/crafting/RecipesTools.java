// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import java.util.Arrays;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;

public class RecipesTools
{
    private /* synthetic */ String[][] recipePatterns;
    private static final /* synthetic */ int[] llIIlIIIIIIIIl;
    private /* synthetic */ Object[][] recipeItems;
    private static final /* synthetic */ String[] llIIIlllllllIl;
    
    public RecipesTools() {
        final String[][] recipePatterns = new String[RecipesTools.llIIlIIIIIIIIl[0]][];
        final int n = RecipesTools.llIIlIIIIIIIIl[1];
        final String[] array = new String[RecipesTools.llIIlIIIIIIIIl[2]];
        array[RecipesTools.llIIlIIIIIIIIl[1]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[1]];
        array[RecipesTools.llIIlIIIIIIIIl[3]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[3]];
        array[RecipesTools.llIIlIIIIIIIIl[4]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[4]];
        recipePatterns[n] = array;
        final int n2 = RecipesTools.llIIlIIIIIIIIl[3];
        final String[] array2 = new String[RecipesTools.llIIlIIIIIIIIl[2]];
        array2[RecipesTools.llIIlIIIIIIIIl[1]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[2]];
        array2[RecipesTools.llIIlIIIIIIIIl[3]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[0]];
        array2[RecipesTools.llIIlIIIIIIIIl[4]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[5]];
        recipePatterns[n2] = array2;
        final int n3 = RecipesTools.llIIlIIIIIIIIl[4];
        final String[] array3 = new String[RecipesTools.llIIlIIIIIIIIl[2]];
        array3[RecipesTools.llIIlIIIIIIIIl[1]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[6]];
        array3[RecipesTools.llIIlIIIIIIIIl[3]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[7]];
        array3[RecipesTools.llIIlIIIIIIIIl[4]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[8]];
        recipePatterns[n3] = array3;
        final int n4 = RecipesTools.llIIlIIIIIIIIl[2];
        final String[] array4 = new String[RecipesTools.llIIlIIIIIIIIl[2]];
        array4[RecipesTools.llIIlIIIIIIIIl[1]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[9]];
        array4[RecipesTools.llIIlIIIIIIIIl[3]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[10]];
        array4[RecipesTools.llIIlIIIIIIIIl[4]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[11]];
        recipePatterns[n4] = array4;
        this.recipePatterns = recipePatterns;
        final Object[][] recipeItems = new Object[RecipesTools.llIIlIIIIIIIIl[5]][];
        final int n5 = RecipesTools.llIIlIIIIIIIIl[1];
        final Object[] array5 = new Object[RecipesTools.llIIlIIIIIIIIl[5]];
        array5[RecipesTools.llIIlIIIIIIIIl[1]] = Blocks.planks;
        array5[RecipesTools.llIIlIIIIIIIIl[3]] = Blocks.cobblestone;
        array5[RecipesTools.llIIlIIIIIIIIl[4]] = Items.iron_ingot;
        array5[RecipesTools.llIIlIIIIIIIIl[2]] = Items.diamond;
        array5[RecipesTools.llIIlIIIIIIIIl[0]] = Items.gold_ingot;
        recipeItems[n5] = array5;
        final int n6 = RecipesTools.llIIlIIIIIIIIl[3];
        final Object[] array6 = new Object[RecipesTools.llIIlIIIIIIIIl[5]];
        array6[RecipesTools.llIIlIIIIIIIIl[1]] = Items.wooden_pickaxe;
        array6[RecipesTools.llIIlIIIIIIIIl[3]] = Items.stone_pickaxe;
        array6[RecipesTools.llIIlIIIIIIIIl[4]] = Items.iron_pickaxe;
        array6[RecipesTools.llIIlIIIIIIIIl[2]] = Items.diamond_pickaxe;
        array6[RecipesTools.llIIlIIIIIIIIl[0]] = Items.golden_pickaxe;
        recipeItems[n6] = array6;
        final int n7 = RecipesTools.llIIlIIIIIIIIl[4];
        final Object[] array7 = new Object[RecipesTools.llIIlIIIIIIIIl[5]];
        array7[RecipesTools.llIIlIIIIIIIIl[1]] = Items.wooden_shovel;
        array7[RecipesTools.llIIlIIIIIIIIl[3]] = Items.stone_shovel;
        array7[RecipesTools.llIIlIIIIIIIIl[4]] = Items.iron_shovel;
        array7[RecipesTools.llIIlIIIIIIIIl[2]] = Items.diamond_shovel;
        array7[RecipesTools.llIIlIIIIIIIIl[0]] = Items.golden_shovel;
        recipeItems[n7] = array7;
        final int n8 = RecipesTools.llIIlIIIIIIIIl[2];
        final Object[] array8 = new Object[RecipesTools.llIIlIIIIIIIIl[5]];
        array8[RecipesTools.llIIlIIIIIIIIl[1]] = Items.wooden_axe;
        array8[RecipesTools.llIIlIIIIIIIIl[3]] = Items.stone_axe;
        array8[RecipesTools.llIIlIIIIIIIIl[4]] = Items.iron_axe;
        array8[RecipesTools.llIIlIIIIIIIIl[2]] = Items.diamond_axe;
        array8[RecipesTools.llIIlIIIIIIIIl[0]] = Items.golden_axe;
        recipeItems[n8] = array8;
        final int n9 = RecipesTools.llIIlIIIIIIIIl[0];
        final Object[] array9 = new Object[RecipesTools.llIIlIIIIIIIIl[5]];
        array9[RecipesTools.llIIlIIIIIIIIl[1]] = Items.wooden_hoe;
        array9[RecipesTools.llIIlIIIIIIIIl[3]] = Items.stone_hoe;
        array9[RecipesTools.llIIlIIIIIIIIl[4]] = Items.iron_hoe;
        array9[RecipesTools.llIIlIIIIIIIIl[2]] = Items.diamond_hoe;
        array9[RecipesTools.llIIlIIIIIIIIl[0]] = Items.golden_hoe;
        recipeItems[n9] = array9;
        this.recipeItems = recipeItems;
    }
    
    private static void lIIIlIllIllIllIl() {
        (llIIIlllllllIl = new String[RecipesTools.llIIlIIIIIIIIl[16]])[RecipesTools.llIIlIIIIIIIIl[1]] = lIIIlIllIllIlIlI("Vcsk+eEPRLg=", "UNEZU");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[3]] = lIIIlIllIllIlIll("LGuJPd1NHhs=", "KQNWl");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[4]] = lIIIlIllIllIllII("UExx", "poQtR");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[2]] = lIIIlIllIllIlIlI("sW/3Qbre6po=", "joMgn");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[0]] = lIIIlIllIllIlIlI("ICrSuYhmPIU=", "MAYnM");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[5]] = lIIIlIllIllIlIlI("+F1phj9DikE=", "ywgsh");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[6]] = lIIIlIllIllIllII("Ci0=", "RuFyj");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[7]] = lIIIlIllIllIlIll("1pCS4o16xpw=", "VWFTd");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[8]] = lIIIlIllIllIlIll("j46sOy5I6Zk=", "FHmGw");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[9]] = lIIIlIllIllIlIlI("oG6n57bVbcg=", "LuPpo");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[10]] = lIIIlIllIllIlIll("CTII/+vet64=", "opBTJ");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[11]] = lIIIlIllIllIlIlI("yj+c85ly7bo=", "hQiuA");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[14]] = lIIIlIllIllIllII("eEc=", "Xdorw");
        RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[15]] = lIIIlIllIllIllII("YFU=", "CuLLd");
    }
    
    private static String lIIIlIllIllIlIll(final String llllllllllllIlllIIlllIlIIIlIIllI, final String llllllllllllIlllIIlllIlIIIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllIlIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlllIlIIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlllIlIIIlIlIlI.init(RecipesTools.llIIlIIIIIIIIl[4], llllllllllllIlllIIlllIlIIIlIlIll);
            return new String(llllllllllllIlllIIlllIlIIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllIlIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllIlIIIlIlIIl) {
            llllllllllllIlllIIlllIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    public void addRecipes(final CraftingManager llllllllllllIlllIIlllIlIIIllIlII) {
        int llllllllllllIlllIIlllIlIIIlllIIl = RecipesTools.llIIlIIIIIIIIl[1];
        "".length();
        if (((127 + 73 - 170 + 101 ^ 98 + 3 - 92 + 132) & (0x15 ^ 0x72 ^ (0xC0 ^ 0xA9) ^ -" ".length())) > ((0xBD ^ 0xC7 ^ (0xD ^ 0x2A)) & (0xAB ^ 0xA2 ^ (0xEF ^ 0xBB) ^ -" ".length()))) {
            return;
        }
        while (!lIIIlIllIlllIlIl(llllllllllllIlllIIlllIlIIIlllIIl, this.recipeItems[RecipesTools.llIIlIIIIIIIIl[1]].length)) {
            final Object llllllllllllIlllIIlllIlIIIlllIII = this.recipeItems[RecipesTools.llIIlIIIIIIIIl[1]][llllllllllllIlllIIlllIlIIIlllIIl];
            int llllllllllllIlllIIlllIlIIIllIlll = RecipesTools.llIIlIIIIIIIIl[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lIIIlIllIlllIlIl(llllllllllllIlllIIlllIlIIIllIlll, this.recipeItems.length - RecipesTools.llIIlIIIIIIIIl[3])) {
                final Item llllllllllllIlllIIlllIlIIIllIllI = (Item)this.recipeItems[llllllllllllIlllIIlllIlIIIllIlll + RecipesTools.llIIlIIIIIIIIl[3]][llllllllllllIlllIIlllIlIIIlllIIl];
                final ItemStack llllllllllllIlllllllIIlIIIlIllII = new ItemStack(llllllllllllIlllIIlllIlIIIllIllI);
                final Object[] llllllllllllIlllllllIIlIIIllllIl = new Object[RecipesTools.llIIlIIIIIIIIl[5]];
                llllllllllllIlllllllIIlIIIllllIl[RecipesTools.llIIlIIIIIIIIl[1]] = this.recipePatterns[llllllllllllIlllIIlllIlIIIllIlll];
                llllllllllllIlllllllIIlIIIllllIl[RecipesTools.llIIlIIIIIIIIl[3]] = (char)RecipesTools.llIIlIIIIIIIIl[12];
                llllllllllllIlllllllIIlIIIllllIl[RecipesTools.llIIlIIIIIIIIl[4]] = Items.stick;
                llllllllllllIlllllllIIlIIIllllIl[RecipesTools.llIIlIIIIIIIIl[2]] = (char)RecipesTools.llIIlIIIIIIIIl[13];
                llllllllllllIlllllllIIlIIIllllIl[RecipesTools.llIIlIIIIIIIIl[0]] = llllllllllllIlllIIlllIlIIIlllIII;
                llllllllllllIlllIIlllIlIIIllIlII.addRecipe(llllllllllllIlllllllIIlIIIlIllII, llllllllllllIlllllllIIlIIIllllIl);
                "".length();
                ++llllllllllllIlllIIlllIlIIIllIlll;
            }
            ++llllllllllllIlllIIlllIlIIIlllIIl;
        }
        final ItemStack llllllllllllIlllllllIIlIIIlIllII2 = new ItemStack(Items.shears);
        final Object[] llllllllllllIlllllllIIlIIIllllIl2 = new Object[RecipesTools.llIIlIIIIIIIIl[0]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesTools.llIIlIIIIIIIIl[1]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[14]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesTools.llIIlIIIIIIIIl[3]] = RecipesTools.llIIIlllllllIl[RecipesTools.llIIlIIIIIIIIl[15]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesTools.llIIlIIIIIIIIl[4]] = (char)RecipesTools.llIIlIIIIIIIIl[12];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesTools.llIIlIIIIIIIIl[2]] = Items.iron_ingot;
        llllllllllllIlllIIlllIlIIIllIlII.addRecipe(llllllllllllIlllllllIIlIIIlIllII2, llllllllllllIlllllllIIlIIIllllIl2);
        "".length();
    }
    
    static {
        lIIIlIllIlllIlII();
        lIIIlIllIllIllIl();
    }
    
    private static String lIIIlIllIllIlIlI(final String llllllllllllIlllIIlllIlIIIIllIIl, final String llllllllllllIlllIIlllIlIIIIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllIlIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllIlIIIIllIlI.getBytes(StandardCharsets.UTF_8)), RecipesTools.llIIlIIIIIIIIl[8]), "DES");
            final Cipher llllllllllllIlllIIlllIlIIIIlllIl = Cipher.getInstance("DES");
            llllllllllllIlllIIlllIlIIIIlllIl.init(RecipesTools.llIIlIIIIIIIIl[4], llllllllllllIlllIIlllIlIIIIllllI);
            return new String(llllllllllllIlllIIlllIlIIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllIlIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllIlIIIIlllII) {
            llllllllllllIlllIIlllIlIIIIlllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIllIlllIlIl(final int llllllllllllIlllIIlllIIllllllIll, final int llllllllllllIlllIIlllIIllllllIlI) {
        return llllllllllllIlllIIlllIIllllllIll >= llllllllllllIlllIIlllIIllllllIlI;
    }
    
    private static void lIIIlIllIlllIlII() {
        (llIIlIIIIIIIIl = new int[17])[0] = (0xC7 ^ 0xC3);
        RecipesTools.llIIlIIIIIIIIl[1] = ((0x31 ^ 0x3D) & ~(0x30 ^ 0x3C));
        RecipesTools.llIIlIIIIIIIIl[2] = "   ".length();
        RecipesTools.llIIlIIIIIIIIl[3] = " ".length();
        RecipesTools.llIIlIIIIIIIIl[4] = "  ".length();
        RecipesTools.llIIlIIIIIIIIl[5] = (0x76 ^ 0x73);
        RecipesTools.llIIlIIIIIIIIl[6] = (0x87 ^ 0xB9 ^ (0xF8 ^ 0xC0));
        RecipesTools.llIIlIIIIIIIIl[7] = (0x21 ^ 0x26);
        RecipesTools.llIIlIIIIIIIIl[8] = (0xC ^ 0x4);
        RecipesTools.llIIlIIIIIIIIl[9] = (54 + 170 - 129 + 79 ^ 26 + 67 - 1 + 75);
        RecipesTools.llIIlIIIIIIIIl[10] = (0x72 ^ 0x26 ^ (0xF2 ^ 0xAC));
        RecipesTools.llIIlIIIIIIIIl[11] = (0x24 ^ 0x14 ^ (0xA4 ^ 0x9F));
        RecipesTools.llIIlIIIIIIIIl[12] = (0xA7 ^ 0x84);
        RecipesTools.llIIlIIIIIIIIl[13] = (0x7C ^ 0x24);
        RecipesTools.llIIlIIIIIIIIl[14] = (0x8 ^ 0x31 ^ (0xF5 ^ 0xC0));
        RecipesTools.llIIlIIIIIIIIl[15] = (0xAE ^ 0xA3);
        RecipesTools.llIIlIIIIIIIIl[16] = (112 + 85 - 18 + 0 ^ 118 + 140 - 190 + 121);
    }
    
    private static boolean lIIIlIllIlllIllI(final int llllllllllllIlllIIlllIIlllllIlll, final int llllllllllllIlllIIlllIIlllllIllI) {
        return llllllllllllIlllIIlllIIlllllIlll < llllllllllllIlllIIlllIIlllllIllI;
    }
    
    private static String lIIIlIllIllIllII(String llllllllllllIlllIIlllIlIIIIIIllI, final String llllllllllllIlllIIlllIlIIIIIIlIl) {
        llllllllllllIlllIIlllIlIIIIIIllI = new String(Base64.getDecoder().decode(llllllllllllIlllIIlllIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlllIlIIIIIlIIl = new StringBuilder();
        final char[] llllllllllllIlllIIlllIlIIIIIlIII = llllllllllllIlllIIlllIlIIIIIIlIl.toCharArray();
        int llllllllllllIlllIIlllIlIIIIIIlll = RecipesTools.llIIlIIIIIIIIl[1];
        final short llllllllllllIlllIIlllIlIIIIIIIIl = (Object)llllllllllllIlllIIlllIlIIIIIIllI.toCharArray();
        final byte llllllllllllIlllIIlllIlIIIIIIIII = (byte)llllllllllllIlllIIlllIlIIIIIIIIl.length;
        char llllllllllllIlllIIlllIIlllllllll = (char)RecipesTools.llIIlIIIIIIIIl[1];
        while (lIIIlIllIlllIllI(llllllllllllIlllIIlllIIlllllllll, llllllllllllIlllIIlllIlIIIIIIIII)) {
            final char llllllllllllIlllIIlllIlIIIIIllII = llllllllllllIlllIIlllIlIIIIIIIIl[llllllllllllIlllIIlllIIlllllllll];
            llllllllllllIlllIIlllIlIIIIIlIIl.append((char)(llllllllllllIlllIIlllIlIIIIIllII ^ llllllllllllIlllIIlllIlIIIIIlIII[llllllllllllIlllIIlllIlIIIIIIlll % llllllllllllIlllIIlllIlIIIIIlIII.length]));
            "".length();
            ++llllllllllllIlllIIlllIlIIIIIIlll;
            ++llllllllllllIlllIIlllIIlllllllll;
            "".length();
            if (((0x6E ^ 0x36 ^ (0x60 ^ 0x6D)) & (0x65 ^ 0x10 ^ (0x90 ^ 0xB0) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlllIlIIIIIlIIl);
    }
}
