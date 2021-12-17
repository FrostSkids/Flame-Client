// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemAppleGold extends ItemFood
{
    private static final /* synthetic */ int[] llIlIlllIlllII;
    
    @Override
    public boolean hasEffect(final ItemStack llllllllllllIllIlIIIllllIIIllllI) {
        if (lIIlIlIlllIlIIlI(llllllllllllIllIlIIIllllIIIllllI.getMetadata())) {
            return ItemAppleGold.llIlIlllIlllII[0] != 0;
        }
        return ItemAppleGold.llIlIlllIlllII[1] != 0;
    }
    
    private static boolean lIIlIlIlllIlIIll(final int llllllllllllIllIlIIIllllIIIIIIll) {
        return llllllllllllIllIlIIIllllIIIIIIll == 0;
    }
    
    private static void lIIlIlIlllIlIIIl() {
        (llIlIlllIlllII = new int[6])[0] = " ".length();
        ItemAppleGold.llIlIlllIlllII[1] = ((0x4 ^ 0x43) & ~(0x3F ^ 0x78));
        ItemAppleGold.llIlIlllIlllII[2] = (-(0xFFFFFF03 & 0x52FD) & (0xFFFFDBEC & 0x7F73));
        ItemAppleGold.llIlIlllIlllII[3] = (0xFFFF93FD & 0x6E5A);
        ItemAppleGold.llIlIlllIlllII[4] = (0x56 ^ 0x76 ^ (0x61 ^ 0x45));
        ItemAppleGold.llIlIlllIlllII[5] = (-(0xFFFFD5E5 & 0x6A1E) & (0xFFFFDFF3 & 0x777F));
    }
    
    private static boolean lIIlIlIlllIlIIlI(final int llllllllllllIllIlIIIllllIIIIIIIl) {
        return llllllllllllIllIlIIIllllIIIIIIIl > 0;
    }
    
    @Override
    protected void onFoodEaten(final ItemStack llllllllllllIllIlIIIllllIIIIllll, final World llllllllllllIllIlIIIllllIIIlIIlI, final EntityPlayer llllllllllllIllIlIIIllllIIIlIIIl) {
        if (lIIlIlIlllIlIIll(llllllllllllIllIlIIIllllIIIlIIlI.isRemote ? 1 : 0)) {
            llllllllllllIllIlIIIllllIIIlIIIl.addPotionEffect(new PotionEffect(Potion.absorption.id, ItemAppleGold.llIlIlllIlllII[2], ItemAppleGold.llIlIlllIlllII[1]));
        }
        if (lIIlIlIlllIlIIlI(llllllllllllIllIlIIIllllIIIIllll.getMetadata())) {
            if (lIIlIlIlllIlIIll(llllllllllllIllIlIIIllllIIIlIIlI.isRemote ? 1 : 0)) {
                llllllllllllIllIlIIIllllIIIlIIIl.addPotionEffect(new PotionEffect(Potion.regeneration.id, ItemAppleGold.llIlIlllIlllII[3], ItemAppleGold.llIlIlllIlllII[4]));
                llllllllllllIllIlIIIllllIIIlIIIl.addPotionEffect(new PotionEffect(Potion.resistance.id, ItemAppleGold.llIlIlllIlllII[5], ItemAppleGold.llIlIlllIlllII[1]));
                llllllllllllIllIlIIIllllIIIlIIIl.addPotionEffect(new PotionEffect(Potion.fireResistance.id, ItemAppleGold.llIlIlllIlllII[5], ItemAppleGold.llIlIlllIlllII[1]));
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
        }
        else {
            super.onFoodEaten(llllllllllllIllIlIIIllllIIIIllll, llllllllllllIllIlIIIllllIIIlIIlI, llllllllllllIllIlIIIllllIIIlIIIl);
        }
    }
    
    @Override
    public EnumRarity getRarity(final ItemStack llllllllllllIllIlIIIllllIIIllIIl) {
        EnumRarity enumRarity;
        if (lIIlIlIlllIlIIll(llllllllllllIllIlIIIllllIIIllIIl.getMetadata())) {
            enumRarity = EnumRarity.RARE;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            enumRarity = EnumRarity.EPIC;
        }
        return enumRarity;
    }
    
    public ItemAppleGold(final int llllllllllllIllIlIIIllllIIlIIIll, final float llllllllllllIllIlIIIllllIIlIIIlI, final boolean llllllllllllIllIlIIIllllIIlIIlIl) {
        super(llllllllllllIllIlIIIllllIIlIIIll, llllllllllllIllIlIIIllllIIlIIIlI, llllllllllllIllIlIIIllllIIlIIlIl);
        this.setHasSubtypes((boolean)(ItemAppleGold.llIlIlllIlllII[0] != 0));
        "".length();
    }
    
    @Override
    public void getSubItems(final Item llllllllllllIllIlIIIllllIIIIIllI, final CreativeTabs llllllllllllIllIlIIIllllIIIIlIII, final List<ItemStack> llllllllllllIllIlIIIllllIIIIIlIl) {
        llllllllllllIllIlIIIllllIIIIIlIl.add(new ItemStack(llllllllllllIllIlIIIllllIIIIIllI, ItemAppleGold.llIlIlllIlllII[0], ItemAppleGold.llIlIlllIlllII[1]));
        "".length();
        llllllllllllIllIlIIIllllIIIIIlIl.add(new ItemStack(llllllllllllIllIlIIIllllIIIIIllI, ItemAppleGold.llIlIlllIlllII[0], ItemAppleGold.llIlIlllIlllII[0]));
        "".length();
    }
    
    static {
        lIIlIlIlllIlIIIl();
    }
}
