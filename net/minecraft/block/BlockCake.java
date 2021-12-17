// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumWorldBlockLayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.stats.StatList;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyInteger;

public class BlockCake extends Block
{
    private static final /* synthetic */ String[] lIlIIIIlIllIIl;
    private static final /* synthetic */ int[] lIlIIIIllIIIIl;
    public static final /* synthetic */ PropertyInteger BITES;
    
    @Override
    public Item getItem(final World lllllllllllllIIlIIIIIlIllIIllIll, final BlockPos lllllllllllllIIlIIIIIlIllIIllIlI) {
        return Items.cake;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIlIIIIIlIllIIlllll, final Random lllllllllllllIIlIIIIIlIllIIllllI, final int lllllllllllllIIlIIIIIlIllIIlllIl) {
        return null;
    }
    
    private void eatCake(final World lllllllllllllIIlIIIIIlIlllIIIIlI, final BlockPos lllllllllllllIIlIIIIIlIlllIIIIIl, final IBlockState lllllllllllllIIlIIIIIlIlllIIIIII, final EntityPlayer lllllllllllllIIlIIIIIlIllIllllll) {
        if (lllIIIIlllIIIlI(lllllllllllllIIlIIIIIlIllIllllll.canEat((boolean)(BlockCake.lIlIIIIllIIIIl[0] != 0)) ? 1 : 0)) {
            lllllllllllllIIlIIIIIlIllIllllll.triggerAchievement(StatList.field_181724_H);
            lllllllllllllIIlIIIIIlIllIllllll.getFoodStats().addStats(BlockCake.lIlIIIIllIIIIl[3], 0.1f);
            final int lllllllllllllIIlIIIIIlIlllIIIIll = lllllllllllllIIlIIIIIlIlllIIIIII.getValue((IProperty<Integer>)BlockCake.BITES);
            if (lllIIIIlllIIIll(lllllllllllllIIlIIIIIlIlllIIIIll, BlockCake.lIlIIIIllIIIIl[1])) {
                lllllllllllllIIlIIIIIlIlllIIIIlI.setBlockState(lllllllllllllIIlIIIIIlIlllIIIIIl, lllllllllllllIIlIIIIIlIlllIIIIII.withProperty((IProperty<Comparable>)BlockCake.BITES, lllllllllllllIIlIIIIIlIlllIIIIll + BlockCake.lIlIIIIllIIIIl[2]), BlockCake.lIlIIIIllIIIIl[4]);
                "".length();
                "".length();
                if ((0x93 ^ 0xB5 ^ (0x92 ^ 0xB1)) <= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIIIIIlIlllIIIIlI.setBlockToAir(lllllllllllllIIlIIIIIlIlllIIIIIl);
                "".length();
            }
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIIIIIlIllIIlIlIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockCake.BITES, lllllllllllllIIlIIIIIlIllIIlIlIl);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockCake.lIlIIIIllIIIIl[0] != 0;
    }
    
    protected BlockCake() {
        super(Material.cake);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockCake.BITES, BlockCake.lIlIIIIllIIIIl[0]));
        this.setTickRandomly((boolean)(BlockCake.lIlIIIIllIIIIl[2] != 0));
        "".length();
    }
    
    private static boolean lllIIIIlllIIIll(final int lllllllllllllIIlIIIIIlIlIllIlIIl, final int lllllllllllllIIlIIIIIlIlIllIlIII) {
        return lllllllllllllIIlIIIIIlIlIllIlIIl < lllllllllllllIIlIIIIIlIlIllIlIII;
    }
    
    static {
        lllIIIIlllIIIII();
        lllIIIIllIlIlII();
        BITES = PropertyInteger.create(BlockCake.lIlIIIIlIllIIl[BlockCake.lIlIIIIllIIIIl[0]], BlockCake.lIlIIIIllIIIIl[0], BlockCake.lIlIIIIllIIIIl[1]);
    }
    
    private static String lllIIIIllIlIIll(String lllllllllllllIIlIIIIIlIlIlllIlII, final String lllllllllllllIIlIIIIIlIlIlllIIll) {
        lllllllllllllIIlIIIIIlIlIlllIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIIlIlIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIIlIlIlllIlll = new StringBuilder();
        final char[] lllllllllllllIIlIIIIIlIlIlllIllI = lllllllllllllIIlIIIIIlIlIlllIIll.toCharArray();
        int lllllllllllllIIlIIIIIlIlIlllIlIl = BlockCake.lIlIIIIllIIIIl[0];
        final double lllllllllllllIIlIIIIIlIlIllIllll = (Object)lllllllllllllIIlIIIIIlIlIlllIlII.toCharArray();
        final short lllllllllllllIIlIIIIIlIlIllIlllI = (short)lllllllllllllIIlIIIIIlIlIllIllll.length;
        byte lllllllllllllIIlIIIIIlIlIllIllIl = (byte)BlockCake.lIlIIIIllIIIIl[0];
        while (lllIIIIlllIIIll(lllllllllllllIIlIIIIIlIlIllIllIl, lllllllllllllIIlIIIIIlIlIllIlllI)) {
            final char lllllllllllllIIlIIIIIlIlIllllIlI = lllllllllllllIIlIIIIIlIlIllIllll[lllllllllllllIIlIIIIIlIlIllIllIl];
            lllllllllllllIIlIIIIIlIlIlllIlll.append((char)(lllllllllllllIIlIIIIIlIlIllllIlI ^ lllllllllllllIIlIIIIIlIlIlllIllI[lllllllllllllIIlIIIIIlIlIlllIlIl % lllllllllllllIIlIIIIIlIlIlllIllI.length]));
            "".length();
            ++lllllllllllllIIlIIIIIlIlIlllIlIl;
            ++lllllllllllllIIlIIIIIlIlIllIllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIIlIlIlllIlll);
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIlIIIIIlIllIlIlIll, final BlockPos lllllllllllllIIlIIIIIlIllIlIlIlI, final IBlockState lllllllllllllIIlIIIIIlIllIlIlllI, final Block lllllllllllllIIlIIIIIlIllIlIllIl) {
        if (lllIIIIlllIIlII(this.canBlockStay(lllllllllllllIIlIIIIIlIllIlIlIll, lllllllllllllIIlIIIIIlIllIlIlIlI) ? 1 : 0)) {
            lllllllllllllIIlIIIIIlIllIlIlIll.setBlockToAir(lllllllllllllIIlIIIIIlIllIlIlIlI);
            "".length();
        }
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    private static void lllIIIIlllIIIII() {
        (lIlIIIIllIIIIl = new int[6])[0] = ((0x69 ^ 0x3A ^ (0xC9 ^ 0x92)) & (0x7F ^ 0x38 ^ (0x22 ^ 0x6D) ^ -" ".length()));
        BlockCake.lIlIIIIllIIIIl[1] = (0xB7 ^ 0xAE ^ (0x50 ^ 0x4F));
        BlockCake.lIlIIIIllIIIIl[2] = " ".length();
        BlockCake.lIlIIIIllIIIIl[3] = "  ".length();
        BlockCake.lIlIIIIllIIIIl[4] = "   ".length();
        BlockCake.lIlIIIIllIIIIl[5] = (0x48 ^ 0x4F);
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World lllllllllllllIIlIIIIIlIlllllIIII, final BlockPos lllllllllllllIIlIIIIIlIllllIllll) {
        return this.getCollisionBoundingBox(lllllllllllllIIlIIIIIlIlllllIIII, lllllllllllllIIlIIIIIlIllllIllll, lllllllllllllIIlIIIIIlIlllllIIII.getBlockState(lllllllllllllIIlIIIIIlIllllIllll));
    }
    
    @Override
    public void onBlockClicked(final World lllllllllllllIIlIIIIIlIlllIlIlII, final BlockPos lllllllllllllIIlIIIIIlIlllIIllll, final EntityPlayer lllllllllllllIIlIIIIIlIlllIIlllI) {
        this.eatCake(lllllllllllllIIlIIIIIlIlllIlIlII, lllllllllllllIIlIIIIIlIlllIIllll, lllllllllllllIIlIIIIIlIlllIlIlII.getBlockState(lllllllllllllIIlIIIIIlIlllIIllll), lllllllllllllIIlIIIIIlIlllIIlllI);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockCake.lIlIIIIllIIIIl[0] != 0;
    }
    
    private static void lllIIIIllIlIlII() {
        (lIlIIIIlIllIIl = new String[BlockCake.lIlIIIIllIIIIl[2]])[BlockCake.lIlIIIIllIIIIl[0]] = lllIIIIllIlIIll("Cz8jCBg=", "iVWmk");
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIlIIIIIlIllIllIllI, final BlockPos lllllllllllllIIlIIIIIlIllIlllIII) {
        int canBlockStay;
        if (lllIIIIlllIIIlI(super.canPlaceBlockAt(lllllllllllllIIlIIIIIlIllIllIllI, lllllllllllllIIlIIIIIlIllIlllIII) ? 1 : 0)) {
            canBlockStay = (this.canBlockStay(lllllllllllllIIlIIIIIlIllIllIllI, lllllllllllllIIlIIIIIlIllIlllIII) ? 1 : 0);
            "".length();
            if (((0x1B ^ 0x49) & ~(0x6B ^ 0x39)) != ((0x6C ^ 0x2A) & ~(0xEE ^ 0xA8))) {
                return ((0x44 ^ 0x6A) & ~(0xEA ^ 0xC4)) != 0x0;
            }
        }
        else {
            canBlockStay = BlockCake.lIlIIIIllIIIIl[0];
        }
        return canBlockStay != 0;
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIlIIIIIllIIIIlIllI, final BlockPos lllllllllllllIIlIIIIIllIIIIlIlIl) {
        final float lllllllllllllIIlIIIIIllIIIIllIlI = 0.0625f;
        final float lllllllllllllIIlIIIIIllIIIIllIIl = (BlockCake.lIlIIIIllIIIIl[2] + lllllllllllllIIlIIIIIllIIIIlIllI.getBlockState(lllllllllllllIIlIIIIIllIIIIlIlIl).getValue((IProperty<Integer>)BlockCake.BITES) * BlockCake.lIlIIIIllIIIIl[3]) / 16.0f;
        final float lllllllllllllIIlIIIIIllIIIIllIII = 0.5f;
        this.setBlockBounds(lllllllllllllIIlIIIIIllIIIIllIIl, 0.0f, lllllllllllllIIlIIIIIllIIIIllIlI, 1.0f - lllllllllllllIIlIIIIIllIIIIllIlI, lllllllllllllIIlIIIIIllIIIIllIII, 1.0f - lllllllllllllIIlIIIIIllIIIIllIlI);
    }
    
    @Override
    public int getComparatorInputOverride(final World lllllllllllllIIlIIIIIlIllIIIlIII, final BlockPos lllllllllllllIIlIIIIIlIllIIIIlIl) {
        return (BlockCake.lIlIIIIllIIIIl[5] - lllllllllllllIIlIIIIIlIllIIIlIII.getBlockState(lllllllllllllIIlIIIIIlIllIIIIlIl).getValue((IProperty<Integer>)BlockCake.BITES)) * BlockCake.lIlIIIIllIIIIl[3];
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockCake.lIlIIIIllIIIIl[2] != 0;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIlIIIIIlIlllIlllIl, final BlockPos lllllllllllllIIlIIIIIlIlllIlllII, final IBlockState lllllllllllllIIlIIIIIlIlllIllIll, final EntityPlayer lllllllllllllIIlIIIIIlIllllIIIll, final EnumFacing lllllllllllllIIlIIIIIlIllllIIIlI, final float lllllllllllllIIlIIIIIlIllllIIIIl, final float lllllllllllllIIlIIIIIlIllllIIIII, final float lllllllllllllIIlIIIIIlIlllIlllll) {
        this.eatCake(lllllllllllllIIlIIIIIlIlllIlllIl, lllllllllllllIIlIIIIIlIlllIlllII, lllllllllllllIIlIIIIIlIlllIllIll, lllllllllllllIIlIIIIIlIllllIIIll);
        return BlockCake.lIlIIIIllIIIIl[2] != 0;
    }
    
    private static boolean lllIIIIlllIIlII(final int lllllllllllllIIlIIIIIlIlIllIIlII) {
        return lllllllllllllIIlIIIIIlIlIllIIlII == 0;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIlIIIIIlIllIlIIIIl) {
        return BlockCake.lIlIIIIllIIIIl[0];
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockCake.lIlIIIIllIIIIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCake.lIlIIIIllIIIIl[0]] = BlockCake.BITES;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIlIIIIIllIIIIIIIlI, final BlockPos lllllllllllllIIlIIIIIllIIIIIIIIl, final IBlockState lllllllllllllIIlIIIIIlIllllllIll) {
        final float lllllllllllllIIlIIIIIlIlllllllll = 0.0625f;
        final float lllllllllllllIIlIIIIIlIllllllllI = (BlockCake.lIlIIIIllIIIIl[2] + lllllllllllllIIlIIIIIlIllllllIll.getValue((IProperty<Integer>)BlockCake.BITES) * BlockCake.lIlIIIIllIIIIl[3]) / 16.0f;
        final float lllllllllllllIIlIIIIIlIlllllllIl = 0.5f;
        return new AxisAlignedBB(lllllllllllllIIlIIIIIllIIIIIIIIl.getX() + lllllllllllllIIlIIIIIlIllllllllI, lllllllllllllIIlIIIIIllIIIIIIIIl.getY(), lllllllllllllIIlIIIIIllIIIIIIIIl.getZ() + lllllllllllllIIlIIIIIlIlllllllll, lllllllllllllIIlIIIIIllIIIIIIIIl.getX() + BlockCake.lIlIIIIllIIIIl[2] - lllllllllllllIIlIIIIIlIlllllllll, lllllllllllllIIlIIIIIllIIIIIIIIl.getY() + lllllllllllllIIlIIIIIlIlllllllIl, lllllllllllllIIlIIIIIllIIIIIIIIl.getZ() + BlockCake.lIlIIIIllIIIIl[2] - lllllllllllllIIlIIIIIlIlllllllll);
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        final float lllllllllllllIIlIIIIIllIIIIIllIl = 0.0625f;
        final float lllllllllllllIIlIIIIIllIIIIIllII = 0.5f;
        this.setBlockBounds(lllllllllllllIIlIIIIIllIIIIIllIl, 0.0f, lllllllllllllIIlIIIIIllIIIIIllIl, 1.0f - lllllllllllllIIlIIIIIllIIIIIllIl, lllllllllllllIIlIIIIIllIIIIIllII, 1.0f - lllllllllllllIIlIIIIIllIIIIIllIl);
    }
    
    private static boolean lllIIIIlllIIIlI(final int lllllllllllllIIlIIIIIlIlIllIIllI) {
        return lllllllllllllIIlIIIIIlIlIllIIllI != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIIIIIlIllIIIllll) {
        return lllllllllllllIIlIIIIIlIllIIIllll.getValue((IProperty<Integer>)BlockCake.BITES);
    }
    
    private boolean canBlockStay(final World lllllllllllllIIlIIIIIlIllIlIIllI, final BlockPos lllllllllllllIIlIIIIIlIllIlIIlIl) {
        return lllllllllllllIIlIIIIIlIllIlIIllI.getBlockState(lllllllllllllIIlIIIIIlIllIlIIlIl.down()).getBlock().getMaterial().isSolid();
    }
}
