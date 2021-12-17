// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemSoup extends ItemFood
{
    private static final /* synthetic */ int[] llIlIllIlIlllI;
    
    @Override
    public ItemStack onItemUseFinish(final ItemStack llllllllllllIllIlIIlIllIIIllllII, final World llllllllllllIllIlIIlIllIIIlllIll, final EntityPlayer llllllllllllIllIlIIlIllIIIlllIlI) {
        super.onItemUseFinish(llllllllllllIllIlIIlIllIIIllllII, llllllllllllIllIlIIlIllIIIlllIll, llllllllllllIllIlIIlIllIIIlllIlI);
        "".length();
        return new ItemStack(Items.bowl);
    }
    
    private static void lIIlIlIlIlIllllI() {
        (llIlIllIlIlllI = new int[2])[0] = ((0x54 ^ 0x12) & ~(0x80 ^ 0xC6));
        ItemSoup.llIlIllIlIlllI[1] = " ".length();
    }
    
    public ItemSoup(final int llllllllllllIllIlIIlIllIIlIIIIlI) {
        super(llllllllllllIllIlIIlIllIIlIIIIlI, (boolean)(ItemSoup.llIlIllIlIlllI[0] != 0));
        this.setMaxStackSize(ItemSoup.llIlIllIlIlllI[1]);
        "".length();
    }
    
    static {
        lIIlIlIlIlIllllI();
    }
}
