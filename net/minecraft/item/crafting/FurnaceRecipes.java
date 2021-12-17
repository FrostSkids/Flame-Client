// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item.crafting;

import java.util.Iterator;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import java.util.Map;

public class FurnaceRecipes
{
    private /* synthetic */ Map<ItemStack, Float> experienceList;
    private /* synthetic */ Map<ItemStack, ItemStack> smeltingList;
    private static final /* synthetic */ int[] lIIlIIIlllIlll;
    private static final /* synthetic */ FurnaceRecipes smeltingBase;
    
    public Map<ItemStack, ItemStack> getSmeltingList() {
        return this.smeltingList;
    }
    
    private static void llIIlIlllIlIIIl() {
        (lIIlIIIlllIlll = new int[3])[0] = " ".length();
        FurnaceRecipes.lIIlIIIlllIlll[1] = ((14 + 72 + 3 + 43 ^ 53 + 26 - 25 + 74) & (143 + 67 - 156 + 106 ^ 94 + 46 - 83 + 107 ^ -" ".length()));
        FurnaceRecipes.lIIlIIIlllIlll[2] = (-1 & 0x7FFF);
    }
    
    private static boolean llIIlIlllIlIlll(final int lllllllllllllIIlllIIIlllIIIllIlI, final int lllllllllllllIIlllIIIlllIIIllIIl) {
        return lllllllllllllIIlllIIIlllIIIllIlI == lllllllllllllIIlllIIIlllIIIllIIl;
    }
    
    private static boolean llIIlIlllIlIIll(final int lllllllllllllIIlllIIIlllIIIlIllI, final int lllllllllllllIIlllIIIlllIIIlIlIl) {
        return lllllllllllllIIlllIIIlllIIIlIllI >= lllllllllllllIIlllIIIlllIIIlIlIl;
    }
    
    public static FurnaceRecipes instance() {
        return FurnaceRecipes.smeltingBase;
    }
    
    private static boolean llIIlIlllIlIIlI(final int lllllllllllllIIlllIIIlllIIIIllll) {
        return lllllllllllllIIlllIIIlllIIIIllll != 0;
    }
    
    private static boolean llIIlIlllIlIllI(final int lllllllllllllIIlllIIIlllIIIIlIlI, final int lllllllllllllIIlllIIIlllIIIIlIIl) {
        return lllllllllllllIIlllIIIlllIIIIlIlI != lllllllllllllIIlllIIIlllIIIIlIIl;
    }
    
    public ItemStack getSmeltingResult(final ItemStack lllllllllllllIIlllIIIlllIIllIlII) {
        final int lllllllllllllIIlllIIIlllIIllIIlI = (int)this.smeltingList.entrySet().iterator();
        "".length();
        if ("   ".length() == "  ".length()) {
            return null;
        }
        while (!llIIlIlllIlIlII(((Iterator)lllllllllllllIIlllIIIlllIIllIIlI).hasNext() ? 1 : 0)) {
            final Map.Entry<ItemStack, ItemStack> lllllllllllllIIlllIIIlllIIllIllI = ((Iterator<Map.Entry<ItemStack, ItemStack>>)lllllllllllllIIlllIIIlllIIllIIlI).next();
            if (llIIlIlllIlIIlI(this.compareItemStacks(lllllllllllllIIlllIIIlllIIllIlII, lllllllllllllIIlllIIIlllIIllIllI.getKey()) ? 1 : 0)) {
                return lllllllllllllIIlllIIIlllIIllIllI.getValue();
            }
        }
        return null;
    }
    
    public void addSmeltingRecipeForBlock(final Block lllllllllllllIIlllIIIlllIlIlllIl, final ItemStack lllllllllllllIIlllIIIlllIllIIIII, final float lllllllllllllIIlllIIIlllIlIllIll) {
        this.addSmelting(Item.getItemFromBlock(lllllllllllllIIlllIIIlllIlIlllIl), lllllllllllllIIlllIIIlllIllIIIII, lllllllllllllIIlllIIIlllIlIllIll);
    }
    
    public void addSmelting(final Item lllllllllllllIIlllIIIlllIlIlIIIl, final ItemStack lllllllllllllIIlllIIIlllIlIlIIII, final float lllllllllllllIIlllIIIlllIlIlIIll) {
        this.addSmeltingRecipe(new ItemStack(lllllllllllllIIlllIIIlllIlIlIIIl, FurnaceRecipes.lIIlIIIlllIlll[0], FurnaceRecipes.lIIlIIIlllIlll[2]), lllllllllllllIIlllIIIlllIlIlIIII, lllllllllllllIIlllIIIlllIlIlIIll);
    }
    
    private FurnaceRecipes() {
        this.smeltingList = (Map<ItemStack, ItemStack>)Maps.newHashMap();
        this.experienceList = (Map<ItemStack, Float>)Maps.newHashMap();
        this.addSmeltingRecipeForBlock(Blocks.iron_ore, new ItemStack(Items.iron_ingot), 0.7f);
        this.addSmeltingRecipeForBlock(Blocks.gold_ore, new ItemStack(Items.gold_ingot), 1.0f);
        this.addSmeltingRecipeForBlock(Blocks.diamond_ore, new ItemStack(Items.diamond), 1.0f);
        this.addSmeltingRecipeForBlock(Blocks.sand, new ItemStack(Blocks.glass), 0.1f);
        this.addSmelting(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.35f);
        this.addSmelting(Items.beef, new ItemStack(Items.cooked_beef), 0.35f);
        this.addSmelting(Items.chicken, new ItemStack(Items.cooked_chicken), 0.35f);
        this.addSmelting(Items.rabbit, new ItemStack(Items.cooked_rabbit), 0.35f);
        this.addSmelting(Items.mutton, new ItemStack(Items.cooked_mutton), 0.35f);
        this.addSmeltingRecipeForBlock(Blocks.cobblestone, new ItemStack(Blocks.stone), 0.1f);
        this.addSmeltingRecipe(new ItemStack(Blocks.stonebrick, FurnaceRecipes.lIIlIIIlllIlll[0], BlockStoneBrick.DEFAULT_META), new ItemStack(Blocks.stonebrick, FurnaceRecipes.lIIlIIIlllIlll[0], BlockStoneBrick.CRACKED_META), 0.1f);
        this.addSmelting(Items.clay_ball, new ItemStack(Items.brick), 0.3f);
        this.addSmeltingRecipeForBlock(Blocks.clay, new ItemStack(Blocks.hardened_clay), 0.35f);
        this.addSmeltingRecipeForBlock(Blocks.cactus, new ItemStack(Items.dye, FurnaceRecipes.lIIlIIIlllIlll[0], EnumDyeColor.GREEN.getDyeDamage()), 0.2f);
        this.addSmeltingRecipeForBlock(Blocks.log, new ItemStack(Items.coal, FurnaceRecipes.lIIlIIIlllIlll[0], FurnaceRecipes.lIIlIIIlllIlll[0]), 0.15f);
        this.addSmeltingRecipeForBlock(Blocks.log2, new ItemStack(Items.coal, FurnaceRecipes.lIIlIIIlllIlll[0], FurnaceRecipes.lIIlIIIlllIlll[0]), 0.15f);
        this.addSmeltingRecipeForBlock(Blocks.emerald_ore, new ItemStack(Items.emerald), 1.0f);
        this.addSmelting(Items.potato, new ItemStack(Items.baked_potato), 0.35f);
        this.addSmeltingRecipeForBlock(Blocks.netherrack, new ItemStack(Items.netherbrick), 0.1f);
        this.addSmeltingRecipe(new ItemStack(Blocks.sponge, FurnaceRecipes.lIIlIIIlllIlll[0], FurnaceRecipes.lIIlIIIlllIlll[0]), new ItemStack(Blocks.sponge, FurnaceRecipes.lIIlIIIlllIlll[0], FurnaceRecipes.lIIlIIIlllIlll[1]), 0.15f);
        final byte lllllllllllllIIlllIIIlllIllIIlll;
        final short lllllllllllllIIlllIIIlllIllIlIII = (short)((ItemFishFood.FishType[])(Object)(lllllllllllllIIlllIIIlllIllIIlll = (byte)(Object)ItemFishFood.FishType.values())).length;
        float lllllllllllllIIlllIIIlllIllIlIIl = FurnaceRecipes.lIIlIIIlllIlll[1];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!llIIlIlllIlIIll((int)lllllllllllllIIlllIIIlllIllIlIIl, lllllllllllllIIlllIIIlllIllIlIII)) {
            final ItemFishFood.FishType lllllllllllllIIlllIIIlllIllIllII = lllllllllllllIIlllIIIlllIllIIlll[lllllllllllllIIlllIIIlllIllIlIIl];
            if (llIIlIlllIlIIlI(lllllllllllllIIlllIIIlllIllIllII.canCook() ? 1 : 0)) {
                this.addSmeltingRecipe(new ItemStack(Items.fish, FurnaceRecipes.lIIlIIIlllIlll[0], lllllllllllllIIlllIIIlllIllIllII.getMetadata()), new ItemStack(Items.cooked_fish, FurnaceRecipes.lIIlIIIlllIlll[0], lllllllllllllIIlllIIIlllIllIllII.getMetadata()), 0.35f);
            }
            ++lllllllllllllIIlllIIIlllIllIlIIl;
        }
        this.addSmeltingRecipeForBlock(Blocks.coal_ore, new ItemStack(Items.coal), 0.1f);
        this.addSmeltingRecipeForBlock(Blocks.redstone_ore, new ItemStack(Items.redstone), 0.7f);
        this.addSmeltingRecipeForBlock(Blocks.lapis_ore, new ItemStack(Items.dye, FurnaceRecipes.lIIlIIIlllIlll[0], EnumDyeColor.BLUE.getDyeDamage()), 0.2f);
        this.addSmeltingRecipeForBlock(Blocks.quartz_ore, new ItemStack(Items.quartz), 0.2f);
    }
    
    private static boolean llIIlIlllIlIlII(final int lllllllllllllIIlllIIIlllIIIIllIl) {
        return lllllllllllllIIlllIIIlllIIIIllIl == 0;
    }
    
    static {
        llIIlIlllIlIIIl();
        smeltingBase = new FurnaceRecipes();
    }
    
    private boolean compareItemStacks(final ItemStack lllllllllllllIIlllIIIlllIIlIlllI, final ItemStack lllllllllllllIIlllIIIlllIIlIlIll) {
        if (llIIlIlllIlIlIl(lllllllllllllIIlllIIIlllIIlIlIll.getItem(), lllllllllllllIIlllIIIlllIIlIlllI.getItem()) && (!llIIlIlllIlIllI(lllllllllllllIIlllIIIlllIIlIlIll.getMetadata(), FurnaceRecipes.lIIlIIIlllIlll[2]) || llIIlIlllIlIlll(lllllllllllllIIlllIIIlllIIlIlIll.getMetadata(), lllllllllllllIIlllIIIlllIIlIlllI.getMetadata()))) {
            return FurnaceRecipes.lIIlIIIlllIlll[0] != 0;
        }
        return FurnaceRecipes.lIIlIIIlllIlll[1] != 0;
    }
    
    public void addSmeltingRecipe(final ItemStack lllllllllllllIIlllIIIlllIlIIlIII, final ItemStack lllllllllllllIIlllIIIlllIlIIIlll, final float lllllllllllllIIlllIIIlllIlIIIllI) {
        this.smeltingList.put(lllllllllllllIIlllIIIlllIlIIlIII, lllllllllllllIIlllIIIlllIlIIIlll);
        "".length();
        this.experienceList.put(lllllllllllllIIlllIIIlllIlIIIlll, lllllllllllllIIlllIIIlllIlIIIllI);
        "".length();
    }
    
    private static boolean llIIlIlllIlIlIl(final Object lllllllllllllIIlllIIIlllIIIlIIlI, final Object lllllllllllllIIlllIIIlllIIIlIIIl) {
        return lllllllllllllIIlllIIIlllIIIlIIlI == lllllllllllllIIlllIIIlllIIIlIIIl;
    }
    
    public float getSmeltingExperience(final ItemStack lllllllllllllIIlllIIIlllIIIlllll) {
        final float lllllllllllllIIlllIIIlllIIIlllIl = (float)this.experienceList.entrySet().iterator();
        "".length();
        if ("  ".length() == "   ".length()) {
            return 0.0f;
        }
        while (!llIIlIlllIlIlII(((Iterator)lllllllllllllIIlllIIIlllIIIlllIl).hasNext() ? 1 : 0)) {
            final Map.Entry<ItemStack, Float> lllllllllllllIIlllIIIlllIIlIIIIl = ((Iterator<Map.Entry<ItemStack, Float>>)lllllllllllllIIlllIIIlllIIIlllIl).next();
            if (llIIlIlllIlIIlI(this.compareItemStacks(lllllllllllllIIlllIIIlllIIIlllll, lllllllllllllIIlllIIIlllIIlIIIIl.getKey()) ? 1 : 0)) {
                return lllllllllllllIIlllIIIlllIIlIIIIl.getValue();
            }
        }
        return 0.0f;
    }
}
