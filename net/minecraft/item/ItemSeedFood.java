// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

public class ItemSeedFood extends ItemFood
{
    private static final /* synthetic */ int[] lllIIIIIlllIII;
    private /* synthetic */ Block crops;
    private /* synthetic */ Block soilId;
    
    private static boolean lIIlllIIIlIIllII(final Object llllllllllllIllIIIIllIlIIIlIIllI, final Object llllllllllllIllIIIIllIlIIIlIIlIl) {
        return llllllllllllIllIIIIllIlIIIlIIllI != llllllllllllIllIIIIllIlIIIlIIlIl;
    }
    
    private static void lIIlllIIIlIIlIll() {
        (lllIIIIIlllIII = new int[2])[0] = (("  ".length() ^ (0x2B ^ 0x2D)) & (157 + 117 - 211 + 109 ^ 65 + 130 - 56 + 29 ^ -" ".length()));
        ItemSeedFood.lllIIIIIlllIII[1] = " ".length();
    }
    
    static {
        lIIlllIIIlIIlIll();
    }
    
    private static boolean lIIlllIIIlIIllll(final int llllllllllllIllIIIIllIlIIIIlllIl) {
        return llllllllllllIllIIIIllIlIIIIlllIl != 0;
    }
    
    public ItemSeedFood(final int llllllllllllIllIIIIllIlIIlIIIllI, final float llllllllllllIllIIIIllIlIIlIIIlIl, final Block llllllllllllIllIIIIllIlIIIllllll, final Block llllllllllllIllIIIIllIlIIlIIIIll) {
        super(llllllllllllIllIIIIllIlIIlIIIllI, llllllllllllIllIIIIllIlIIlIIIlIl, (boolean)(ItemSeedFood.lllIIIIIlllIII[0] != 0));
        this.crops = llllllllllllIllIIIIllIlIIIllllll;
        this.soilId = llllllllllllIllIIIIllIlIIlIIIIll;
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIllIIIIllIlIIIlIllIl, final EntityPlayer llllllllllllIllIIIIllIlIIIllIlIl, final World llllllllllllIllIIIIllIlIIIlIlIll, final BlockPos llllllllllllIllIIIIllIlIIIllIIll, final EnumFacing llllllllllllIllIIIIllIlIIIllIIlI, final float llllllllllllIllIIIIllIlIIIllIIIl, final float llllllllllllIllIIIIllIlIIIllIIII, final float llllllllllllIllIIIIllIlIIIlIllll) {
        if (lIIlllIIIlIIllII(llllllllllllIllIIIIllIlIIIllIIlI, EnumFacing.UP)) {
            return ItemSeedFood.lllIIIIIlllIII[0] != 0;
        }
        if (lIIlllIIIlIIllIl(llllllllllllIllIIIIllIlIIIllIlIl.canPlayerEdit(llllllllllllIllIIIIllIlIIIllIIll.offset(llllllllllllIllIIIIllIlIIIllIIlI), llllllllllllIllIIIIllIlIIIllIIlI, llllllllllllIllIIIIllIlIIIlIllIl) ? 1 : 0)) {
            return ItemSeedFood.lllIIIIIlllIII[0] != 0;
        }
        if (lIIlllIIIlIIlllI(llllllllllllIllIIIIllIlIIIlIlIll.getBlockState(llllllllllllIllIIIIllIlIIIllIIll).getBlock(), this.soilId) && lIIlllIIIlIIllll(llllllllllllIllIIIIllIlIIIlIlIll.isAirBlock(llllllllllllIllIIIIllIlIIIllIIll.up()) ? 1 : 0)) {
            llllllllllllIllIIIIllIlIIIlIlIll.setBlockState(llllllllllllIllIIIIllIlIIIllIIll.up(), this.crops.getDefaultState());
            "".length();
            llllllllllllIllIIIIllIlIIIlIllIl.stackSize -= ItemSeedFood.lllIIIIIlllIII[1];
            return ItemSeedFood.lllIIIIIlllIII[1] != 0;
        }
        return ItemSeedFood.lllIIIIIlllIII[0] != 0;
    }
    
    private static boolean lIIlllIIIlIIllIl(final int llllllllllllIllIIIIllIlIIIIllIlI) {
        return llllllllllllIllIIIIllIlIIIIllIlI == 0;
    }
    
    private static boolean lIIlllIIIlIIlllI(final Object llllllllllllIllIIIIllIlIIIlIIIIl, final Object llllllllllllIllIIIIllIlIIIlIIIII) {
        return llllllllllllIllIIIIllIlIIIlIIIIl == llllllllllllIllIIIIllIlIIIlIIIII;
    }
}
