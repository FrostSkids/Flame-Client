// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.MathHelper;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public class BlockOre extends Block
{
    private static final /* synthetic */ int[] lIlllIIIIIlIIl;
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllllllIIIIIIIIllIIl, final Random llllllllllllIllllllIIIIIIIIllIII, final int llllllllllllIllllllIIIIIIIIlIlll) {
        Item item;
        if (lIIIIIIIllIIllII(this, Blocks.coal_ore)) {
            item = Items.coal;
            "".length();
            if (((0x1 ^ 0x3A ^ " ".length()) & (0xB3 ^ 0x85 ^ (0x58 ^ 0x54) ^ -" ".length())) < 0) {
                return null;
            }
        }
        else if (lIIIIIIIllIIllII(this, Blocks.diamond_ore)) {
            item = Items.diamond;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIIIIIIllIIllII(this, Blocks.lapis_ore)) {
            item = Items.dye;
            "".length();
            if ("  ".length() > (0x8A ^ 0x8E)) {
                return null;
            }
        }
        else if (lIIIIIIIllIIllII(this, Blocks.emerald_ore)) {
            item = Items.emerald;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        else if (lIIIIIIIllIIllII(this, Blocks.quartz_ore)) {
            item = Items.quartz;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            item = Item.getItemFromBlock(this);
        }
        return item;
    }
    
    public BlockOre(final MapColor llllllllllllIllllllIIIIIIIIllllI) {
        super(Material.rock, llllllllllllIllllllIIIIIIIIllllI);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public int quantityDropped(final Random llllllllllllIllllllIIIIIIIIlIIII) {
        int n;
        if (lIIIIIIIllIIllII(this, Blocks.lapis_ore)) {
            n = BlockOre.lIlllIIIIIlIIl[0] + llllllllllllIllllllIIIIIIIIlIIII.nextInt(BlockOre.lIlllIIIIIlIIl[1]);
            "".length();
            if (" ".length() <= ((0x6C ^ 0x2B ^ (0x16 ^ 0x33)) & (7 + 49 + 7 + 167 ^ 54 + 75 - 32 + 35 ^ -" ".length()))) {
                return (134 + 87 - 35 + 13 ^ 131 + 133 - 151 + 31) & (0xB0 ^ 0xC5 ^ (0x6 ^ 0x24) ^ -" ".length());
            }
        }
        else {
            n = BlockOre.lIlllIIIIIlIIl[2];
        }
        return n;
    }
    
    @Override
    public int getDamageValue(final World llllllllllllIlllllIllllllllIllIl, final BlockPos llllllllllllIlllllIllllllllIllII) {
        return BlockOre.lIlllIIIIIlIIl[4];
    }
    
    private static boolean lIIIIIIIllIIllII(final Object llllllllllllIlllllIllllllllIIIIl, final Object llllllllllllIlllllIllllllllIIIII) {
        return llllllllllllIlllllIllllllllIIIIl == llllllllllllIlllllIllllllllIIIII;
    }
    
    private static void lIIIIIIIllIIlIll() {
        (lIlllIIIIIlIIl = new int[7])[0] = (0x4D ^ 0x49);
        BlockOre.lIlllIIIIIlIIl[1] = (0x2 ^ 0x7);
        BlockOre.lIlllIIIIIlIIl[2] = " ".length();
        BlockOre.lIlllIIIIIlIIl[3] = "  ".length();
        BlockOre.lIlllIIIIIlIIl[4] = ((0x66 ^ 0x28 ^ (0xE1 ^ 0x94)) & (0x3F ^ 0x20 ^ (0xA4 ^ 0x80) ^ -" ".length()));
        BlockOre.lIlllIIIIIlIIl[5] = "   ".length();
        BlockOre.lIlllIIIIIlIIl[6] = (0x11 ^ 0x16);
    }
    
    @Override
    public int damageDropped(final IBlockState llllllllllllIlllllIllllllllIlIIl) {
        int dyeDamage;
        if (lIIIIIIIllIIllII(this, Blocks.lapis_ore)) {
            dyeDamage = EnumDyeColor.BLUE.getDyeDamage();
            "".length();
            if ("   ".length() <= 0) {
                return (0xC8 ^ 0x89) & ~(0x83 ^ 0xC2);
            }
        }
        else {
            dyeDamage = BlockOre.lIlllIIIIIlIIl[4];
        }
        return dyeDamage;
    }
    
    public BlockOre() {
        this(Material.rock.getMaterialMapColor());
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIlllllIllllllllllIll, final BlockPos llllllllllllIlllllIllllllllllIlI, final IBlockState llllllllllllIlllllIllllllllllIIl, final float llllllllllllIlllllIlllllllllIIIl, final int llllllllllllIlllllIlllllllllIIII) {
        super.dropBlockAsItemWithChance(llllllllllllIlllllIllllllllllIll, llllllllllllIlllllIllllllllllIlI, llllllllllllIlllllIllllllllllIIl, llllllllllllIlllllIlllllllllIIIl, llllllllllllIlllllIlllllllllIIII);
        if (lIIIIIIIllIIlllI(this.getItemDropped(llllllllllllIlllllIllllllllllIIl, llllllllllllIlllllIllllllllllIll.rand, llllllllllllIlllllIlllllllllIIII), Item.getItemFromBlock(this))) {
            int llllllllllllIlllllIlllllllllIllI = BlockOre.lIlllIIIIIlIIl[4];
            if (lIIIIIIIllIIllII(this, Blocks.coal_ore)) {
                llllllllllllIlllllIlllllllllIllI = MathHelper.getRandomIntegerInRange(llllllllllllIlllllIllllllllllIll.rand, BlockOre.lIlllIIIIIlIIl[4], BlockOre.lIlllIIIIIlIIl[3]);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else if (lIIIIIIIllIIllII(this, Blocks.diamond_ore)) {
                llllllllllllIlllllIlllllllllIllI = MathHelper.getRandomIntegerInRange(llllllllllllIlllllIllllllllllIll.rand, BlockOre.lIlllIIIIIlIIl[5], BlockOre.lIlllIIIIIlIIl[6]);
                "".length();
                if (((0x1B ^ 0x7) & ~(0x93 ^ 0x8F)) < -" ".length()) {
                    return;
                }
            }
            else if (lIIIIIIIllIIllII(this, Blocks.emerald_ore)) {
                llllllllllllIlllllIlllllllllIllI = MathHelper.getRandomIntegerInRange(llllllllllllIlllllIllllllllllIll.rand, BlockOre.lIlllIIIIIlIIl[5], BlockOre.lIlllIIIIIlIIl[6]);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else if (lIIIIIIIllIIllII(this, Blocks.lapis_ore)) {
                llllllllllllIlllllIlllllllllIllI = MathHelper.getRandomIntegerInRange(llllllllllllIlllllIllllllllllIll.rand, BlockOre.lIlllIIIIIlIIl[3], BlockOre.lIlllIIIIIlIIl[1]);
                "".length();
                if (" ".length() == (176 + 64 - 72 + 18 ^ 30 + 100 + 44 + 16)) {
                    return;
                }
            }
            else if (lIIIIIIIllIIllII(this, Blocks.quartz_ore)) {
                llllllllllllIlllllIlllllllllIllI = MathHelper.getRandomIntegerInRange(llllllllllllIlllllIllllllllllIll.rand, BlockOre.lIlllIIIIIlIIl[3], BlockOre.lIlllIIIIIlIIl[1]);
            }
            this.dropXpOnBlockBreak(llllllllllllIlllllIllllllllllIll, llllllllllllIlllllIllllllllllIlI, llllllllllllIlllllIlllllllllIllI);
        }
    }
    
    static {
        lIIIIIIIllIIlIll();
    }
    
    private static boolean lIIIIIIIllIIllIl(final int llllllllllllIlllllIlllllllIlllII) {
        return llllllllllllIlllllIlllllllIlllII > 0;
    }
    
    private static boolean lIIIIIIIllIIlllI(final Object llllllllllllIlllllIllllllllIIlIl, final Object llllllllllllIlllllIllllllllIIlII) {
        return llllllllllllIlllllIllllllllIIlIl != llllllllllllIlllllIllllllllIIlII;
    }
    
    @Override
    public int quantityDroppedWithBonus(final int llllllllllllIllllllIIIIIIIIIIllI, final Random llllllllllllIllllllIIIIIIIIIIlIl) {
        if (lIIIIIIIllIIllIl(llllllllllllIllllllIIIIIIIIIIllI) && lIIIIIIIllIIlllI(Item.getItemFromBlock(this), this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), llllllllllllIllllllIIIIIIIIIIlIl, llllllllllllIllllllIIIIIIIIIIllI))) {
            int llllllllllllIllllllIIIIIIIIIlIII = llllllllllllIllllllIIIIIIIIIIlIl.nextInt(llllllllllllIllllllIIIIIIIIIIllI + BlockOre.lIlllIIIIIlIIl[3]) - BlockOre.lIlllIIIIIlIIl[2];
            if (lIIIIIIIllIIllll(llllllllllllIllllllIIIIIIIIIlIII)) {
                llllllllllllIllllllIIIIIIIIIlIII = BlockOre.lIlllIIIIIlIIl[4];
            }
            return this.quantityDropped(llllllllllllIllllllIIIIIIIIIIlIl) * (llllllllllllIllllllIIIIIIIIIlIII + BlockOre.lIlllIIIIIlIIl[2]);
        }
        return this.quantityDropped(llllllllllllIllllllIIIIIIIIIIlIl);
    }
    
    private static boolean lIIIIIIIllIIllll(final int llllllllllllIlllllIlllllllIllllI) {
        return llllllllllllIlllllIlllllllIllllI < 0;
    }
}
