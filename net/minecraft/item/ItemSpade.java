// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import com.google.common.collect.Sets;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import java.util.Set;

public class ItemSpade extends ItemTool
{
    private static final /* synthetic */ int[] lIlllllIllIlll;
    private static final /* synthetic */ Set<Block> EFFECTIVE_ON;
    
    private static void lIIIIlIllIIlIIlI() {
        (lIlllllIllIlll = new int[11])[0] = (0xC ^ 0x6);
        ItemSpade.lIlllllIllIlll[1] = ((104 + 152 - 198 + 172 ^ 189 + 4 - 143 + 146) & (54 + 93 - 23 + 40 ^ 11 + 7 - 15 + 131 ^ -" ".length()));
        ItemSpade.lIlllllIllIlll[2] = " ".length();
        ItemSpade.lIlllllIllIlll[3] = "  ".length();
        ItemSpade.lIlllllIllIlll[4] = "   ".length();
        ItemSpade.lIlllllIllIlll[5] = (0x50 ^ 0x63 ^ (0x12 ^ 0x25));
        ItemSpade.lIlllllIllIlll[6] = (0x62 ^ 0x67);
        ItemSpade.lIlllllIllIlll[7] = (0xAF ^ 0x9F ^ (0x3F ^ 0x9));
        ItemSpade.lIlllllIllIlll[8] = (0xAB ^ 0xAC);
        ItemSpade.lIlllllIllIlll[9] = (0x6D ^ 0x65);
        ItemSpade.lIlllllIllIlll[10] = (0xB7 ^ 0xBE);
    }
    
    public ItemSpade(final ToolMaterial llllllllllllIllllIIlIlllIlllIlIl) {
        super(1.0f, llllllllllllIllllIIlIlllIlllIlIl, ItemSpade.EFFECTIVE_ON);
    }
    
    static {
        lIIIIlIllIIlIIlI();
        final Block[] array = new Block[ItemSpade.lIlllllIllIlll[0]];
        array[ItemSpade.lIlllllIllIlll[1]] = Blocks.clay;
        array[ItemSpade.lIlllllIllIlll[2]] = Blocks.dirt;
        array[ItemSpade.lIlllllIllIlll[3]] = Blocks.farmland;
        array[ItemSpade.lIlllllIllIlll[4]] = Blocks.grass;
        array[ItemSpade.lIlllllIllIlll[5]] = Blocks.gravel;
        array[ItemSpade.lIlllllIllIlll[6]] = Blocks.mycelium;
        array[ItemSpade.lIlllllIllIlll[7]] = Blocks.sand;
        array[ItemSpade.lIlllllIllIlll[8]] = Blocks.snow;
        array[ItemSpade.lIlllllIllIlll[9]] = Blocks.snow_layer;
        array[ItemSpade.lIlllllIllIlll[10]] = Blocks.soul_sand;
        EFFECTIVE_ON = Sets.newHashSet((Object[])array);
    }
    
    @Override
    public boolean canHarvestBlock(final Block llllllllllllIllllIIlIlllIllIllll) {
        int n;
        if (lIIIIlIllIIlIIll(llllllllllllIllllIIlIlllIllIllll, Blocks.snow_layer)) {
            n = ItemSpade.lIlllllIllIlll[2];
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) >= "   ".length()) {
                return ((0x11 ^ 0x50 ^ (0x70 ^ 0x3F)) & (0x7D ^ 0x4C ^ (0xBF ^ 0x80) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIIlIllIIlIIll(llllllllllllIllllIIlIlllIllIllll, Blocks.snow)) {
            n = ItemSpade.lIlllllIllIlll[2];
            "".length();
            if (((0x91 ^ 0x88) & ~(0x7E ^ 0x67)) != 0x0) {
                return ((0x2C ^ 0x7E) & ~(0x6E ^ 0x3C)) != 0x0;
            }
        }
        else {
            n = ItemSpade.lIlllllIllIlll[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIIlIllIIlIIll(final Object llllllllllllIllllIIlIlllIllIllII, final Object llllllllllllIllllIIlIlllIllIlIll) {
        return llllllllllllIllllIIlIlllIllIllII == llllllllllllIllllIIlIlllIllIlIll;
    }
}
