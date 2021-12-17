// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.block.properties.IProperty;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockMushroom extends BlockBush implements IGrowable
{
    private static final /* synthetic */ int[] lIllIIllIlllIl;
    
    private static boolean lllllIlIllllIlI(final int lllllllllllllIIIIIIlIIllllIIIIII, final int lllllllllllllIIIIIIlIIlllIllllll) {
        return lllllllllllllIIIIIIlIIllllIIIIII < lllllllllllllIIIIIIlIIlllIllllll;
    }
    
    @Override
    public boolean canGrow(final World lllllllllllllIIIIIIlIIlllllIIIII, final BlockPos lllllllllllllIIIIIIlIIllllIlllll, final IBlockState lllllllllllllIIIIIIlIIllllIllllI, final boolean lllllllllllllIIIIIIlIIllllIlllIl) {
        return BlockMushroom.lIllIIllIlllIl[0] != 0;
    }
    
    private static boolean lllllIlIlllllIl(final int lllllllllllllIIIIIIlIIlllIllIIIl) {
        return lllllllllllllIIIIIIlIIlllIllIIIl < 0;
    }
    
    @Override
    protected boolean canPlaceBlockOn(final Block lllllllllllllIIIIIIlIlIIIIIIIIlI) {
        return lllllllllllllIIIIIIlIlIIIIIIIIlI.isFullBlock();
    }
    
    private static void lllllIlIlllIIlI() {
        (lIllIIllIlllIl = new int[11])[0] = " ".length();
        BlockMushroom.lIllIIllIlllIl[1] = (145 + 183 - 248 + 137 ^ 111 + 173 - 179 + 87);
        BlockMushroom.lIllIIllIlllIl[2] = (0x1F ^ 0x41 ^ (0x1 ^ 0x5A));
        BlockMushroom.lIllIIllIlllIl[3] = (0x91 ^ 0xA6 ^ (0x9B ^ 0xA8));
        BlockMushroom.lIllIIllIlllIl[4] = -(0x2F ^ 0x2B);
        BlockMushroom.lIllIIllIlllIl[5] = -" ".length();
        BlockMushroom.lIllIIllIlllIl[6] = "   ".length();
        BlockMushroom.lIllIIllIlllIl[7] = "  ".length();
        BlockMushroom.lIllIIllIlllIl[8] = ((0xC5 ^ 0xA6) & ~(0xDB ^ 0xB8));
        BlockMushroom.lIllIIllIlllIl[9] = (-(0xFFFFFC7B & 0xFED) & (0xFFFFDDED & 0x2F7A));
        BlockMushroom.lIllIIllIlllIl[10] = (0x26 ^ 0xB ^ (0x1A ^ 0x3A));
    }
    
    public boolean generateBigMushroom(final World lllllllllllllIIIIIIlIIlllllIIllI, final BlockPos lllllllllllllIIIIIIlIIlllllIlIll, final IBlockState lllllllllllllIIIIIIlIIlllllIlIlI, final Random lllllllllllllIIIIIIlIIlllllIlIIl) {
        lllllllllllllIIIIIIlIIlllllIIllI.setBlockToAir(lllllllllllllIIIIIIlIIlllllIlIll);
        "".length();
        WorldGenerator lllllllllllllIIIIIIlIIlllllIlIII = null;
        if (lllllIlIlllIlIl(this, Blocks.brown_mushroom)) {
            lllllllllllllIIIIIIlIIlllllIlIII = new WorldGenBigMushroom(Blocks.brown_mushroom_block);
            "".length();
            if (((0x2C ^ 0xA) & ~(0x43 ^ 0x65)) > (" ".length() & ~" ".length())) {
                return ((0xF ^ 0x15) & ~(0x6E ^ 0x74)) != 0x0;
            }
        }
        else if (lllllIlIlllIlIl(this, Blocks.red_mushroom)) {
            lllllllllllllIIIIIIlIIlllllIlIII = new WorldGenBigMushroom(Blocks.red_mushroom_block);
        }
        if (lllllIlIllllIll(lllllllllllllIIIIIIlIIlllllIlIII) && lllllIlIlllIlll(lllllllllllllIIIIIIlIIlllllIlIII.generate(lllllllllllllIIIIIIlIIlllllIIllI, lllllllllllllIIIIIIlIIlllllIlIIl, lllllllllllllIIIIIIlIIlllllIlIll) ? 1 : 0)) {
            return BlockMushroom.lIllIIllIlllIl[0] != 0;
        }
        lllllllllllllIIIIIIlIIlllllIIllI.setBlockState(lllllllllllllIIIIIIlIIlllllIlIll, lllllllllllllIIIIIIlIIlllllIlIlI, BlockMushroom.lIllIIllIlllIl[6]);
        "".length();
        return BlockMushroom.lIllIIllIlllIl[8] != 0;
    }
    
    protected BlockMushroom() {
        final float lllllllllllllIIIIIIlIlIIIIlIlIlI = 0.2f;
        this.setBlockBounds(0.5f - lllllllllllllIIIIIIlIlIIIIlIlIlI, 0.0f, 0.5f - lllllllllllllIIIIIIlIlIIIIlIlIlI, 0.5f + lllllllllllllIIIIIIlIlIIIIlIlIlI, lllllllllllllIIIIIIlIlIIIIlIlIlI * 2.0f, 0.5f + lllllllllllllIIIIIIlIlIIIIlIlIlI);
        this.setTickRandomly((boolean)(BlockMushroom.lIllIIllIlllIl[0] != 0));
        "".length();
    }
    
    @Override
    public boolean canBlockStay(final World lllllllllllllIIIIIIlIIlllllllIll, final BlockPos lllllllllllllIIIIIIlIIlllllllIlI, final IBlockState lllllllllllllIIIIIIlIIlllllllIIl) {
        if (lllllIlIllllIIl(lllllllllllllIIIIIIlIIlllllllIlI.getY()) && lllllIlIllllIlI(lllllllllllllIIIIIIlIIlllllllIlI.getY(), BlockMushroom.lIllIIllIlllIl[9])) {
            final IBlockState lllllllllllllIIIIIIlIIlllllllIII = lllllllllllllIIIIIIlIIlllllllIll.getBlockState(lllllllllllllIIIIIIlIIlllllllIlI.down());
            int n;
            if (lllllIlIlllIlIl(lllllllllllllIIIIIIlIIlllllllIII.getBlock(), Blocks.mycelium)) {
                n = BlockMushroom.lIllIIllIlllIl[0];
                "".length();
                if (" ".length() < 0) {
                    return ((0xD0 ^ 0xA2 ^ (0x47 ^ 0x32)) & (0x13 ^ 0x17 ^ "   ".length() ^ -" ".length())) != 0x0;
                }
            }
            else if (lllllIlIlllIlIl(lllllllllllllIIIIIIlIIlllllllIII.getBlock(), Blocks.dirt) && lllllIlIlllIlIl(lllllllllllllIIIIIIlIIlllllllIII.getValue(BlockDirt.VARIANT), BlockDirt.DirtType.PODZOL)) {
                n = BlockMushroom.lIllIIllIlllIl[0];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x70 ^ 0x38) & ~(0x8C ^ 0xC4)) != 0x0;
                }
            }
            else if (lllllIlIllllIlI(lllllllllllllIIIIIIlIIlllllllIll.getLight(lllllllllllllIIIIIIlIIlllllllIlI), BlockMushroom.lIllIIllIlllIl[10]) && lllllIlIlllIlll(this.canPlaceBlockOn(lllllllllllllIIIIIIlIIlllllllIII.getBlock()) ? 1 : 0)) {
                n = BlockMushroom.lIllIIllIlllIl[0];
                "".length();
                if (" ".length() == 0) {
                    return ((11 + 45 + 122 + 36 ^ 15 + 55 + 15 + 59) & (0xBA ^ 0x9D ^ (0x4A ^ 0x2B) ^ -" ".length()) & (((0x57 ^ 0x2D ^ (0x7F ^ 0xD)) & (0x7A ^ 0x42 ^ (0x6F ^ 0x5F) ^ -" ".length())) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = BlockMushroom.lIllIIllIlllIl[8];
            }
            return n != 0;
        }
        return BlockMushroom.lIllIIllIlllIl[8] != 0;
    }
    
    private static boolean lllllIlIlllIlll(final int lllllllllllllIIIIIIlIIlllIllIlll) {
        return lllllllllllllIIIIIIlIIlllIllIlll != 0;
    }
    
    @Override
    public void grow(final World lllllllllllllIIIIIIlIIllllIIlIlI, final Random lllllllllllllIIIIIIlIIllllIIlllI, final BlockPos lllllllllllllIIIIIIlIIllllIIllIl, final IBlockState lllllllllllllIIIIIIlIIllllIIIlll) {
        this.generateBigMushroom(lllllllllllllIIIIIIlIIllllIIlIlI, lllllllllllllIIIIIIlIIllllIIllIl, lllllllllllllIIIIIIlIIllllIIIlll, lllllllllllllIIIIIIlIIllllIIlllI);
        "".length();
    }
    
    static {
        lllllIlIlllIIlI();
    }
    
    private static boolean lllllIlIlllIlIl(final Object lllllllllllllIIIIIIlIIlllIllllII, final Object lllllllllllllIIIIIIlIIlllIlllIll) {
        return lllllllllllllIIIIIIlIIlllIllllII == lllllllllllllIIIIIIlIIlllIlllIll;
    }
    
    private static boolean lllllIlIllllIIl(final int lllllllllllllIIIIIIlIIlllIllIIll) {
        return lllllllllllllIIIIIIlIIlllIllIIll >= 0;
    }
    
    private static int lllllIlIlllllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIIIIIlIlIIIIIIlIIl, final BlockPos lllllllllllllIIIIIIlIlIIIIIIIlIl) {
        if (lllllIlIlllIlll(super.canPlaceBlockAt(lllllllllllllIIIIIIlIlIIIIIIlIIl, lllllllllllllIIIIIIlIlIIIIIIIlIl) ? 1 : 0) && lllllIlIlllIlll(this.canBlockStay(lllllllllllllIIIIIIlIlIIIIIIlIIl, lllllllllllllIIIIIIlIlIIIIIIIlIl, this.getDefaultState()) ? 1 : 0)) {
            return BlockMushroom.lIllIIllIlllIl[0] != 0;
        }
        return BlockMushroom.lIllIIllIlllIl[8] != 0;
    }
    
    @Override
    public boolean canUseBonemeal(final World lllllllllllllIIIIIIlIIllllIllIlI, final Random lllllllllllllIIIIIIlIIllllIlIllI, final BlockPos lllllllllllllIIIIIIlIIllllIllIII, final IBlockState lllllllllllllIIIIIIlIIllllIlIlll) {
        if (lllllIlIlllllIl(lllllIlIlllllII(lllllllllllllIIIIIIlIIllllIlIllI.nextFloat(), 0.4))) {
            return BlockMushroom.lIllIIllIlllIl[0] != 0;
        }
        return BlockMushroom.lIllIIllIlllIl[8] != 0;
    }
    
    private static boolean lllllIlIllllIll(final Object lllllllllllllIIIIIIlIIlllIlllIIl) {
        return lllllllllllllIIIIIIlIIlllIlllIIl != null;
    }
    
    private static boolean lllllIlIllllIII(final int lllllllllllllIIIIIIlIIllllIIIlII, final int lllllllllllllIIIIIIlIIllllIIIIll) {
        return lllllllllllllIIIIIIlIIllllIIIlII >= lllllllllllllIIIIIIlIIllllIIIIll;
    }
    
    private static boolean lllllIlIlllIllI(final int lllllllllllllIIIIIIlIIlllIlIllll) {
        return lllllllllllllIIIIIIlIIlllIlIllll <= 0;
    }
    
    @Override
    public void updateTick(final World lllllllllllllIIIIIIlIlIIIIIlIlII, BlockPos lllllllllllllIIIIIIlIlIIIIIlIIll, final IBlockState lllllllllllllIIIIIIlIlIIIIIlllII, final Random lllllllllllllIIIIIIlIlIIIIIlIIlI) {
        if (lllllIlIlllIlII(lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[1]))) {
            int lllllllllllllIIIIIIlIlIIIIIllIlI = BlockMushroom.lIllIIllIlllIl[2];
            final int lllllllllllllIIIIIIlIlIIIIIllIIl = BlockMushroom.lIllIIllIlllIl[3];
            final byte lllllllllllllIIIIIIlIlIIIIIIlllI = (byte)BlockPos.getAllInBoxMutable(lllllllllllllIIIIIIlIlIIIIIlIIll.add(BlockMushroom.lIllIIllIlllIl[4], BlockMushroom.lIllIIllIlllIl[5], BlockMushroom.lIllIIllIlllIl[4]), lllllllllllllIIIIIIlIlIIIIIlIIll.add(BlockMushroom.lIllIIllIlllIl[3], BlockMushroom.lIllIIllIlllIl[0], BlockMushroom.lIllIIllIlllIl[3])).iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lllllIlIlllIlII(((Iterator)lllllllllllllIIIIIIlIlIIIIIIlllI).hasNext() ? 1 : 0)) {
                final BlockPos lllllllllllllIIIIIIlIlIIIIIllIII = ((Iterator<BlockPos>)lllllllllllllIIIIIIlIlIIIIIIlllI).next();
                if (lllllIlIlllIlIl(lllllllllllllIIIIIIlIlIIIIIlIlII.getBlockState(lllllllllllllIIIIIIlIlIIIIIllIII).getBlock(), this) && lllllIlIlllIllI(--lllllllllllllIIIIIIlIlIIIIIllIlI)) {
                    return;
                }
            }
            BlockPos lllllllllllllIIIIIIlIlIIIIIlIlll = lllllllllllllIIIIIIlIlIIIIIlIIll.add(lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[6]) - BlockMushroom.lIllIIllIlllIl[0], lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[7]) - lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[7]), lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[6]) - BlockMushroom.lIllIIllIlllIl[0]);
            int lllllllllllllIIIIIIlIlIIIIIlIllI = BlockMushroom.lIllIIllIlllIl[8];
            "".length();
            if (null != null) {
                return;
            }
            while (!lllllIlIllllIII(lllllllllllllIIIIIIlIlIIIIIlIllI, BlockMushroom.lIllIIllIlllIl[3])) {
                if (lllllIlIlllIlll(lllllllllllllIIIIIIlIlIIIIIlIlII.isAirBlock(lllllllllllllIIIIIIlIlIIIIIlIlll) ? 1 : 0) && lllllIlIlllIlll(this.canBlockStay(lllllllllllllIIIIIIlIlIIIIIlIlII, lllllllllllllIIIIIIlIlIIIIIlIlll, this.getDefaultState()) ? 1 : 0)) {
                    lllllllllllllIIIIIIlIlIIIIIlIIll = lllllllllllllIIIIIIlIlIIIIIlIlll;
                }
                lllllllllllllIIIIIIlIlIIIIIlIlll = lllllllllllllIIIIIIlIlIIIIIlIIll.add(lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[6]) - BlockMushroom.lIllIIllIlllIl[0], lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[7]) - lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[7]), lllllllllllllIIIIIIlIlIIIIIlIIlI.nextInt(BlockMushroom.lIllIIllIlllIl[6]) - BlockMushroom.lIllIIllIlllIl[0]);
                ++lllllllllllllIIIIIIlIlIIIIIlIllI;
            }
            if (lllllIlIlllIlll(lllllllllllllIIIIIIlIlIIIIIlIlII.isAirBlock(lllllllllllllIIIIIIlIlIIIIIlIlll) ? 1 : 0) && lllllIlIlllIlll(this.canBlockStay(lllllllllllllIIIIIIlIlIIIIIlIlII, lllllllllllllIIIIIIlIlIIIIIlIlll, this.getDefaultState()) ? 1 : 0)) {
                lllllllllllllIIIIIIlIlIIIIIlIlII.setBlockState(lllllllllllllIIIIIIlIlIIIIIlIlll, this.getDefaultState(), BlockMushroom.lIllIIllIlllIl[7]);
                "".length();
            }
        }
    }
    
    private static boolean lllllIlIlllIlII(final int lllllllllllllIIIIIIlIIlllIllIlIl) {
        return lllllllllllllIIIIIIlIIlllIllIlIl == 0;
    }
}
