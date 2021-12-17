// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;

public class ItemSeeds extends Item
{
    private /* synthetic */ Block soilBlockID;
    private static final /* synthetic */ int[] llIIIIllllIIIl;
    private /* synthetic */ Block crops;
    
    private static boolean lIIIlIIIIllllIll(final int llllllllllllIlllIllIIllIlIIIlllI) {
        return llllllllllllIlllIllIIllIlIIIlllI == 0;
    }
    
    public ItemSeeds(final Block llllllllllllIlllIllIIllIlIllIIll, final Block llllllllllllIlllIllIIllIlIlIllll) {
        this.crops = llllllllllllIlllIllIIllIlIllIIll;
        this.soilBlockID = llllllllllllIlllIllIIllIlIlIllll;
        this.setCreativeTab(CreativeTabs.tabMaterials);
        "".length();
    }
    
    private static boolean lIIIlIIIIlllllII(final Object llllllllllllIlllIllIIllIlIIlIIll, final Object llllllllllllIlllIllIIllIlIIlIIlI) {
        return llllllllllllIlllIllIIllIlIIlIIll == llllllllllllIlllIllIIllIlIIlIIlI;
    }
    
    static {
        lIIIlIIIIllllIIl();
    }
    
    private static boolean lIIIlIIIIllllIlI(final Object llllllllllllIlllIllIIllIlIIlIlll, final Object llllllllllllIlllIllIIllIlIIlIllI) {
        return llllllllllllIlllIllIIllIlIIlIlll != llllllllllllIlllIllIIllIlIIlIllI;
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIlllIllIIllIlIlIIlll, final EntityPlayer llllllllllllIlllIllIIllIlIlIIllI, final World llllllllllllIlllIllIIllIlIlIIlIl, final BlockPos llllllllllllIlllIllIIllIlIIllIll, final EnumFacing llllllllllllIlllIllIIllIlIIllIlI, final float llllllllllllIlllIllIIllIlIlIIIlI, final float llllllllllllIlllIllIIllIlIlIIIIl, final float llllllllllllIlllIllIIllIlIlIIIII) {
        if (lIIIlIIIIllllIlI(llllllllllllIlllIllIIllIlIIllIlI, EnumFacing.UP)) {
            return ItemSeeds.llIIIIllllIIIl[0] != 0;
        }
        if (lIIIlIIIIllllIll(llllllllllllIlllIllIIllIlIlIIllI.canPlayerEdit(llllllllllllIlllIllIIllIlIIllIll.offset(llllllllllllIlllIllIIllIlIIllIlI), llllllllllllIlllIllIIllIlIIllIlI, llllllllllllIlllIllIIllIlIlIIlll) ? 1 : 0)) {
            return ItemSeeds.llIIIIllllIIIl[0] != 0;
        }
        if (lIIIlIIIIlllllII(llllllllllllIlllIllIIllIlIlIIlIl.getBlockState(llllllllllllIlllIllIIllIlIIllIll).getBlock(), this.soilBlockID) && lIIIlIIIIlllllIl(llllllllllllIlllIllIIllIlIlIIlIl.isAirBlock(llllllllllllIlllIllIIllIlIIllIll.up()) ? 1 : 0)) {
            llllllllllllIlllIllIIllIlIlIIlIl.setBlockState(llllllllllllIlllIllIIllIlIIllIll.up(), this.crops.getDefaultState());
            "".length();
            llllllllllllIlllIllIIllIlIlIIlll.stackSize -= ItemSeeds.llIIIIllllIIIl[1];
            return ItemSeeds.llIIIIllllIIIl[1] != 0;
        }
        return ItemSeeds.llIIIIllllIIIl[0] != 0;
    }
    
    private static boolean lIIIlIIIIlllllIl(final int llllllllllllIlllIllIIllIlIIlIIII) {
        return llllllllllllIlllIllIIllIlIIlIIII != 0;
    }
    
    private static void lIIIlIIIIllllIIl() {
        (llIIIIllllIIIl = new int[2])[0] = ((0x7D ^ 0x3C ^ 13 + 62 - 66 + 118) & (0x88 ^ 0x95 ^ (0x50 ^ 0x73) ^ -" ".length()));
        ItemSeeds.llIIIIllllIIIl[1] = " ".length();
    }
}
