// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import java.util.List;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Container;
import net.minecraft.client.Minecraft;
import net.minecraft.inventory.ICrafting;

public class CreativeCrafting implements ICrafting
{
    private final /* synthetic */ Minecraft mc;
    
    @Override
    public void sendSlotContents(final Container lllllllllllllIlIIIlIlIlIlIllIIIl, final int lllllllllllllIlIIIlIlIlIlIllIIII, final ItemStack lllllllllllllIlIIIlIlIlIlIlIllII) {
        this.mc.playerController.sendSlotPacket(lllllllllllllIlIIIlIlIlIlIlIllII, lllllllllllllIlIIIlIlIlIlIllIIII);
    }
    
    public CreativeCrafting(final Minecraft lllllllllllllIlIIIlIlIlIlIlllIIl) {
        this.mc = lllllllllllllIlIIIlIlIlIlIlllIIl;
    }
    
    @Override
    public void sendProgressBarUpdate(final Container lllllllllllllIlIIIlIlIlIlIlIlIlI, final int lllllllllllllIlIIIlIlIlIlIlIlIIl, final int lllllllllllllIlIIIlIlIlIlIlIlIII) {
    }
    
    @Override
    public void func_175173_a(final Container lllllllllllllIlIIIlIlIlIlIlIIllI, final IInventory lllllllllllllIlIIIlIlIlIlIlIIlIl) {
    }
    
    @Override
    public void updateCraftingInventory(final Container lllllllllllllIlIIIlIlIlIlIllIlll, final List<ItemStack> lllllllllllllIlIIIlIlIlIlIllIllI) {
    }
}
