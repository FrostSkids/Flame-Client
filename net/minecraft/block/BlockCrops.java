// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MathHelper;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.state.BlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyInteger;

public class BlockCrops extends BlockBush implements IGrowable
{
    private static final /* synthetic */ int[] llllIIlIlIIIl;
    private static final /* synthetic */ String[] llllIIlIIllll;
    public static final /* synthetic */ PropertyInteger AGE;
    
    private static boolean lIlIlIIIlIIIlII(final int lllllllllllllIlIlllIIllIIIIIllII) {
        return lllllllllllllIlIlllIIllIIIIIllII > 0;
    }
    
    private static boolean lIlIlIIIlIIIIlI(final int lllllllllllllIlIlllIIllIIIIlIIII) {
        return lllllllllllllIlIlllIIllIIIIlIIII == 0;
    }
    
    private static boolean lIlIlIIIlIIIIll(final int lllllllllllllIlIlllIIllIIIlIlIlI, final int lllllllllllllIlIlllIIllIIIlIlIII) {
        return lllllllllllllIlIlllIIllIIIlIlIlI > lllllllllllllIlIlllIIllIIIlIlIII;
    }
    
    @Override
    public boolean canBlockStay(final World lllllllllllllIlIlllIIllIlIlIlIlI, final BlockPos lllllllllllllIlIlllIIllIlIlIlIIl, final IBlockState lllllllllllllIlIlllIIllIlIlIllII) {
        if ((!lIlIlIIIlIIIIIl(lllllllllllllIlIlllIIllIlIlIlIlI.getLight(lllllllllllllIlIlllIIllIlIlIlIIl), BlockCrops.llllIIlIlIIIl[7]) || lIlIlIIIlIIIlIl(lllllllllllllIlIlllIIllIlIlIlIlI.canSeeSky(lllllllllllllIlIlllIIllIlIlIlIIl) ? 1 : 0)) && lIlIlIIIlIIIlIl(this.canPlaceBlockOn(lllllllllllllIlIlllIIllIlIlIlIlI.getBlockState(lllllllllllllIlIlllIIllIlIlIlIIl.down()).getBlock()) ? 1 : 0)) {
            return BlockCrops.llllIIlIlIIIl[2] != 0;
        }
        return BlockCrops.llllIIlIlIIIl[0] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlllIIllIIllIIIII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockCrops.AGE, lllllllllllllIlIlllIIllIIllIIIII);
    }
    
    protected static float getGrowthChance(final Block lllllllllllllIlIlllIIllIllIIlllI, final World lllllllllllllIlIlllIIllIlIllllIl, final BlockPos lllllllllllllIlIlllIIllIlIllllII) {
        float lllllllllllllIlIlllIIllIllIIlIll = 1.0f;
        final BlockPos lllllllllllllIlIlllIIllIllIIlIlI = lllllllllllllIlIlllIIllIlIllllII.down();
        int lllllllllllllIlIlllIIllIllIIlIIl = BlockCrops.llllIIlIlIIIl[6];
        "".length();
        if (null != null) {
            return 0.0f;
        }
        while (!lIlIlIIIlIIIIll(lllllllllllllIlIlllIIllIllIIlIIl, BlockCrops.llllIIlIlIIIl[2])) {
            int lllllllllllllIlIlllIIllIllIIlIII = BlockCrops.llllIIlIlIIIl[6];
            "".length();
            if (((0x80 ^ 0xA1) & ~(0xE3 ^ 0xC2)) != 0x0) {
                return 0.0f;
            }
            while (!lIlIlIIIlIIIIll(lllllllllllllIlIlllIIllIllIIlIII, BlockCrops.llllIIlIlIIIl[2])) {
                float lllllllllllllIlIlllIIllIllIIIlll = 0.0f;
                final IBlockState lllllllllllllIlIlllIIllIllIIIllI = lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIlIlI.add(lllllllllllllIlIlllIIllIllIIlIIl, BlockCrops.llllIIlIlIIIl[0], lllllllllllllIlIlllIIllIllIIlIII));
                if (lIlIlIIIIllllll(lllllllllllllIlIlllIIllIllIIIllI.getBlock(), Blocks.farmland)) {
                    lllllllllllllIlIlllIIllIllIIIlll = 1.0f;
                    if (lIlIlIIIlIIIlII(lllllllllllllIlIlllIIllIllIIIllI.getValue((IProperty<Integer>)BlockFarmland.MOISTURE))) {
                        lllllllllllllIlIlllIIllIllIIIlll = 3.0f;
                    }
                }
                if (!lIlIlIIIlIIIIlI(lllllllllllllIlIlllIIllIllIIlIIl) || lIlIlIIIlIIIlIl(lllllllllllllIlIlllIIllIllIIlIII)) {
                    lllllllllllllIlIlllIIllIllIIIlll /= 4.0f;
                }
                lllllllllllllIlIlllIIllIllIIlIll += lllllllllllllIlIlllIIllIllIIIlll;
                ++lllllllllllllIlIlllIIllIllIIlIII;
            }
            ++lllllllllllllIlIlllIIllIllIIlIIl;
        }
        final BlockPos lllllllllllllIlIlllIIllIllIIIlIl = lllllllllllllIlIlllIIllIlIllllII.north();
        final BlockPos lllllllllllllIlIlllIIllIllIIIlII = lllllllllllllIlIlllIIllIlIllllII.south();
        final BlockPos lllllllllllllIlIlllIIllIllIIIIll = lllllllllllllIlIlllIIllIlIllllII.west();
        final BlockPos lllllllllllllIlIlllIIllIllIIIIlI = lllllllllllllIlIlllIIllIlIllllII.east();
        int n;
        if (lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIIll).getBlock()) && lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIIlI).getBlock())) {
            n = BlockCrops.llllIIlIlIIIl[0];
            "".length();
            if ("  ".length() > (0x69 ^ 0x6D)) {
                return 0.0f;
            }
        }
        else {
            n = BlockCrops.llllIIlIlIIIl[2];
        }
        final boolean lllllllllllllIlIlllIIllIllIIIIIl = n != 0;
        int n2;
        if (lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIlIl).getBlock()) && lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIlII).getBlock())) {
            n2 = BlockCrops.llllIIlIlIIIl[0];
            "".length();
            if ("  ".length() < ((170 + 190 - 269 + 108 ^ 111 + 39 - 34 + 35) & (0x1C ^ 0x7E ^ (0x6 ^ 0x34) ^ -" ".length()))) {
                return 0.0f;
            }
        }
        else {
            n2 = BlockCrops.llllIIlIlIIIl[2];
        }
        final boolean lllllllllllllIlIlllIIllIllIIIIII = n2 != 0;
        if (lIlIlIIIlIIIlIl(lllllllllllllIlIlllIIllIllIIIIIl ? 1 : 0) && lIlIlIIIlIIIlIl(lllllllllllllIlIlllIIllIllIIIIII ? 1 : 0)) {
            lllllllllllllIlIlllIIllIllIIlIll /= 2.0f;
            "".length();
            if ("  ".length() > (0x5D ^ 0x59)) {
                return 0.0f;
            }
        }
        else {
            int n3;
            if (lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIIll.north()).getBlock()) && lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIIlI.north()).getBlock()) && lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIIlI.south()).getBlock()) && lIlIlIIIlIIIllI(lllllllllllllIlIlllIIllIllIIlllI, lllllllllllllIlIlllIIllIlIllllIl.getBlockState(lllllllllllllIlIlllIIllIllIIIIll.south()).getBlock())) {
                n3 = BlockCrops.llllIIlIlIIIl[0];
                "".length();
                if (null != null) {
                    return 0.0f;
                }
            }
            else {
                n3 = BlockCrops.llllIIlIlIIIl[2];
            }
            final boolean lllllllllllllIlIlllIIllIlIllllll = n3 != 0;
            if (lIlIlIIIlIIIlIl(lllllllllllllIlIlllIIllIlIllllll ? 1 : 0)) {
                lllllllllllllIlIlllIIllIllIIlIll /= 2.0f;
            }
        }
        return lllllllllllllIlIlllIIllIllIIlIll;
    }
    
    @Override
    public boolean canUseBonemeal(final World lllllllllllllIlIlllIIllIIlllIllI, final Random lllllllllllllIlIlllIIllIIlllIlIl, final BlockPos lllllllllllllIlIlllIIllIIlllIlII, final IBlockState lllllllllllllIlIlllIIllIIlllIIll) {
        return BlockCrops.llllIIlIlIIIl[2] != 0;
    }
    
    private static boolean lIlIlIIIIllllll(final Object lllllllllllllIlIlllIIllIIIIllIll, final Object lllllllllllllIlIlllIIllIIIIllIIl) {
        return lllllllllllllIlIlllIIllIIIIllIll == lllllllllllllIlIlllIIllIIIIllIIl;
    }
    
    private static void lIlIlIIIIlllllI() {
        (llllIIlIlIIIl = new int[10])[0] = ((0x19 ^ 0x29 ^ (0x5D ^ 0x24)) & (0xCE ^ 0x96 ^ (0x76 ^ 0x67) ^ -" ".length()));
        BlockCrops.llllIIlIlIIIl[1] = (0x8E ^ 0xA2 ^ (0x24 ^ 0xF));
        BlockCrops.llllIIlIlIIIl[2] = " ".length();
        BlockCrops.llllIIlIlIIIl[3] = (0xA3 ^ 0xAA);
        BlockCrops.llllIIlIlIIIl[4] = "  ".length();
        BlockCrops.llllIIlIlIIIl[5] = (52 + 172 - 145 + 104 ^ 66 + 29 - 74 + 157);
        BlockCrops.llllIIlIlIIIl[6] = -" ".length();
        BlockCrops.llllIIlIlIIIl[7] = (0x52 ^ 0x76 ^ (0x78 ^ 0x54));
        BlockCrops.llllIIlIlIIIl[8] = "   ".length();
        BlockCrops.llllIIlIlIIIl[9] = (0x2C ^ 0xB ^ (0x3A ^ 0x12));
    }
    
    private static boolean lIlIlIIIlIIIIII(final int lllllllllllllIlIlllIIllIIIlllIlI, final int lllllllllllllIlIlllIIllIIIlllIIl) {
        return lllllllllllllIlIlllIIllIIIlllIlI >= lllllllllllllIlIlllIIllIIIlllIIl;
    }
    
    @Override
    protected boolean canPlaceBlockOn(final Block lllllllllllllIlIlllIIllIllllllIl) {
        if (lIlIlIIIIllllll(lllllllllllllIlIlllIIllIllllllIl, Blocks.farmland)) {
            return BlockCrops.llllIIlIlIIIl[2] != 0;
        }
        return BlockCrops.llllIIlIlIIIl[0] != 0;
    }
    
    private static void lIlIlIIIIlllIll() {
        (llllIIlIIllll = new String[BlockCrops.llllIIlIlIIIl[2]])[BlockCrops.llllIIlIlIIIl[0]] = lIlIlIIIIlllIlI("EQ4J", "pilTa");
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIlllIIllIIlIlllIl) {
        return lllllllllllllIlIlllIIllIIlIlllIl.getValue((IProperty<Integer>)BlockCrops.AGE);
    }
    
    private static boolean lIlIlIIIlIIIlll(final int lllllllllllllIlIlllIIllIIIllIIIl, final int lllllllllllllIlIlllIIllIIIllIIII) {
        return lllllllllllllIlIlllIIllIIIllIIIl <= lllllllllllllIlIlllIIllIIIllIIII;
    }
    
    protected Item getSeed() {
        return Items.wheat_seeds;
    }
    
    @Override
    public boolean canGrow(final World lllllllllllllIlIlllIIllIIlllllII, final BlockPos lllllllllllllIlIlllIIllIIllllIll, final IBlockState lllllllllllllIlIlllIIllIIllllIII, final boolean lllllllllllllIlIlllIIllIIllllIIl) {
        if (lIlIlIIIlIIIIIl(lllllllllllllIlIlllIIllIIllllIII.getValue((IProperty<Integer>)BlockCrops.AGE), BlockCrops.llllIIlIlIIIl[1])) {
            return BlockCrops.llllIIlIlIIIl[2] != 0;
        }
        return BlockCrops.llllIIlIlIIIl[0] != 0;
    }
    
    private static boolean lIlIlIIIlIIIllI(final Object lllllllllllllIlIlllIIllIIIlIIlII, final Object lllllllllllllIlIlllIIllIIIlIIIlI) {
        return lllllllllllllIlIlllIIllIIIlIIlII != lllllllllllllIlIlllIIllIIIlIIIlI;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockCrops.llllIIlIlIIIl[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCrops.llllIIlIlIIIl[0]] = BlockCrops.AGE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIlIlIIIlIIIlIl(final int lllllllllllllIlIlllIIllIIIIlIIll) {
        return lllllllllllllIlIlllIIllIIIIlIIll != 0;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIlllIIllIlIIIIIIl, final BlockPos lllllllllllllIlIlllIIllIlIIIIIII) {
        return this.getSeed();
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIlllIIllIlIIIlIII, final Random lllllllllllllIlIlllIIllIlIIIIlll, final int lllllllllllllIlIlllIIllIlIIIIllI) {
        Item item;
        if (lIlIlIIIlIIlIII(lllllllllllllIlIlllIIllIlIIIlIII.getValue((IProperty<Integer>)BlockCrops.AGE), BlockCrops.llllIIlIlIIIl[1])) {
            item = this.getCrop();
            "".length();
            if ((0x9E ^ 0x9B) <= 0) {
                return null;
            }
        }
        else {
            item = this.getSeed();
        }
        return item;
    }
    
    private static String lIlIlIIIIlllIlI(String lllllllllllllIlIlllIIllIIlIIlIIl, final String lllllllllllllIlIlllIIllIIlIIllIl) {
        lllllllllllllIlIlllIIllIIlIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIIllIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIIllIIlIIllII = new StringBuilder();
        final char[] lllllllllllllIlIlllIIllIIlIIlIll = lllllllllllllIlIlllIIllIIlIIllIl.toCharArray();
        int lllllllllllllIlIlllIIllIIlIIlIlI = BlockCrops.llllIIlIlIIIl[0];
        final Exception lllllllllllllIlIlllIIllIIlIIIlII = (Object)lllllllllllllIlIlllIIllIIlIIlIIl.toCharArray();
        final long lllllllllllllIlIlllIIllIIlIIIIll = lllllllllllllIlIlllIIllIIlIIIlII.length;
        long lllllllllllllIlIlllIIllIIlIIIIlI = BlockCrops.llllIIlIlIIIl[0];
        while (lIlIlIIIlIIIIIl((int)lllllllllllllIlIlllIIllIIlIIIIlI, (int)lllllllllllllIlIlllIIllIIlIIIIll)) {
            final char lllllllllllllIlIlllIIllIIlIIllll = lllllllllllllIlIlllIIllIIlIIIlII[lllllllllllllIlIlllIIllIIlIIIIlI];
            lllllllllllllIlIlllIIllIIlIIllII.append((char)(lllllllllllllIlIlllIIllIIlIIllll ^ lllllllllllllIlIlllIIllIIlIIlIll[lllllllllllllIlIlllIIllIIlIIlIlI % lllllllllllllIlIlllIIllIIlIIlIll.length]));
            "".length();
            ++lllllllllllllIlIlllIIllIIlIIlIlI;
            ++lllllllllllllIlIlllIIllIIlIIIIlI;
            "".length();
            if ((0x32 ^ 0x36) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIIllIIlIIllII);
    }
    
    private static boolean lIlIlIIIlIIlIII(final int lllllllllllllIlIlllIIllIIIlllllI, final int lllllllllllllIlIlllIIllIIIllllIl) {
        return lllllllllllllIlIlllIIllIIIlllllI == lllllllllllllIlIlllIIllIIIllllIl;
    }
    
    public void grow(final World lllllllllllllIlIlllIIllIlllIIIlI, final BlockPos lllllllllllllIlIlllIIllIllIlllIl, final IBlockState lllllllllllllIlIlllIIllIlllIIIII) {
        int lllllllllllllIlIlllIIllIllIlllll = lllllllllllllIlIlllIIllIlllIIIII.getValue((IProperty<Integer>)BlockCrops.AGE) + MathHelper.getRandomIntegerInRange(lllllllllllllIlIlllIIllIlllIIIlI.rand, BlockCrops.llllIIlIlIIIl[4], BlockCrops.llllIIlIlIIIl[5]);
        if (lIlIlIIIlIIIIll(lllllllllllllIlIlllIIllIllIlllll, BlockCrops.llllIIlIlIIIl[1])) {
            lllllllllllllIlIlllIIllIllIlllll = BlockCrops.llllIIlIlIIIl[1];
        }
        lllllllllllllIlIlllIIllIlllIIIlI.setBlockState(lllllllllllllIlIlllIIllIllIlllIl, lllllllllllllIlIlllIIllIlllIIIII.withProperty((IProperty<Comparable>)BlockCrops.AGE, lllllllllllllIlIlllIIllIllIlllll), BlockCrops.llllIIlIlIIIl[4]);
        "".length();
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIlllIIllIllllIlII, final BlockPos lllllllllllllIlIlllIIllIlllIllII, final IBlockState lllllllllllllIlIlllIIllIllllIIlI, final Random lllllllllllllIlIlllIIllIlllIlIlI) {
        super.updateTick(lllllllllllllIlIlllIIllIllllIlII, lllllllllllllIlIlllIIllIlllIllII, lllllllllllllIlIlllIIllIllllIIlI, lllllllllllllIlIlllIIllIlllIlIlI);
        if (lIlIlIIIlIIIIII(lllllllllllllIlIlllIIllIllllIlII.getLightFromNeighbors(lllllllllllllIlIlllIIllIlllIllII.up()), BlockCrops.llllIIlIlIIIl[3])) {
            final int lllllllllllllIlIlllIIllIllllIIII = lllllllllllllIlIlllIIllIllllIIlI.getValue((IProperty<Integer>)BlockCrops.AGE);
            if (lIlIlIIIlIIIIIl(lllllllllllllIlIlllIIllIllllIIII, BlockCrops.llllIIlIlIIIl[1])) {
                final float lllllllllllllIlIlllIIllIlllIllll = getGrowthChance(this, lllllllllllllIlIlllIIllIllllIlII, lllllllllllllIlIlllIIllIlllIllII);
                if (lIlIlIIIlIIIIlI(lllllllllllllIlIlllIIllIlllIlIlI.nextInt((int)(25.0f / lllllllllllllIlIlllIIllIlllIllll) + BlockCrops.llllIIlIlIIIl[2]))) {
                    lllllllllllllIlIlllIIllIllllIlII.setBlockState(lllllllllllllIlIlllIIllIlllIllII, lllllllllllllIlIlllIIllIllllIIlI.withProperty((IProperty<Comparable>)BlockCrops.AGE, lllllllllllllIlIlllIIllIllllIIII + BlockCrops.llllIIlIlIIIl[2]), BlockCrops.llllIIlIlIIIl[4]);
                    "".length();
                }
            }
        }
    }
    
    static {
        lIlIlIIIIlllllI();
        lIlIlIIIIlllIll();
        AGE = PropertyInteger.create(BlockCrops.llllIIlIIllll[BlockCrops.llllIIlIlIIIl[0]], BlockCrops.llllIIlIlIIIl[0], BlockCrops.llllIIlIlIIIl[1]);
    }
    
    protected Item getCrop() {
        return Items.wheat;
    }
    
    protected BlockCrops() {
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockCrops.AGE, BlockCrops.llllIIlIlIIIl[0]));
        this.setTickRandomly((boolean)(BlockCrops.llllIIlIlIIIl[2] != 0));
        "".length();
        final float lllllllllllllIlIlllIIlllIIIIIIll = 0.5f;
        this.setBlockBounds(0.5f - lllllllllllllIlIlllIIlllIIIIIIll, 0.0f, 0.5f - lllllllllllllIlIlllIIlllIIIIIIll, 0.5f + lllllllllllllIlIlllIIlllIIIIIIll, 0.25f, 0.5f + lllllllllllllIlIlllIIlllIIIIIIll);
        this.setCreativeTab(null);
        "".length();
        this.setHardness(0.0f);
        "".length();
        this.setStepSound(BlockCrops.soundTypeGrass);
        "".length();
        this.disableStats();
        "".length();
    }
    
    @Override
    public void grow(final World lllllllllllllIlIlllIIllIIllIllIl, final Random lllllllllllllIlIlllIIllIIllIllII, final BlockPos lllllllllllllIlIlllIIllIIllIIlll, final IBlockState lllllllllllllIlIlllIIllIIllIlIlI) {
        this.grow(lllllllllllllIlIlllIIllIIllIllIl, lllllllllllllIlIlllIIllIIllIIlll, lllllllllllllIlIlllIIllIIllIlIlI);
    }
    
    private static boolean lIlIlIIIlIIIIIl(final int lllllllllllllIlIlllIIllIIIllIllI, final int lllllllllllllIlIlllIIllIIIllIlIl) {
        return lllllllllllllIlIlllIIllIIIllIllI < lllllllllllllIlIlllIIllIIIllIlIl;
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIlIlllIIllIlIIlllII, final BlockPos lllllllllllllIlIlllIIllIlIIllIll, final IBlockState lllllllllllllIlIlllIIllIlIIlIIIl, final float lllllllllllllIlIlllIIllIlIIlIIII, final int lllllllllllllIlIlllIIllIlIIIllll) {
        super.dropBlockAsItemWithChance(lllllllllllllIlIlllIIllIlIIlllII, lllllllllllllIlIlllIIllIlIIllIll, lllllllllllllIlIlllIIllIlIIlIIIl, lllllllllllllIlIlllIIllIlIIlIIII, BlockCrops.llllIIlIlIIIl[0]);
        if (lIlIlIIIlIIIIlI(lllllllllllllIlIlllIIllIlIIlllII.isRemote ? 1 : 0)) {
            final int lllllllllllllIlIlllIIllIlIIlIlll = lllllllllllllIlIlllIIllIlIIlIIIl.getValue((IProperty<Integer>)BlockCrops.AGE);
            if (lIlIlIIIlIIIIII(lllllllllllllIlIlllIIllIlIIlIlll, BlockCrops.llllIIlIlIIIl[1])) {
                final int lllllllllllllIlIlllIIllIlIIlIllI = BlockCrops.llllIIlIlIIIl[8] + lllllllllllllIlIlllIIllIlIIIllll;
                int lllllllllllllIlIlllIIllIlIIlIlIl = BlockCrops.llllIIlIlIIIl[0];
                "".length();
                if (((0xD5 ^ 0xAD ^ (0x54 ^ 0x16)) & (139 + 109 - 137 + 33 ^ 67 + 149 - 144 + 98 ^ -" ".length())) < 0) {
                    return;
                }
                while (!lIlIlIIIlIIIIII(lllllllllllllIlIlllIIllIlIIlIlIl, lllllllllllllIlIlllIIllIlIIlIllI)) {
                    if (lIlIlIIIlIIIlll(lllllllllllllIlIlllIIllIlIIlllII.rand.nextInt(BlockCrops.llllIIlIlIIIl[9]), lllllllllllllIlIlllIIllIlIIlIlll)) {
                        Block.spawnAsEntity(lllllllllllllIlIlllIIllIlIIlllII, lllllllllllllIlIlllIIllIlIIllIll, new ItemStack(this.getSeed(), BlockCrops.llllIIlIlIIIl[2], BlockCrops.llllIIlIlIIIl[0]));
                    }
                    ++lllllllllllllIlIlllIIllIlIIlIlIl;
                }
            }
        }
    }
}
