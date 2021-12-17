// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.init.Items;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemCarrotOnAStick extends Item
{
    private static final /* synthetic */ int[] lIIlllIIIlllII;
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIlIlIIIlIIlIllIIII, final World lllllllllllllIIlIlIIIlIIlIlIllll, final EntityPlayer lllllllllllllIIlIlIIIlIIlIlIlllI) {
        if (llIllIlIllIIlll(lllllllllllllIIlIlIIIlIIlIlIlllI.isRiding() ? 1 : 0) && llIllIlIllIIlll((lllllllllllllIIlIlIIIlIIlIlIlllI.ridingEntity instanceof EntityPig) ? 1 : 0)) {
            final EntityPig lllllllllllllIIlIlIIIlIIlIlIllIl = (EntityPig)lllllllllllllIIlIlIIIlIIlIlIlllI.ridingEntity;
            if (llIllIlIllIIlll(lllllllllllllIIlIlIIIlIIlIlIllIl.getAIControlledByPlayer().isControlledByPlayer() ? 1 : 0) && llIllIlIllIlIII(lllllllllllllIIlIlIIIlIIlIllIIII.getMaxDamage() - lllllllllllllIIlIlIIIlIIlIllIIII.getMetadata(), ItemCarrotOnAStick.lIIlllIIIlllII[2])) {
                lllllllllllllIIlIlIIIlIIlIlIllIl.getAIControlledByPlayer().boostSpeed();
                lllllllllllllIIlIlIIIlIIlIllIIII.damageItem(ItemCarrotOnAStick.lIIlllIIIlllII[2], lllllllllllllIIlIlIIIlIIlIlIlllI);
                if (llIllIlIllIlIIl(lllllllllllllIIlIlIIIlIIlIllIIII.stackSize)) {
                    final ItemStack lllllllllllllIIlIlIIIlIIlIlIllII = new ItemStack(Items.fishing_rod);
                    lllllllllllllIIlIlIIIlIIlIlIllII.setTagCompound(lllllllllllllIIlIlIIIlIIlIllIIII.getTagCompound());
                    return lllllllllllllIIlIlIIIlIIlIlIllII;
                }
            }
        }
        lllllllllllllIIlIlIIIlIIlIlIlllI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return lllllllllllllIIlIlIIIlIIlIllIIII;
    }
    
    private static boolean llIllIlIllIIlll(final int lllllllllllllIIlIlIIIlIIlIlIIIIl) {
        return lllllllllllllIIlIlIIIlIIlIlIIIIl != 0;
    }
    
    public ItemCarrotOnAStick() {
        this.setCreativeTab(CreativeTabs.tabTransport);
        "".length();
        this.setMaxStackSize(ItemCarrotOnAStick.lIIlllIIIlllII[0]);
        "".length();
        this.setMaxDamage(ItemCarrotOnAStick.lIIlllIIIlllII[1]);
        "".length();
    }
    
    private static boolean llIllIlIllIlIIl(final int lllllllllllllIIlIlIIIlIIlIIlllll) {
        return lllllllllllllIIlIlIIIlIIlIIlllll == 0;
    }
    
    @Override
    public boolean shouldRotateAroundWhenRendering() {
        return ItemCarrotOnAStick.lIIlllIIIlllII[0] != 0;
    }
    
    @Override
    public boolean isFull3D() {
        return ItemCarrotOnAStick.lIIlllIIIlllII[0] != 0;
    }
    
    private static boolean llIllIlIllIlIII(final int lllllllllllllIIlIlIIIlIIlIlIIlII, final int lllllllllllllIIlIlIIIlIIlIlIIIll) {
        return lllllllllllllIIlIlIIIlIIlIlIIlII >= lllllllllllllIIlIlIIIlIIlIlIIIll;
    }
    
    private static void llIllIlIllIIllI() {
        (lIIlllIIIlllII = new int[3])[0] = " ".length();
        ItemCarrotOnAStick.lIIlllIIIlllII[1] = (22 + 196 - 141 + 143 ^ 127 + 86 - 41 + 25);
        ItemCarrotOnAStick.lIIlllIIIlllII[2] = (0x61 ^ 0x66);
    }
    
    static {
        llIllIlIllIIllI();
    }
}
