// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class ItemNameTag extends Item
{
    private static final /* synthetic */ int[] lllIllIIlIIlIl;
    
    private static boolean lIlIIlIIIlIlllll(final int llllllllllllIlIllIIllIIllIIIIIII) {
        return llllllllllllIlIllIIllIIllIIIIIII == 0;
    }
    
    @Override
    public boolean itemInteractionForEntity(final ItemStack llllllllllllIlIllIIllIIllIIIllII, final EntityPlayer llllllllllllIlIllIIllIIllIIIIllI, final EntityLivingBase llllllllllllIlIllIIllIIllIIIIlIl) {
        if (lIlIIlIIIlIlllll(llllllllllllIlIllIIllIIllIIIllII.hasDisplayName() ? 1 : 0)) {
            return ItemNameTag.lllIllIIlIIlIl[0] != 0;
        }
        if (lIlIIlIIIllIIIII((llllllllllllIlIllIIllIIllIIIIlIl instanceof EntityLiving) ? 1 : 0)) {
            final EntityLiving llllllllllllIlIllIIllIIllIIIlIIl = (EntityLiving)llllllllllllIlIllIIllIIllIIIIlIl;
            llllllllllllIlIllIIllIIllIIIlIIl.setCustomNameTag(llllllllllllIlIllIIllIIllIIIllII.getDisplayName());
            llllllllllllIlIllIIllIIllIIIlIIl.enablePersistence();
            llllllllllllIlIllIIllIIllIIIllII.stackSize -= ItemNameTag.lllIllIIlIIlIl[1];
            return ItemNameTag.lllIllIIlIIlIl[1] != 0;
        }
        return super.itemInteractionForEntity(llllllllllllIlIllIIllIIllIIIllII, llllllllllllIlIllIIllIIllIIIIllI, llllllllllllIlIllIIllIIllIIIIlIl);
    }
    
    public ItemNameTag() {
        this.setCreativeTab(CreativeTabs.tabTools);
        "".length();
    }
    
    private static void lIlIIlIIIlIllllI() {
        (lllIllIIlIIlIl = new int[2])[0] = ((0x46 ^ 0x1B) & ~(0x7 ^ 0x5A));
        ItemNameTag.lllIllIIlIIlIl[1] = " ".length();
    }
    
    private static boolean lIlIIlIIIllIIIII(final int llllllllllllIlIllIIllIIllIIIIIlI) {
        return llllllllllllIlIllIIllIIllIIIIIlI != 0;
    }
    
    static {
        lIlIIlIIIlIllllI();
    }
}
