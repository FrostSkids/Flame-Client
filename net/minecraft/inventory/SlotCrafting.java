// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.item.ItemSword;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class SlotCrafting extends Slot
{
    private final /* synthetic */ InventoryCrafting craftMatrix;
    private final /* synthetic */ EntityPlayer thePlayer;
    private static final /* synthetic */ int[] lIllIIIIIIlIII;
    private /* synthetic */ int amountCrafted;
    
    private static boolean llllIlIlllIllIl(final int lllllllllllllIIIIlIIlIIlIIIIlIll, final int lllllllllllllIIIIlIIlIIlIIIIlIlI) {
        return lllllllllllllIIIIlIIlIIlIIIIlIll == lllllllllllllIIIIlIIlIIlIIIIlIlI;
    }
    
    private static boolean llllIlIlllIlIlI(final int lllllllllllllIIIIlIIlIIIllllIlII) {
        return lllllllllllllIIIIlIIlIIIllllIlII > 0;
    }
    
    private static boolean llllIlIlllIlllI(final Object lllllllllllllIIIIlIIlIIIllllllII) {
        return lllllllllllllIIIIlIIlIIIllllllII != null;
    }
    
    private static boolean llllIlIlllIllII(final Object lllllllllllllIIIIlIIlIIlIIIIIIll, final Object lllllllllllllIIIIlIIlIIlIIIIIIlI) {
        return lllllllllllllIIIIlIIlIIlIIIIIIll != lllllllllllllIIIIlIIlIIlIIIIIIlI;
    }
    
    @Override
    public void onPickupFromSlot(final EntityPlayer lllllllllllllIIIIlIIlIIlIIIlIIll, final ItemStack lllllllllllllIIIIlIIlIIlIIIlIIlI) {
        this.onCrafting(lllllllllllllIIIIlIIlIIlIIIlIIlI);
        final ItemStack[] lllllllllllllIIIIlIIlIIlIIIllIII = CraftingManager.getInstance().func_180303_b(this.craftMatrix, lllllllllllllIIIIlIIlIIlIIIlIIll.worldObj);
        int lllllllllllllIIIIlIIlIIlIIIlIlll = SlotCrafting.lIllIIIIIIlIII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllIlIllllIIIl(lllllllllllllIIIIlIIlIIlIIIlIlll, lllllllllllllIIIIlIIlIIlIIIllIII.length)) {
            final ItemStack lllllllllllllIIIIlIIlIIlIIIlIllI = this.craftMatrix.getStackInSlot(lllllllllllllIIIIlIIlIIlIIIlIlll);
            final ItemStack lllllllllllllIIIIlIIlIIlIIIlIlIl = lllllllllllllIIIIlIIlIIlIIIllIII[lllllllllllllIIIIlIIlIIlIIIlIlll];
            if (llllIlIlllIlllI(lllllllllllllIIIIlIIlIIlIIIlIllI)) {
                this.craftMatrix.decrStackSize(lllllllllllllIIIIlIIlIIlIIIlIlll, SlotCrafting.lIllIIIIIIlIII[1]);
                "".length();
            }
            if (llllIlIlllIlllI(lllllllllllllIIIIlIIlIIlIIIlIlIl)) {
                if (llllIlIlllIllll(this.craftMatrix.getStackInSlot(lllllllllllllIIIIlIIlIIlIIIlIlll))) {
                    this.craftMatrix.setInventorySlotContents(lllllllllllllIIIIlIIlIIlIIIlIlll, lllllllllllllIIIIlIIlIIlIIIlIlIl);
                    "".length();
                    if (((0x14 ^ 0x4) & ~(0x53 ^ 0x43)) >= "  ".length()) {
                        return;
                    }
                }
                else if (llllIlIllllIIII(this.thePlayer.inventory.addItemStackToInventory(lllllllllllllIIIIlIIlIIlIIIlIlIl) ? 1 : 0)) {
                    this.thePlayer.dropPlayerItemWithRandomChoice(lllllllllllllIIIIlIIlIIlIIIlIlIl, (boolean)(SlotCrafting.lIllIIIIIIlIII[0] != 0));
                    "".length();
                }
            }
            ++lllllllllllllIIIIlIIlIIlIIIlIlll;
        }
    }
    
    @Override
    protected void onCrafting(final ItemStack lllllllllllllIIIIlIIlIIlIIlIIlIl) {
        if (llllIlIlllIlIlI(this.amountCrafted)) {
            lllllllllllllIIIIlIIlIIlIIlIIlIl.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.amountCrafted);
        }
        this.amountCrafted = SlotCrafting.lIllIIIIIIlIII[0];
        if (llllIlIlllIlIll(lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem(), Item.getItemFromBlock(Blocks.crafting_table))) {
            this.thePlayer.triggerAchievement(AchievementList.buildWorkBench);
        }
        if (llllIlIlllIlIIl((lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem() instanceof ItemPickaxe) ? 1 : 0)) {
            this.thePlayer.triggerAchievement(AchievementList.buildPickaxe);
        }
        if (llllIlIlllIlIll(lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem(), Item.getItemFromBlock(Blocks.furnace))) {
            this.thePlayer.triggerAchievement(AchievementList.buildFurnace);
        }
        if (llllIlIlllIlIIl((lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem() instanceof ItemHoe) ? 1 : 0)) {
            this.thePlayer.triggerAchievement(AchievementList.buildHoe);
        }
        if (llllIlIlllIlIll(lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem(), Items.bread)) {
            this.thePlayer.triggerAchievement(AchievementList.makeBread);
        }
        if (llllIlIlllIlIll(lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem(), Items.cake)) {
            this.thePlayer.triggerAchievement(AchievementList.bakeCake);
        }
        if (llllIlIlllIlIIl((lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem() instanceof ItemPickaxe) ? 1 : 0) && llllIlIlllIllII(((ItemPickaxe)lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem()).getToolMaterial(), Item.ToolMaterial.WOOD)) {
            this.thePlayer.triggerAchievement(AchievementList.buildBetterPickaxe);
        }
        if (llllIlIlllIlIIl((lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem() instanceof ItemSword) ? 1 : 0)) {
            this.thePlayer.triggerAchievement(AchievementList.buildSword);
        }
        if (llllIlIlllIlIll(lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem(), Item.getItemFromBlock(Blocks.enchanting_table))) {
            this.thePlayer.triggerAchievement(AchievementList.enchantments);
        }
        if (llllIlIlllIlIll(lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem(), Item.getItemFromBlock(Blocks.bookshelf))) {
            this.thePlayer.triggerAchievement(AchievementList.bookcase);
        }
        if (llllIlIlllIlIll(lllllllllllllIIIIlIIlIIlIIlIIlIl.getItem(), Items.golden_apple) && llllIlIlllIllIl(lllllllllllllIIIIlIIlIIlIIlIIlIl.getMetadata(), SlotCrafting.lIllIIIIIIlIII[1])) {
            this.thePlayer.triggerAchievement(AchievementList.overpowered);
        }
    }
    
    @Override
    protected void onCrafting(final ItemStack lllllllllllllIIIIlIIlIIlIIlIllIl, final int lllllllllllllIIIIlIIlIIlIIlIllII) {
        this.amountCrafted += lllllllllllllIIIIlIIlIIlIIlIllII;
        this.onCrafting(lllllllllllllIIIIlIIlIIlIIlIllIl);
    }
    
    static {
        llllIlIlllIlIII();
    }
    
    @Override
    public boolean isItemValid(final ItemStack lllllllllllllIIIIlIIlIIlIIlllIII) {
        return SlotCrafting.lIllIIIIIIlIII[0] != 0;
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIIIIlIIlIIlIIllIlII) {
        if (llllIlIlllIlIIl(this.getHasStack() ? 1 : 0)) {
            this.amountCrafted += Math.min(lllllllllllllIIIIlIIlIIlIIllIlII, this.getStack().stackSize);
        }
        return super.decrStackSize(lllllllllllllIIIIlIIlIIlIIllIlII);
    }
    
    public SlotCrafting(final EntityPlayer lllllllllllllIIIIlIIlIIlIIllllll, final InventoryCrafting lllllllllllllIIIIlIIlIIlIlIIIlIl, final IInventory lllllllllllllIIIIlIIlIIlIlIIIlII, final int lllllllllllllIIIIlIIlIIlIlIIIIll, final int lllllllllllllIIIIlIIlIIlIIlllIll, final int lllllllllllllIIIIlIIlIIlIIlllIlI) {
        super(lllllllllllllIIIIlIIlIIlIlIIIlII, lllllllllllllIIIIlIIlIIlIlIIIIll, lllllllllllllIIIIlIIlIIlIIlllIll, lllllllllllllIIIIlIIlIIlIIlllIlI);
        this.thePlayer = lllllllllllllIIIIlIIlIIlIIllllll;
        this.craftMatrix = lllllllllllllIIIIlIIlIIlIlIIIlIl;
    }
    
    private static boolean llllIlIlllIlIIl(final int lllllllllllllIIIIlIIlIIIlllllIII) {
        return lllllllllllllIIIIlIIlIIIlllllIII != 0;
    }
    
    private static boolean llllIlIllllIIIl(final int lllllllllllllIIIIlIIlIIlIIIIIlll, final int lllllllllllllIIIIlIIlIIlIIIIIllI) {
        return lllllllllllllIIIIlIIlIIlIIIIIlll >= lllllllllllllIIIIlIIlIIlIIIIIllI;
    }
    
    private static boolean llllIlIllllIIII(final int lllllllllllllIIIIlIIlIIIllllIllI) {
        return lllllllllllllIIIIlIIlIIIllllIllI == 0;
    }
    
    private static void llllIlIlllIlIII() {
        (lIllIIIIIIlIII = new int[2])[0] = ((0xE ^ 0x3C ^ (0x24 ^ 0x13)) & (43 + 101 - 48 + 31 ^ (0xD4 ^ 0xAE) ^ -" ".length()));
        SlotCrafting.lIllIIIIIIlIII[1] = " ".length();
    }
    
    private static boolean llllIlIlllIllll(final Object lllllllllllllIIIIlIIlIIIlllllIlI) {
        return lllllllllllllIIIIlIIlIIIlllllIlI == null;
    }
    
    private static boolean llllIlIlllIlIll(final Object lllllllllllllIIIIlIIlIIIllllllll, final Object lllllllllllllIIIIlIIlIIIlllllllI) {
        return lllllllllllllIIIIlIIlIIIllllllll == lllllllllllllIIIIlIIlIIIlllllllI;
    }
}
