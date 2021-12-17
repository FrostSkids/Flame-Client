// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.material.Material;
import com.google.common.collect.Sets;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import java.util.Set;

public class ItemAxe extends ItemTool
{
    private static final /* synthetic */ Set<Block> EFFECTIVE_ON;
    private static final /* synthetic */ int[] lIIlIlIlllIlIl;
    
    protected ItemAxe(final ToolMaterial lllllllllllllIIllIIllIIllllIlIll) {
        super(3.0f, lllllllllllllIIllIIllIIllllIlIll, ItemAxe.EFFECTIVE_ON);
    }
    
    static {
        llIlIIIlIllIIIl();
        final Block[] array = new Block[ItemAxe.lIIlIlIlllIlIl[0]];
        array[ItemAxe.lIIlIlIlllIlIl[1]] = Blocks.planks;
        array[ItemAxe.lIIlIlIlllIlIl[2]] = Blocks.bookshelf;
        array[ItemAxe.lIIlIlIlllIlIl[3]] = Blocks.log;
        array[ItemAxe.lIIlIlIlllIlIl[4]] = Blocks.log2;
        array[ItemAxe.lIIlIlIlllIlIl[5]] = Blocks.chest;
        array[ItemAxe.lIIlIlIlllIlIl[6]] = Blocks.pumpkin;
        array[ItemAxe.lIIlIlIlllIlIl[7]] = Blocks.lit_pumpkin;
        array[ItemAxe.lIIlIlIlllIlIl[8]] = Blocks.melon_block;
        array[ItemAxe.lIIlIlIlllIlIl[9]] = Blocks.ladder;
        EFFECTIVE_ON = Sets.newHashSet((Object[])array);
    }
    
    @Override
    public float getStrVsBlock(final ItemStack lllllllllllllIIllIIllIIllllIIIll, final Block lllllllllllllIIllIIllIIllllIIlIl) {
        float n;
        if (llIlIIIlIllIIlI(lllllllllllllIIllIIllIIllllIIlIl.getMaterial(), Material.wood) && llIlIIIlIllIIlI(lllllllllllllIIllIIllIIllllIIlIl.getMaterial(), Material.plants) && llIlIIIlIllIIlI(lllllllllllllIIllIIllIIllllIIlIl.getMaterial(), Material.vine)) {
            n = super.getStrVsBlock(lllllllllllllIIllIIllIIllllIIIll, lllllllllllllIIllIIllIIllllIIlIl);
            "".length();
            if (" ".length() >= "  ".length()) {
                return 0.0f;
            }
        }
        else {
            n = this.efficiencyOnProperMaterial;
        }
        return n;
    }
    
    private static boolean llIlIIIlIllIIlI(final Object lllllllllllllIIllIIllIIlllIlllll, final Object lllllllllllllIIllIIllIIlllIllllI) {
        return lllllllllllllIIllIIllIIlllIlllll != lllllllllllllIIllIIllIIlllIllllI;
    }
    
    private static void llIlIIIlIllIIIl() {
        (lIIlIlIlllIlIl = new int[10])[0] = (0x57 ^ 0x7F ^ (0xB6 ^ 0x97));
        ItemAxe.lIIlIlIlllIlIl[1] = ((0xA2 ^ 0x99 ^ (0x2E ^ 0x5A)) & (181 + 29 + 18 + 26 ^ 136 + 48 - 41 + 34 ^ -" ".length()));
        ItemAxe.lIIlIlIlllIlIl[2] = " ".length();
        ItemAxe.lIIlIlIlllIlIl[3] = "  ".length();
        ItemAxe.lIIlIlIlllIlIl[4] = "   ".length();
        ItemAxe.lIIlIlIlllIlIl[5] = (0x6 ^ 0x2);
        ItemAxe.lIIlIlIlllIlIl[6] = (0xC6 ^ 0xC3);
        ItemAxe.lIIlIlIlllIlIl[7] = (0x11 ^ 0x17);
        ItemAxe.lIIlIlIlllIlIl[8] = (0x98 ^ 0xA4 ^ (0x12 ^ 0x29));
        ItemAxe.lIIlIlIlllIlIl[9] = (0x93 ^ 0xB6 ^ (0x9B ^ 0xB6));
    }
}
