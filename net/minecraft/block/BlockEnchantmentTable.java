// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.world.IInteractionObject;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockEnchantmentTable extends BlockContainer
{
    private static final /* synthetic */ int[] lIIIlIIlIIIIIl;
    
    static {
        lIllllllIIIIllI();
    }
    
    private static boolean lIllllllIIlIIlI(final int lllllllllllllIlIIIlIllIIIIlIlIlI) {
        return lllllllllllllIlIIIlIllIIIIlIlIlI != 0;
    }
    
    private static boolean lIllllllIIIlIll(final int lllllllllllllIlIIIlIllIIIlIIIIlI, final int lllllllllllllIlIIIlIllIIIlIIIIII) {
        return lllllllllllllIlIIIlIllIIIlIIIIlI == lllllllllllllIlIIIlIllIIIlIIIIII;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockEnchantmentTable.lIIIlIIlIIIIIl[0] != 0;
    }
    
    @Override
    public void onBlockPlacedBy(final World lllllllllllllIlIIIlIllIIIlIIlllI, final BlockPos lllllllllllllIlIIIlIllIIIlIllIIl, final IBlockState lllllllllllllIlIIIlIllIIIlIllIII, final EntityLivingBase lllllllllllllIlIIIlIllIIIlIIlIlI, final ItemStack lllllllllllllIlIIIlIllIIIlIlIlII) {
        super.onBlockPlacedBy(lllllllllllllIlIIIlIllIIIlIIlllI, lllllllllllllIlIIIlIllIIIlIllIIl, lllllllllllllIlIIIlIllIIIlIllIII, lllllllllllllIlIIIlIllIIIlIIlIlI, lllllllllllllIlIIIlIllIIIlIlIlII);
        if (lIllllllIIlIIlI(lllllllllllllIlIIIlIllIIIlIlIlII.hasDisplayName() ? 1 : 0)) {
            final TileEntity lllllllllllllIlIIIlIllIIIlIlIIlI = lllllllllllllIlIIIlIllIIIlIIlllI.getTileEntity(lllllllllllllIlIIIlIllIIIlIllIIl);
            if (lIllllllIIlIIlI((lllllllllllllIlIIIlIllIIIlIlIIlI instanceof TileEntityEnchantmentTable) ? 1 : 0)) {
                ((TileEntityEnchantmentTable)lllllllllllllIlIIIlIllIIIlIlIIlI).setCustomName(lllllllllllllIlIIIlIllIIIlIlIlII.getDisplayName());
            }
        }
    }
    
    private static void lIllllllIIIIllI() {
        (lIIIlIIlIIIIIl = new int[7])[0] = ((0x2E ^ 0x35) & ~(0x7B ^ 0x60));
        BlockEnchantmentTable.lIIIlIIlIIIIIl[1] = -"  ".length();
        BlockEnchantmentTable.lIIIlIIlIIIIIl[2] = "  ".length();
        BlockEnchantmentTable.lIIIlIIlIIIIIl[3] = -" ".length();
        BlockEnchantmentTable.lIIIlIIlIIIIIl[4] = (0x79 ^ 0x69);
        BlockEnchantmentTable.lIIIlIIlIIIIIl[5] = " ".length();
        BlockEnchantmentTable.lIIIlIIlIIIIIl[6] = "   ".length();
    }
    
    private static boolean lIllllllIIIlllI(final Object lllllllllllllIlIIIlIllIIIIllIIIl, final Object lllllllllllllIlIIIlIllIIIIlIllll) {
        return lllllllllllllIlIIIlIllIIIIllIIIl == lllllllllllllIlIIIlIllIIIIlIllll;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockEnchantmentTable.lIIIlIIlIIIIIl[0] != 0;
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIlIIIlIllIIlIIIlIII, final BlockPos lllllllllllllIlIIIlIllIIlIIIIlll, final IBlockState lllllllllllllIlIIIlIllIIlIIIllll, final Random lllllllllllllIlIIIlIllIIlIIIIlIl) {
        super.randomDisplayTick(lllllllllllllIlIIIlIllIIlIIIlIII, lllllllllllllIlIIIlIllIIlIIIIlll, lllllllllllllIlIIIlIllIIlIIIllll, lllllllllllllIlIIIlIllIIlIIIIlIl);
        int lllllllllllllIlIIIlIllIIlIIIllIl = BlockEnchantmentTable.lIIIlIIlIIIIIl[1];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lIllllllIIIlIII(lllllllllllllIlIIIlIllIIlIIIllIl, BlockEnchantmentTable.lIIIlIIlIIIIIl[2])) {
            int lllllllllllllIlIIIlIllIIlIIIllII = BlockEnchantmentTable.lIIIlIIlIIIIIl[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIllllllIIIlIII(lllllllllllllIlIIIlIllIIlIIIllII, BlockEnchantmentTable.lIIIlIIlIIIIIl[2])) {
                if (lIllllllIIIlIII(lllllllllllllIlIIIlIllIIlIIIllIl, BlockEnchantmentTable.lIIIlIIlIIIIIl[1]) && lIllllllIIIlIlI(lllllllllllllIlIIIlIllIIlIIIllIl, BlockEnchantmentTable.lIIIlIIlIIIIIl[2]) && lIllllllIIIlIll(lllllllllllllIlIIIlIllIIlIIIllII, BlockEnchantmentTable.lIIIlIIlIIIIIl[3])) {
                    lllllllllllllIlIIIlIllIIlIIIllII = BlockEnchantmentTable.lIIIlIIlIIIIIl[2];
                }
                if (lIllllllIIIllIl(lllllllllllllIlIIIlIllIIlIIIIlIl.nextInt(BlockEnchantmentTable.lIIIlIIlIIIIIl[4]))) {
                    int lllllllllllllIlIIIlIllIIlIIIlIll = BlockEnchantmentTable.lIIIlIIlIIIIIl[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIllllllIIIlIII(lllllllllllllIlIIIlIllIIlIIIlIll, BlockEnchantmentTable.lIIIlIIlIIIIIl[5])) {
                        final BlockPos lllllllllllllIlIIIlIllIIlIIIlIlI = lllllllllllllIlIIIlIllIIlIIIIlll.add(lllllllllllllIlIIIlIllIIlIIIllIl, lllllllllllllIlIIIlIllIIlIIIlIll, lllllllllllllIlIIIlIllIIlIIIllII);
                        if (lIllllllIIIlllI(lllllllllllllIlIIIlIllIIlIIIlIII.getBlockState(lllllllllllllIlIIIlIllIIlIIIlIlI).getBlock(), Blocks.bookshelf)) {
                            if (lIllllllIIIllIl(lllllllllllllIlIIIlIllIIlIIIlIII.isAirBlock(lllllllllllllIlIIIlIllIIlIIIIlll.add(lllllllllllllIlIIIlIllIIlIIIllIl / BlockEnchantmentTable.lIIIlIIlIIIIIl[2], BlockEnchantmentTable.lIIIlIIlIIIIIl[0], lllllllllllllIlIIIlIllIIlIIIllII / BlockEnchantmentTable.lIIIlIIlIIIIIl[2])) ? 1 : 0)) {
                                "".length();
                                if (((169 + 222 - 386 + 231 ^ 43 + 11 + 103 + 16) & (0x94 ^ 0x9C ^ (0x55 ^ 0x1C) ^ -" ".length())) != 0x0) {
                                    return;
                                }
                                break;
                            }
                            else {
                                lllllllllllllIlIIIlIllIIlIIIlIII.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, lllllllllllllIlIIIlIllIIlIIIIlll.getX() + 0.5, lllllllllllllIlIIIlIllIIlIIIIlll.getY() + 2.0, lllllllllllllIlIIIlIllIIlIIIIlll.getZ() + 0.5, lllllllllllllIlIIIlIllIIlIIIllIl + lllllllllllllIlIIIlIllIIlIIIIlIl.nextFloat() - 0.5, lllllllllllllIlIIIlIllIIlIIIlIll - lllllllllllllIlIIIlIllIIlIIIIlIl.nextFloat() - 1.0f, lllllllllllllIlIIIlIllIIlIIIllII + lllllllllllllIlIIIlIllIIlIIIIlIl.nextFloat() - 0.5, new int[BlockEnchantmentTable.lIIIlIIlIIIIIl[0]]);
                            }
                        }
                        ++lllllllllllllIlIIIlIllIIlIIIlIll;
                    }
                }
                ++lllllllllllllIlIIIlIllIIlIIIllII;
            }
            ++lllllllllllllIlIIIlIllIIlIIIllIl;
        }
    }
    
    private static boolean lIllllllIIIlIlI(final int lllllllllllllIlIIIlIllIIIIlllIll, final int lllllllllllllIlIIIlIllIIIIlllIlI) {
        return lllllllllllllIlIIIlIllIIIIlllIll < lllllllllllllIlIIIlIllIIIIlllIlI;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIlIIIlIllIIIllIllIl, final BlockPos lllllllllllllIlIIIlIllIIIlllIlIl, final IBlockState lllllllllllllIlIIIlIllIIIlllIlII, final EntityPlayer lllllllllllllIlIIIlIllIIIllIlIll, final EnumFacing lllllllllllllIlIIIlIllIIIlllIIlI, final float lllllllllllllIlIIIlIllIIIlllIIIl, final float lllllllllllllIlIIIlIllIIIlllIIII, final float lllllllllllllIlIIIlIllIIIllIllll) {
        if (lIllllllIIlIIlI(lllllllllllllIlIIIlIllIIIllIllIl.isRemote ? 1 : 0)) {
            return BlockEnchantmentTable.lIIIlIIlIIIIIl[5] != 0;
        }
        final TileEntity lllllllllllllIlIIIlIllIIIllIlllI = lllllllllllllIlIIIlIllIIIllIllIl.getTileEntity(lllllllllllllIlIIIlIllIIIlllIlIl);
        if (lIllllllIIlIIlI((lllllllllllllIlIIIlIllIIIllIlllI instanceof TileEntityEnchantmentTable) ? 1 : 0)) {
            lllllllllllllIlIIIlIllIIIllIlIll.displayGui((IInteractionObject)lllllllllllllIlIIIlIllIIIllIlllI);
        }
        return BlockEnchantmentTable.lIIIlIIlIIIIIl[5] != 0;
    }
    
    @Override
    public int getRenderType() {
        return BlockEnchantmentTable.lIIIlIIlIIIIIl[6];
    }
    
    private static boolean lIllllllIIIllIl(final int lllllllllllllIlIIIlIllIIIIlIIllI) {
        return lllllllllllllIlIIIlIllIIIIlIIllI == 0;
    }
    
    private static boolean lIllllllIIIlIII(final int lllllllllllllIlIIIlIllIIIIllIlll, final int lllllllllllllIlIIIlIllIIIIllIllI) {
        return lllllllllllllIlIIIlIllIIIIllIlll > lllllllllllllIlIIIlIllIIIIllIllI;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIlIIIlIllIIIlllllIl, final int lllllllllllllIlIIIlIllIIIlllllII) {
        return new TileEntityEnchantmentTable();
    }
    
    protected BlockEnchantmentTable() {
        super(Material.rock, MapColor.redColor);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.setLightOpacity(BlockEnchantmentTable.lIIIlIIlIIIIIl[0]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
}
