// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.EnumSkyBlock;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockIce extends BlockBreakable
{
    private static final /* synthetic */ int[] lIIIlllIIllIlI;
    
    public BlockIce() {
        super(Material.ice, (boolean)(BlockIce.lIIIlllIIllIlI[0] != 0));
        this.slipperiness = 0.98f;
        this.setTickRandomly((boolean)(BlockIce.lIIIlllIIllIlI[1] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public void updateTick(final World lllllllllllllIIlllllIIlllIllIlII, final BlockPos lllllllllllllIIlllllIIlllIlllIII, final IBlockState lllllllllllllIIlllllIIlllIllIlll, final Random lllllllllllllIIlllllIIlllIllIllI) {
        if (llIIIllIIlIIlll(lllllllllllllIIlllllIIlllIllIlII.getLightFor(EnumSkyBlock.BLOCK, lllllllllllllIIlllllIIlllIlllIII), BlockIce.lIIIlllIIllIlI[2] - this.getLightOpacity())) {
            if (llIIIllIIlIIlII(lllllllllllllIIlllllIIlllIllIlII.provider.doesWaterVaporize() ? 1 : 0)) {
                lllllllllllllIIlllllIIlllIllIlII.setBlockToAir(lllllllllllllIIlllllIIlllIlllIII);
                "".length();
                "".length();
                if ((0x39 ^ 0x52 ^ (0xA9 ^ 0xC6)) > (67 + 44 - 55 + 81 ^ 102 + 87 - 150 + 102)) {
                    return;
                }
            }
            else {
                this.dropBlockAsItem(lllllllllllllIIlllllIIlllIllIlII, lllllllllllllIIlllllIIlllIlllIII, lllllllllllllIIlllllIIlllIllIlII.getBlockState(lllllllllllllIIlllllIIlllIlllIII), BlockIce.lIIIlllIIllIlI[0]);
                lllllllllllllIIlllllIIlllIllIlII.setBlockState(lllllllllllllIIlllllIIlllIlllIII, Blocks.water.getDefaultState());
                "".length();
            }
        }
    }
    
    static {
        llIIIllIIlIIIll();
    }
    
    private static boolean llIIIllIIlIIllI(final int lllllllllllllIIlllllIIlllIIllIlI) {
        return lllllllllllllIIlllllIIlllIIllIlI == 0;
    }
    
    private static boolean llIIIllIIlIIlII(final int lllllllllllllIIlllllIIlllIIllllI) {
        return lllllllllllllIIlllllIIlllIIllllI != 0;
    }
    
    private static boolean llIIIllIIlIIlIl(final Object lllllllllllllIIlllllIIlllIlIIIll) {
        return lllllllllllllIIlllllIIlllIlIIIll != null;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIlllllIIllllIIIIlI) {
        return BlockIce.lIIIlllIIllIlI[0];
    }
    
    @Override
    public int getMobilityFlag() {
        return BlockIce.lIIIlllIIllIlI[0];
    }
    
    @Override
    public void harvestBlock(final World lllllllllllllIIlllllIIllllIIlIll, final EntityPlayer lllllllllllllIIlllllIIllllIIlIlI, final BlockPos lllllllllllllIIlllllIIllllIlIlll, final IBlockState lllllllllllllIIlllllIIllllIIlIII, final TileEntity lllllllllllllIIlllllIIllllIlIIll) {
        lllllllllllllIIlllllIIllllIIlIlI.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
        lllllllllllllIIlllllIIllllIIlIlI.addExhaustion(0.025f);
        if (llIIIllIIlIIlII(this.canSilkHarvest() ? 1 : 0) && llIIIllIIlIIlII(EnchantmentHelper.getSilkTouchModifier(lllllllllllllIIlllllIIllllIIlIlI) ? 1 : 0)) {
            final ItemStack lllllllllllllIIlllllIIllllIlIIlI = this.createStackedBlock(lllllllllllllIIlllllIIllllIIlIII);
            if (llIIIllIIlIIlIl(lllllllllllllIIlllllIIllllIlIIlI)) {
                Block.spawnAsEntity(lllllllllllllIIlllllIIllllIIlIll, lllllllllllllIIlllllIIllllIlIlll, lllllllllllllIIlllllIIllllIlIIlI);
                "".length();
                if ((0x0 ^ 0x4) <= "  ".length()) {
                    return;
                }
            }
        }
        else {
            if (llIIIllIIlIIlII(lllllllllllllIIlllllIIllllIIlIll.provider.doesWaterVaporize() ? 1 : 0)) {
                lllllllllllllIIlllllIIllllIIlIll.setBlockToAir(lllllllllllllIIlllllIIllllIlIlll);
                "".length();
                return;
            }
            final int lllllllllllllIIlllllIIllllIlIIIl = EnchantmentHelper.getFortuneModifier(lllllllllllllIIlllllIIllllIIlIlI);
            this.dropBlockAsItem(lllllllllllllIIlllllIIllllIIlIll, lllllllllllllIIlllllIIllllIlIlll, lllllllllllllIIlllllIIllllIIlIII, lllllllllllllIIlllllIIllllIlIIIl);
            final Material lllllllllllllIIlllllIIllllIIllll = lllllllllllllIIlllllIIllllIIlIll.getBlockState(lllllllllllllIIlllllIIllllIlIlll.down()).getBlock().getMaterial();
            if (!llIIIllIIlIIllI(lllllllllllllIIlllllIIllllIIllll.blocksMovement() ? 1 : 0) || llIIIllIIlIIlII(lllllllllllllIIlllllIIllllIIllll.isLiquid() ? 1 : 0)) {
                lllllllllllllIIlllllIIllllIIlIll.setBlockState(lllllllllllllIIlllllIIllllIlIlll, Blocks.flowing_water.getDefaultState());
                "".length();
            }
        }
    }
    
    private static void llIIIllIIlIIIll() {
        (lIIIlllIIllIlI = new int[3])[0] = ((0xD1 ^ 0x81 ^ (0x6 ^ 0x50)) & (0xBD ^ 0xB0 ^ (0xE ^ 0x5) ^ -" ".length()));
        BlockIce.lIIIlllIIllIlI[1] = " ".length();
        BlockIce.lIIIlllIIllIlI[2] = (0x50 ^ 0x5B);
    }
    
    private static boolean llIIIllIIlIIlll(final int lllllllllllllIIlllllIIlllIlIlIlI, final int lllllllllllllIIlllllIIlllIlIlIII) {
        return lllllllllllllIIlllllIIlllIlIlIlI > lllllllllllllIIlllllIIlllIlIlIII;
    }
}
