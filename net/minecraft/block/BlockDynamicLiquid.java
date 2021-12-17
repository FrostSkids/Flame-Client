// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import java.util.EnumSet;
import java.util.Set;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockDynamicLiquid extends BlockLiquid
{
    /* synthetic */ int adjacentSourceBlocks;
    private static final /* synthetic */ int[] lllIlIlIIllIIl;
    
    private int func_176374_a(final World llllllllllllIlIllIllIlIIIIlIIllI, final BlockPos llllllllllllIlIllIllIlIIIIlIllll, final int llllllllllllIlIllIllIlIIIIlIIlII, final EnumFacing llllllllllllIlIllIllIlIIIIlIIIll) {
        int llllllllllllIlIllIllIlIIIIlIllII = BlockDynamicLiquid.lllIlIlIIllIIl[8];
        final Exception llllllllllllIlIllIllIlIIIIlIIIII = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (((0x48 ^ 0x71) & ~(0x40 ^ 0x79)) > 0) {
            return (0x3 ^ 0x44) & ~(0x39 ^ 0x7E);
        }
        while (!lIlIIIlIlllIIIlI(((Iterator)llllllllllllIlIllIllIlIIIIlIIIII).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIlIllIllIlIIIIlIlIll = ((Iterator<EnumFacing>)llllllllllllIlIllIllIlIIIIlIIIII).next();
            if (lIlIIIlIlllIlIll(llllllllllllIlIllIllIlIIIIlIlIll, llllllllllllIlIllIllIlIIIIlIIIll)) {
                final BlockPos llllllllllllIlIllIllIlIIIIlIlIlI = llllllllllllIlIllIllIlIIIIlIllll.offset(llllllllllllIlIllIllIlIIIIlIlIll);
                final IBlockState llllllllllllIlIllIllIlIIIIlIlIIl = llllllllllllIlIllIllIlIIIIlIIllI.getBlockState(llllllllllllIlIllIllIlIIIIlIlIlI);
                if (!lIlIIIlIlllIIIlI(this.isBlocked(llllllllllllIlIllIllIlIIIIlIIllI, llllllllllllIlIllIllIlIIIIlIlIlI, llllllllllllIlIllIllIlIIIIlIlIIl) ? 1 : 0) || (lIlIIIlIlllIIIIl(llllllllllllIlIllIllIlIIIIlIlIIl.getBlock().getMaterial(), this.blockMaterial) && !lIlIIIlIlllIIIll(llllllllllllIlIllIllIlIIIIlIlIIl.getValue((IProperty<Integer>)BlockDynamicLiquid.LEVEL)))) {
                    continue;
                }
                if (lIlIIIlIlllIIIlI(this.isBlocked(llllllllllllIlIllIllIlIIIIlIIllI, llllllllllllIlIllIllIlIIIIlIlIlI.down(), llllllllllllIlIllIllIlIIIIlIlIIl) ? 1 : 0)) {
                    return llllllllllllIlIllIllIlIIIIlIIlII;
                }
                if (!lIlIIIlIlllIIlII(llllllllllllIlIllIllIlIIIIlIIlII, BlockDynamicLiquid.lllIlIlIIllIIl[6])) {
                    continue;
                }
                final int llllllllllllIlIllIllIlIIIIlIlIII = this.func_176374_a(llllllllllllIlIllIllIlIIIIlIIllI, llllllllllllIlIllIllIlIIIIlIlIlI, llllllllllllIlIllIllIlIIIIlIIlII + BlockDynamicLiquid.lllIlIlIIllIIl[1], llllllllllllIlIllIllIlIIIIlIlIll.getOpposite());
                if (!lIlIIIlIlllIIlII(llllllllllllIlIllIllIlIIIIlIlIII, llllllllllllIlIllIllIlIIIIlIllII)) {
                    continue;
                }
                llllllllllllIlIllIllIlIIIIlIllII = llllllllllllIlIllIllIlIIIIlIlIII;
            }
        }
        return llllllllllllIlIllIllIlIIIIlIllII;
    }
    
    private static boolean lIlIIIlIlllIllII(final int llllllllllllIlIllIllIIlllIlllIll, final int llllllllllllIlIllIllIIlllIlllIlI) {
        return llllllllllllIlIllIllIIlllIlllIll <= llllllllllllIlIllIllIIlllIlllIlI;
    }
    
    static {
        lIlIIIlIlllIIIII();
    }
    
    private void placeStaticBlock(final World llllllllllllIlIllIllIlIIlIlIIIlI, final BlockPos llllllllllllIlIllIllIlIIlIlIIlIl, final IBlockState llllllllllllIlIllIllIlIIlIlIIIII) {
        llllllllllllIlIllIllIlIIlIlIIIlI.setBlockState(llllllllllllIlIllIllIlIIlIlIIlIl, BlockLiquid.getStaticBlock(this.blockMaterial).getDefaultState().withProperty((IProperty<Comparable>)BlockDynamicLiquid.LEVEL, (Integer)llllllllllllIlIllIllIlIIlIlIIIII.getValue((IProperty<V>)BlockDynamicLiquid.LEVEL)), BlockDynamicLiquid.lllIlIlIIllIIl[0]);
        "".length();
    }
    
    private static void lIlIIIlIlllIIIII() {
        (lllIlIlIIllIIl = new int[9])[0] = "  ".length();
        BlockDynamicLiquid.lllIlIlIIllIIl[1] = " ".length();
        BlockDynamicLiquid.lllIlIlIIllIIl[2] = -(84 + 167 - 101 + 79 ^ 44 + 19 - 18 + 84);
        BlockDynamicLiquid.lllIlIlIIllIIl[3] = ((0x51 ^ 0xD) & ~(0x21 ^ 0x7D));
        BlockDynamicLiquid.lllIlIlIIllIIl[4] = (0x1B ^ 0x13);
        BlockDynamicLiquid.lllIlIlIIllIIl[5] = -" ".length();
        BlockDynamicLiquid.lllIlIlIIllIIl[6] = (0x58 ^ 0x16 ^ (0x50 ^ 0x1A));
        BlockDynamicLiquid.lllIlIlIIllIIl[7] = "   ".length();
        BlockDynamicLiquid.lllIlIlIIllIIl[8] = (-(0xB4 ^ 0xB3) & (0xFFFFDFEF & 0x23FE));
    }
    
    private static boolean lIlIIIlIlllIIlIl(final int llllllllllllIlIllIllIIlllIlIIllI) {
        return llllllllllllIlIllIllIIlllIlIIllI < 0;
    }
    
    private Set<EnumFacing> getPossibleFlowDirections(final World llllllllllllIlIllIllIlIIIIIlIIIl, final BlockPos llllllllllllIlIllIllIlIIIIIIIllI) {
        int llllllllllllIlIllIllIlIIIIIIllll = BlockDynamicLiquid.lllIlIlIIllIIl[8];
        final Set<EnumFacing> llllllllllllIlIllIllIlIIIIIIlllI = EnumSet.noneOf(EnumFacing.class);
        final Exception llllllllllllIlIllIllIlIIIIIIIIlI = (Exception)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if ((0x2F ^ 0x25 ^ (0x1B ^ 0x14)) == 0x0) {
            return null;
        }
        while (!lIlIIIlIlllIIIlI(((Iterator)llllllllllllIlIllIllIlIIIIIIIIlI).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIlIllIllIlIIIIIIllIl = ((Iterator<EnumFacing>)llllllllllllIlIllIllIlIIIIIIIIlI).next();
            final BlockPos llllllllllllIlIllIllIlIIIIIIllII = llllllllllllIlIllIllIlIIIIIIIllI.offset(llllllllllllIlIllIllIlIIIIIIllIl);
            final IBlockState llllllllllllIlIllIllIlIIIIIIlIll = llllllllllllIlIllIllIlIIIIIlIIIl.getBlockState(llllllllllllIlIllIllIlIIIIIIllII);
            if (lIlIIIlIlllIIIlI(this.isBlocked(llllllllllllIlIllIllIlIIIIIlIIIl, llllllllllllIlIllIllIlIIIIIIllII, llllllllllllIlIllIllIlIIIIIIlIll) ? 1 : 0) && (!lIlIIIlIlllIIIIl(llllllllllllIlIllIllIlIIIIIIlIll.getBlock().getMaterial(), this.blockMaterial) || lIlIIIlIlllIIIll(llllllllllllIlIllIllIlIIIIIIlIll.getValue((IProperty<Integer>)BlockDynamicLiquid.LEVEL)))) {
                int llllllllllllIlIllIllIlIIIIIIlIIl = 0;
                if (lIlIIIlIlllIlIII(this.isBlocked(llllllllllllIlIllIllIlIIIIIlIIIl, llllllllllllIlIllIllIlIIIIIIllII.down(), llllllllllllIlIllIllIlIIIIIlIIIl.getBlockState(llllllllllllIlIllIllIlIIIIIIllII.down())) ? 1 : 0)) {
                    final int llllllllllllIlIllIllIlIIIIIIlIlI = this.func_176374_a(llllllllllllIlIllIllIlIIIIIlIIIl, llllllllllllIlIllIllIlIIIIIIllII, BlockDynamicLiquid.lllIlIlIIllIIl[1], llllllllllllIlIllIllIlIIIIIIllIl.getOpposite());
                    "".length();
                    if ((81 + 174 - 165 + 97 ^ 173 + 125 - 230 + 123) < -" ".length()) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlIllIllIlIIIIIIlIIl = BlockDynamicLiquid.lllIlIlIIllIIl[3];
                }
                if (lIlIIIlIlllIIlII(llllllllllllIlIllIllIlIIIIIIlIIl, llllllllllllIlIllIllIlIIIIIIllll)) {
                    llllllllllllIlIllIllIlIIIIIIlllI.clear();
                }
                if (!lIlIIIlIlllIllII(llllllllllllIlIllIllIlIIIIIIlIIl, llllllllllllIlIllIllIlIIIIIIllll)) {
                    continue;
                }
                llllllllllllIlIllIllIlIIIIIIlllI.add(llllllllllllIlIllIllIlIIIIIIllIl);
                "".length();
                llllllllllllIlIllIllIlIIIIIIllll = llllllllllllIlIllIllIlIIIIIIlIIl;
            }
        }
        return llllllllllllIlIllIllIlIIIIIIlllI;
    }
    
    private static boolean lIlIIIlIlllIlIIl(final int llllllllllllIlIllIllIIlllIllIlll, final int llllllllllllIlIllIllIIlllIllIllI) {
        return llllllllllllIlIllIllIIlllIllIlll > llllllllllllIlIllIllIIlllIllIllI;
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIlIllIllIIllllIIllII, final BlockPos llllllllllllIlIllIllIIllllIIlIll, final IBlockState llllllllllllIlIllIllIIllllIIlIlI) {
        if (lIlIIIlIlllIIIlI(this.checkForMixing(llllllllllllIlIllIllIIllllIIllII, llllllllllllIlIllIllIIllllIIlIll, llllllllllllIlIllIllIIllllIIlIlI) ? 1 : 0)) {
            llllllllllllIlIllIllIIllllIIllII.scheduleUpdate(llllllllllllIlIllIllIIllllIIlIll, this, this.tickRate(llllllllllllIlIllIllIIllllIIllII));
        }
    }
    
    private static boolean lIlIIIlIlllIIIll(final int llllllllllllIlIllIllIIlllIlIIlII) {
        return llllllllllllIlIllIllIIlllIlIIlII > 0;
    }
    
    private boolean isBlocked(final World llllllllllllIlIllIllIIlllllllIlI, final BlockPos llllllllllllIlIllIllIIllllllIlIl, final IBlockState llllllllllllIlIllIllIIlllllllIII) {
        final Block llllllllllllIlIllIllIIllllllIlll = llllllllllllIlIllIllIIlllllllIlI.getBlockState(llllllllllllIlIllIllIIllllllIlIl).getBlock();
        int blocksMovement;
        if (lIlIIIlIlllIIIlI((llllllllllllIlIllIllIIllllllIlll instanceof BlockDoor) ? 1 : 0) && lIlIIIlIlllIlIll(llllllllllllIlIllIllIIllllllIlll, Blocks.standing_sign) && lIlIIIlIlllIlIll(llllllllllllIlIllIllIIllllllIlll, Blocks.ladder) && lIlIIIlIlllIlIll(llllllllllllIlIllIllIIllllllIlll, Blocks.reeds)) {
            if (lIlIIIlIlllIIIIl(llllllllllllIlIllIllIIllllllIlll.blockMaterial, Material.portal)) {
                blocksMovement = BlockDynamicLiquid.lllIlIlIIllIIl[1];
                "".length();
                if ("   ".length() < 0) {
                    return ((0xE4 ^ 0x8A ^ (0x1E ^ 0x10)) & (0x7D ^ 0x4A ^ (0xCF ^ 0x98) ^ -" ".length())) != 0x0;
                }
            }
            else {
                blocksMovement = (llllllllllllIlIllIllIIllllllIlll.blockMaterial.blocksMovement() ? 1 : 0);
                "".length();
                if (" ".length() < ((0xA6 ^ 0xC7 ^ (0xEC ^ 0xAB)) & (128 + 121 - 117 + 4 ^ 13 + 13 + 120 + 28 ^ -" ".length()))) {
                    return ((0x5D ^ 0x13 ^ (0xA9 ^ 0xBE)) & (0xAD ^ 0x82 ^ (0xCC ^ 0xBA) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            blocksMovement = BlockDynamicLiquid.lllIlIlIIllIIl[1];
        }
        return blocksMovement != 0;
    }
    
    private static boolean lIlIIIlIlllIlIlI(final int llllllllllllIlIllIllIIllllIIIlll, final int llllllllllllIlIllIllIIllllIIIllI) {
        return llllllllllllIlIllIllIIllllIIIlll == llllllllllllIlIllIllIIllllIIIllI;
    }
    
    private static boolean lIlIIIlIlllIIIIl(final Object llllllllllllIlIllIllIIlllIlIllll, final Object llllllllllllIlIllIllIIlllIlIlllI) {
        return llllllllllllIlIllIllIIlllIlIllll == llllllllllllIlIllIllIIlllIlIlllI;
    }
    
    private void tryFlowInto(final World llllllllllllIlIllIllIlIIIlIllIII, final BlockPos llllllllllllIlIllIllIlIIIlIlIlll, final IBlockState llllllllllllIlIllIllIlIIIlIlIlIl, final int llllllllllllIlIllIllIlIIIlIlIIll) {
        if (lIlIIIlIlllIlIII(this.canFlowInto(llllllllllllIlIllIllIlIIIlIllIII, llllllllllllIlIllIllIlIIIlIlIlll, llllllllllllIlIllIllIlIIIlIlIlIl) ? 1 : 0)) {
            if (lIlIIIlIlllIlIll(llllllllllllIlIllIllIlIIIlIlIlIl.getBlock(), Blocks.air)) {
                if (lIlIIIlIlllIIIIl(this.blockMaterial, Material.lava)) {
                    this.triggerMixEffects(llllllllllllIlIllIllIlIIIlIllIII, llllllllllllIlIllIllIlIIIlIlIlll);
                    "".length();
                    if (-(0x25 ^ 0x21) > 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIllIllIlIIIlIlIlIl.getBlock().dropBlockAsItem(llllllllllllIlIllIllIlIIIlIllIII, llllllllllllIlIllIllIlIIIlIlIlll, llllllllllllIlIllIllIlIIIlIlIlIl, BlockDynamicLiquid.lllIlIlIIllIIl[3]);
                }
            }
            llllllllllllIlIllIllIlIIIlIllIII.setBlockState(llllllllllllIlIllIllIlIIIlIlIlll, this.getDefaultState().withProperty((IProperty<Comparable>)BlockDynamicLiquid.LEVEL, llllllllllllIlIllIllIlIIIlIlIIll), BlockDynamicLiquid.lllIlIlIIllIIl[7]);
            "".length();
        }
    }
    
    private static boolean lIlIIIlIlllIlIll(final Object llllllllllllIlIllIllIIlllIllIIll, final Object llllllllllllIlIllIllIIlllIllIIlI) {
        return llllllllllllIlIllIllIIlllIllIIll != llllllllllllIlIllIllIIlllIllIIlI;
    }
    
    protected int checkAdjacentBlock(final World llllllllllllIlIllIllIIlllllIllIl, final BlockPos llllllllllllIlIllIllIIlllllIIlll, final int llllllllllllIlIllIllIIlllllIlIll) {
        int llllllllllllIlIllIllIIlllllIlIlI = this.getLevel(llllllllllllIlIllIllIIlllllIllIl, llllllllllllIlIllIllIIlllllIIlll);
        if (lIlIIIlIlllIIlIl(llllllllllllIlIllIllIIlllllIlIlI)) {
            return llllllllllllIlIllIllIIlllllIlIll;
        }
        if (lIlIIIlIlllIIIlI(llllllllllllIlIllIllIIlllllIlIlI)) {
            this.adjacentSourceBlocks += BlockDynamicLiquid.lllIlIlIIllIIl[1];
        }
        if (lIlIIIlIlllIIlll(llllllllllllIlIllIllIIlllllIlIlI, BlockDynamicLiquid.lllIlIlIIllIIl[4])) {
            llllllllllllIlIllIllIIlllllIlIlI = BlockDynamicLiquid.lllIlIlIIllIIl[3];
        }
        int n;
        if (lIlIIIlIlllIIllI(llllllllllllIlIllIllIIlllllIlIll) && lIlIIIlIlllIIlll(llllllllllllIlIllIllIIlllllIlIlI, llllllllllllIlIllIllIIlllllIlIll)) {
            n = llllllllllllIlIllIllIIlllllIlIll;
            "".length();
            if ((0x71 ^ 0x52 ^ (0xB4 ^ 0x92)) == 0x0) {
                return (0xF5 ^ 0xC7 ^ (0xAD ^ 0x89)) & (135 + 155 - 177 + 52 ^ 114 + 29 - 55 + 91 ^ -" ".length());
            }
        }
        else {
            n = llllllllllllIlIllIllIIlllllIlIlI;
        }
        return n;
    }
    
    private static boolean lIlIIIlIlllIIlll(final int llllllllllllIlIllIllIIllllIIIIll, final int llllllllllllIlIllIllIIllllIIIIlI) {
        return llllllllllllIlIllIllIIllllIIIIll >= llllllllllllIlIllIllIIllllIIIIlI;
    }
    
    private static boolean lIlIIIlIlllIIIlI(final int llllllllllllIlIllIllIIlllIlIlIlI) {
        return llllllllllllIlIllIllIIlllIlIlIlI == 0;
    }
    
    private static boolean lIlIIIlIlllIIllI(final int llllllllllllIlIllIllIIlllIlIlIII) {
        return llllllllllllIlIllIllIIlllIlIlIII >= 0;
    }
    
    private static boolean lIlIIIlIlllIIlII(final int llllllllllllIlIllIllIIlllIllllll, final int llllllllllllIlIllIllIIlllIlllllI) {
        return llllllllllllIlIllIllIIlllIllllll < llllllllllllIlIllIllIIlllIlllllI;
    }
    
    protected BlockDynamicLiquid(final Material llllllllllllIlIllIllIlIIlIlIlllI) {
        super(llllllllllllIlIllIllIlIIlIlIlllI);
    }
    
    private static boolean lIlIIIlIlllIlIII(final int llllllllllllIlIllIllIIlllIlIllII) {
        return llllllllllllIlIllIllIIlllIlIllII != 0;
    }
    
    private boolean canFlowInto(final World llllllllllllIlIllIllIIllllIllllI, final BlockPos llllllllllllIlIllIllIIllllIllIII, final IBlockState llllllllllllIlIllIllIIllllIlIlll) {
        final Material llllllllllllIlIllIllIIllllIllIll = llllllllllllIlIllIllIIllllIlIlll.getBlock().getMaterial();
        if (lIlIIIlIlllIlIll(llllllllllllIlIllIllIIllllIllIll, this.blockMaterial) && lIlIIIlIlllIlIll(llllllllllllIlIllIllIIllllIllIll, Material.lava) && lIlIIIlIlllIIIlI(this.isBlocked(llllllllllllIlIllIllIIllllIllllI, llllllllllllIlIllIllIIllllIllIII, llllllllllllIlIllIllIIllllIlIlll) ? 1 : 0)) {
            return BlockDynamicLiquid.lllIlIlIIllIIl[1] != 0;
        }
        return BlockDynamicLiquid.lllIlIlIIllIIl[3] != 0;
    }
    
    @Override
    public void updateTick(final World llllllllllllIlIllIllIlIIlIIlIIIl, final BlockPos llllllllllllIlIllIllIlIIIllllIIl, IBlockState llllllllllllIlIllIllIlIIIllllIII, final Random llllllllllllIlIllIllIlIIIlllIlll) {
        int llllllllllllIlIllIllIlIIlIIIllIl = llllllllllllIlIllIllIlIIIllllIII.getValue((IProperty<Integer>)BlockDynamicLiquid.LEVEL);
        int llllllllllllIlIllIllIlIIlIIIllII = BlockDynamicLiquid.lllIlIlIIllIIl[1];
        if (lIlIIIlIlllIIIIl(this.blockMaterial, Material.lava) && lIlIIIlIlllIIIlI(llllllllllllIlIllIllIlIIlIIlIIIl.provider.doesWaterVaporize() ? 1 : 0)) {
            llllllllllllIlIllIllIlIIlIIIllII = BlockDynamicLiquid.lllIlIlIIllIIl[0];
        }
        int llllllllllllIlIllIllIlIIlIIIlIll = this.tickRate(llllllllllllIlIllIllIlIIlIIlIIIl);
        if (lIlIIIlIlllIIIll(llllllllllllIlIllIllIlIIlIIIllIl)) {
            int llllllllllllIlIllIllIlIIlIIIlIlI = BlockDynamicLiquid.lllIlIlIIllIIl[2];
            this.adjacentSourceBlocks = BlockDynamicLiquid.lllIlIlIIllIIl[3];
            final Iterator<EnumFacing> iterator = EnumFacing.Plane.HORIZONTAL.iterator();
            "".length();
            if (-" ".length() == ((1 + 46 - 38 + 208 ^ 138 + 94 - 52 + 15) & (0x3A ^ 0x5C ^ (0x3D ^ 0x41) ^ -" ".length()))) {
                return;
            }
            while (!lIlIIIlIlllIIIlI(iterator.hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIlIllIllIlIIlIIIlIII = iterator.next();
                llllllllllllIlIllIllIlIIlIIIlIlI = this.checkAdjacentBlock(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.offset(llllllllllllIlIllIllIlIIlIIIlIII), llllllllllllIlIllIllIlIIlIIIlIlI);
            }
            int llllllllllllIlIllIllIlIIlIIIIlll = llllllllllllIlIllIllIlIIlIIIlIlI + llllllllllllIlIllIllIlIIlIIIllII;
            if (!lIlIIIlIlllIIlII(llllllllllllIlIllIllIlIIlIIIIlll, BlockDynamicLiquid.lllIlIlIIllIIl[4]) || lIlIIIlIlllIIlIl(llllllllllllIlIllIllIlIIlIIIlIlI)) {
                llllllllllllIlIllIllIlIIlIIIIlll = BlockDynamicLiquid.lllIlIlIIllIIl[5];
            }
            if (lIlIIIlIlllIIllI(this.getLevel(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.up()))) {
                final int llllllllllllIlIllIllIlIIlIIIIlIl = this.getLevel(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.up());
                if (lIlIIIlIlllIIlll(llllllllllllIlIllIllIlIIlIIIIlIl, BlockDynamicLiquid.lllIlIlIIllIIl[4])) {
                    llllllllllllIlIllIllIlIIlIIIIlll = llllllllllllIlIllIllIlIIlIIIIlIl;
                    "".length();
                    if (-(0xB0 ^ 0x9F ^ (0xBC ^ 0x97)) > 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIllIllIlIIlIIIIlll = llllllllllllIlIllIllIlIIlIIIIlIl + BlockDynamicLiquid.lllIlIlIIllIIl[4];
                }
            }
            if (lIlIIIlIlllIIlll(this.adjacentSourceBlocks, BlockDynamicLiquid.lllIlIlIIllIIl[0]) && lIlIIIlIlllIIIIl(this.blockMaterial, Material.water)) {
                final IBlockState llllllllllllIlIllIllIlIIlIIIIlII = llllllllllllIlIllIllIlIIlIIlIIIl.getBlockState(llllllllllllIlIllIllIlIIIllllIIl.down());
                if (lIlIIIlIlllIlIII(llllllllllllIlIllIllIlIIlIIIIlII.getBlock().getMaterial().isSolid() ? 1 : 0)) {
                    llllllllllllIlIllIllIlIIlIIIIlll = BlockDynamicLiquid.lllIlIlIIllIIl[3];
                    "".length();
                    if ("   ".length() <= ((0x4E ^ 0x77) & ~(0x83 ^ 0xBA))) {
                        return;
                    }
                }
                else if (lIlIIIlIlllIIIIl(llllllllllllIlIllIllIlIIlIIIIlII.getBlock().getMaterial(), this.blockMaterial) && lIlIIIlIlllIIIlI(llllllllllllIlIllIllIlIIlIIIIlII.getValue((IProperty<Integer>)BlockDynamicLiquid.LEVEL))) {
                    llllllllllllIlIllIllIlIIlIIIIlll = BlockDynamicLiquid.lllIlIlIIllIIl[3];
                }
            }
            if (lIlIIIlIlllIIIIl(this.blockMaterial, Material.lava) && lIlIIIlIlllIIlII(llllllllllllIlIllIllIlIIlIIIllIl, BlockDynamicLiquid.lllIlIlIIllIIl[4]) && lIlIIIlIlllIIlII(llllllllllllIlIllIllIlIIlIIIIlll, BlockDynamicLiquid.lllIlIlIIllIIl[4]) && lIlIIIlIlllIlIIl(llllllllllllIlIllIllIlIIlIIIIlll, llllllllllllIlIllIllIlIIlIIIllIl) && lIlIIIlIlllIlIII(llllllllllllIlIllIllIlIIIlllIlll.nextInt(BlockDynamicLiquid.lllIlIlIIllIIl[6]))) {
                llllllllllllIlIllIllIlIIlIIIlIll *= BlockDynamicLiquid.lllIlIlIIllIIl[6];
            }
            if (lIlIIIlIlllIlIlI(llllllllllllIlIllIllIlIIlIIIIlll, llllllllllllIlIllIllIlIIlIIIllIl)) {
                this.placeStaticBlock(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl, llllllllllllIlIllIllIlIIIllllIII);
                "".length();
                if (((0x1F ^ 0x5) & ~(0x9D ^ 0x87)) == (0x9E ^ 0x9A)) {
                    return;
                }
            }
            else {
                llllllllllllIlIllIllIlIIlIIIllIl = llllllllllllIlIllIllIlIIlIIIIlll;
                if (lIlIIIlIlllIIlIl(llllllllllllIlIllIllIlIIlIIIIlll)) {
                    llllllllllllIlIllIllIlIIlIIlIIIl.setBlockToAir(llllllllllllIlIllIllIlIIIllllIIl);
                    "".length();
                    "".length();
                    if (-(0x12 ^ 0x16) > 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIllIllIlIIIllllIII = llllllllllllIlIllIllIlIIIllllIII.withProperty((IProperty<Comparable>)BlockDynamicLiquid.LEVEL, llllllllllllIlIllIllIlIIlIIIIlll);
                    llllllllllllIlIllIllIlIIlIIlIIIl.setBlockState(llllllllllllIlIllIllIlIIIllllIIl, llllllllllllIlIllIllIlIIIllllIII, BlockDynamicLiquid.lllIlIlIIllIIl[0]);
                    "".length();
                    llllllllllllIlIllIllIlIIlIIlIIIl.scheduleUpdate(llllllllllllIlIllIllIlIIIllllIIl, this, llllllllllllIlIllIllIlIIlIIIlIll);
                    llllllllllllIlIllIllIlIIlIIlIIIl.notifyNeighborsOfStateChange(llllllllllllIlIllIllIlIIIllllIIl, this);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
        }
        else {
            this.placeStaticBlock(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl, llllllllllllIlIllIllIlIIIllllIII);
        }
        final IBlockState llllllllllllIlIllIllIlIIlIIIIIlI = llllllllllllIlIllIllIlIIlIIlIIIl.getBlockState(llllllllllllIlIllIllIlIIIllllIIl.down());
        if (lIlIIIlIlllIlIII(this.canFlowInto(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.down(), llllllllllllIlIllIllIlIIlIIIIIlI) ? 1 : 0)) {
            if (lIlIIIlIlllIIIIl(this.blockMaterial, Material.lava) && lIlIIIlIlllIIIIl(llllllllllllIlIllIllIlIIlIIlIIIl.getBlockState(llllllllllllIlIllIllIlIIIllllIIl.down()).getBlock().getMaterial(), Material.water)) {
                llllllllllllIlIllIllIlIIlIIlIIIl.setBlockState(llllllllllllIlIllIllIlIIIllllIIl.down(), Blocks.stone.getDefaultState());
                "".length();
                this.triggerMixEffects(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.down());
                return;
            }
            if (lIlIIIlIlllIIlll(llllllllllllIlIllIllIlIIlIIIllIl, BlockDynamicLiquid.lllIlIlIIllIIl[4])) {
                this.tryFlowInto(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.down(), llllllllllllIlIllIllIlIIlIIIIIlI, llllllllllllIlIllIllIlIIlIIIllIl);
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                this.tryFlowInto(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.down(), llllllllllllIlIllIllIlIIlIIIIIlI, llllllllllllIlIllIllIlIIlIIIllIl + BlockDynamicLiquid.lllIlIlIIllIIl[4]);
                "".length();
                if (-" ".length() == " ".length()) {
                    return;
                }
            }
        }
        else if (lIlIIIlIlllIIllI(llllllllllllIlIllIllIlIIlIIIllIl) && (!lIlIIIlIlllIlIII(llllllllllllIlIllIllIlIIlIIIllIl) || lIlIIIlIlllIlIII(this.isBlocked(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.down(), llllllllllllIlIllIllIlIIlIIIIIlI) ? 1 : 0))) {
            final Set<EnumFacing> llllllllllllIlIllIllIlIIlIIIIIII = this.getPossibleFlowDirections(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl);
            int llllllllllllIlIllIllIlIIIllllllI = llllllllllllIlIllIllIlIIlIIIllIl + llllllllllllIlIllIllIlIIlIIIllII;
            if (lIlIIIlIlllIIlll(llllllllllllIlIllIllIlIIlIIIllIl, BlockDynamicLiquid.lllIlIlIIllIIl[4])) {
                llllllllllllIlIllIllIlIIIllllllI = BlockDynamicLiquid.lllIlIlIIllIIl[1];
            }
            if (lIlIIIlIlllIIlll(llllllllllllIlIllIllIlIIIllllllI, BlockDynamicLiquid.lllIlIlIIllIIl[4])) {
                return;
            }
            final String llllllllllllIlIllIllIlIIIllIlIlI = (String)llllllllllllIlIllIllIlIIlIIIIIII.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIIIlIlllIIIlI(((Iterator)llllllllllllIlIllIllIlIIIllIlIlI).hasNext() ? 1 : 0)) {
                final EnumFacing llllllllllllIlIllIllIlIIIlllllII = ((Iterator<EnumFacing>)llllllllllllIlIllIllIlIIIllIlIlI).next();
                this.tryFlowInto(llllllllllllIlIllIllIlIIlIIlIIIl, llllllllllllIlIllIllIlIIIllllIIl.offset(llllllllllllIlIllIllIlIIIlllllII), llllllllllllIlIllIllIlIIlIIlIIIl.getBlockState(llllllllllllIlIllIllIlIIIllllIIl.offset(llllllllllllIlIllIllIlIIIlllllII)), llllllllllllIlIllIllIlIIIllllllI);
            }
        }
    }
}
