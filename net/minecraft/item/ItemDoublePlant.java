// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.world.ColorizerGrass;
import net.minecraft.block.BlockDoublePlant;
import com.google.common.base.Function;
import net.minecraft.block.Block;

public class ItemDoublePlant extends ItemMultiTexture
{
    public ItemDoublePlant(final Block lllllllllllllIIIIlllIlIllllIlIll, final Block lllllllllllllIIIIlllIlIllllIlIlI, final Function<ItemStack, String> lllllllllllllIIIIlllIlIllllIlIIl) {
        super(lllllllllllllIIIIlllIlIllllIlIll, lllllllllllllIIIIlllIlIllllIlIlI, lllllllllllllIIIIlllIlIllllIlIIl);
    }
    
    private static boolean llllIIIIIlIllll(final Object lllllllllllllIIIIlllIlIlllIlIllI, final Object lllllllllllllIIIIlllIlIlllIlIlIl) {
        return lllllllllllllIIIIlllIlIlllIlIllI != lllllllllllllIIIIlllIlIlllIlIlIl;
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack lllllllllllllIIIIlllIlIlllIllIll, final int lllllllllllllIIIIlllIlIlllIllIlI) {
        final BlockDoublePlant.EnumPlantType lllllllllllllIIIIlllIlIlllIlllIl = BlockDoublePlant.EnumPlantType.byMetadata(lllllllllllllIIIIlllIlIlllIllIll.getMetadata());
        int n;
        if (llllIIIIIlIllll(lllllllllllllIIIIlllIlIlllIlllIl, BlockDoublePlant.EnumPlantType.GRASS) && llllIIIIIlIllll(lllllllllllllIIIIlllIlIlllIlllIl, BlockDoublePlant.EnumPlantType.FERN)) {
            n = super.getColorFromItemStack(lllllllllllllIIIIlllIlIlllIllIll, lllllllllllllIIIIlllIlIlllIllIlI);
            "".length();
            if (null != null) {
                return (0x60 ^ 0x48 ^ (0x21 ^ 0x7)) & (0x60 ^ 0xE ^ (0x20 ^ 0x40) ^ -" ".length());
            }
        }
        else {
            n = ColorizerGrass.getGrassColor(0.5, 1.0);
        }
        return n;
    }
}
