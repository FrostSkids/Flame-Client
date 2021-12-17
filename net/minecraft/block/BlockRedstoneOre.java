// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockRedstoneOre extends Block
{
    private final /* synthetic */ boolean isOn;
    private static final /* synthetic */ int[] lllIlIllIlIlIl;
    
    @Override
    public int tickRate(final World llllllllllllIlIllIlIlIIllIllIlll) {
        return BlockRedstoneOre.lllIlIllIlIlIl[1];
    }
    
    private static int lIlIIIllIlIlIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void updateTick(final World llllllllllllIlIllIlIlIIlIIllIllI, final BlockPos llllllllllllIlIllIlIlIIlIIllIlII, final IBlockState llllllllllllIlIllIlIlIIlIIllIIlI, final Random llllllllllllIlIllIlIlIIlIIllIIIl) {
        if (lIlIIIllIlIlIIlI(this, Blocks.lit_redstone_ore)) {
            llllllllllllIlIllIlIlIIlIIllIllI.setBlockState(llllllllllllIlIllIlIlIIlIIllIlII, Blocks.redstone_ore.getDefaultState());
            "".length();
        }
    }
    
    private static void lIlIIIllIlIlIIII() {
        (lllIlIllIlIlIl = new int[8])[0] = " ".length();
        BlockRedstoneOre.lllIlIllIlIlIl[1] = (0x7A ^ 0x58 ^ (0x76 ^ 0x4A));
        BlockRedstoneOre.lllIlIllIlIlIl[2] = (0x55 ^ 0x67 ^ (0xB6 ^ 0x80));
        BlockRedstoneOre.lllIlIllIlIlIl[3] = "  ".length();
        BlockRedstoneOre.lllIlIllIlIlIl[4] = (0xA8 ^ 0x91 ^ (0xB ^ 0x37));
        BlockRedstoneOre.lllIlIllIlIlIl[5] = ((0x55 ^ 0x4B) & ~(0x54 ^ 0x4A));
        BlockRedstoneOre.lllIlIllIlIlIl[6] = "   ".length();
        BlockRedstoneOre.lllIlIllIlIlIl[7] = (0x68 ^ 0x6E);
    }
    
    static {
        lIlIIIllIlIlIIII();
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIlIllIlIlIIlIlIlllll, final BlockPos llllllllllllIlIllIlIlIIlIllIllIl, final IBlockState llllllllllllIlIllIlIlIIlIlIlllII, final EntityPlayer llllllllllllIlIllIlIlIIlIlIllIll, final EnumFacing llllllllllllIlIllIlIlIIlIllIIlll, final float llllllllllllIlIllIlIlIIlIllIIllI, final float llllllllllllIlIllIlIlIIlIllIIlII, final float llllllllllllIlIllIlIlIIlIllIIIll) {
        this.activate(llllllllllllIlIllIlIlIIlIlIlllll, llllllllllllIlIllIlIlIIlIllIllIl);
        return super.onBlockActivated(llllllllllllIlIllIlIlIIlIlIlllll, llllllllllllIlIllIlIlIIlIllIllIl, llllllllllllIlIllIlIlIIlIlIlllII, llllllllllllIlIllIlIlIIlIlIllIll, llllllllllllIlIllIlIlIIlIllIIlll, llllllllllllIlIllIlIlIIlIllIIllI, llllllllllllIlIllIlIlIIlIllIIlII, llllllllllllIlIllIlIlIIlIllIIIll);
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIlIllIlIlIIIlllIlIIl, final BlockPos llllllllllllIlIllIlIlIIIllllIlIl, final IBlockState llllllllllllIlIllIlIlIIIlllIIllI, final float llllllllllllIlIllIlIlIIIllllIIIl, final int llllllllllllIlIllIlIlIIIlllIllll) {
        super.dropBlockAsItemWithChance(llllllllllllIlIllIlIlIIIlllIlIIl, llllllllllllIlIllIlIlIIIllllIlIl, llllllllllllIlIllIlIlIIIlllIIllI, llllllllllllIlIllIlIlIIIllllIIIl, llllllllllllIlIllIlIlIIIlllIllll);
        if (lIlIIIllIlIlIIll(this.getItemDropped(llllllllllllIlIllIlIlIIIlllIIllI, llllllllllllIlIllIlIlIIIlllIlIIl.rand, llllllllllllIlIllIlIlIIIlllIllll), Item.getItemFromBlock(this))) {
            final int llllllllllllIlIllIlIlIIIlllIllIl = BlockRedstoneOre.lllIlIllIlIlIl[0] + llllllllllllIlIllIlIlIIIlllIlIIl.rand.nextInt(BlockRedstoneOre.lllIlIllIlIlIl[4]);
            this.dropXpOnBlockBreak(llllllllllllIlIllIlIlIIIlllIlIIl, llllllllllllIlIllIlIlIIIllllIlIl, llllllllllllIlIllIlIlIIIlllIllIl);
        }
    }
    
    private static boolean lIlIIIllIlIlIlll(final int llllllllllllIlIllIlIlIIIlIIIIIIl, final int llllllllllllIlIllIlIlIIIlIIIIIII) {
        return llllllllllllIlIllIlIlIIIlIIIIIIl == llllllllllllIlIllIlIlIIIlIIIIIII;
    }
    
    @Override
    public void onBlockClicked(final World llllllllllllIlIllIlIlIIllIlIlIlI, final BlockPos llllllllllllIlIllIlIlIIllIlIIIII, final EntityPlayer llllllllllllIlIllIlIlIIllIlIIllI) {
        this.activate(llllllllllllIlIllIlIlIIllIlIlIlI, llllllllllllIlIllIlIlIIllIlIIIII);
        super.onBlockClicked(llllllllllllIlIllIlIlIIllIlIlIlI, llllllllllllIlIllIlIlIIllIlIIIII, llllllllllllIlIllIlIlIIllIlIIllI);
    }
    
    @Override
    public void randomDisplayTick(final World llllllllllllIlIllIlIlIIIllIIllII, final BlockPos llllllllllllIlIllIlIlIIIllIlIIll, final IBlockState llllllllllllIlIllIlIlIIIllIlIIIl, final Random llllllllllllIlIllIlIlIIIllIlIIII) {
        if (lIlIIIllIlIlIIIl(this.isOn ? 1 : 0)) {
            this.spawnParticles(llllllllllllIlIllIlIlIIIllIIllII, llllllllllllIlIllIlIlIIIllIlIIll);
        }
    }
    
    private static boolean lIlIIIllIlIllIlI(final int llllllllllllIlIllIlIlIIIIlIIllll) {
        return llllllllllllIlIllIlIlIIIIlIIllll > 0;
    }
    
    public BlockRedstoneOre(final boolean llllllllllllIlIllIlIlIIllIllllII) {
        super(Material.rock);
        if (lIlIIIllIlIlIIIl(llllllllllllIlIllIlIlIIllIllllII ? 1 : 0)) {
            this.setTickRandomly((boolean)(BlockRedstoneOre.lllIlIllIlIlIl[0] != 0));
            "".length();
        }
        this.isOn = llllllllllllIlIllIlIlIIllIllllII;
    }
    
    private void spawnParticles(final World llllllllllllIlIllIlIlIIIlIIlllII, final BlockPos llllllllllllIlIllIlIlIIIlIIllIll) {
        final Random llllllllllllIlIllIlIlIIIlIlIIlII = llllllllllllIlIllIlIlIIIlIIlllII.rand;
        final double llllllllllllIlIllIlIlIIIlIlIIIll = 0.0625;
        int llllllllllllIlIllIlIlIIIlIlIIIlI = BlockRedstoneOre.lllIlIllIlIlIl[5];
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lIlIIIllIlIllIll(llllllllllllIlIllIlIlIIIlIlIIIlI, BlockRedstoneOre.lllIlIllIlIlIl[7])) {
            double llllllllllllIlIllIlIlIIIlIlIIIII = llllllllllllIlIllIlIlIIIlIIllIll.getX() + llllllllllllIlIllIlIlIIIlIlIIlII.nextFloat();
            double llllllllllllIlIllIlIlIIIlIIlllll = llllllllllllIlIllIlIlIIIlIIllIll.getY() + llllllllllllIlIllIlIlIIIlIlIIlII.nextFloat();
            double llllllllllllIlIllIlIlIIIlIIllllI = llllllllllllIlIllIlIlIIIlIIllIll.getZ() + llllllllllllIlIllIlIlIIIlIlIIlII.nextFloat();
            if (lIlIIIllIlIlIllI(llllllllllllIlIllIlIlIIIlIlIIIlI) && lIlIIIllIlIlIllI(llllllllllllIlIllIlIlIIIlIIlllII.getBlockState(llllllllllllIlIllIlIlIIIlIIllIll.up()).getBlock().isOpaqueCube() ? 1 : 0)) {
                llllllllllllIlIllIlIlIIIlIIlllll = llllllllllllIlIllIlIlIIIlIIllIll.getY() + llllllllllllIlIllIlIlIIIlIlIIIll + 1.0;
            }
            if (lIlIIIllIlIlIlll(llllllllllllIlIllIlIlIIIlIlIIIlI, BlockRedstoneOre.lllIlIllIlIlIl[0]) && lIlIIIllIlIlIllI(llllllllllllIlIllIlIlIIIlIIlllII.getBlockState(llllllllllllIlIllIlIlIIIlIIllIll.down()).getBlock().isOpaqueCube() ? 1 : 0)) {
                llllllllllllIlIllIlIlIIIlIIlllll = llllllllllllIlIllIlIlIIIlIIllIll.getY() - llllllllllllIlIllIlIlIIIlIlIIIll;
            }
            if (lIlIIIllIlIlIlll(llllllllllllIlIllIlIlIIIlIlIIIlI, BlockRedstoneOre.lllIlIllIlIlIl[3]) && lIlIIIllIlIlIllI(llllllllllllIlIllIlIlIIIlIIlllII.getBlockState(llllllllllllIlIllIlIlIIIlIIllIll.south()).getBlock().isOpaqueCube() ? 1 : 0)) {
                llllllllllllIlIllIlIlIIIlIIllllI = llllllllllllIlIllIlIlIIIlIIllIll.getZ() + llllllllllllIlIllIlIlIIIlIlIIIll + 1.0;
            }
            if (lIlIIIllIlIlIlll(llllllllllllIlIllIlIlIIIlIlIIIlI, BlockRedstoneOre.lllIlIllIlIlIl[6]) && lIlIIIllIlIlIllI(llllllllllllIlIllIlIlIIIlIIlllII.getBlockState(llllllllllllIlIllIlIlIIIlIIllIll.north()).getBlock().isOpaqueCube() ? 1 : 0)) {
                llllllllllllIlIllIlIlIIIlIIllllI = llllllllllllIlIllIlIlIIIlIIllIll.getZ() - llllllllllllIlIllIlIlIIIlIlIIIll;
            }
            if (lIlIIIllIlIlIlll(llllllllllllIlIllIlIlIIIlIlIIIlI, BlockRedstoneOre.lllIlIllIlIlIl[2]) && lIlIIIllIlIlIllI(llllllllllllIlIllIlIlIIIlIIlllII.getBlockState(llllllllllllIlIllIlIlIIIlIIllIll.east()).getBlock().isOpaqueCube() ? 1 : 0)) {
                llllllllllllIlIllIlIlIIIlIlIIIII = llllllllllllIlIllIlIlIIIlIIllIll.getX() + llllllllllllIlIllIlIlIIIlIlIIIll + 1.0;
            }
            if (lIlIIIllIlIlIlll(llllllllllllIlIllIlIlIIIlIlIIIlI, BlockRedstoneOre.lllIlIllIlIlIl[4]) && lIlIIIllIlIlIllI(llllllllllllIlIllIlIlIIIlIIlllII.getBlockState(llllllllllllIlIllIlIlIIIlIIllIll.west()).getBlock().isOpaqueCube() ? 1 : 0)) {
                llllllllllllIlIllIlIlIIIlIlIIIII = llllllllllllIlIllIlIlIIIlIIllIll.getX() - llllllllllllIlIllIlIlIIIlIlIIIll;
            }
            if (!lIlIIIllIlIllIII(lIlIIIllIlIlIlII(llllllllllllIlIllIlIlIIIlIlIIIII, llllllllllllIlIllIlIlIIIlIIllIll.getX())) || !lIlIIIllIlIllIIl(lIlIIIllIlIlIlIl(llllllllllllIlIllIlIlIIIlIlIIIII, llllllllllllIlIllIlIlIIIlIIllIll.getX() + BlockRedstoneOre.lllIlIllIlIlIl[0])) || !lIlIIIllIlIllIII(lIlIIIllIlIlIlII(llllllllllllIlIllIlIlIIIlIIlllll, 0.0)) || !lIlIIIllIlIllIIl(lIlIIIllIlIlIlIl(llllllllllllIlIllIlIlIIIlIIlllll, llllllllllllIlIllIlIlIIIlIIllIll.getY() + BlockRedstoneOre.lllIlIllIlIlIl[0])) || !lIlIIIllIlIllIII(lIlIIIllIlIlIlII(llllllllllllIlIllIlIlIIIlIIllllI, llllllllllllIlIllIlIlIIIlIIllIll.getZ())) || lIlIIIllIlIllIlI(lIlIIIllIlIlIlIl(llllllllllllIlIllIlIlIIIlIIllllI, llllllllllllIlIllIlIlIIIlIIllIll.getZ() + BlockRedstoneOre.lllIlIllIlIlIl[0]))) {
                llllllllllllIlIllIlIlIIIlIIlllII.spawnParticle(EnumParticleTypes.REDSTONE, llllllllllllIlIllIlIlIIIlIlIIIII, llllllllllllIlIllIlIlIIIlIIlllll, llllllllllllIlIllIlIlIIIlIIllllI, 0.0, 0.0, 0.0, new int[BlockRedstoneOre.lllIlIllIlIlIl[5]]);
            }
            ++llllllllllllIlIllIlIlIIIlIlIIIlI;
        }
    }
    
    private static boolean lIlIIIllIlIllIIl(final int llllllllllllIlIllIlIlIIIIlIlIIll) {
        return llllllllllllIlIllIlIlIIIIlIlIIll <= 0;
    }
    
    private static boolean lIlIIIllIlIlIIlI(final Object llllllllllllIlIllIlIlIIIIllIlIII, final Object llllllllllllIlIllIlIlIIIIllIIllI) {
        return llllllllllllIlIllIlIlIIIIllIlIII == llllllllllllIlIllIlIlIIIIllIIllI;
    }
    
    private static boolean lIlIIIllIlIllIll(final int llllllllllllIlIllIlIlIIIIllllIIl, final int llllllllllllIlIllIlIlIIIIlllIlll) {
        return llllllllllllIlIllIlIlIIIIllllIIl >= llllllllllllIlIllIlIlIIIIlllIlll;
    }
    
    private static boolean lIlIIIllIlIllIII(final int llllllllllllIlIllIlIlIIIIlIllIII) {
        return llllllllllllIlIllIlIlIIIIlIllIII >= 0;
    }
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState llllllllllllIlIllIlIlIIIlIIIlIlI) {
        return new ItemStack(Blocks.redstone_ore);
    }
    
    private static boolean lIlIIIllIlIlIllI(final int llllllllllllIlIllIlIlIIIIlIlllIl) {
        return llllllllllllIlIllIlIlIIIIlIlllIl == 0;
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World llllllllllllIlIllIlIlIIllIIIllll, final BlockPos llllllllllllIlIllIlIlIIllIIIllIl, final Entity llllllllllllIlIllIlIlIIllIIIIlIl) {
        this.activate(llllllllllllIlIllIlIlIIllIIIllll, llllllllllllIlIllIlIlIIllIIIllIl);
        super.onEntityCollidedWithBlock(llllllllllllIlIllIlIlIIllIIIllll, llllllllllllIlIllIlIlIIllIIIllIl, llllllllllllIlIllIlIlIIllIIIIlIl);
    }
    
    @Override
    public int quantityDroppedWithBonus(final int llllllllllllIlIllIlIlIIlIIIlIlIl, final Random llllllllllllIlIllIlIlIIlIIIllIII) {
        return this.quantityDropped(llllllllllllIlIllIlIlIIlIIIllIII) + llllllllllllIlIllIlIlIIlIIIllIII.nextInt(llllllllllllIlIllIlIlIIlIIIlIlIl + BlockRedstoneOre.lllIlIllIlIlIl[0]);
    }
    
    private void activate(final World llllllllllllIlIllIlIlIIlIlIIIlII, final BlockPos llllllllllllIlIllIlIlIIlIlIIIIlI) {
        this.spawnParticles(llllllllllllIlIllIlIlIIlIlIIIlII, llllllllllllIlIllIlIlIIlIlIIIIlI);
        if (lIlIIIllIlIlIIlI(this, Blocks.redstone_ore)) {
            llllllllllllIlIllIlIlIIlIlIIIlII.setBlockState(llllllllllllIlIllIlIlIIlIlIIIIlI, Blocks.lit_redstone_ore.getDefaultState());
            "".length();
        }
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIllIlIlIIlIIlIlIIl, final Random llllllllllllIlIllIlIlIIlIIlIIlll, final int llllllllllllIlIllIlIlIIlIIlIIlIl) {
        return Items.redstone;
    }
    
    @Override
    public int quantityDropped(final Random llllllllllllIlIllIlIlIIlIIIIllII) {
        return BlockRedstoneOre.lllIlIllIlIlIl[2] + llllllllllllIlIllIlIlIIlIIIIllII.nextInt(BlockRedstoneOre.lllIlIllIlIlIl[3]);
    }
    
    private static boolean lIlIIIllIlIlIIll(final Object llllllllllllIlIllIlIlIIIIlllIIlI, final Object llllllllllllIlIllIlIlIIIIlllIIII) {
        return llllllllllllIlIllIlIlIIIIlllIIlI != llllllllllllIlIllIlIlIIIIlllIIII;
    }
    
    private static int lIlIIIllIlIlIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIIllIlIlIIIl(final int llllllllllllIlIllIlIlIIIIllIIIIl) {
        return llllllllllllIlIllIlIlIIIIllIIIIl != 0;
    }
}
