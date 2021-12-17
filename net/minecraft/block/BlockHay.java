// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.state.IBlockState;

public class BlockHay extends BlockRotatedPillar
{
    private static final /* synthetic */ int[] llllIIlIllIll;
    
    @Override
    protected ItemStack createStackedBlock(final IBlockState lllllllllllllIlIlllIIlIllIIllIII) {
        return new ItemStack(Item.getItemFromBlock(this), BlockHay.llllIIlIllIll[4], BlockHay.llllIIlIllIll[3]);
    }
    
    private static boolean lIlIlIIIlIlIIlI(final Object lllllllllllllIlIlllIIlIlIlllIlIl, final Object lllllllllllllIlIlllIIlIlIlllIlII) {
        return lllllllllllllIlIlllIIlIlIlllIlIl == lllllllllllllIlIlllIIlIlIlllIlII;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIlllIIlIllIIIllII, final BlockPos lllllllllllllIlIlllIIlIllIIIIIlI, final EnumFacing lllllllllllllIlIlllIIlIllIIIIIIl, final float lllllllllllllIlIlllIIlIllIIIIIII, final float lllllllllllllIlIlllIIlIlIlllllll, final float lllllllllllllIlIlllIIlIlIllllllI, final int lllllllllllllIlIlllIIlIlIlllllIl, final EntityLivingBase lllllllllllllIlIlllIIlIlIlllllII) {
        return super.onBlockPlaced(lllllllllllllIlIlllIIlIllIIIllII, lllllllllllllIlIlllIIlIllIIIIIlI, lllllllllllllIlIlllIIlIllIIIIIIl, lllllllllllllIlIlllIIlIllIIIIIII, lllllllllllllIlIlllIIlIlIlllllll, lllllllllllllIlIlllIIlIlIllllllI, lllllllllllllIlIlllIIlIlIlllllIl, lllllllllllllIlIlllIIlIlIlllllII).withProperty(BlockHay.AXIS, lllllllllllllIlIlllIIlIllIIIIIIl.getAxis());
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlllIIlIllIlIlIlI) {
        EnumFacing.Axis lllllllllllllIlIlllIIlIllIlIllIl = EnumFacing.Axis.Y;
        final int lllllllllllllIlIlllIIlIllIlIllII = lllllllllllllIlIlllIIlIllIlIlIlI & BlockHay.llllIIlIllIll[0];
        if (lIlIlIIIlIlIIII(lllllllllllllIlIlllIIlIllIlIllII, BlockHay.llllIIlIllIll[1])) {
            lllllllllllllIlIlllIIlIllIlIllIl = EnumFacing.Axis.X;
            "".length();
            if ((0x3C ^ 0x7C ^ (0xE1 ^ 0xA5)) == 0x0) {
                return null;
            }
        }
        else if (lIlIlIIIlIlIIII(lllllllllllllIlIlllIIlIllIlIllII, BlockHay.llllIIlIllIll[2])) {
            lllllllllllllIlIlllIIlIllIlIllIl = EnumFacing.Axis.Z;
        }
        return this.getDefaultState().withProperty(BlockHay.AXIS, lllllllllllllIlIlllIIlIllIlIllIl);
    }
    
    private static void lIlIlIIIlIIllll() {
        (llllIIlIllIll = new int[5])[0] = (0x2E ^ 0x5E ^ (0xF4 ^ 0x88));
        BlockHay.llllIIlIllIll[1] = (0xAB ^ 0xAF);
        BlockHay.llllIIlIllIll[2] = (0xCB ^ 0xB3 ^ (0x6A ^ 0x1A));
        BlockHay.llllIIlIllIll[3] = ((0x12 ^ 0xE ^ "  ".length()) & (0x2F ^ 0x67 ^ (0x5C ^ 0xA) ^ -" ".length()));
        BlockHay.llllIIlIllIll[4] = " ".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockHay.llllIIlIllIll[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockHay.llllIIlIllIll[3]] = BlockHay.AXIS;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIlllIIlIllIlIIIll) {
        int lllllllllllllIlIlllIIlIllIlIIIlI = BlockHay.llllIIlIllIll[3];
        final EnumFacing.Axis lllllllllllllIlIlllIIlIllIlIIIIl = lllllllllllllIlIlllIIlIllIlIIIll.getValue(BlockHay.AXIS);
        if (lIlIlIIIlIlIIlI(lllllllllllllIlIlllIIlIllIlIIIIl, EnumFacing.Axis.X)) {
            lllllllllllllIlIlllIIlIllIlIIIlI |= BlockHay.llllIIlIllIll[1];
            "".length();
            if (-(0x65 ^ 0x7 ^ (0x1 ^ 0x67)) > 0) {
                return (66 + 48 - 110 + 141 ^ 97 + 11 - 34 + 109) & (13 + 5 + 133 + 2 ^ 10 + 16 + 153 + 12 ^ -" ".length());
            }
        }
        else if (lIlIlIIIlIlIIlI(lllllllllllllIlIlllIIlIllIlIIIIl, EnumFacing.Axis.Z)) {
            lllllllllllllIlIlllIIlIllIlIIIlI |= BlockHay.llllIIlIllIll[2];
        }
        return lllllllllllllIlIlllIIlIllIlIIIlI;
    }
    
    static {
        lIlIlIIIlIIllll();
    }
    
    public BlockHay() {
        super(Material.grass, MapColor.yellowColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockHay.AXIS, EnumFacing.Axis.Y));
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lIlIlIIIlIlIIII(final int lllllllllllllIlIlllIIlIlIllllIIl, final int lllllllllllllIlIlllIIlIlIllllIII) {
        return lllllllllllllIlIlllIIlIlIllllIIl == lllllllllllllIlIlllIIlIlIllllIII;
    }
}
