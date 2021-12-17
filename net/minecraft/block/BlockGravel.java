// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public class BlockGravel extends BlockFalling
{
    private static final /* synthetic */ int[] llIIlIlIIlIIll;
    
    static {
        lIIIllIIlllIlllI();
    }
    
    private static boolean lIIIllIIllllIIII(final int llllllllllllIlllIIIlllllIIllIlII) {
        return llllllllllllIlllIIIlllllIIllIlII == 0;
    }
    
    private static boolean lIIIllIIlllIllll(final int llllllllllllIlllIIIlllllIIllIlll, final int llllllllllllIlllIIIlllllIIllIllI) {
        return llllllllllllIlllIIIlllllIIllIlll > llllllllllllIlllIIIlllllIIllIllI;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlllIIIlllllIlIIIIIl, final Random llllllllllllIlllIIIlllllIIllllIl, int llllllllllllIlllIIIlllllIIllllII) {
        if (lIIIllIIlllIllll(llllllllllllIlllIIIlllllIIllllII, BlockGravel.llIIlIlIIlIIll[0])) {
            llllllllllllIlllIIIlllllIIllllII = BlockGravel.llIIlIlIIlIIll[0];
        }
        Item item;
        if (lIIIllIIllllIIII(llllllllllllIlllIIIlllllIIllllIl.nextInt(BlockGravel.llIIlIlIIlIIll[1] - llllllllllllIlllIIIlllllIIllllII * BlockGravel.llIIlIlIIlIIll[0]))) {
            item = Items.flint;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            item = Item.getItemFromBlock(this);
        }
        return item;
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIlllIIIlllllIIlllIlI) {
        return MapColor.stoneColor;
    }
    
    private static void lIIIllIIlllIlllI() {
        (llIIlIlIIlIIll = new int[2])[0] = "   ".length();
        BlockGravel.llIIlIlIIlIIll[1] = (0x95 ^ 0x9F);
    }
}
