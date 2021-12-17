// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.item.ItemStack;

public class SlotFurnaceFuel extends Slot
{
    private static final /* synthetic */ int[] lIlllIIIIlIIII;
    
    @Override
    public int getItemStackLimit(final ItemStack llllllllllllIlllllIllllIllIllllI) {
        int itemStackLimit;
        if (lIIIIIIIlllIIIlI(isBucket(llllllllllllIlllllIllllIllIllllI) ? 1 : 0)) {
            itemStackLimit = SlotFurnaceFuel.lIlllIIIIlIIII[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return (0x95 ^ 0xA6) & ~(0xA2 ^ 0x91);
            }
        }
        else {
            itemStackLimit = super.getItemStackLimit(llllllllllllIlllllIllllIllIllllI);
        }
        return itemStackLimit;
    }
    
    private static boolean lIIIIIIIlllIIlII(final Object llllllllllllIlllllIllllIllIlIllI, final Object llllllllllllIlllllIllllIllIlIlIl) {
        return llllllllllllIlllllIllllIllIlIllI == llllllllllllIlllllIllllIllIlIlIl;
    }
    
    private static void lIIIIIIIlllIIIII() {
        (lIlllIIIIlIIII = new int[2])[0] = ((0x7 ^ 0x70 ^ (0xBD ^ 0x8B)) & (0x81 ^ 0x89 ^ (0x72 ^ 0x3B) ^ -" ".length()));
        SlotFurnaceFuel.lIlllIIIIlIIII[1] = " ".length();
    }
    
    @Override
    public boolean isItemValid(final ItemStack llllllllllllIlllllIllllIlllIIlIl) {
        if (lIIIIIIIlllIIIIl(TileEntityFurnace.isItemFuel(llllllllllllIlllllIllllIlllIIlIl) ? 1 : 0) && lIIIIIIIlllIIIIl(isBucket(llllllllllllIlllllIllllIlllIIlIl) ? 1 : 0)) {
            return SlotFurnaceFuel.lIlllIIIIlIIII[0] != 0;
        }
        return SlotFurnaceFuel.lIlllIIIIlIIII[1] != 0;
    }
    
    public static boolean isBucket(final ItemStack llllllllllllIlllllIllllIllIlllII) {
        if (lIIIIIIIlllIIIll(llllllllllllIlllllIllllIllIlllII) && lIIIIIIIlllIIIll(llllllllllllIlllllIllllIllIlllII.getItem()) && lIIIIIIIlllIIlII(llllllllllllIlllllIllllIllIlllII.getItem(), Items.bucket)) {
            return SlotFurnaceFuel.lIlllIIIIlIIII[1] != 0;
        }
        return SlotFurnaceFuel.lIlllIIIIlIIII[0] != 0;
    }
    
    static {
        lIIIIIIIlllIIIII();
    }
    
    public SlotFurnaceFuel(final IInventory llllllllllllIlllllIllllIllllIIII, final int llllllllllllIlllllIllllIlllIlIlI, final int llllllllllllIlllllIllllIlllIlIIl, final int llllllllllllIlllllIllllIlllIllIl) {
        super(llllllllllllIlllllIllllIllllIIII, llllllllllllIlllllIllllIlllIlIlI, llllllllllllIlllllIllllIlllIlIIl, llllllllllllIlllllIllllIlllIllIl);
    }
    
    private static boolean lIIIIIIIlllIIIlI(final int llllllllllllIlllllIllllIllIlIIll) {
        return llllllllllllIlllllIllllIllIlIIll != 0;
    }
    
    private static boolean lIIIIIIIlllIIIIl(final int llllllllllllIlllllIllllIllIlIIIl) {
        return llllllllllllIlllllIllllIllIlIIIl == 0;
    }
    
    private static boolean lIIIIIIIlllIIIll(final Object llllllllllllIlllllIllllIllIllIIl) {
        return llllllllllllIlllllIllllIllIllIIl != null;
    }
}
