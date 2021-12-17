// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state;

import java.util.Collection;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import java.util.List;

public class BlockPistonStructureHelper
{
    private final /* synthetic */ List<BlockPos> toDestroy;
    private final /* synthetic */ BlockPos blockToMove;
    private static final /* synthetic */ int[] lIlIIllllIlIll;
    private final /* synthetic */ World world;
    private final /* synthetic */ BlockPos pistonPos;
    private final /* synthetic */ List<BlockPos> toMove;
    private final /* synthetic */ EnumFacing moveDirection;
    
    private boolean func_177251_a(final BlockPos lllllllllllllIIIlIlllIIIIIlIlIII) {
        Block lllllllllllllIIIlIlllIIIIIllIIll = this.world.getBlockState(lllllllllllllIIIlIlllIIIIIlIlIII).getBlock();
        if (lllIlIlIIIIIlII(lllllllllllllIIIlIlllIIIIIllIIll.getMaterial(), Material.air)) {
            return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
        }
        if (lllIlIlIIIIIIlI(BlockPistonBase.canPush(lllllllllllllIIIlIlllIIIIIllIIll, this.world, lllllllllllllIIIlIlllIIIIIlIlIII, this.moveDirection, (boolean)(BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0)) ? 1 : 0)) {
            return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
        }
        if (lllIlIlIIIIIIIl(lllllllllllllIIIlIlllIIIIIlIlIII.equals(this.pistonPos) ? 1 : 0)) {
            return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
        }
        if (lllIlIlIIIIIIIl(this.toMove.contains(lllllllllllllIIIlIlllIIIIIlIlIII) ? 1 : 0)) {
            return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
        }
        int lllllllllllllIIIlIlllIIIIIllIIlI = BlockPistonStructureHelper.lIlIIllllIlIll[2];
        if (lllIlIlIIIIIllI(lllllllllllllIIIlIlllIIIIIllIIlI + this.toMove.size(), BlockPistonStructureHelper.lIlIIllllIlIll[3])) {
            return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
        }
        while (!lllIlIlIIIIIlll(lllllllllllllIIIlIlllIIIIIllIIll, Blocks.slime_block)) {
            final BlockPos lllllllllllllIIIlIlllIIIIIllIIIl = lllllllllllllIIIlIlllIIIIIlIlIII.offset(this.moveDirection.getOpposite(), lllllllllllllIIIlIlllIIIIIllIIlI);
            lllllllllllllIIIlIlllIIIIIllIIll = this.world.getBlockState(lllllllllllllIIIlIlllIIIIIllIIIl).getBlock();
            if (!lllIlIlIIIIIlll(lllllllllllllIIIlIlllIIIIIllIIll.getMaterial(), Material.air) || !lllIlIlIIIIIIIl(BlockPistonBase.canPush(lllllllllllllIIIlIlllIIIIIllIIll, this.world, lllllllllllllIIIlIlllIIIIIllIIIl, this.moveDirection, (boolean)(BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0)) ? 1 : 0)) {
                break;
            }
            if (lllIlIlIIIIIIIl(lllllllllllllIIIlIlllIIIIIllIIIl.equals(this.pistonPos) ? 1 : 0)) {
                "".length();
                if (-"   ".length() > 0) {
                    return ((0x5E ^ 0x70) & ~(0x32 ^ 0x1C)) != 0x0;
                }
                break;
            }
            else {
                if (lllIlIlIIIIIllI(++lllllllllllllIIIlIlllIIIIIllIIlI + this.toMove.size(), BlockPistonStructureHelper.lIlIIllllIlIll[3])) {
                    return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
                }
                continue;
            }
        }
        int lllllllllllllIIIlIlllIIIIIllIIII = BlockPistonStructureHelper.lIlIIllllIlIll[1];
        int lllllllllllllIIIlIlllIIIIIlIllll = lllllllllllllIIIlIlllIIIIIllIIlI - BlockPistonStructureHelper.lIlIIllllIlIll[2];
        "".length();
        if (null != null) {
            return ((139 + 33 - 63 + 37 ^ 6 + 115 + 23 + 13) & (0xDA ^ 0xA9 ^ (0x48 ^ 0x34) ^ -" ".length())) != 0x0;
        }
        while (!lllIlIlIIIIlIII(lllllllllllllIIIlIlllIIIIIlIllll)) {
            this.toMove.add(lllllllllllllIIIlIlllIIIIIlIlIII.offset(this.moveDirection.getOpposite(), lllllllllllllIIIlIlllIIIIIlIllll));
            "".length();
            ++lllllllllllllIIIlIlllIIIIIllIIII;
            --lllllllllllllIIIlIlllIIIIIlIllll;
        }
        int lllllllllllllIIIlIlllIIIIIlIlllI = BlockPistonStructureHelper.lIlIIllllIlIll[2];
        do {
            final BlockPos lllllllllllllIIIlIlllIIIIIlIllIl = lllllllllllllIIIlIlllIIIIIlIlIII.offset(this.moveDirection, lllllllllllllIIIlIlllIIIIIlIlllI);
            final int lllllllllllllIIIlIlllIIIIIlIllII = this.toMove.indexOf(lllllllllllllIIIlIlllIIIIIlIllIl);
            if (lllIlIlIIIIIllI(lllllllllllllIIIlIlllIIIIIlIllII, BlockPistonStructureHelper.lIlIIllllIlIll[4])) {
                this.func_177255_a(lllllllllllllIIIlIlllIIIIIllIIII, lllllllllllllIIIlIlllIIIIIlIllII);
                int lllllllllllllIIIlIlllIIIIIlIlIll = BlockPistonStructureHelper.lIlIIllllIlIll[1];
                "".length();
                if (null != null) {
                    return ((0x6E ^ 0x2D) & ~(0x83 ^ 0xC0)) != 0x0;
                }
                while (!lllIlIlIIIIIllI(lllllllllllllIIIlIlllIIIIIlIlIll, lllllllllllllIIIlIlllIIIIIlIllII + lllllllllllllIIIlIlllIIIIIllIIII)) {
                    final BlockPos lllllllllllllIIIlIlllIIIIIlIlIlI = this.toMove.get(lllllllllllllIIIlIlllIIIIIlIlIll);
                    if (lllIlIlIIIIIlII(this.world.getBlockState(lllllllllllllIIIlIlllIIIIIlIlIlI).getBlock(), Blocks.slime_block) && lllIlIlIIIIIIlI(this.func_177250_b(lllllllllllllIIIlIlllIIIIIlIlIlI) ? 1 : 0)) {
                        return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
                    }
                    ++lllllllllllllIIIlIlllIIIIIlIlIll;
                }
                return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
            }
            else {
                lllllllllllllIIIlIlllIIIIIllIIll = this.world.getBlockState(lllllllllllllIIIlIlllIIIIIlIllIl).getBlock();
                if (lllIlIlIIIIIlII(lllllllllllllIIIlIlllIIIIIllIIll.getMaterial(), Material.air)) {
                    return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
                }
                if (!lllIlIlIIIIIIIl(BlockPistonBase.canPush(lllllllllllllIIIlIlllIIIIIllIIll, this.world, lllllllllllllIIIlIlllIIIIIlIllIl, this.moveDirection, (boolean)(BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0)) ? 1 : 0) || lllIlIlIIIIIIIl(lllllllllllllIIIlIlllIIIIIlIllIl.equals(this.pistonPos) ? 1 : 0)) {
                    return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
                }
                if (lllIlIlIIIIlIIl(lllllllllllllIIIlIlllIIIIIllIIll.getMobilityFlag(), BlockPistonStructureHelper.lIlIIllllIlIll[2])) {
                    this.toDestroy.add(lllllllllllllIIIlIlllIIIIIlIllIl);
                    "".length();
                    return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
                }
                if (lllIlIlIIIIIlIl(this.toMove.size(), BlockPistonStructureHelper.lIlIIllllIlIll[3])) {
                    return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
                }
                this.toMove.add(lllllllllllllIIIlIlllIIIIIlIllIl);
                "".length();
                ++lllllllllllllIIIlIlllIIIIIllIIII;
                ++lllllllllllllIIIlIlllIIIIIlIlllI;
                "".length();
            }
        } while (-"   ".length() <= 0);
        return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
    }
    
    private void func_177255_a(final int lllllllllllllIIIlIlllIIIIIIlIIlI, final int lllllllllllllIIIlIlllIIIIIIlIlll) {
        final List<BlockPos> lllllllllllllIIIlIlllIIIIIIlIllI = (List<BlockPos>)Lists.newArrayList();
        final List<BlockPos> lllllllllllllIIIlIlllIIIIIIlIlIl = (List<BlockPos>)Lists.newArrayList();
        final List<BlockPos> lllllllllllllIIIlIlllIIIIIIlIlII = (List<BlockPos>)Lists.newArrayList();
        lllllllllllllIIIlIlllIIIIIIlIllI.addAll(this.toMove.subList(BlockPistonStructureHelper.lIlIIllllIlIll[1], lllllllllllllIIIlIlllIIIIIIlIlll));
        "".length();
        lllllllllllllIIIlIlllIIIIIIlIlIl.addAll(this.toMove.subList(this.toMove.size() - lllllllllllllIIIlIlllIIIIIIlIIlI, this.toMove.size()));
        "".length();
        lllllllllllllIIIlIlllIIIIIIlIlII.addAll(this.toMove.subList(lllllllllllllIIIlIlllIIIIIIlIlll, this.toMove.size() - lllllllllllllIIIlIlllIIIIIIlIIlI));
        "".length();
        this.toMove.clear();
        this.toMove.addAll(lllllllllllllIIIlIlllIIIIIIlIllI);
        "".length();
        this.toMove.addAll(lllllllllllllIIIlIlllIIIIIIlIlIl);
        "".length();
        this.toMove.addAll(lllllllllllllIIIlIlllIIIIIIlIlII);
        "".length();
    }
    
    static {
        lllIlIlIIIIIIII();
    }
    
    public List<BlockPos> getBlocksToMove() {
        return this.toMove;
    }
    
    private static boolean lllIlIlIIIIlIII(final int lllllllllllllIIIlIllIlllllIlllll) {
        return lllllllllllllIIIlIllIlllllIlllll < 0;
    }
    
    private boolean func_177250_b(final BlockPos lllllllllllllIIIlIlllIIIIIIIIIll) {
        final int lllllllllllllIIIlIllIlllllllllll;
        final Exception lllllllllllllIIIlIlllIIIIIIIIIII = (Exception)((EnumFacing[])(Object)(lllllllllllllIIIlIllIlllllllllll = (int)(Object)EnumFacing.values())).length;
        float lllllllllllllIIIlIlllIIIIIIIIIIl = BlockPistonStructureHelper.lIlIIllllIlIll[1];
        "".length();
        if ("   ".length() <= " ".length()) {
            return ((0x5E ^ 0x77 ^ (0x56 ^ 0x36)) & (0x2A ^ 0x13 ^ (0x79 ^ 0x9) ^ -" ".length())) != 0x0;
        }
        while (!lllIlIlIIIIIlIl((int)lllllllllllllIIIlIlllIIIIIIIIIIl, (int)lllllllllllllIIIlIlllIIIIIIIIIII)) {
            final EnumFacing lllllllllllllIIIlIlllIIIIIIIIlIl = lllllllllllllIIIlIllIlllllllllll[lllllllllllllIIIlIlllIIIIIIIIIIl];
            if (lllIlIlIIIIIlll(lllllllllllllIIIlIlllIIIIIIIIlIl.getAxis(), this.moveDirection.getAxis()) && lllIlIlIIIIIIlI(this.func_177251_a(lllllllllllllIIIlIlllIIIIIIIIIll.offset(lllllllllllllIIIlIlllIIIIIIIIlIl)) ? 1 : 0)) {
                return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
            }
            ++lllllllllllllIIIlIlllIIIIIIIIIIl;
        }
        return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
    }
    
    private static boolean lllIlIlIIIIIlIl(final int lllllllllllllIIIlIllIlllllllIIlI, final int lllllllllllllIIIlIllIlllllllIIIl) {
        return lllllllllllllIIIlIllIlllllllIIlI >= lllllllllllllIIIlIllIlllllllIIIl;
    }
    
    private static boolean lllIlIlIIIIIIlI(final int lllllllllllllIIIlIllIllllllIIIIl) {
        return lllllllllllllIIIlIllIllllllIIIIl == 0;
    }
    
    public boolean canMove() {
        this.toMove.clear();
        this.toDestroy.clear();
        final Block lllllllllllllIIIlIlllIIIIlIIIllI = this.world.getBlockState(this.blockToMove).getBlock();
        if (lllIlIlIIIIIIlI(BlockPistonBase.canPush(lllllllllllllIIIlIlllIIIIlIIIllI, this.world, this.blockToMove, this.moveDirection, (boolean)(BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0)) ? 1 : 0)) {
            if (lllIlIlIIIIIIll(lllllllllllllIIIlIlllIIIIlIIIllI.getMobilityFlag(), BlockPistonStructureHelper.lIlIIllllIlIll[2])) {
                return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
            }
            this.toDestroy.add(this.blockToMove);
            "".length();
            return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
        }
        else {
            if (lllIlIlIIIIIIlI(this.func_177251_a(this.blockToMove) ? 1 : 0)) {
                return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
            }
            int lllllllllllllIIIlIlllIIIIlIIIlIl = BlockPistonStructureHelper.lIlIIllllIlIll[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0x4D ^ 0x1D) & ~(0x32 ^ 0x62)) != 0x0;
            }
            while (!lllIlIlIIIIIlIl(lllllllllllllIIIlIlllIIIIlIIIlIl, this.toMove.size())) {
                final BlockPos lllllllllllllIIIlIlllIIIIlIIIlII = this.toMove.get(lllllllllllllIIIlIlllIIIIlIIIlIl);
                if (lllIlIlIIIIIlII(this.world.getBlockState(lllllllllllllIIIlIlllIIIIlIIIlII).getBlock(), Blocks.slime_block) && lllIlIlIIIIIIlI(this.func_177250_b(lllllllllllllIIIlIlllIIIIlIIIlII) ? 1 : 0)) {
                    return BlockPistonStructureHelper.lIlIIllllIlIll[1] != 0;
                }
                ++lllllllllllllIIIlIlllIIIIlIIIlIl;
            }
            return BlockPistonStructureHelper.lIlIIllllIlIll[2] != 0;
        }
    }
    
    private static boolean lllIlIlIIIIIIll(final int lllllllllllllIIIlIllIlllllIlllII, final int lllllllllllllIIIlIllIlllllIllIll) {
        return lllllllllllllIIIlIllIlllllIlllII != lllllllllllllIIIlIllIlllllIllIll;
    }
    
    private static boolean lllIlIlIIIIIllI(final int lllllllllllllIIIlIllIllllllIlllI, final int lllllllllllllIIIlIllIllllllIllIl) {
        return lllllllllllllIIIlIllIllllllIlllI > lllllllllllllIIIlIllIllllllIllIl;
    }
    
    public List<BlockPos> getBlocksToDestroy() {
        return this.toDestroy;
    }
    
    private static boolean lllIlIlIIIIIlll(final Object lllllllllllllIIIlIllIllllllIlIlI, final Object lllllllllllllIIIlIllIllllllIlIIl) {
        return lllllllllllllIIIlIllIllllllIlIlI != lllllllllllllIIIlIllIllllllIlIIl;
    }
    
    private static boolean lllIlIlIIIIIlII(final Object lllllllllllllIIIlIllIllllllIIllI, final Object lllllllllllllIIIlIllIllllllIIlIl) {
        return lllllllllllllIIIlIllIllllllIIllI == lllllllllllllIIIlIllIllllllIIlIl;
    }
    
    private static boolean lllIlIlIIIIlIIl(final int lllllllllllllIIIlIllIlllllllIllI, final int lllllllllllllIIIlIllIlllllllIlIl) {
        return lllllllllllllIIIlIllIlllllllIllI == lllllllllllllIIIlIllIlllllllIlIl;
    }
    
    public BlockPistonStructureHelper(final World lllllllllllllIIIlIlllIIIIlIIllll, final BlockPos lllllllllllllIIIlIlllIIIIlIlIIll, final EnumFacing lllllllllllllIIIlIlllIIIIlIlIIlI, final boolean lllllllllllllIIIlIlllIIIIlIlIIIl) {
        this.toMove = (List<BlockPos>)Lists.newArrayList();
        this.toDestroy = (List<BlockPos>)Lists.newArrayList();
        this.world = lllllllllllllIIIlIlllIIIIlIIllll;
        this.pistonPos = lllllllllllllIIIlIlllIIIIlIlIIll;
        if (lllIlIlIIIIIIIl(lllllllllllllIIIlIlllIIIIlIlIIIl ? 1 : 0)) {
            this.moveDirection = lllllllllllllIIIlIlllIIIIlIlIIlI;
            this.blockToMove = lllllllllllllIIIlIlllIIIIlIlIIll.offset(lllllllllllllIIIlIlllIIIIlIlIIlI);
            "".length();
            if (-" ".length() > 0) {
                throw null;
            }
        }
        else {
            this.moveDirection = lllllllllllllIIIlIlllIIIIlIlIIlI.getOpposite();
            this.blockToMove = lllllllllllllIIIlIlllIIIIlIlIIll.offset(lllllllllllllIIIlIlllIIIIlIlIIlI, BlockPistonStructureHelper.lIlIIllllIlIll[0]);
        }
    }
    
    private static boolean lllIlIlIIIIIIIl(final int lllllllllllllIIIlIllIllllllIIIll) {
        return lllllllllllllIIIlIllIllllllIIIll != 0;
    }
    
    private static void lllIlIlIIIIIIII() {
        (lIlIIllllIlIll = new int[5])[0] = "  ".length();
        BlockPistonStructureHelper.lIlIIllllIlIll[1] = ((0xBC ^ 0xAA) & ~(0x2F ^ 0x39));
        BlockPistonStructureHelper.lIlIIllllIlIll[2] = " ".length();
        BlockPistonStructureHelper.lIlIIllllIlIll[3] = (0x8B ^ 0x87);
        BlockPistonStructureHelper.lIlIIllllIlIll[4] = -" ".length();
    }
}
