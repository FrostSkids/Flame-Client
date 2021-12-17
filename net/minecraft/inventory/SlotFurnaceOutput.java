// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.util.MathHelper;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class SlotFurnaceOutput extends Slot
{
    private /* synthetic */ int field_75228_b;
    private /* synthetic */ EntityPlayer thePlayer;
    private static final /* synthetic */ int[] lllIlIlIIIlllI;
    
    static {
        lIlIIIlIllIIIlIl();
    }
    
    private static void lIlIIIlIllIIIlIl() {
        (lllIlIlIIIlllI = new int[1])[0] = ((0x3B ^ 0x16) & ~(0x99 ^ 0xB4));
    }
    
    @Override
    protected void onCrafting(final ItemStack llllllllllllIlIllIllIllIIIIIlllI) {
        llllllllllllIlIllIllIllIIIIIlllI.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.field_75228_b);
        if (lIlIIIlIllIIlIll(this.thePlayer.worldObj.isRemote ? 1 : 0)) {
            int llllllllllllIlIllIllIllIIIIlIIll = this.field_75228_b;
            final float llllllllllllIlIllIllIllIIIIlIIlI = FurnaceRecipes.instance().getSmeltingExperience(llllllllllllIlIllIllIllIIIIIlllI);
            if (lIlIIIlIllIIlIll(lIlIIIlIllIIlIII(llllllllllllIlIllIllIllIIIIlIIlI, 0.0f))) {
                llllllllllllIlIllIllIllIIIIlIIll = SlotFurnaceOutput.lllIlIlIIIlllI[0];
                "".length();
                if ((0x8F ^ 0x8B) == " ".length()) {
                    return;
                }
            }
            else if (lIlIIIlIllIIllII(lIlIIIlIllIIlIIl(llllllllllllIlIllIllIllIIIIlIIlI, 1.0f))) {
                int llllllllllllIlIllIllIllIIIIlIIIl = MathHelper.floor_float(llllllllllllIlIllIllIllIIIIlIIll * llllllllllllIlIllIllIllIIIIlIIlI);
                if (lIlIIIlIllIIllIl(llllllllllllIlIllIllIllIIIIlIIIl, MathHelper.ceiling_float_int(llllllllllllIlIllIllIllIIIIlIIll * llllllllllllIlIllIllIllIIIIlIIlI)) && lIlIIIlIllIIllII(lIlIIIlIllIIlIlI(Math.random(), llllllllllllIlIllIllIllIIIIlIIll * llllllllllllIlIllIllIllIIIIlIIlI - llllllllllllIlIllIllIllIIIIlIIIl))) {
                    ++llllllllllllIlIllIllIllIIIIlIIIl;
                }
                llllllllllllIlIllIllIllIIIIlIIll = llllllllllllIlIllIllIllIIIIlIIIl;
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            while (!lIlIIIlIllIIlllI(llllllllllllIlIllIllIllIIIIlIIll)) {
                final int llllllllllllIlIllIllIllIIIIlIIII = EntityXPOrb.getXPSplit(llllllllllllIlIllIllIllIIIIlIIll);
                llllllllllllIlIllIllIllIIIIlIIll -= llllllllllllIlIllIllIllIIIIlIIII;
                this.thePlayer.worldObj.spawnEntityInWorld(new EntityXPOrb(this.thePlayer.worldObj, this.thePlayer.posX, this.thePlayer.posY + 0.5, this.thePlayer.posZ + 0.5, llllllllllllIlIllIllIllIIIIlIIII));
                "".length();
            }
        }
        this.field_75228_b = SlotFurnaceOutput.lllIlIlIIIlllI[0];
        if (lIlIIIlIllIIllll(llllllllllllIlIllIllIllIIIIIlllI.getItem(), Items.iron_ingot)) {
            this.thePlayer.triggerAchievement(AchievementList.acquireIron);
        }
        if (lIlIIIlIllIIllll(llllllllllllIlIllIllIllIIIIIlllI.getItem(), Items.cooked_fish)) {
            this.thePlayer.triggerAchievement(AchievementList.cookFish);
        }
    }
    
    private static int lIlIIIlIllIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIIlIllIIllIl(final int llllllllllllIlIllIllIllIIIIIlIII, final int llllllllllllIlIllIllIllIIIIIIlll) {
        return llllllllllllIlIllIllIllIIIIIlIII < llllllllllllIlIllIllIllIIIIIIlll;
    }
    
    @Override
    public ItemStack decrStackSize(final int llllllllllllIlIllIllIllIIIlIllIl) {
        if (lIlIIIlIllIIIlll(this.getHasStack() ? 1 : 0)) {
            this.field_75228_b += Math.min(llllllllllllIlIllIllIllIIIlIllIl, this.getStack().stackSize);
        }
        return super.decrStackSize(llllllllllllIlIllIllIllIIIlIllIl);
    }
    
    private static boolean lIlIIIlIllIIIlll(final int llllllllllllIlIllIllIllIIIIIIIIl) {
        return llllllllllllIlIllIllIllIIIIIIIIl != 0;
    }
    
    private static int lIlIIIlIllIIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlIIIlIllIIlIll(final int llllllllllllIlIllIllIlIlllllllll) {
        return llllllllllllIlIllIllIlIlllllllll == 0;
    }
    
    private static boolean lIlIIIlIllIIllll(final Object llllllllllllIlIllIllIllIIIIIIlII, final Object llllllllllllIlIllIllIllIIIIIIIll) {
        return llllllllllllIlIllIllIllIIIIIIlII == llllllllllllIlIllIllIllIIIIIIIll;
    }
    
    private static boolean lIlIIIlIllIIlllI(final int llllllllllllIlIllIllIlIllllllIll) {
        return llllllllllllIlIllIllIlIllllllIll <= 0;
    }
    
    private static boolean lIlIIIlIllIIllII(final int llllllllllllIlIllIllIlIlllllllIl) {
        return llllllllllllIlIllIllIlIlllllllIl < 0;
    }
    
    @Override
    public boolean isItemValid(final ItemStack llllllllllllIlIllIllIllIIIllIIll) {
        return SlotFurnaceOutput.lllIlIlIIIlllI[0] != 0;
    }
    
    @Override
    protected void onCrafting(final ItemStack llllllllllllIlIllIllIllIIIIlllII, final int llllllllllllIlIllIllIllIIIIllIll) {
        this.field_75228_b += llllllllllllIlIllIllIllIIIIllIll;
        this.onCrafting(llllllllllllIlIllIllIllIIIIlllII);
    }
    
    private static int lIlIIIlIllIIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void onPickupFromSlot(final EntityPlayer llllllllllllIlIllIllIllIIIlIlIII, final ItemStack llllllllllllIlIllIllIllIIIlIIlII) {
        this.onCrafting(llllllllllllIlIllIllIllIIIlIIlII);
        super.onPickupFromSlot(llllllllllllIlIllIllIllIIIlIlIII, llllllllllllIlIllIllIllIIIlIIlII);
    }
    
    public SlotFurnaceOutput(final EntityPlayer llllllllllllIlIllIllIllIIIlllIIl, final IInventory llllllllllllIlIllIllIllIIIlllllI, final int llllllllllllIlIllIllIllIIIllllIl, final int llllllllllllIlIllIllIllIIIllIllI, final int llllllllllllIlIllIllIllIIIlllIll) {
        super(llllllllllllIlIllIllIllIIIlllllI, llllllllllllIlIllIllIllIIIllllIl, llllllllllllIlIllIllIllIIIllIllI, llllllllllllIlIllIllIllIIIlllIll);
        this.thePlayer = llllllllllllIlIllIllIllIIIlllIIl;
    }
}
