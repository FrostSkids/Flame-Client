// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;

public class ItemShears extends Item
{
    private static final /* synthetic */ int[] lIlllIllllIlII;
    
    static {
        lIIIIIlllIIllIlI();
    }
    
    @Override
    public float getStrVsBlock(final ItemStack llllllllllllIllllIllIlIIIIlIlllI, final Block llllllllllllIllllIllIlIIIIlIlIlI) {
        float strVsBlock;
        if (lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlIlIlI, Blocks.web) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlIlIlI.getMaterial(), Material.leaves)) {
            if (lIIIIIlllIIlllII(llllllllllllIllllIllIlIIIIlIlIlI, Blocks.wool)) {
                strVsBlock = 5.0f;
                "".length();
                if (null != null) {
                    return 0.0f;
                }
            }
            else {
                strVsBlock = super.getStrVsBlock(llllllllllllIllllIllIlIIIIlIlllI, llllllllllllIllllIllIlIIIIlIlIlI);
                "".length();
                if (((0xC6 ^ 0xA5) & ~(0x2E ^ 0x4D)) < 0) {
                    return 0.0f;
                }
            }
        }
        else {
            strVsBlock = 15.0f;
        }
        return strVsBlock;
    }
    
    @Override
    public boolean canHarvestBlock(final Block llllllllllllIllllIllIlIIIIllIlII) {
        if (lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIllIlII, Blocks.web) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIllIlII, Blocks.redstone_wire) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIllIlII, Blocks.tripwire)) {
            return ItemShears.lIlllIllllIlII[2] != 0;
        }
        return ItemShears.lIlllIllllIlII[0] != 0;
    }
    
    private static boolean lIIIIIlllIIlllII(final Object llllllllllllIllllIllIlIIIIlIIIll, final Object llllllllllllIllllIllIlIIIIlIIIlI) {
        return llllllllllllIllllIllIlIIIIlIIIll == llllllllllllIllllIllIlIIIIlIIIlI;
    }
    
    private static void lIIIIIlllIIllIlI() {
        (lIlllIllllIlII = new int[3])[0] = " ".length();
        ItemShears.lIlllIllllIlII[1] = (0x76 ^ 0x49) + (23 + 78 - 92 + 181) - (97 + 99 - 93 + 60) + (79 + 112 - 183 + 140);
        ItemShears.lIlllIllllIlII[2] = ((0x18 ^ 0x11) & ~(0x76 ^ 0x7F));
    }
    
    @Override
    public boolean onBlockDestroyed(final ItemStack llllllllllllIllllIllIlIIIIlllIll, final World llllllllllllIllllIllIlIIIlIIIIII, final Block llllllllllllIllllIllIlIIIIlllIIl, final BlockPos llllllllllllIllllIllIlIIIIlllllI, final EntityLivingBase llllllllllllIllllIllIlIIIIllIlll) {
        if (lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlllIIl.getMaterial(), Material.leaves) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlllIIl, Blocks.web) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlllIIl, Blocks.tallgrass) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlllIIl, Blocks.vine) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlllIIl, Blocks.tripwire) && lIIIIIlllIIllIll(llllllllllllIllllIllIlIIIIlllIIl, Blocks.wool)) {
            return super.onBlockDestroyed(llllllllllllIllllIllIlIIIIlllIll, llllllllllllIllllIllIlIIIlIIIIII, llllllllllllIllllIllIlIIIIlllIIl, llllllllllllIllllIllIlIIIIlllllI, llllllllllllIllllIllIlIIIIllIlll);
        }
        llllllllllllIllllIllIlIIIIlllIll.damageItem(ItemShears.lIlllIllllIlII[0], llllllllllllIllllIllIlIIIIllIlll);
        return ItemShears.lIlllIllllIlII[0] != 0;
    }
    
    private static boolean lIIIIIlllIIllIll(final Object llllllllllllIllllIllIlIIIIlIIlll, final Object llllllllllllIllllIllIlIIIIlIIllI) {
        return llllllllllllIllllIllIlIIIIlIIlll != llllllllllllIllllIllIlIIIIlIIllI;
    }
    
    public ItemShears() {
        this.setMaxStackSize(ItemShears.lIlllIllllIlII[0]);
        "".length();
        this.setMaxDamage(ItemShears.lIlllIllllIlII[1]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabTools);
        "".length();
    }
}
