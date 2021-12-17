// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.material.Material;
import com.google.common.collect.Sets;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import java.util.Set;

public class ItemPickaxe extends ItemTool
{
    private static final /* synthetic */ int[] lIIIIlIIIIlIll;
    private static final /* synthetic */ Set<Block> EFFECTIVE_ON;
    
    static {
        lIlllIIIIIIIIII();
        final Block[] array = new Block[ItemPickaxe.lIIIIlIIIIlIll[0]];
        array[ItemPickaxe.lIIIIlIIIIlIll[1]] = Blocks.activator_rail;
        array[ItemPickaxe.lIIIIlIIIIlIll[2]] = Blocks.coal_ore;
        array[ItemPickaxe.lIIIIlIIIIlIll[3]] = Blocks.cobblestone;
        array[ItemPickaxe.lIIIIlIIIIlIll[4]] = Blocks.detector_rail;
        array[ItemPickaxe.lIIIIlIIIIlIll[5]] = Blocks.diamond_block;
        array[ItemPickaxe.lIIIIlIIIIlIll[6]] = Blocks.diamond_ore;
        array[ItemPickaxe.lIIIIlIIIIlIll[7]] = Blocks.double_stone_slab;
        array[ItemPickaxe.lIIIIlIIIIlIll[8]] = Blocks.golden_rail;
        array[ItemPickaxe.lIIIIlIIIIlIll[9]] = Blocks.gold_block;
        array[ItemPickaxe.lIIIIlIIIIlIll[10]] = Blocks.gold_ore;
        array[ItemPickaxe.lIIIIlIIIIlIll[11]] = Blocks.ice;
        array[ItemPickaxe.lIIIIlIIIIlIll[12]] = Blocks.iron_block;
        array[ItemPickaxe.lIIIIlIIIIlIll[13]] = Blocks.iron_ore;
        array[ItemPickaxe.lIIIIlIIIIlIll[14]] = Blocks.lapis_block;
        array[ItemPickaxe.lIIIIlIIIIlIll[15]] = Blocks.lapis_ore;
        array[ItemPickaxe.lIIIIlIIIIlIll[16]] = Blocks.lit_redstone_ore;
        array[ItemPickaxe.lIIIIlIIIIlIll[17]] = Blocks.mossy_cobblestone;
        array[ItemPickaxe.lIIIIlIIIIlIll[18]] = Blocks.netherrack;
        array[ItemPickaxe.lIIIIlIIIIlIll[19]] = Blocks.packed_ice;
        array[ItemPickaxe.lIIIIlIIIIlIll[20]] = Blocks.rail;
        array[ItemPickaxe.lIIIIlIIIIlIll[21]] = Blocks.redstone_ore;
        array[ItemPickaxe.lIIIIlIIIIlIll[22]] = Blocks.sandstone;
        array[ItemPickaxe.lIIIIlIIIIlIll[23]] = Blocks.red_sandstone;
        array[ItemPickaxe.lIIIIlIIIIlIll[24]] = Blocks.stone;
        array[ItemPickaxe.lIIIIlIIIIlIll[25]] = Blocks.stone_slab;
        EFFECTIVE_ON = Sets.newHashSet((Object[])array);
    }
    
    private static boolean lIlllIIIIIIIlIl(final int lllllllllllllIlIIllIlIIIllIIIlll, final int lllllllllllllIlIIllIlIIIllIIIllI) {
        return lllllllllllllIlIIllIlIIIllIIIlll >= lllllllllllllIlIIllIlIIIllIIIllI;
    }
    
    private static boolean lIlllIIIIIIIlII(final Object lllllllllllllIlIIllIlIIIllIIIIll, final Object lllllllllllllIlIIllIlIIIllIIIIlI) {
        return lllllllllllllIlIIllIlIIIllIIIIll != lllllllllllllIlIIllIlIIIllIIIIlI;
    }
    
    protected ItemPickaxe(final ToolMaterial lllllllllllllIlIIllIlIIIllIlllll) {
        super(2.0f, lllllllllllllIlIIllIlIIIllIlllll, ItemPickaxe.EFFECTIVE_ON);
    }
    
    @Override
    public boolean canHarvestBlock(final Block lllllllllllllIlIIllIlIIIllIllIIl) {
        int n;
        if (lIlllIIIIIIIIIl(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.obsidian)) {
            if (lIlllIIIIIIIIlI(this.toolMaterial.getHarvestLevel(), ItemPickaxe.lIIIIlIIIIlIll[4])) {
                n = ItemPickaxe.lIIIIlIIIIlIll[2];
                "".length();
                if ("  ".length() <= ((0x61 ^ 0x34 ^ (0xD7 ^ 0x84)) & (86 + 113 - 114 + 70 ^ 93 + 15 - 26 + 75 ^ -" ".length()))) {
                    return ((28 + 10 + 85 + 81 ^ 60 + 82 - 20 + 7) & (0x65 ^ 0x78 ^ (0xD0 ^ 0x80) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = ItemPickaxe.lIIIIlIIIIlIll[1];
                "".length();
                if (null != null) {
                    return ((0x67 ^ 0x40) & ~(0x99 ^ 0xBE)) != 0x0;
                }
            }
        }
        else if (lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.diamond_block) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.diamond_ore)) {
            if (lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.emerald_ore) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.emerald_block)) {
                if (lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.gold_block) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.gold_ore)) {
                    if (lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.iron_block) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.iron_ore)) {
                        if (lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.lapis_block) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.lapis_ore)) {
                            if (lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.redstone_ore) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIllIIl, Blocks.lit_redstone_ore)) {
                                if (lIlllIIIIIIIIIl(lllllllllllllIlIIllIlIIIllIllIIl.getMaterial(), Material.rock)) {
                                    n = ItemPickaxe.lIIIIlIIIIlIll[2];
                                    "".length();
                                    if (((0x9 ^ 0x3E ^ (0x34 ^ 0x33)) & (0x4C ^ 0x1C ^ (0x3 ^ 0x63) ^ -" ".length())) != 0x0) {
                                        return ((69 + 136 - 142 + 94 ^ 42 + 48 + 12 + 68) & (0x2B ^ 0x4B ^ (0xC4 ^ 0x93) ^ -" ".length())) != 0x0;
                                    }
                                }
                                else if (lIlllIIIIIIIIIl(lllllllllllllIlIIllIlIIIllIllIIl.getMaterial(), Material.iron)) {
                                    n = ItemPickaxe.lIIIIlIIIIlIll[2];
                                    "".length();
                                    if (-"   ".length() > 0) {
                                        return ((0x8E ^ 0xC3 ^ (0xBC ^ 0x90)) & (106 + 60 + 10 + 28 ^ 115 + 160 - 217 + 115 ^ -" ".length())) != 0x0;
                                    }
                                }
                                else if (lIlllIIIIIIIIIl(lllllllllllllIlIIllIlIIIllIllIIl.getMaterial(), Material.anvil)) {
                                    n = ItemPickaxe.lIIIIlIIIIlIll[2];
                                    "".length();
                                    if (-" ".length() >= (75 + 89 - 91 + 93 ^ 49 + 111 - 44 + 46)) {
                                        return ((17 + 64 + 28 + 36 ^ 138 + 54 - 160 + 108) & (99 + 95 - 68 + 44 ^ 155 + 130 - 183 + 81 ^ -" ".length())) != 0x0;
                                    }
                                }
                                else {
                                    n = ItemPickaxe.lIIIIlIIIIlIll[1];
                                    "".length();
                                    if ("  ".length() >= "   ".length()) {
                                        return ((0x81 ^ 0xAB) & ~(0x8E ^ 0xA4)) != 0x0;
                                    }
                                }
                            }
                            else if (lIlllIIIIIIIlIl(this.toolMaterial.getHarvestLevel(), ItemPickaxe.lIIIIlIIIIlIll[3])) {
                                n = ItemPickaxe.lIIIIlIIIIlIll[2];
                                "".length();
                                if ("  ".length() == 0) {
                                    return ((0x3D ^ 0x63) & ~(0x35 ^ 0x6B)) != 0x0;
                                }
                            }
                            else {
                                n = ItemPickaxe.lIIIIlIIIIlIll[1];
                                "".length();
                                if (-" ".length() >= ((0x45 ^ 0x28 ^ (0xE3 ^ 0xA6)) & (0xF9 ^ 0xA8 ^ (0xF8 ^ 0x81) ^ -" ".length()))) {
                                    return ((0xED ^ 0x9C ^ (0x6B ^ 0xA)) & (21 + 37 + 76 + 9 ^ 60 + 98 - 157 + 158 ^ -" ".length())) != 0x0;
                                }
                            }
                        }
                        else if (lIlllIIIIIIIlIl(this.toolMaterial.getHarvestLevel(), ItemPickaxe.lIIIIlIIIIlIll[2])) {
                            n = ItemPickaxe.lIIIIlIIIIlIll[2];
                            "".length();
                            if (-"   ".length() >= 0) {
                                return ((0x9F ^ 0xC3) & ~(0xC9 ^ 0x95)) != 0x0;
                            }
                        }
                        else {
                            n = ItemPickaxe.lIIIIlIIIIlIll[1];
                            "".length();
                            if (-" ".length() > 0) {
                                return ((0xA0 ^ 0x8C ^ (0xD0 ^ 0xBE)) & (0x44 ^ 0x8 ^ (0x30 ^ 0x3E) ^ -" ".length())) != 0x0;
                            }
                        }
                    }
                    else if (lIlllIIIIIIIlIl(this.toolMaterial.getHarvestLevel(), ItemPickaxe.lIIIIlIIIIlIll[2])) {
                        n = ItemPickaxe.lIIIIlIIIIlIll[2];
                        "".length();
                        if ("  ".length() >= (0x79 ^ 0x7D)) {
                            return ((0x9B ^ 0xAC) & ~(0x5C ^ 0x6B)) != 0x0;
                        }
                    }
                    else {
                        n = ItemPickaxe.lIIIIlIIIIlIll[1];
                        "".length();
                        if (((0x11 ^ 0x4E) & ~(0xF ^ 0x50)) != 0x0) {
                            return ((0x3B ^ 0x10) & ~(0xA2 ^ 0x89)) != 0x0;
                        }
                    }
                }
                else if (lIlllIIIIIIIlIl(this.toolMaterial.getHarvestLevel(), ItemPickaxe.lIIIIlIIIIlIll[3])) {
                    n = ItemPickaxe.lIIIIlIIIIlIll[2];
                    "".length();
                    if (null != null) {
                        return ((0xF0 ^ 0xAD) & ~(0x69 ^ 0x34)) != 0x0;
                    }
                }
                else {
                    n = ItemPickaxe.lIIIIlIIIIlIll[1];
                    "".length();
                    if (((121 + 188 - 181 + 87 ^ 149 + 93 - 76 + 17) & (0x5B ^ 0x4C ^ (0x76 ^ 0x1) ^ -" ".length())) == -" ".length()) {
                        return ((0x9C ^ 0xB5 ^ (0xF8 ^ 0xB0)) & (0xCA ^ 0x9A ^ (0x24 ^ 0x15) ^ -" ".length())) != 0x0;
                    }
                }
            }
            else if (lIlllIIIIIIIlIl(this.toolMaterial.getHarvestLevel(), ItemPickaxe.lIIIIlIIIIlIll[3])) {
                n = ItemPickaxe.lIIIIlIIIIlIll[2];
                "".length();
                if (-"  ".length() > 0) {
                    return ((0xAD ^ 0xB0) & ~(0xAF ^ 0xB2)) != 0x0;
                }
            }
            else {
                n = ItemPickaxe.lIIIIlIIIIlIll[1];
                "".length();
                if (((211 + 186 - 328 + 183 ^ 146 + 25 - 31 + 29) & (219 + 155 - 349 + 211 ^ 82 + 117 - 31 + 17 ^ -" ".length())) == " ".length()) {
                    return ((0x87 ^ 0x92 ^ (0x1D ^ 0x1)) & (119 + 91 - 207 + 142 ^ 111 + 147 - 228 + 122 ^ -" ".length())) != 0x0;
                }
            }
        }
        else if (lIlllIIIIIIIlIl(this.toolMaterial.getHarvestLevel(), ItemPickaxe.lIIIIlIIIIlIll[3])) {
            n = ItemPickaxe.lIIIIlIIIIlIll[2];
            "".length();
            if ("  ".length() == 0) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            n = ItemPickaxe.lIIIIlIIIIlIll[1];
        }
        return n != 0;
    }
    
    @Override
    public float getStrVsBlock(final ItemStack lllllllllllllIlIIllIlIIIllIIllll, final Block lllllllllllllIlIIllIlIIIllIlIIIl) {
        float n;
        if (lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIlIIIl.getMaterial(), Material.iron) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIlIIIl.getMaterial(), Material.anvil) && lIlllIIIIIIIlII(lllllllllllllIlIIllIlIIIllIlIIIl.getMaterial(), Material.rock)) {
            n = super.getStrVsBlock(lllllllllllllIlIIllIlIIIllIIllll, lllllllllllllIlIIllIlIIIllIlIIIl);
            "".length();
            if (((26 + 146 - 162 + 222 ^ 9 + 133 + 3 + 25) & (0x28 ^ 0x68 ^ "  ".length() ^ -" ".length())) != 0x0) {
                return 0.0f;
            }
        }
        else {
            n = this.efficiencyOnProperMaterial;
        }
        return n;
    }
    
    private static void lIlllIIIIIIIIII() {
        (lIIIIlIIIIlIll = new int[26])[0] = (0x77 ^ 0x6E);
        ItemPickaxe.lIIIIlIIIIlIll[1] = ((0x6 ^ 0x3) & ~(0x66 ^ 0x63));
        ItemPickaxe.lIIIIlIIIIlIll[2] = " ".length();
        ItemPickaxe.lIIIIlIIIIlIll[3] = "  ".length();
        ItemPickaxe.lIIIIlIIIIlIll[4] = "   ".length();
        ItemPickaxe.lIIIIlIIIIlIll[5] = (0x65 ^ 0x61);
        ItemPickaxe.lIIIIlIIIIlIll[6] = (0x89 ^ 0xA6 ^ (0x41 ^ 0x6B));
        ItemPickaxe.lIIIIlIIIIlIll[7] = (83 + 14 - 52 + 86 ^ 106 + 49 - 52 + 30);
        ItemPickaxe.lIIIIlIIIIlIll[8] = (0xD8 ^ 0xB4 ^ (0xC0 ^ 0xAB));
        ItemPickaxe.lIIIIlIIIIlIll[9] = (88 + 124 - 112 + 39 ^ 122 + 71 - 148 + 86);
        ItemPickaxe.lIIIIlIIIIlIll[10] = (0xAB ^ 0x9D ^ (0x5 ^ 0x3A));
        ItemPickaxe.lIIIIlIIIIlIll[11] = (0x33 ^ 0x39);
        ItemPickaxe.lIIIIlIIIIlIll[12] = (15 + 38 - 40 + 144 ^ 14 + 88 - 83 + 131);
        ItemPickaxe.lIIIIlIIIIlIll[13] = (0x59 ^ 0x5F ^ (0x37 ^ 0x3D));
        ItemPickaxe.lIIIIlIIIIlIll[14] = (0x9D ^ 0x90);
        ItemPickaxe.lIIIIlIIIIlIll[15] = (0x5 ^ 0xE ^ (0xBE ^ 0xBB));
        ItemPickaxe.lIIIIlIIIIlIll[16] = (0xAA ^ 0xB8 ^ (0x89 ^ 0x94));
        ItemPickaxe.lIIIIlIIIIlIll[17] = (0x9B ^ 0xBF ^ (0x8B ^ 0xBF));
        ItemPickaxe.lIIIIlIIIIlIll[18] = (0xD1 ^ 0x8A ^ (0x3C ^ 0x76));
        ItemPickaxe.lIIIIlIIIIlIll[19] = (0x21 ^ 0xB ^ (0x4E ^ 0x76));
        ItemPickaxe.lIIIIlIIIIlIll[20] = (0x69 ^ 0x7A);
        ItemPickaxe.lIIIIlIIIIlIll[21] = (0x71 ^ 0x3F ^ (0x18 ^ 0x42));
        ItemPickaxe.lIIIIlIIIIlIll[22] = (0x5E ^ 0x4B);
        ItemPickaxe.lIIIIlIIIIlIll[23] = (0xB4 ^ 0xA2);
        ItemPickaxe.lIIIIlIIIIlIll[24] = (0x3E ^ 0x29);
        ItemPickaxe.lIIIIlIIIIlIll[25] = (0xCE ^ 0xC0 ^ (0xA6 ^ 0xB0));
    }
    
    private static boolean lIlllIIIIIIIIlI(final int lllllllllllllIlIIllIlIIIllIIlIll, final int lllllllllllllIlIIllIlIIIllIIlIlI) {
        return lllllllllllllIlIIllIlIIIllIIlIll == lllllllllllllIlIIllIlIIIllIIlIlI;
    }
    
    private static boolean lIlllIIIIIIIIIl(final Object lllllllllllllIlIIllIlIIIlIllllll, final Object lllllllllllllIlIIllIlIIIlIlllllI) {
        return lllllllllllllIlIIllIlIIIlIllllll == lllllllllllllIlIIllIlIIIlIlllllI;
    }
}
