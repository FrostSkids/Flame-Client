// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.state.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyInteger;

public class BlockNetherWart extends BlockBush
{
    private static final /* synthetic */ String[] llllIlllIlIII;
    public static final /* synthetic */ PropertyInteger AGE;
    private static final /* synthetic */ int[] llllIlllIlIIl;
    
    @Override
    public Item getItem(final World lllllllllllllIlIllIIlIIIlIIIIIll, final BlockPos lllllllllllllIlIllIIlIIIlIIIIIlI) {
        return Items.nether_wart;
    }
    
    @Override
    protected boolean canPlaceBlockOn(final Block lllllllllllllIlIllIIlIIIlIlllIll) {
        if (lIlIllIIIIlIlll(lllllllllllllIlIllIIlIIIlIlllIll, Blocks.soul_sand)) {
            return BlockNetherWart.llllIlllIlIIl[2] != 0;
        }
        return BlockNetherWart.llllIlllIlIIl[0] != 0;
    }
    
    private static boolean lIlIllIIIIllIlI(final int lllllllllllllIlIllIIlIIIIlIllIlI, final int lllllllllllllIlIllIIlIIIIlIllIIl) {
        return lllllllllllllIlIllIIlIIIIlIllIlI >= lllllllllllllIlIllIIlIIIIlIllIIl;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIllIIlIIIlIIIIlIl) {
        return BlockNetherWart.llllIlllIlIIl[0];
    }
    
    private static boolean lIlIllIIIIlIlll(final Object lllllllllllllIlIllIIlIIIIlIlIIlI, final Object lllllllllllllIlIllIIlIIIIlIlIIIl) {
        return lllllllllllllIlIllIIlIIIIlIlIIlI == lllllllllllllIlIllIIlIIIIlIlIIIl;
    }
    
    static {
        lIlIllIIIIlIllI();
        lIlIllIIIIlIlIl();
        AGE = PropertyInteger.create(BlockNetherWart.llllIlllIlIII[BlockNetherWart.llllIlllIlIIl[0]], BlockNetherWart.llllIlllIlIIl[0], BlockNetherWart.llllIlllIlIIl[1]);
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIlIllIIlIIIlIIlIIII, final BlockPos lllllllllllllIlIllIIlIIIlIIIllll, final IBlockState lllllllllllllIlIllIIlIIIlIIIlllI, final float lllllllllllllIlIllIIlIIIlIIlIlII, final int lllllllllllllIlIllIIlIIIlIIIllIl) {
        if (lIlIllIIIIllIIl(lllllllllllllIlIllIIlIIIlIIlIIII.isRemote ? 1 : 0)) {
            int lllllllllllllIlIllIIlIIIlIIlIIlI = BlockNetherWart.llllIlllIlIIl[2];
            if (lIlIllIIIIllIlI(lllllllllllllIlIllIIlIIIlIIIlllI.getValue((IProperty<Integer>)BlockNetherWart.AGE), BlockNetherWart.llllIlllIlIIl[1])) {
                lllllllllllllIlIllIIlIIIlIIlIIlI = BlockNetherWart.llllIlllIlIIl[4] + lllllllllllllIlIllIIlIIIlIIlIIII.rand.nextInt(BlockNetherWart.llllIlllIlIIl[1]);
                if (lIlIllIIIIllIll(lllllllllllllIlIllIIlIIIlIIIllIl)) {
                    lllllllllllllIlIllIIlIIIlIIlIIlI += lllllllllllllIlIllIIlIIIlIIlIIII.rand.nextInt(lllllllllllllIlIllIIlIIIlIIIllIl + BlockNetherWart.llllIlllIlIIl[2]);
                }
            }
            int lllllllllllllIlIllIIlIIIlIIlIIIl = BlockNetherWart.llllIlllIlIIl[0];
            "".length();
            if (" ".length() < 0) {
                return;
            }
            while (!lIlIllIIIIllIlI(lllllllllllllIlIllIIlIIIlIIlIIIl, lllllllllllllIlIllIIlIIIlIIlIIlI)) {
                Block.spawnAsEntity(lllllllllllllIlIllIIlIIIlIIlIIII, lllllllllllllIlIllIIlIIIlIIIllll, new ItemStack(Items.nether_wart));
                ++lllllllllllllIlIllIIlIIIlIIlIIIl;
            }
        }
    }
    
    private static boolean lIlIllIIIIllIII(final int lllllllllllllIlIllIIlIIIIlIlIllI, final int lllllllllllllIlIllIIlIIIIlIlIlIl) {
        return lllllllllllllIlIllIIlIIIIlIlIllI < lllllllllllllIlIllIIlIIIIlIlIlIl;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIllIIlIIIIlllllII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockNetherWart.AGE, lllllllllllllIlIllIIlIIIIlllllII);
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockNetherWart.llllIlllIlIIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockNetherWart.llllIlllIlIIl[0]] = BlockNetherWart.AGE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public boolean canBlockStay(final World lllllllllllllIlIllIIlIIIlIllIllI, final BlockPos lllllllllllllIlIllIIlIIIlIllIIIl, final IBlockState lllllllllllllIlIllIIlIIIlIllIlII) {
        return this.canPlaceBlockOn(lllllllllllllIlIllIIlIIIlIllIllI.getBlockState(lllllllllllllIlIllIIlIIIlIllIIIl.down()).getBlock());
    }
    
    private static boolean lIlIllIIIIllIIl(final int lllllllllllllIlIllIIlIIIIlIIllll) {
        return lllllllllllllIlIllIIlIIIIlIIllll == 0;
    }
    
    private static void lIlIllIIIIlIlIl() {
        (llllIlllIlIII = new String[BlockNetherWart.llllIlllIlIIl[2]])[BlockNetherWart.llllIlllIlIIl[0]] = lIlIllIIIIlIlII("Jhco", "GpMrt");
    }
    
    private static void lIlIllIIIIlIllI() {
        (llllIlllIlIIl = new int[5])[0] = ((0xCA ^ 0xA8 ^ (0x1E ^ 0x57)) & (0x4A ^ 0x64 ^ (0x66 ^ 0x63) ^ -" ".length()));
        BlockNetherWart.llllIlllIlIIl[1] = "   ".length();
        BlockNetherWart.llllIlllIlIIl[2] = " ".length();
        BlockNetherWart.llllIlllIlIIl[3] = ("   ".length() ^ (0x9A ^ 0x93));
        BlockNetherWart.llllIlllIlIIl[4] = "  ".length();
    }
    
    private static String lIlIllIIIIlIlII(String lllllllllllllIlIllIIlIIIIllIIlIl, final String lllllllllllllIlIllIIlIIIIllIIlII) {
        lllllllllllllIlIllIIlIIIIllIIlIl = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIIlIIIIllIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIlIIIIllIlIII = new StringBuilder();
        final char[] lllllllllllllIlIllIIlIIIIllIIlll = lllllllllllllIlIllIIlIIIIllIIlII.toCharArray();
        int lllllllllllllIlIllIIlIIIIllIIllI = BlockNetherWart.llllIlllIlIIl[0];
        final long lllllllllllllIlIllIIlIIIIllIIIII = (Object)((String)lllllllllllllIlIllIIlIIIIllIIlIl).toCharArray();
        final byte lllllllllllllIlIllIIlIIIIlIlllll = (byte)lllllllllllllIlIllIIlIIIIllIIIII.length;
        int lllllllllllllIlIllIIlIIIIlIllllI = BlockNetherWart.llllIlllIlIIl[0];
        while (lIlIllIIIIllIII(lllllllllllllIlIllIIlIIIIlIllllI, lllllllllllllIlIllIIlIIIIlIlllll)) {
            final char lllllllllllllIlIllIIlIIIIllIlIll = lllllllllllllIlIllIIlIIIIllIIIII[lllllllllllllIlIllIIlIIIIlIllllI];
            lllllllllllllIlIllIIlIIIIllIlIII.append((char)(lllllllllllllIlIllIIlIIIIllIlIll ^ lllllllllllllIlIllIIlIIIIllIIlll[lllllllllllllIlIllIIlIIIIllIIllI % lllllllllllllIlIllIIlIIIIllIIlll.length]));
            "".length();
            ++lllllllllllllIlIllIIlIIIIllIIllI;
            ++lllllllllllllIlIllIIlIIIIlIllllI;
            "".length();
            if (((0x64 ^ 0x4B) & ~(0x13 ^ 0x3C)) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIlIIIIllIlIII);
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIllIIlIIIlIlIlIIl, final BlockPos lllllllllllllIlIllIIlIIIlIlIlIII, IBlockState lllllllllllllIlIllIIlIIIlIlIIIIl, final Random lllllllllllllIlIllIIlIIIlIlIIIII) {
        final int lllllllllllllIlIllIIlIIIlIlIIlIl = ((IBlockState)lllllllllllllIlIllIIlIIIlIlIIIIl).getValue((IProperty<Integer>)BlockNetherWart.AGE);
        if (lIlIllIIIIllIII(lllllllllllllIlIllIIlIIIlIlIIlIl, BlockNetherWart.llllIlllIlIIl[1]) && lIlIllIIIIllIIl(lllllllllllllIlIllIIlIIIlIlIIIII.nextInt(BlockNetherWart.llllIlllIlIIl[3]))) {
            lllllllllllllIlIllIIlIIIlIlIIIIl = ((IBlockState)lllllllllllllIlIllIIlIIIlIlIIIIl).withProperty((IProperty<Comparable>)BlockNetherWart.AGE, Integer.valueOf(lllllllllllllIlIllIIlIIIlIlIIlIl + BlockNetherWart.llllIlllIlIIl[2]));
            lllllllllllllIlIllIIlIIIlIlIlIIl.setBlockState(lllllllllllllIlIllIIlIIIlIlIlIII, (IBlockState)lllllllllllllIlIllIIlIIIlIlIIIIl, BlockNetherWart.llllIlllIlIIl[4]);
            "".length();
        }
        super.updateTick(lllllllllllllIlIllIIlIIIlIlIlIIl, lllllllllllllIlIllIIlIIIlIlIlIII, (IBlockState)lllllllllllllIlIllIIlIIIlIlIIIIl, lllllllllllllIlIllIIlIIIlIlIIIII);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIllIIlIIIlIIIlIIl, final Random lllllllllllllIlIllIIlIIIlIIIlIII, final int lllllllllllllIlIllIIlIIIlIIIIlll) {
        return null;
    }
    
    private static boolean lIlIllIIIIllIll(final int lllllllllllllIlIllIIlIIIIlIIllIl) {
        return lllllllllllllIlIllIIlIIIIlIIllIl > 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIllIIlIIIIllllIIl) {
        return lllllllllllllIlIllIIlIIIIllllIIl.getValue((IProperty<Integer>)BlockNetherWart.AGE);
    }
    
    protected BlockNetherWart() {
        super(Material.plants, MapColor.redColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockNetherWart.AGE, BlockNetherWart.llllIlllIlIIl[0]));
        this.setTickRandomly((boolean)(BlockNetherWart.llllIlllIlIIl[2] != 0));
        "".length();
        final float lllllllllllllIlIllIIlIIIllIIIIIl = 0.5f;
        this.setBlockBounds(0.5f - lllllllllllllIlIllIIlIIIllIIIIIl, 0.0f, 0.5f - lllllllllllllIlIllIIlIIIllIIIIIl, 0.5f + lllllllllllllIlIllIIlIIIllIIIIIl, 0.25f, 0.5f + lllllllllllllIlIllIIlIIIllIIIIIl);
        this.setCreativeTab(null);
        "".length();
    }
}
