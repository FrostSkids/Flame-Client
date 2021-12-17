// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class RecipesDyes
{
    private static final /* synthetic */ int[] lllllllIIIIIl;
    private static final /* synthetic */ String[] lllllllIIIIII;
    
    private static void lIllIIIIlIlIlII() {
        (lllllllIIIIIl = new int[14])[0] = ((0x3 ^ 0x49) & ~(0x11 ^ 0x5B));
        RecipesDyes.lllllllIIIIIl[1] = " ".length();
        RecipesDyes.lllllllIIIIIl[2] = "  ".length();
        RecipesDyes.lllllllIIIIIl[3] = (0x34 ^ 0x5 ^ (0x13 ^ 0x2D));
        RecipesDyes.lllllllIIIIIl[4] = (0x2C ^ 0x24);
        RecipesDyes.lllllllIIIIIl[5] = (0xA ^ 0xD);
        RecipesDyes.lllllllIIIIIl[6] = "   ".length();
        RecipesDyes.lllllllIIIIIl[7] = (0x9C ^ 0xBF);
        RecipesDyes.lllllllIIIIIl[8] = (17 + 4 - 14 + 123 ^ 26 + 90 - 68 + 86);
        RecipesDyes.lllllllIIIIIl[9] = (66 + 77 - 74 + 67 ^ 6 + 109 - 60 + 86);
        RecipesDyes.lllllllIIIIIl[10] = (0xD5 ^ 0x8D);
        RecipesDyes.lllllllIIIIIl[11] = (0x3E ^ 0x38);
        RecipesDyes.lllllllIIIIIl[12] = (54 + 16 + 15 + 46 ^ 1 + 91 - 47 + 102);
        RecipesDyes.lllllllIIIIIl[13] = (0x9F ^ 0x96);
    }
    
    private static void lIllIIIIlIlIIll() {
        (lllllllIIIIII = new String[RecipesDyes.lllllllIIIIIl[13]])[RecipesDyes.lllllllIIIIIl[0]] = lIllIIIIlIlIIII("sthJDlwkKtM=", "WGovG");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[1]] = lIllIIIIlIlIIIl("VA9r", "wWHNe");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[2]] = lIllIIIIlIlIIIl("SVBZ", "jszJx");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[6]] = lIllIIIIlIlIIIl("d1tB", "Txbaz");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[8]] = lIllIIIIlIlIIlI("VdzqY0kb/o8=", "DynoS");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[9]] = lIllIIIIlIlIIII("qHoqwa/oEL8=", "hJzZk");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[11]] = lIllIIIIlIlIIII("T0uFhogolkA=", "MZpsf");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[5]] = lIllIIIIlIlIIII("jmb266cv4kk=", "DGNRp");
        RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[4]] = lIllIIIIlIlIIIl("QkY=", "aeUpa");
    }
    
    static {
        lIllIIIIlIlIlII();
        lIllIIIIlIlIIll();
    }
    
    private static boolean lIllIIIIlIlIllI(final int lllllllllllllIlIlIlIIlIlllIllIII, final int lllllllllllllIlIlIlIIlIlllIlIlll) {
        return lllllllllllllIlIlIlIIlIlllIllIII < lllllllllllllIlIlIlIIlIlllIlIlll;
    }
    
    private static String lIllIIIIlIlIIIl(String lllllllllllllIlIlIlIIlIlllllIlII, final String lllllllllllllIlIlIlIIlIlllllIIll) {
        lllllllllllllIlIlIlIIlIlllllIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIlIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIIlIlllllIlll = new StringBuilder();
        final char[] lllllllllllllIlIlIlIIlIlllllIllI = lllllllllllllIlIlIlIIlIlllllIIll.toCharArray();
        int lllllllllllllIlIlIlIIlIlllllIlIl = RecipesDyes.lllllllIIIIIl[0];
        final String lllllllllllllIlIlIlIIlIllllIllll = (Object)lllllllllllllIlIlIlIIlIlllllIlII.toCharArray();
        final long lllllllllllllIlIlIlIIlIllllIlllI = lllllllllllllIlIlIlIIlIllllIllll.length;
        int lllllllllllllIlIlIlIIlIllllIllIl = RecipesDyes.lllllllIIIIIl[0];
        while (lIllIIIIlIlIllI(lllllllllllllIlIlIlIIlIllllIllIl, (int)lllllllllllllIlIlIlIIlIllllIlllI)) {
            final char lllllllllllllIlIlIlIIlIllllllIlI = lllllllllllllIlIlIlIIlIllllIllll[lllllllllllllIlIlIlIIlIllllIllIl];
            lllllllllllllIlIlIlIIlIlllllIlll.append((char)(lllllllllllllIlIlIlIIlIllllllIlI ^ lllllllllllllIlIlIlIIlIlllllIllI[lllllllllllllIlIlIlIIlIlllllIlIl % lllllllllllllIlIlIlIIlIlllllIllI.length]));
            "".length();
            ++lllllllllllllIlIlIlIIlIlllllIlIl;
            ++lllllllllllllIlIlIlIIlIllllIllIl;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIIlIlllllIlll);
    }
    
    private static boolean lIllIIIIlIlIlIl(final int lllllllllllllIlIlIlIIlIlllIlllII, final int lllllllllllllIlIlIlIIlIlllIllIll) {
        return lllllllllllllIlIlIlIIlIlllIlllII >= lllllllllllllIlIlIlIIlIlllIllIll;
    }
    
    public void addRecipes(final CraftingManager lllllllllllllIlIlIlIIllIIIIlIIlI) {
        int lllllllllllllIlIlIlIIllIIIIlIlII = RecipesDyes.lllllllIIIIIl[0];
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lIllIIIIlIlIlIl(lllllllllllllIlIlIlIIllIIIIlIlII, RecipesDyes.lllllllIIIIIl[12])) {
            final ItemStack llllllllllllIlllllllIIlIIIIllIIl = new ItemStack(Blocks.wool, RecipesDyes.lllllllIIIIIl[1], lllllllllllllIlIlIlIIllIIIIlIlII);
            final Object[] llllllllllllIlllllllIIlIIIIllIII = new Object[RecipesDyes.lllllllIIIIIl[2]];
            llllllllllllIlllllllIIlIIIIllIII[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], RecipesDyes.lllllllIIIIIl[3] - lllllllllllllIlIlIlIIllIIIIlIlII);
            llllllllllllIlllllllIIlIIIIllIII[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Item.getItemFromBlock(Blocks.wool), RecipesDyes.lllllllIIIIIl[1], RecipesDyes.lllllllIIIIIl[0]);
            lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl, llllllllllllIlllllllIIlIIIIllIII);
            final ItemStack llllllllllllIlllllllIIlIIIlIllII = new ItemStack(Blocks.stained_hardened_clay, RecipesDyes.lllllllIIIIIl[4], RecipesDyes.lllllllIIIIIl[3] - lllllllllllllIlIlIlIIllIIIIlIlII);
            final Object[] llllllllllllIlllllllIIlIIIllllIl = new Object[RecipesDyes.lllllllIIIIIl[5]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesDyes.lllllllIIIIIl[0]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[0]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesDyes.lllllllIIIIIl[1]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[1]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesDyes.lllllllIIIIIl[2]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[2]];
            llllllllllllIlllllllIIlIIIllllIl[RecipesDyes.lllllllIIIIIl[6]] = (char)RecipesDyes.lllllllIIIIIl[7];
            llllllllllllIlllllllIIlIIIllllIl[RecipesDyes.lllllllIIIIIl[8]] = new ItemStack(Blocks.hardened_clay);
            llllllllllllIlllllllIIlIIIllllIl[RecipesDyes.lllllllIIIIIl[9]] = (char)RecipesDyes.lllllllIIIIIl[10];
            llllllllllllIlllllllIIlIIIllllIl[RecipesDyes.lllllllIIIIIl[11]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], lllllllllllllIlIlIlIIllIIIIlIlII);
            lllllllllllllIlIlIlIIllIIIIlIIlI.addRecipe(llllllllllllIlllllllIIlIIIlIllII, llllllllllllIlllllllIIlIIIllllIl);
            "".length();
            final ItemStack llllllllllllIlllllllIIlIIIlIllII2 = new ItemStack(Blocks.stained_glass, RecipesDyes.lllllllIIIIIl[4], RecipesDyes.lllllllIIIIIl[3] - lllllllllllllIlIlIlIIllIIIIlIlII);
            final Object[] llllllllllllIlllllllIIlIIIllllIl2 = new Object[RecipesDyes.lllllllIIIIIl[5]];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesDyes.lllllllIIIIIl[0]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[6]];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesDyes.lllllllIIIIIl[1]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[8]];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesDyes.lllllllIIIIIl[2]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[9]];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesDyes.lllllllIIIIIl[6]] = (char)RecipesDyes.lllllllIIIIIl[7];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesDyes.lllllllIIIIIl[8]] = new ItemStack(Blocks.glass);
            llllllllllllIlllllllIIlIIIllllIl2[RecipesDyes.lllllllIIIIIl[9]] = (char)RecipesDyes.lllllllIIIIIl[10];
            llllllllllllIlllllllIIlIIIllllIl2[RecipesDyes.lllllllIIIIIl[11]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], lllllllllllllIlIlIlIIllIIIIlIlII);
            lllllllllllllIlIlIlIIllIIIIlIIlI.addRecipe(llllllllllllIlllllllIIlIIIlIllII2, llllllllllllIlllllllIIlIIIllllIl2);
            "".length();
            final ItemStack llllllllllllIlllllllIIlIIIlIllII3 = new ItemStack(Blocks.stained_glass_pane, RecipesDyes.lllllllIIIIIl[12], lllllllllllllIlIlIlIIllIIIIlIlII);
            final Object[] llllllllllllIlllllllIIlIIIllllIl3 = new Object[RecipesDyes.lllllllIIIIIl[8]];
            llllllllllllIlllllllIIlIIIllllIl3[RecipesDyes.lllllllIIIIIl[0]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[11]];
            llllllllllllIlllllllIIlIIIllllIl3[RecipesDyes.lllllllIIIIIl[1]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[5]];
            llllllllllllIlllllllIIlIIIllllIl3[RecipesDyes.lllllllIIIIIl[2]] = (char)RecipesDyes.lllllllIIIIIl[7];
            llllllllllllIlllllllIIlIIIllllIl3[RecipesDyes.lllllllIIIIIl[6]] = new ItemStack(Blocks.stained_glass, RecipesDyes.lllllllIIIIIl[1], lllllllllllllIlIlIlIIllIIIIlIlII);
            lllllllllllllIlIlIlIIllIIIIlIIlI.addRecipe(llllllllllllIlllllllIIlIIIlIllII3, llllllllllllIlllllllIIlIIIllllIl3);
            "".length();
            ++lllllllllllllIlIlIlIIllIIIIlIlII;
        }
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl2 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.YELLOW.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII2 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII2[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.yellow_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.DANDELION.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl2, llllllllllllIlllllllIIlIIIIllIII2);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl3 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII3 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII3[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.POPPY.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl3, llllllllllllIlllllllIIlIIIIllIII3);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl4 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[6], EnumDyeColor.WHITE.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII4 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII4[RecipesDyes.lllllllIIIIIl[0]] = Items.bone;
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl4, llllllllllllIlllllllIIlIIIIllIII4);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl5 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.PINK.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII5 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII5[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII5[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl5, llllllllllllIlllllllIIlIIIIllIII5);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl6 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.ORANGE.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII6 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII6[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII6[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.YELLOW.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl6, llllllllllllIlllllllIIlIIIIllIII6);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl7 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.LIME.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII7 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII7[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.GREEN.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII7[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl7, llllllllllllIlllllllIIlIIIIllIII7);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl8 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.GRAY.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII8 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII8[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.BLACK.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII8[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl8, llllllllllllIlllllllIIlIIIIllIII8);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl9 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.SILVER.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII9 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII9[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.GRAY.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII9[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl9, llllllllllllIlllllllIIlIIIIllIII9);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl10 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[6], EnumDyeColor.SILVER.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII10 = new Object[RecipesDyes.lllllllIIIIIl[6]];
        llllllllllllIlllllllIIlIIIIllIII10[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.BLACK.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII10[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII10[RecipesDyes.lllllllIIIIIl[2]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl10, llllllllllllIlllllllIIlIIIIllIII10);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl11 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.LIGHT_BLUE.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII11 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII11[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.BLUE.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII11[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl11, llllllllllllIlllllllIIlIIIIllIII11);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl12 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.CYAN.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII12 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII12[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.BLUE.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII12[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.GREEN.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl12, llllllllllllIlllllllIIlIIIIllIII12);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl13 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.PURPLE.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII13 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII13[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.BLUE.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII13[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl13, llllllllllllIlllllllIIlIIIIllIII13);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl14 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.MAGENTA.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII14 = new Object[RecipesDyes.lllllllIIIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII14[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.PURPLE.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII14[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.PINK.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl14, llllllllllllIlllllllIIlIIIIllIII14);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl15 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[6], EnumDyeColor.MAGENTA.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII15 = new Object[RecipesDyes.lllllllIIIIIl[6]];
        llllllllllllIlllllllIIlIIIIllIII15[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.BLUE.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII15[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII15[RecipesDyes.lllllllIIIIIl[2]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.PINK.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl15, llllllllllllIlllllllIIlIIIIllIII15);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl16 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[8], EnumDyeColor.MAGENTA.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII16 = new Object[RecipesDyes.lllllllIIIIIl[8]];
        llllllllllllIlllllllIIlIIIIllIII16[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.BLUE.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII16[RecipesDyes.lllllllIIIIIl[1]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII16[RecipesDyes.lllllllIIIIIl[2]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        llllllllllllIlllllllIIlIIIIllIII16[RecipesDyes.lllllllIIIIIl[6]] = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.WHITE.getDyeDamage());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl16, llllllllllllIlllllllIIlIIIIllIII16);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl17 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.LIGHT_BLUE.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII17 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII17[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.BLUE_ORCHID.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl17, llllllllllllIlllllllIIlIIIIllIII17);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl18 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.MAGENTA.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII18 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII18[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.ALLIUM.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl18, llllllllllllIlllllllIIlIIIIllIII18);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl19 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.SILVER.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII19 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII19[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.HOUSTONIA.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl19, llllllllllllIlllllllIIlIIIIllIII19);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl20 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.RED.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII20 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII20[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.RED_TULIP.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl20, llllllllllllIlllllllIIlIIIIllIII20);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl21 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.ORANGE.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII21 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII21[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.ORANGE_TULIP.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl21, llllllllllllIlllllllIIlIIIIllIII21);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl22 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.SILVER.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII22 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII22[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.WHITE_TULIP.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl22, llllllllllllIlllllllIIlIIIIllIII22);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl23 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.PINK.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII23 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII23[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.PINK_TULIP.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl23, llllllllllllIlllllllIIlIIIIllIII23);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl24 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[1], EnumDyeColor.SILVER.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII24 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII24[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.red_flower, RecipesDyes.lllllllIIIIIl[1], BlockFlower.EnumFlowerType.OXEYE_DAISY.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl24, llllllllllllIlllllllIIlIIIIllIII24);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl25 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.YELLOW.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII25 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII25[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.double_plant, RecipesDyes.lllllllIIIIIl[1], BlockDoublePlant.EnumPlantType.SUNFLOWER.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl25, llllllllllllIlllllllIIlIIIIllIII25);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl26 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.MAGENTA.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII26 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII26[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.double_plant, RecipesDyes.lllllllIIIIIl[1], BlockDoublePlant.EnumPlantType.SYRINGA.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl26, llllllllllllIlllllllIIlIIIIllIII26);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl27 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.RED.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII27 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII27[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.double_plant, RecipesDyes.lllllllIIIIIl[1], BlockDoublePlant.EnumPlantType.ROSE.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl27, llllllllllllIlllllllIIlIIIIllIII27);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl28 = new ItemStack(Items.dye, RecipesDyes.lllllllIIIIIl[2], EnumDyeColor.PINK.getDyeDamage());
        final Object[] llllllllllllIlllllllIIlIIIIllIII28 = new Object[RecipesDyes.lllllllIIIIIl[1]];
        llllllllllllIlllllllIIlIIIIllIII28[RecipesDyes.lllllllIIIIIl[0]] = new ItemStack(Blocks.double_plant, RecipesDyes.lllllllIIIIIl[1], BlockDoublePlant.EnumPlantType.PAEONIA.getMeta());
        lllllllllllllIlIlIlIIllIIIIlIIlI.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl28, llllllllllllIlllllllIIlIIIIllIII28);
        int lllllllllllllIlIlIlIIllIIIIlIIll = RecipesDyes.lllllllIIIIIl[0];
        "".length();
        if (-" ".length() == (0x4A ^ 0x3E ^ (0x33 ^ 0x43))) {
            return;
        }
        while (!lIllIIIIlIlIlIl(lllllllllllllIlIlIlIIllIIIIlIIll, RecipesDyes.lllllllIIIIIl[12])) {
            final ItemStack llllllllllllIlllllllIIlIIIlIllII4 = new ItemStack(Blocks.carpet, RecipesDyes.lllllllIIIIIl[6], lllllllllllllIlIlIlIIllIIIIlIIll);
            final Object[] llllllllllllIlllllllIIlIIIllllIl4 = new Object[RecipesDyes.lllllllIIIIIl[6]];
            llllllllllllIlllllllIIlIIIllllIl4[RecipesDyes.lllllllIIIIIl[0]] = RecipesDyes.lllllllIIIIII[RecipesDyes.lllllllIIIIIl[4]];
            llllllllllllIlllllllIIlIIIllllIl4[RecipesDyes.lllllllIIIIIl[1]] = (char)RecipesDyes.lllllllIIIIIl[7];
            llllllllllllIlllllllIIlIIIllllIl4[RecipesDyes.lllllllIIIIIl[2]] = new ItemStack(Blocks.wool, RecipesDyes.lllllllIIIIIl[1], lllllllllllllIlIlIlIIllIIIIlIIll);
            lllllllllllllIlIlIlIIllIIIIlIIlI.addRecipe(llllllllllllIlllllllIIlIIIlIllII4, llllllllllllIlllllllIIlIIIllllIl4);
            "".length();
            ++lllllllllllllIlIlIlIIllIIIIlIIll;
        }
    }
    
    private static String lIllIIIIlIlIIII(final String lllllllllllllIlIlIlIIllIIIIIlIIl, final String lllllllllllllIlIlIlIIllIIIIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIllIIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIllIIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIIllIIIIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIIllIIIIIlIll.init(RecipesDyes.lllllllIIIIIl[2], lllllllllllllIlIlIlIIllIIIIIllII);
            return new String(lllllllllllllIlIlIlIIllIIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIllIIIIIlIlI) {
            lllllllllllllIlIlIlIIllIIIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIIIIlIlIIlI(final String lllllllllllllIlIlIlIIlIllllIIlII, final String lllllllllllllIlIlIlIIlIllllIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIlIllllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIlIllllIIIll.getBytes(StandardCharsets.UTF_8)), RecipesDyes.lllllllIIIIIl[4]), "DES");
            final Cipher lllllllllllllIlIlIlIIlIllllIIllI = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIIlIllllIIllI.init(RecipesDyes.lllllllIIIIIl[2], lllllllllllllIlIlIlIIlIllllIIlll);
            return new String(lllllllllllllIlIlIlIIlIllllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIlIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIlIllllIIlIl) {
            lllllllllllllIlIlIlIIlIllllIIlIl.printStackTrace();
            return null;
        }
    }
}
