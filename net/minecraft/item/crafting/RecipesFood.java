// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class RecipesFood
{
    private static final /* synthetic */ int[] lllllIlllIIIl;
    private static final /* synthetic */ String[] lllllIlIIlIlI;
    
    private static String lIlIlllIlIIIIll(final String lllllllllllllIlIlIllIIlIIlIIIllI, final String lllllllllllllIlIlIllIIlIIlIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIIlIIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), RecipesFood.lllllIlllIIIl[4]), "DES");
            final Cipher lllllllllllllIlIlIllIIlIIlIIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIIlIIlIIlIII.init(RecipesFood.lllllIlllIIIl[3], lllllllllllllIlIlIllIIlIIlIIlIIl);
            return new String(lllllllllllllIlIlIllIIlIIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIIlIIlIIIlll) {
            lllllllllllllIlIlIllIIlIIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    public void addRecipes(final CraftingManager lllllllllllllIlIlIllIIlIIllIIlll) {
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl = new ItemStack(Items.mushroom_stew);
        final Object[] llllllllllllIlllllllIIlIIIIllIII = new Object[RecipesFood.lllllIlllIIIl[0]];
        llllllllllllIlllllllIIlIIIIllIII[RecipesFood.lllllIlllIIIl[1]] = Blocks.brown_mushroom;
        llllllllllllIlllllllIIlIIIIllIII[RecipesFood.lllllIlllIIIl[2]] = Blocks.red_mushroom;
        llllllllllllIlllllllIIlIIIIllIII[RecipesFood.lllllIlllIIIl[3]] = Items.bowl;
        lllllllllllllIlIlIllIIlIIllIIlll.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl, llllllllllllIlllllllIIlIIIIllIII);
        final ItemStack llllllllllllIlllllllIIlIIIlIllII = new ItemStack(Items.cookie, RecipesFood.lllllIlllIIIl[4]);
        final Object[] llllllllllllIlllllllIIlIIIllllIl = new Object[RecipesFood.lllllIlllIIIl[5]];
        llllllllllllIlllllllIIlIIIllllIl[RecipesFood.lllllIlllIIIl[1]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[1]];
        llllllllllllIlllllllIIlIIIllllIl[RecipesFood.lllllIlllIIIl[2]] = (char)RecipesFood.lllllIlllIIIl[6];
        llllllllllllIlllllllIIlIIIllllIl[RecipesFood.lllllIlllIIIl[3]] = new ItemStack(Items.dye, RecipesFood.lllllIlllIIIl[2], EnumDyeColor.BROWN.getDyeDamage());
        llllllllllllIlllllllIIlIIIllllIl[RecipesFood.lllllIlllIIIl[0]] = (char)RecipesFood.lllllIlllIIIl[7];
        llllllllllllIlllllllIIlIIIllllIl[RecipesFood.lllllIlllIIIl[8]] = Items.wheat;
        lllllllllllllIlIlIllIIlIIllIIlll.addRecipe(llllllllllllIlllllllIIlIIIlIllII, llllllllllllIlllllllIIlIIIllllIl);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIlIllII2 = new ItemStack(Items.rabbit_stew);
        final Object[] llllllllllllIlllllllIIlIIIllllIl2 = new Object[RecipesFood.lllllIlllIIIl[9]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[1]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[2]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[2]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[3]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[3]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[0]];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[0]] = (char)RecipesFood.lllllIlllIIIl[10];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[8]] = new ItemStack(Items.cooked_rabbit);
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[5]] = (char)RecipesFood.lllllIlllIIIl[11];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[12]] = Items.carrot;
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[13]] = (char)RecipesFood.lllllIlllIIIl[14];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[4]] = Items.baked_potato;
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[15]] = (char)RecipesFood.lllllIlllIIIl[16];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[17]] = Blocks.brown_mushroom;
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[18]] = (char)RecipesFood.lllllIlllIIIl[19];
        llllllllllllIlllllllIIlIIIllllIl2[RecipesFood.lllllIlllIIIl[20]] = Items.bowl;
        lllllllllllllIlIlIllIIlIIllIIlll.addRecipe(llllllllllllIlllllllIIlIIIlIllII2, llllllllllllIlllllllIIlIIIllllIl2);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIlIllII3 = new ItemStack(Items.rabbit_stew);
        final Object[] llllllllllllIlllllllIIlIIIllllIl3 = new Object[RecipesFood.lllllIlllIIIl[9]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[1]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[8]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[2]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[5]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[3]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[12]];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[0]] = (char)RecipesFood.lllllIlllIIIl[10];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[8]] = new ItemStack(Items.cooked_rabbit);
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[5]] = (char)RecipesFood.lllllIlllIIIl[11];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[12]] = Items.carrot;
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[13]] = (char)RecipesFood.lllllIlllIIIl[14];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[4]] = Items.baked_potato;
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[15]] = (char)RecipesFood.lllllIlllIIIl[21];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[17]] = Blocks.red_mushroom;
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[18]] = (char)RecipesFood.lllllIlllIIIl[19];
        llllllllllllIlllllllIIlIIIllllIl3[RecipesFood.lllllIlllIIIl[20]] = Items.bowl;
        lllllllllllllIlIlIllIIlIIllIIlll.addRecipe(llllllllllllIlllllllIIlIIIlIllII3, llllllllllllIlllllllIIlIIIllllIl3);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIlIllII4 = new ItemStack(Blocks.melon_block);
        final Object[] llllllllllllIlllllllIIlIIIllllIl4 = new Object[RecipesFood.lllllIlllIIIl[5]];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesFood.lllllIlllIIIl[1]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[13]];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesFood.lllllIlllIIIl[2]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[4]];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesFood.lllllIlllIIIl[3]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[15]];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesFood.lllllIlllIIIl[0]] = (char)RecipesFood.lllllIlllIIIl[16];
        llllllllllllIlllllllIIlIIIllllIl4[RecipesFood.lllllIlllIIIl[8]] = Items.melon;
        lllllllllllllIlIlIllIIlIIllIIlll.addRecipe(llllllllllllIlllllllIIlIIIlIllII4, llllllllllllIlllllllIIlIIIllllIl4);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIlIllII5 = new ItemStack(Items.melon_seeds);
        final Object[] llllllllllllIlllllllIIlIIIllllIl5 = new Object[RecipesFood.lllllIlllIIIl[0]];
        llllllllllllIlllllllIIlIIIllllIl5[RecipesFood.lllllIlllIIIl[1]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[17]];
        llllllllllllIlllllllIIlIIIllllIl5[RecipesFood.lllllIlllIIIl[2]] = (char)RecipesFood.lllllIlllIIIl[16];
        llllllllllllIlllllllIIlIIIllllIl5[RecipesFood.lllllIlllIIIl[3]] = Items.melon;
        lllllllllllllIlIlIllIIlIIllIIlll.addRecipe(llllllllllllIlllllllIIlIIIlIllII5, llllllllllllIlllllllIIlIIIllllIl5);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIlIllII6 = new ItemStack(Items.pumpkin_seeds, RecipesFood.lllllIlllIIIl[8]);
        final Object[] llllllllllllIlllllllIIlIIIllllIl6 = new Object[RecipesFood.lllllIlllIIIl[0]];
        llllllllllllIlllllllIIlIIIllllIl6[RecipesFood.lllllIlllIIIl[1]] = RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[18]];
        llllllllllllIlllllllIIlIIIllllIl6[RecipesFood.lllllIlllIIIl[2]] = (char)RecipesFood.lllllIlllIIIl[16];
        llllllllllllIlllllllIIlIIIllllIl6[RecipesFood.lllllIlllIIIl[3]] = Blocks.pumpkin;
        lllllllllllllIlIlIllIIlIIllIIlll.addRecipe(llllllllllllIlllllllIIlIIIlIllII6, llllllllllllIlllllllIIlIIIllllIl6);
        "".length();
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl2 = new ItemStack(Items.pumpkin_pie);
        final Object[] llllllllllllIlllllllIIlIIIIllIII2 = new Object[RecipesFood.lllllIlllIIIl[0]];
        llllllllllllIlllllllIIlIIIIllIII2[RecipesFood.lllllIlllIIIl[1]] = Blocks.pumpkin;
        llllllllllllIlllllllIIlIIIIllIII2[RecipesFood.lllllIlllIIIl[2]] = Items.sugar;
        llllllllllllIlllllllIIlIIIIllIII2[RecipesFood.lllllIlllIIIl[3]] = Items.egg;
        lllllllllllllIlIlIllIIlIIllIIlll.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl2, llllllllllllIlllllllIIlIIIIllIII2);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl3 = new ItemStack(Items.fermented_spider_eye);
        final Object[] llllllllllllIlllllllIIlIIIIllIII3 = new Object[RecipesFood.lllllIlllIIIl[0]];
        llllllllllllIlllllllIIlIIIIllIII3[RecipesFood.lllllIlllIIIl[1]] = Items.spider_eye;
        llllllllllllIlllllllIIlIIIIllIII3[RecipesFood.lllllIlllIIIl[2]] = Blocks.brown_mushroom;
        llllllllllllIlllllllIIlIIIIllIII3[RecipesFood.lllllIlllIIIl[3]] = Items.sugar;
        lllllllllllllIlIlIllIIlIIllIIlll.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl3, llllllllllllIlllllllIIlIIIIllIII3);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl4 = new ItemStack(Items.blaze_powder, RecipesFood.lllllIlllIIIl[3]);
        final Object[] llllllllllllIlllllllIIlIIIIllIII4 = new Object[RecipesFood.lllllIlllIIIl[2]];
        llllllllllllIlllllllIIlIIIIllIII4[RecipesFood.lllllIlllIIIl[1]] = Items.blaze_rod;
        lllllllllllllIlIlIllIIlIIllIIlll.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl4, llllllllllllIlllllllIIlIIIIllIII4);
        final ItemStack llllllllllllIlllllllIIlIIIIllIIl5 = new ItemStack(Items.magma_cream);
        final Object[] llllllllllllIlllllllIIlIIIIllIII5 = new Object[RecipesFood.lllllIlllIIIl[3]];
        llllllllllllIlllllllIIlIIIIllIII5[RecipesFood.lllllIlllIIIl[1]] = Items.blaze_powder;
        llllllllllllIlllllllIIlIIIIllIII5[RecipesFood.lllllIlllIIIl[2]] = Items.slime_ball;
        lllllllllllllIlIlIllIIlIIllIIlll.addShapelessRecipe(llllllllllllIlllllllIIlIIIIllIIl5, llllllllllllIlllllllIIlIIIIllIII5);
    }
    
    private static void lIlIlllIlIIIlII() {
        (lllllIlIIlIlI = new String[RecipesFood.lllllIlllIIIl[20]])[RecipesFood.lllllIlllIIIl[1]] = lIlIlllIlIIIIlI("cBJ1", "SJVvK");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[2]] = lIlIlllIlIIIIll("dHxuobzew9A=", "EsLbK");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[3]] = lIlIlllIlIIIIlI("KxMO", "hCCrA");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[0]] = lIlIlllIlIIIIlI("ZTJK", "EpjPn");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[8]] = lIlIlllIlIIIIll("3NPq1ZUvBTk=", "muCVa");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[5]] = lIlIlllIlIIIIlI("Lzw+", "llzok");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[12]] = lIlIlllIlIIIIlI("azNq", "KqJWV");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[13]] = lIlIlllIlIIIIll("nzqtGauaQCI=", "ytApr");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[4]] = lIlIlllIlIIIIlI("GjcM", "WzALy");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[15]] = lIlIlllIlIIIIll("+MhL+Jwa/MA=", "qGeDP");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[17]] = lIlIlllIlIIIIlI("FA==", "YgGGY");
        RecipesFood.lllllIlIIlIlI[RecipesFood.lllllIlllIIIl[18]] = lIlIlllIlIIIIlI("Pw==", "rUEyB");
    }
    
    private static String lIlIlllIlIIIIlI(String lllllllllllllIlIlIllIIlIIlIlIllI, final String lllllllllllllIlIlIllIIlIIlIlIlIl) {
        lllllllllllllIlIlIllIIlIIlIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIllIIlIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllIIlIIlIllIIl = new StringBuilder();
        final char[] lllllllllllllIlIlIllIIlIIlIllIII = lllllllllllllIlIlIllIIlIIlIlIlIl.toCharArray();
        int lllllllllllllIlIlIllIIlIIlIlIlll = RecipesFood.lllllIlllIIIl[1];
        final short lllllllllllllIlIlIllIIlIIlIlIIIl = (Object)lllllllllllllIlIlIllIIlIIlIlIllI.toCharArray();
        final int lllllllllllllIlIlIllIIlIIlIlIIII = lllllllllllllIlIlIllIIlIIlIlIIIl.length;
        float lllllllllllllIlIlIllIIlIIlIIllll = RecipesFood.lllllIlllIIIl[1];
        while (lIlIllllIIlIlII((int)lllllllllllllIlIlIllIIlIIlIIllll, lllllllllllllIlIlIllIIlIIlIlIIII)) {
            final char lllllllllllllIlIlIllIIlIIlIlllII = lllllllllllllIlIlIllIIlIIlIlIIIl[lllllllllllllIlIlIllIIlIIlIIllll];
            lllllllllllllIlIlIllIIlIIlIllIIl.append((char)(lllllllllllllIlIlIllIIlIIlIlllII ^ lllllllllllllIlIlIllIIlIIlIllIII[lllllllllllllIlIlIllIIlIIlIlIlll % lllllllllllllIlIlIllIIlIIlIllIII.length]));
            "".length();
            ++lllllllllllllIlIlIllIIlIIlIlIlll;
            ++lllllllllllllIlIlIllIIlIIlIIllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllIIlIIlIllIIl);
    }
    
    private static void lIlIllllIIlIIll() {
        (lllllIlllIIIl = new int[22])[0] = "   ".length();
        RecipesFood.lllllIlllIIIl[1] = ((0x5F ^ 0x7B) & ~(0xA7 ^ 0x83));
        RecipesFood.lllllIlllIIIl[2] = " ".length();
        RecipesFood.lllllIlllIIIl[3] = "  ".length();
        RecipesFood.lllllIlllIIIl[4] = (0xA ^ 0x1E ^ (0xA5 ^ 0xB9));
        RecipesFood.lllllIlllIIIl[5] = (0x86 ^ 0xBC ^ (0x52 ^ 0x6D));
        RecipesFood.lllllIlllIIIl[6] = (0x3E ^ 0x66);
        RecipesFood.lllllIlllIIIl[7] = (0x57 ^ 0x74);
        RecipesFood.lllllIlllIIIl[8] = (0x9B ^ 0x9F);
        RecipesFood.lllllIlllIIIl[9] = (154 + 12 - 18 + 21 ^ 116 + 95 - 168 + 121);
        RecipesFood.lllllIlllIIIl[10] = (0x6 ^ 0x77 ^ (0x2C ^ 0xF));
        RecipesFood.lllllIlllIIIl[11] = (0x85 ^ 0xC7 ^ " ".length());
        RecipesFood.lllllIlllIIIl[12] = (0x8D ^ 0x8B);
        RecipesFood.lllllIlllIIIl[13] = (0x76 ^ 0x41 ^ (0xF2 ^ 0xC2));
        RecipesFood.lllllIlllIIIl[14] = (0xE1 ^ 0xB1);
        RecipesFood.lllllIlllIIIl[15] = (164 + 31 - 38 + 11 ^ 134 + 24 - 37 + 40);
        RecipesFood.lllllIlllIIIl[16] = (0x13 ^ 0x5E);
        RecipesFood.lllllIlllIIIl[17] = (0xD6 ^ 0xB4 ^ (0x3A ^ 0x52));
        RecipesFood.lllllIlllIIIl[18] = (0x8F ^ 0x99 ^ (0xA8 ^ 0xB5));
        RecipesFood.lllllIlllIIIl[19] = (0x1E ^ 0x5C);
        RecipesFood.lllllIlllIIIl[20] = (122 + 99 - 101 + 17 ^ 80 + 39 - 71 + 85);
        RecipesFood.lllllIlllIIIl[21] = (0x3A ^ 0x12 ^ (0x2 ^ 0x6E));
    }
    
    private static boolean lIlIllllIIlIlII(final int lllllllllllllIlIlIllIIlIIIlllllI, final int lllllllllllllIlIlIllIIlIIIllllIl) {
        return lllllllllllllIlIlIllIIlIIIlllllI < lllllllllllllIlIlIllIIlIIIllllIl;
    }
    
    static {
        lIlIllllIIlIIll();
        lIlIlllIlIIIlII();
    }
}
