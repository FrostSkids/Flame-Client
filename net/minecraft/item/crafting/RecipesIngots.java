// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.init.Blocks;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;

public class RecipesIngots
{
    private static final /* synthetic */ String[] lIIIlIlIlIIIII;
    private static final /* synthetic */ int[] lIIIllIIIIllIl;
    private /* synthetic */ Object[][] recipeItems;
    
    private static void llIIIIlIllIIIll() {
        (lIIIllIIIIllIl = new int[11])[0] = (0x14 ^ 0x65 ^ (0xD7 ^ 0xAF));
        RecipesIngots.lIIIllIIIIllIl[1] = ((0x3A ^ 0xA) & ~(0x8D ^ 0xBD));
        RecipesIngots.lIIIllIIIIllIl[2] = "  ".length();
        RecipesIngots.lIIIllIIIIllIl[3] = " ".length();
        RecipesIngots.lIIIllIIIIllIl[4] = "   ".length();
        RecipesIngots.lIIIllIIIIllIl[5] = (0x5F ^ 0xB ^ (0x11 ^ 0x41));
        RecipesIngots.lIIIllIIIIllIl[6] = (0xFF ^ 0xAC ^ (0x19 ^ 0x4F));
        RecipesIngots.lIIIllIIIIllIl[7] = (0xD1 ^ 0x99 ^ (0x2C ^ 0x62));
        RecipesIngots.lIIIllIIIIllIl[8] = (115 + 171 - 209 + 109 ^ 181 + 133 - 270 + 145);
        RecipesIngots.lIIIllIIIIllIl[9] = (0x49 ^ 0x7F ^ (0x26 ^ 0x18));
        RecipesIngots.lIIIllIIIIllIl[10] = (0x6B ^ 0x48);
    }
    
    public void addRecipes(final CraftingManager lllllllllllllIlIIIIIlllIlIlIIlII) {
        int lllllllllllllIlIIIIIlllIlIlIlIII = RecipesIngots.lIIIllIIIIllIl[1];
        "".length();
        if ((0x44 ^ 0x15 ^ (0x5C ^ 0x8)) == 0x0) {
            return;
        }
        while (!llIIIIlIllIIlII(lllllllllllllIlIIIIIlllIlIlIlIII, this.recipeItems.length)) {
            final Block lllllllllllllIlIIIIIlllIlIlIIlll = (Block)this.recipeItems[lllllllllllllIlIIIIIlllIlIlIlIII][RecipesIngots.lIIIllIIIIllIl[1]];
            final ItemStack lllllllllllllIlIIIIIlllIlIlIIllI = (ItemStack)this.recipeItems[lllllllllllllIlIIIIIlllIlIlIlIII][RecipesIngots.lIIIllIIIIllIl[3]];
            final ItemStack llllllllllllIlllllllIIlIIIlIllII = new ItemStack(lllllllllllllIlIIIIIlllIlIlIIlll);
            final Object[] llllllllllllIlllllllIIlIIIllllIl = new Object[RecipesIngots.lIIIllIIIIllIl[6]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesIngots.lIIIllIIIIllIl[1]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[1]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesIngots.lIIIllIIIIllIl[3]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[3]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesIngots.lIIIllIIIIllIl[2]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[2]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesIngots.lIIIllIIIIllIl[4]] = (char)RecipesIngots.lIIIllIIIIllIl[10];
            llllllllllllIlllllllIIlIIIllllIl[RecipesIngots.lIIIllIIIIllIl[5]] = lllllllllllllIlIIIIIlllIlIlIIllI;
            lllllllllllllIlIIIIIlllIlIlIIlII.addRecipe(llllllllllllIlllllllIIlIIIlIllII, llllllllllllIlllllllIIlIIIllllIl);
            "".length();
            final ItemStack llllllllllllIlllllllIIlIIIlIllII2 = lllllllllllllIlIIIIIlllIlIlIIllI;
            final Object[] llllllllllllIlllllllIIlIIIllllIl2 = new Object[RecipesIngots.lIIIllIIIIllIl[4]];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesIngots.lIIIllIIIIllIl[1]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[4]];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesIngots.lIIIllIIIIllIl[3]] = (char)RecipesIngots.lIIIllIIIIllIl[10];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesIngots.lIIIllIIIIllIl[2]] = lllllllllllllIlIIIIIlllIlIlIIlll;
            lllllllllllllIlIIIIIlllIlIlIIlII.addRecipe(llllllllllllIlllllllIIlIIIlIllII2, llllllllllllIlllllllIIlIIIllllIl2);
            "".length();
            ++lllllllllllllIlIIIIIlllIlIlIlIII;
        }
        final ItemStack llllllllllllIlllllllIIlIIIlIllII3 = new ItemStack(Items.gold_ingot);
        final Object[] llllllllllllIlllllllIIlIIIllllIl3 = new Object[RecipesIngots.lIIIllIIIIllIl[6]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesIngots.lIIIllIIIIllIl[1]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[5]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesIngots.lIIIllIIIIllIl[3]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[6]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesIngots.lIIIllIIIIllIl[2]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[7]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesIngots.lIIIllIIIIllIl[4]] = (char)RecipesIngots.lIIIllIIIIllIl[10];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesIngots.lIIIllIIIIllIl[5]] = Items.gold_nugget;
        lllllllllllllIlIIIIIlllIlIlIIlII.addRecipe(llllllllllllIlllllllIIlIIIlIllII3, llllllllllllIlllllllIIlIIIllllIl3);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIlIllII4 = new ItemStack(Items.gold_nugget, RecipesIngots.lIIIllIIIIllIl[0]);
        final Object[] llllllllllllIlllllllIIlIIIllllIl4 = new Object[RecipesIngots.lIIIllIIIIllIl[4]];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesIngots.lIIIllIIIIllIl[1]] = RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[8]];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesIngots.lIIIllIIIIllIl[3]] = (char)RecipesIngots.lIIIllIIIIllIl[10];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesIngots.lIIIllIIIIllIl[2]] = Items.gold_ingot;
        lllllllllllllIlIIIIIlllIlIlIIlII.addRecipe(llllllllllllIlllllllIIlIIIlIllII4, llllllllllllIlllllllIIlIIIllllIl4);
        "".length();
    }
    
    private static String llIIIIIIllIllII(String lllllllllllllIlIIIIIlllIIlllIlll, final String lllllllllllllIlIIIIIlllIIllllIll) {
        lllllllllllllIlIIIIIlllIIlllIlll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIlllIIlllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIlllIIllllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIIIIlllIIllllIIl = lllllllllllllIlIIIIIlllIIllllIll.toCharArray();
        int lllllllllllllIlIIIIIlllIIllllIII = RecipesIngots.lIIIllIIIIllIl[1];
        final short lllllllllllllIlIIIIIlllIIlllIIlI = (Object)((String)lllllllllllllIlIIIIIlllIIlllIlll).toCharArray();
        final byte lllllllllllllIlIIIIIlllIIlllIIIl = (byte)lllllllllllllIlIIIIIlllIIlllIIlI.length;
        String lllllllllllllIlIIIIIlllIIlllIIII = (String)RecipesIngots.lIIIllIIIIllIl[1];
        while (llIIIIlIllIIlIl((int)lllllllllllllIlIIIIIlllIIlllIIII, lllllllllllllIlIIIIIlllIIlllIIIl)) {
            final char lllllllllllllIlIIIIIlllIIlllllIl = lllllllllllllIlIIIIIlllIIlllIIlI[lllllllllllllIlIIIIIlllIIlllIIII];
            lllllllllllllIlIIIIIlllIIllllIlI.append((char)(lllllllllllllIlIIIIIlllIIlllllIl ^ lllllllllllllIlIIIIIlllIIllllIIl[lllllllllllllIlIIIIIlllIIllllIII % lllllllllllllIlIIIIIlllIIllllIIl.length]));
            "".length();
            ++lllllllllllllIlIIIIIlllIIllllIII;
            ++lllllllllllllIlIIIIIlllIIlllIIII;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIlllIIllllIlI);
    }
    
    private static boolean llIIIIlIllIIlII(final int lllllllllllllIlIIIIIlllIIllIllII, final int lllllllllllllIlIIIIIlllIIllIlIll) {
        return lllllllllllllIlIIIIIlllIIllIllII >= lllllllllllllIlIIIIIlllIIllIlIll;
    }
    
    private static void llIIIIIIllIllIl() {
        (lIIIlIlIlIIIII = new String[RecipesIngots.lIIIllIIIIllIl[9]])[RecipesIngots.lIIIllIIIIllIl[1]] = llIIIIIIllIlIlI("igPpsGfIXAs=", "lgjfV");
        RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[3]] = llIIIIIIllIlIlI("NMGtKflZht4=", "NOYtj");
        RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[2]] = llIIIIIIllIlIll("CpjNagPyqxc=", "REqsX");
        RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[4]] = llIIIIIIllIlIll("L7xLI3P3ynE=", "sDfIE");
        RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[5]] = llIIIIIIllIllII("e2J2", "XAUUP");
        RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[6]] = llIIIIIIllIlIll("Galxb6FcjCw=", "wOBBf");
        RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[7]] = llIIIIIIllIlIll("8gFHuXiliv4=", "tFJEW");
        RecipesIngots.lIIIlIlIlIIIII[RecipesIngots.lIIIllIIIIllIl[8]] = llIIIIIIllIlIlI("aB4GZmg4Qxk=", "vxHlw");
    }
    
    static {
        llIIIIlIllIIIll();
        llIIIIIIllIllIl();
    }
    
    private static boolean llIIIIlIllIIlIl(final int lllllllllllllIlIIIIIlllIIllIlIII, final int lllllllllllllIlIIIIIlllIIllIIlll) {
        return lllllllllllllIlIIIIIlllIIllIlIII < lllllllllllllIlIIIIIlllIIllIIlll;
    }
    
    private static String llIIIIIIllIlIlI(final String lllllllllllllIlIIIIIlllIlIIlIlll, final String lllllllllllllIlIIIIIlllIlIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlllIlIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIlllIlIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIlllIlIIllIll.init(RecipesIngots.lIIIllIIIIllIl[2], lllllllllllllIlIIIIIlllIlIIlllII);
            return new String(lllllllllllllIlIIIIIlllIlIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlllIlIIllIlI) {
            lllllllllllllIlIIIIIlllIlIIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIIIllIlIll(final String lllllllllllllIlIIIIIlllIlIIIllII, final String lllllllllllllIlIIIIIlllIlIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlllIlIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), RecipesIngots.lIIIllIIIIllIl[9]), "DES");
            final Cipher lllllllllllllIlIIIIIlllIlIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlllIlIIIlllI.init(RecipesIngots.lIIIllIIIIllIl[2], lllllllllllllIlIIIIIlllIlIIIllll);
            return new String(lllllllllllllIlIIIIIlllIlIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlllIlIIIllIl) {
            lllllllllllllIlIIIIIlllIlIIIllIl.printStackTrace();
            return null;
        }
    }
    
    public RecipesIngots() {
        final Object[][] recipeItems = new Object[RecipesIngots.lIIIllIIIIllIl[0]][];
        final int n = RecipesIngots.lIIIllIIIIllIl[1];
        final Object[] array = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.gold_block;
        array[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.gold_ingot, RecipesIngots.lIIIllIIIIllIl[0]);
        recipeItems[n] = array;
        final int n2 = RecipesIngots.lIIIllIIIIllIl[3];
        final Object[] array2 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array2[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.iron_block;
        array2[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.iron_ingot, RecipesIngots.lIIIllIIIIllIl[0]);
        recipeItems[n2] = array2;
        final int n3 = RecipesIngots.lIIIllIIIIllIl[2];
        final Object[] array3 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array3[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.diamond_block;
        array3[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.diamond, RecipesIngots.lIIIllIIIIllIl[0]);
        recipeItems[n3] = array3;
        final int n4 = RecipesIngots.lIIIllIIIIllIl[4];
        final Object[] array4 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array4[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.emerald_block;
        array4[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.emerald, RecipesIngots.lIIIllIIIIllIl[0]);
        recipeItems[n4] = array4;
        final int n5 = RecipesIngots.lIIIllIIIIllIl[5];
        final Object[] array5 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array5[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.lapis_block;
        array5[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.dye, RecipesIngots.lIIIllIIIIllIl[0], EnumDyeColor.BLUE.getDyeDamage());
        recipeItems[n5] = array5;
        final int n6 = RecipesIngots.lIIIllIIIIllIl[6];
        final Object[] array6 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array6[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.redstone_block;
        array6[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.redstone, RecipesIngots.lIIIllIIIIllIl[0]);
        recipeItems[n6] = array6;
        final int n7 = RecipesIngots.lIIIllIIIIllIl[7];
        final Object[] array7 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array7[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.coal_block;
        array7[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.coal, RecipesIngots.lIIIllIIIIllIl[0], RecipesIngots.lIIIllIIIIllIl[1]);
        recipeItems[n7] = array7;
        final int n8 = RecipesIngots.lIIIllIIIIllIl[8];
        final Object[] array8 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array8[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.hay_block;
        array8[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.wheat, RecipesIngots.lIIIllIIIIllIl[0]);
        recipeItems[n8] = array8;
        final int n9 = RecipesIngots.lIIIllIIIIllIl[9];
        final Object[] array9 = new Object[RecipesIngots.lIIIllIIIIllIl[2]];
        array9[RecipesIngots.lIIIllIIIIllIl[1]] = Blocks.slime_block;
        array9[RecipesIngots.lIIIllIIIIllIl[3]] = new ItemStack(Items.slime_ball, RecipesIngots.lIIIllIIIIllIl[0]);
        recipeItems[n9] = array9;
        this.recipeItems = recipeItems;
    }
}
