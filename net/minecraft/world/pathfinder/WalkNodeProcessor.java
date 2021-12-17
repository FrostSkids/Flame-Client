// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.pathfinder;

import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.entity.Entity;

public class WalkNodeProcessor extends NodeProcessor
{
    private /* synthetic */ boolean canBreakDoors;
    private /* synthetic */ boolean canEnterDoors;
    private static final /* synthetic */ int[] lIlIlIIIIlllll;
    private /* synthetic */ boolean avoidsWater;
    private /* synthetic */ boolean shouldAvoidWater;
    private /* synthetic */ boolean canSwim;
    
    public void setEnterDoors(final boolean lllllllllllllIIIlIlIlllIllIlIlII) {
        this.canEnterDoors = lllllllllllllIIIlIlIlllIllIlIlII;
    }
    
    @Override
    public PathPoint getPathPointTo(final Entity lllllllllllllIIIlIlIllllIlllIlII) {
        int lllllllllllllIIIlIlIllllIllllIII = 0;
        if (lllIlIllIIIIIII(this.canSwim ? 1 : 0) && lllIlIllIIIIIII(lllllllllllllIIIlIlIllllIlllIlII.isInWater() ? 1 : 0)) {
            int lllllllllllllIIIlIlIllllIllllIIl = (int)lllllllllllllIIIlIlIllllIlllIlII.getEntityBoundingBox().minY;
            final BlockPos.MutableBlockPos lllllllllllllIIIlIlIllllIlllIlll = new BlockPos.MutableBlockPos(MathHelper.floor_double(lllllllllllllIIIlIlIllllIlllIlII.posX), lllllllllllllIIIlIlIllllIllllIIl, MathHelper.floor_double(lllllllllllllIIIlIlIllllIlllIlII.posZ));
            Block lllllllllllllIIIlIlIllllIlllIllI = this.blockaccess.getBlockState(lllllllllllllIIIlIlIllllIlllIlll).getBlock();
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
            while (!lllIlIllIIIIIIl(lllllllllllllIIIlIlIllllIlllIllI, Blocks.flowing_water) || !lllIlIllIIIIIIl(lllllllllllllIIIlIlIllllIlllIllI, Blocks.water)) {
                ++lllllllllllllIIIlIlIllllIllllIIl;
                lllllllllllllIIIlIlIllllIlllIlll.func_181079_c(MathHelper.floor_double(lllllllllllllIIIlIlIllllIlllIlII.posX), lllllllllllllIIIlIlIllllIllllIIl, MathHelper.floor_double(lllllllllllllIIIlIlIllllIlllIlII.posZ));
                "".length();
                lllllllllllllIIIlIlIllllIlllIllI = this.blockaccess.getBlockState(lllllllllllllIIIlIlIllllIlllIlll).getBlock();
            }
            this.avoidsWater = (WalkNodeProcessor.lIlIlIIIIlllll[0] != 0);
            "".length();
            if (" ".length() > (0x80 ^ 0x84)) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlIlIllllIllllIII = MathHelper.floor_double(lllllllllllllIIIlIlIllllIlllIlII.getEntityBoundingBox().minY + 0.5);
        }
        return this.openPoint(MathHelper.floor_double(lllllllllllllIIIlIlIllllIlllIlII.getEntityBoundingBox().minX), lllllllllllllIIIlIlIllllIllllIII, MathHelper.floor_double(lllllllllllllIIIlIlIllllIlllIlII.getEntityBoundingBox().minZ));
    }
    
    private static boolean lllIlIllIIIIlIl(final int lllllllllllllIIIlIlIlllIlIIlllll) {
        return lllllllllllllIIIlIlIlllIlIIlllll == 0;
    }
    
    private static boolean lllIlIllIIIlIIl(final int lllllllllllllIIIlIlIlllIlIIlIllI, final int lllllllllllllIIIlIlIlllIlIIlIlIl) {
        return lllllllllllllIIIlIlIlllIlIIlIllI != lllllllllllllIIIlIlIlllIlIIlIlIl;
    }
    
    private static boolean lllIlIllIIIIlII(final Object lllllllllllllIIIlIlIlllIlIlIlIIl) {
        return lllllllllllllIIIlIlIlllIlIlIlIIl != null;
    }
    
    @Override
    public void initProcessor(final IBlockAccess lllllllllllllIIIlIlIlllllIIIlIII, final Entity lllllllllllllIIIlIlIlllllIIIIlII) {
        super.initProcessor(lllllllllllllIIIlIlIlllllIIIlIII, lllllllllllllIIIlIlIlllllIIIIlII);
        this.shouldAvoidWater = this.avoidsWater;
    }
    
    private static void lllIlIlIlllllll() {
        (lIlIlIIIIlllll = new int[7])[0] = ((0xF ^ 0x7) & ~(0x88 ^ 0x80));
        WalkNodeProcessor.lIlIlIIIIlllll[1] = " ".length();
        WalkNodeProcessor.lIlIlIIIIlllll[2] = "  ".length();
        WalkNodeProcessor.lIlIlIIIIlllll[3] = -"   ".length();
        WalkNodeProcessor.lIlIlIIIIlllll[4] = -(0x82 ^ 0xAC ^ (0xAF ^ 0x85));
        WalkNodeProcessor.lIlIlIIIIlllll[5] = -" ".length();
        WalkNodeProcessor.lIlIlIIIIlllll[6] = -"  ".length();
    }
    
    private static boolean lllIlIllIIIllII(final Object lllllllllllllIIIlIlIlllIlIlIIllI, final Object lllllllllllllIIIlIlIlllIlIlIIlIl) {
        return lllllllllllllIIIlIlIlllIlIlIIllI == lllllllllllllIIIlIlIlllIlIlIIlIl;
    }
    
    private static boolean lllIlIllIIIIIll(final int lllllllllllllIIIlIlIlllIlIllIlII, final int lllllllllllllIIIlIlIlllIlIllIIll) {
        return lllllllllllllIIIlIlIlllIlIllIlII == lllllllllllllIIIlIlIlllIlIllIIll;
    }
    
    static {
        lllIlIlIlllllll();
    }
    
    private static boolean lllIlIllIIIlIlI(final int lllllllllllllIIIlIlIlllIlIllIIII, final int lllllllllllllIIIlIlIlllIlIlIllll) {
        return lllllllllllllIIIlIlIlllIlIllIIII >= lllllllllllllIIIlIlIlllIlIlIllll;
    }
    
    public static int func_176170_a(final IBlockAccess lllllllllllllIIIlIlIlllIlllIlIlI, final Entity lllllllllllllIIIlIlIlllIllllllII, final int lllllllllllllIIIlIlIlllIlllIlIII, final int lllllllllllllIIIlIlIlllIlllIIlll, final int lllllllllllllIIIlIlIlllIlllIIllI, final int lllllllllllllIIIlIlIlllIlllllIII, final int lllllllllllllIIIlIlIlllIlllIIlII, final int lllllllllllllIIIlIlIlllIlllIIIll, final boolean lllllllllllllIIIlIlIlllIllllIlIl, final boolean lllllllllllllIIIlIlIlllIllllIlII, final boolean lllllllllllllIIIlIlIlllIllllIIll) {
        boolean lllllllllllllIIIlIlIlllIllllIIlI = WalkNodeProcessor.lIlIlIIIIlllll[0] != 0;
        final BlockPos lllllllllllllIIIlIlIlllIllllIIIl = new BlockPos(lllllllllllllIIIlIlIlllIllllllII);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIlIlllIllllIIII = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIlIlllIlllIllll = lllllllllllllIIIlIlIlllIlllIlIII;
        "".length();
        if (((143 + 137 - 131 + 7 ^ 124 + 64 - 187 + 176) & (34 + 42 + 53 + 11 ^ 87 + 159 - 226 + 141 ^ -" ".length())) != 0x0) {
            return (" ".length() ^ (0xB6 ^ 0x91)) & (132 + 86 - 200 + 115 ^ 0 + 106 - 17 + 74 ^ -" ".length());
        }
        while (!lllIlIllIIIlIlI(lllllllllllllIIIlIlIlllIlllIllll, lllllllllllllIIIlIlIlllIlllIlIII + lllllllllllllIIIlIlIlllIlllllIII)) {
            int lllllllllllllIIIlIlIlllIlllIlllI = lllllllllllllIIIlIlIlllIlllIIlll;
            "".length();
            if ("   ".length() != "   ".length()) {
                return (0x30 ^ 0x34) & ~(0x9A ^ 0x9E);
            }
            while (!lllIlIllIIIlIlI(lllllllllllllIIIlIlIlllIlllIlllI, lllllllllllllIIIlIlIlllIlllIIlll + lllllllllllllIIIlIlIlllIlllIIlII)) {
                int lllllllllllllIIIlIlIlllIlllIllIl = lllllllllllllIIIlIlIlllIlllIIllI;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return (0xA2 ^ 0xB9 ^ (0x8 ^ 0x20)) & (147 + 125 - 219 + 102 ^ 21 + 59 + 31 + 57 ^ -" ".length());
                }
                while (!lllIlIllIIIlIlI(lllllllllllllIIIlIlIlllIlllIllIl, lllllllllllllIIIlIlIlllIlllIIllI + lllllllllllllIIIlIlIlllIlllIIIll)) {
                    lllllllllllllIIIlIlIlllIllllIIII.func_181079_c(lllllllllllllIIIlIlIlllIlllIllll, lllllllllllllIIIlIlIlllIlllIlllI, lllllllllllllIIIlIlIlllIlllIllIl);
                    "".length();
                    final Block lllllllllllllIIIlIlIlllIlllIllII = lllllllllllllIIIlIlIlllIlllIlIlI.getBlockState(lllllllllllllIIIlIlIlllIllllIIII).getBlock();
                    if (lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIllII.getMaterial(), Material.air)) {
                        if (lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIllII, Blocks.trapdoor) && lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIllII, Blocks.iron_trapdoor)) {
                            if (lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIllII, Blocks.flowing_water) && lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIllII, Blocks.water)) {
                                if (lllIlIllIIIIlIl(lllllllllllllIIIlIlIlllIllllIIll ? 1 : 0) && lllIlIllIIIIIII((lllllllllllllIIIlIlIlllIlllIllII instanceof BlockDoor) ? 1 : 0) && lllIlIllIIIllII(lllllllllllllIIIlIlIlllIlllIllII.getMaterial(), Material.wood)) {
                                    return WalkNodeProcessor.lIlIlIIIIlllll[0];
                                }
                            }
                            else {
                                if (lllIlIllIIIIIII(lllllllllllllIIIlIlIlllIllllIlIl ? 1 : 0)) {
                                    return WalkNodeProcessor.lIlIlIIIIlllll[5];
                                }
                                lllllllllllllIIIlIlIlllIllllIIlI = (WalkNodeProcessor.lIlIlIIIIlllll[1] != 0);
                                "".length();
                                if (((41 + 12 - 40 + 123 ^ 132 + 143 - 119 + 2) & (9 + 8 + 41 + 112 ^ 77 + 143 - 204 + 172 ^ -" ".length())) != 0x0) {
                                    return (0xD4 ^ 0xB1 ^ (0x5D ^ 0x26)) & (40 + 30 + 31 + 45 ^ 103 + 24 - 78 + 91 ^ -" ".length());
                                }
                            }
                        }
                        else {
                            lllllllllllllIIIlIlIlllIllllIIlI = (WalkNodeProcessor.lIlIlIIIIlllll[1] != 0);
                        }
                        if (lllIlIllIIIIIII((lllllllllllllIIIlIlIlllIllllllII.worldObj.getBlockState(lllllllllllllIIIlIlIlllIllllIIII).getBlock() instanceof BlockRailBase) ? 1 : 0)) {
                            if (lllIlIllIIIIlIl((lllllllllllllIIIlIlIlllIllllllII.worldObj.getBlockState(lllllllllllllIIIlIlIlllIllllIIIl).getBlock() instanceof BlockRailBase) ? 1 : 0) && lllIlIllIIIIlIl((lllllllllllllIIIlIlIlllIllllllII.worldObj.getBlockState(lllllllllllllIIIlIlIlllIllllIIIl.down()).getBlock() instanceof BlockRailBase) ? 1 : 0)) {
                                return WalkNodeProcessor.lIlIlIIIIlllll[3];
                            }
                        }
                        else if (lllIlIllIIIIlIl(lllllllllllllIIIlIlIlllIlllIllII.isPassable(lllllllllllllIIIlIlIlllIlllIlIlI, lllllllllllllIIIlIlIlllIllllIIII) ? 1 : 0) && (!lllIlIllIIIIIII(lllllllllllllIIIlIlIlllIllllIlII ? 1 : 0) || !lllIlIllIIIIIII((lllllllllllllIIIlIlIlllIlllIllII instanceof BlockDoor) ? 1 : 0) || lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIllII.getMaterial(), Material.wood))) {
                            if (!lllIlIllIIIIlIl((lllllllllllllIIIlIlIlllIlllIllII instanceof BlockFence) ? 1 : 0) || !lllIlIllIIIIlIl((lllllllllllllIIIlIlIlllIlllIllII instanceof BlockFenceGate) ? 1 : 0) || lllIlIllIIIIIII((lllllllllllllIIIlIlIlllIlllIllII instanceof BlockWall) ? 1 : 0)) {
                                return WalkNodeProcessor.lIlIlIIIIlllll[3];
                            }
                            if (!lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIllII, Blocks.trapdoor) || lllIlIllIIIllII(lllllllllllllIIIlIlIlllIlllIllII, Blocks.iron_trapdoor)) {
                                return WalkNodeProcessor.lIlIlIIIIlllll[4];
                            }
                            final Material lllllllllllllIIIlIlIlllIlllIlIll = lllllllllllllIIIlIlIlllIlllIllII.getMaterial();
                            if (lllIlIllIIIIIIl(lllllllllllllIIIlIlIlllIlllIlIll, Material.lava)) {
                                return WalkNodeProcessor.lIlIlIIIIlllll[0];
                            }
                            if (lllIlIllIIIIlIl(lllllllllllllIIIlIlIlllIllllllII.isInLava() ? 1 : 0)) {
                                return WalkNodeProcessor.lIlIlIIIIlllll[6];
                            }
                        }
                    }
                    ++lllllllllllllIIIlIlIlllIlllIllIl;
                }
                ++lllllllllllllIIIlIlIlllIlllIlllI;
            }
            ++lllllllllllllIIIlIlIlllIlllIllll;
        }
        int n;
        if (lllIlIllIIIIIII(lllllllllllllIIIlIlIlllIllllIIlI ? 1 : 0)) {
            n = WalkNodeProcessor.lIlIlIIIIlllll[2];
            "".length();
            if (" ".length() != " ".length()) {
                return "   ".length() & ("   ".length() ^ -" ".length());
            }
        }
        else {
            n = WalkNodeProcessor.lIlIlIIIIlllll[1];
        }
        return n;
    }
    
    private static boolean lllIlIllIIIIIIl(final Object lllllllllllllIIIlIlIlllIlIlIllII, final Object lllllllllllllIIIlIlIlllIlIlIlIll) {
        return lllllllllllllIIIlIlIlllIlIlIllII != lllllllllllllIIIlIlIlllIlIlIlIll;
    }
    
    @Override
    public void postProcess() {
        super.postProcess();
        this.avoidsWater = this.shouldAvoidWater;
    }
    
    private PathPoint getSafePoint(final Entity lllllllllllllIIIlIlIllllIIllIIlI, final int lllllllllllllIIIlIlIllllIIllIIIl, int lllllllllllllIIIlIlIllllIIllIIII, final int lllllllllllllIIIlIlIllllIIlIllll, final int lllllllllllllIIIlIlIllllIIlIlllI) {
        PathPoint lllllllllllllIIIlIlIllllIIlIllIl = null;
        final int lllllllllllllIIIlIlIllllIIlIllII = this.getVerticalOffset(lllllllllllllIIIlIlIllllIIllIIlI, lllllllllllllIIIlIlIllllIIllIIIl, lllllllllllllIIIlIlIllllIIllIIII, lllllllllllllIIIlIlIllllIIlIllll);
        if (lllIlIllIIIIIll(lllllllllllllIIIlIlIllllIIlIllII, WalkNodeProcessor.lIlIlIIIIlllll[2])) {
            return this.openPoint(lllllllllllllIIIlIlIllllIIllIIIl, lllllllllllllIIIlIlIllllIIllIIII, lllllllllllllIIIlIlIllllIIlIllll);
        }
        if (lllIlIllIIIIIll(lllllllllllllIIIlIlIllllIIlIllII, WalkNodeProcessor.lIlIlIIIIlllll[1])) {
            lllllllllllllIIIlIlIllllIIlIllIl = this.openPoint(lllllllllllllIIIlIlIllllIIllIIIl, lllllllllllllIIIlIlIllllIIllIIII, lllllllllllllIIIlIlIllllIIlIllll);
        }
        if (lllIlIllIIIIlll(lllllllllllllIIIlIlIllllIIlIllIl) && lllIlIllIIIlIII(lllllllllllllIIIlIlIllllIIlIlllI) && lllIlIllIIIlIIl(lllllllllllllIIIlIlIllllIIlIllII, WalkNodeProcessor.lIlIlIIIIlllll[3]) && lllIlIllIIIlIIl(lllllllllllllIIIlIlIllllIIlIllII, WalkNodeProcessor.lIlIlIIIIlllll[4]) && lllIlIllIIIIIll(this.getVerticalOffset(lllllllllllllIIIlIlIllllIIllIIlI, lllllllllllllIIIlIlIllllIIllIIIl, lllllllllllllIIIlIlIllllIIllIIII + lllllllllllllIIIlIlIllllIIlIlllI, lllllllllllllIIIlIlIllllIIlIllll), WalkNodeProcessor.lIlIlIIIIlllll[1])) {
            lllllllllllllIIIlIlIllllIIlIllIl = this.openPoint(lllllllllllllIIIlIlIllllIIllIIIl, lllllllllllllIIIlIlIllllIIllIIII + lllllllllllllIIIlIlIllllIIlIlllI, lllllllllllllIIIlIlIllllIIlIllll);
            lllllllllllllIIIlIlIllllIIllIIII += lllllllllllllIIIlIlIllllIIlIlllI;
        }
        if (lllIlIllIIIIlII(lllllllllllllIIIlIlIllllIIlIllIl)) {
            int lllllllllllllIIIlIlIllllIIlIlIll = WalkNodeProcessor.lIlIlIIIIlllll[0];
            int lllllllllllllIIIlIlIllllIIlIlIlI = WalkNodeProcessor.lIlIlIIIIlllll[0];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
            while (!lllIlIllIIIlIll(lllllllllllllIIIlIlIllllIIllIIII)) {
                lllllllllllllIIIlIlIllllIIlIlIlI = this.getVerticalOffset(lllllllllllllIIIlIlIllllIIllIIlI, lllllllllllllIIIlIlIllllIIllIIIl, lllllllllllllIIIlIlIllllIIllIIII - WalkNodeProcessor.lIlIlIIIIlllll[1], lllllllllllllIIIlIlIllllIIlIllll);
                if (lllIlIllIIIIIII(this.avoidsWater ? 1 : 0) && lllIlIllIIIIIll(lllllllllllllIIIlIlIllllIIlIlIlI, WalkNodeProcessor.lIlIlIIIIlllll[5])) {
                    return null;
                }
                if (lllIlIllIIIlIIl(lllllllllllllIIIlIlIllllIIlIlIlI, WalkNodeProcessor.lIlIlIIIIlllll[1])) {
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                    break;
                }
                else {
                    if (lllIlIllIIIlIlI(lllllllllllllIIIlIlIllllIIlIlIll++, lllllllllllllIIIlIlIllllIIllIIlI.getMaxFallHeight())) {
                        return null;
                    }
                    if (lllIlIllIIIlIll(--lllllllllllllIIIlIlIllllIIllIIII)) {
                        return null;
                    }
                    lllllllllllllIIIlIlIllllIIlIllIl = this.openPoint(lllllllllllllIIIlIlIllllIIllIIIl, lllllllllllllIIIlIlIllllIIllIIII, lllllllllllllIIIlIlIllllIIlIllll);
                }
            }
            if (lllIlIllIIIIIll(lllllllllllllIIIlIlIllllIIlIlIlI, WalkNodeProcessor.lIlIlIIIIlllll[6])) {
                return null;
            }
        }
        return lllllllllllllIIIlIlIllllIIlIllIl;
    }
    
    private static boolean lllIlIllIIIIllI(final int lllllllllllllIIIlIlIlllIlIIlllIl) {
        return lllllllllllllIIIlIlIlllIlIIlllIl < 0;
    }
    
    public void setCanSwim(final boolean lllllllllllllIIIlIlIlllIllIIIIII) {
        this.canSwim = lllllllllllllIIIlIlIlllIllIIIIII;
    }
    
    private static boolean lllIlIllIIIIlll(final Object lllllllllllllIIIlIlIlllIlIlIIIll) {
        return lllllllllllllIIIlIlIlllIlIlIIIll == null;
    }
    
    public void setAvoidsWater(final boolean lllllllllllllIIIlIlIlllIllIIlIII) {
        this.avoidsWater = lllllllllllllIIIlIlIlllIllIIlIII;
    }
    
    private static boolean lllIlIllIIIlIII(final int lllllllllllllIIIlIlIlllIlIIllIIl) {
        return lllllllllllllIIIlIlIlllIlIIllIIl > 0;
    }
    
    public boolean getAvoidsWater() {
        return this.avoidsWater;
    }
    
    public boolean getEnterDoors() {
        return this.canEnterDoors;
    }
    
    @Override
    public PathPoint getPathPointToCoords(final Entity lllllllllllllIIIlIlIllllIllIlIlI, final double lllllllllllllIIIlIlIllllIllIIlII, final double lllllllllllllIIIlIlIllllIllIIIll, final double lllllllllllllIIIlIlIllllIllIIIlI) {
        return this.openPoint(MathHelper.floor_double(lllllllllllllIIIlIlIllllIllIIlII - lllllllllllllIIIlIlIllllIllIlIlI.width / 2.0f), MathHelper.floor_double(lllllllllllllIIIlIlIllllIllIIIll), MathHelper.floor_double(lllllllllllllIIIlIlIllllIllIIIlI - lllllllllllllIIIlIlIllllIllIlIlI.width / 2.0f));
    }
    
    private static int lllIlIllIIIIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean getCanSwim() {
        return this.canSwim;
    }
    
    @Override
    public int findPathOptions(final PathPoint[] lllllllllllllIIIlIlIllllIlIIlIII, final Entity lllllllllllllIIIlIlIllllIlIIIlll, final PathPoint lllllllllllllIIIlIlIllllIlIlIIlI, final PathPoint lllllllllllllIIIlIlIllllIlIIIlIl, final float lllllllllllllIIIlIlIllllIlIlIIII) {
        int lllllllllllllIIIlIlIllllIlIIllll = WalkNodeProcessor.lIlIlIIIIlllll[0];
        int lllllllllllllIIIlIlIllllIlIIlllI = WalkNodeProcessor.lIlIlIIIIlllll[0];
        if (lllIlIllIIIIIll(this.getVerticalOffset(lllllllllllllIIIlIlIllllIlIIIlll, lllllllllllllIIIlIlIllllIlIlIIlI.xCoord, lllllllllllllIIIlIlIllllIlIlIIlI.yCoord + WalkNodeProcessor.lIlIlIIIIlllll[1], lllllllllllllIIIlIlIllllIlIlIIlI.zCoord), WalkNodeProcessor.lIlIlIIIIlllll[1])) {
            lllllllllllllIIIlIlIllllIlIIlllI = WalkNodeProcessor.lIlIlIIIIlllll[1];
        }
        final PathPoint lllllllllllllIIIlIlIllllIlIIllIl = this.getSafePoint(lllllllllllllIIIlIlIllllIlIIIlll, lllllllllllllIIIlIlIllllIlIlIIlI.xCoord, lllllllllllllIIIlIlIllllIlIlIIlI.yCoord, lllllllllllllIIIlIlIllllIlIlIIlI.zCoord + WalkNodeProcessor.lIlIlIIIIlllll[1], lllllllllllllIIIlIlIllllIlIIlllI);
        final PathPoint lllllllllllllIIIlIlIllllIlIIllII = this.getSafePoint(lllllllllllllIIIlIlIllllIlIIIlll, lllllllllllllIIIlIlIllllIlIlIIlI.xCoord - WalkNodeProcessor.lIlIlIIIIlllll[1], lllllllllllllIIIlIlIllllIlIlIIlI.yCoord, lllllllllllllIIIlIlIllllIlIlIIlI.zCoord, lllllllllllllIIIlIlIllllIlIIlllI);
        final PathPoint lllllllllllllIIIlIlIllllIlIIlIll = this.getSafePoint(lllllllllllllIIIlIlIllllIlIIIlll, lllllllllllllIIIlIlIllllIlIlIIlI.xCoord + WalkNodeProcessor.lIlIlIIIIlllll[1], lllllllllllllIIIlIlIllllIlIlIIlI.yCoord, lllllllllllllIIIlIlIllllIlIlIIlI.zCoord, lllllllllllllIIIlIlIllllIlIIlllI);
        final PathPoint lllllllllllllIIIlIlIllllIlIIlIlI = this.getSafePoint(lllllllllllllIIIlIlIllllIlIIIlll, lllllllllllllIIIlIlIllllIlIlIIlI.xCoord, lllllllllllllIIIlIlIllllIlIlIIlI.yCoord, lllllllllllllIIIlIlIllllIlIlIIlI.zCoord - WalkNodeProcessor.lIlIlIIIIlllll[1], lllllllllllllIIIlIlIllllIlIIlllI);
        if (lllIlIllIIIIlII(lllllllllllllIIIlIlIllllIlIIllIl) && lllIlIllIIIIlIl(lllllllllllllIIIlIlIllllIlIIllIl.visited ? 1 : 0) && lllIlIllIIIIllI(lllIlIllIIIIIlI(lllllllllllllIIIlIlIllllIlIIllIl.distanceTo(lllllllllllllIIIlIlIllllIlIIIlIl), lllllllllllllIIIlIlIllllIlIlIIII))) {
            lllllllllllllIIIlIlIllllIlIIlIII[lllllllllllllIIIlIlIllllIlIIllll++] = lllllllllllllIIIlIlIllllIlIIllIl;
        }
        if (lllIlIllIIIIlII(lllllllllllllIIIlIlIllllIlIIllII) && lllIlIllIIIIlIl(lllllllllllllIIIlIlIllllIlIIllII.visited ? 1 : 0) && lllIlIllIIIIllI(lllIlIllIIIIIlI(lllllllllllllIIIlIlIllllIlIIllII.distanceTo(lllllllllllllIIIlIlIllllIlIIIlIl), lllllllllllllIIIlIlIllllIlIlIIII))) {
            lllllllllllllIIIlIlIllllIlIIlIII[lllllllllllllIIIlIlIllllIlIIllll++] = lllllllllllllIIIlIlIllllIlIIllII;
        }
        if (lllIlIllIIIIlII(lllllllllllllIIIlIlIllllIlIIlIll) && lllIlIllIIIIlIl(lllllllllllllIIIlIlIllllIlIIlIll.visited ? 1 : 0) && lllIlIllIIIIllI(lllIlIllIIIIIlI(lllllllllllllIIIlIlIllllIlIIlIll.distanceTo(lllllllllllllIIIlIlIllllIlIIIlIl), lllllllllllllIIIlIlIllllIlIlIIII))) {
            lllllllllllllIIIlIlIllllIlIIlIII[lllllllllllllIIIlIlIllllIlIIllll++] = lllllllllllllIIIlIlIllllIlIIlIll;
        }
        if (lllIlIllIIIIlII(lllllllllllllIIIlIlIllllIlIIlIlI) && lllIlIllIIIIlIl(lllllllllllllIIIlIlIllllIlIIlIlI.visited ? 1 : 0) && lllIlIllIIIIllI(lllIlIllIIIIIlI(lllllllllllllIIIlIlIllllIlIIlIlI.distanceTo(lllllllllllllIIIlIlIllllIlIIIlIl), lllllllllllllIIIlIlIllllIlIlIIII))) {
            lllllllllllllIIIlIlIllllIlIIlIII[lllllllllllllIIIlIlIllllIlIIllll++] = lllllllllllllIIIlIlIllllIlIIlIlI;
        }
        return lllllllllllllIIIlIlIllllIlIIllll;
    }
    
    private static boolean lllIlIllIIIIIII(final int lllllllllllllIIIlIlIlllIlIlIIIIl) {
        return lllllllllllllIIIlIlIlllIlIlIIIIl != 0;
    }
    
    private int getVerticalOffset(final Entity lllllllllllllIIIlIlIllllIIIlIlII, final int lllllllllllllIIIlIlIllllIIIlIIll, final int lllllllllllllIIIlIlIllllIIIlIIlI, final int lllllllllllllIIIlIlIllllIIIlIIIl) {
        return func_176170_a(this.blockaccess, lllllllllllllIIIlIlIllllIIIlIlII, lllllllllllllIIIlIlIllllIIIlIIll, lllllllllllllIIIlIlIllllIIIlIIlI, lllllllllllllIIIlIlIllllIIIlIIIl, this.entitySizeX, this.entitySizeY, this.entitySizeZ, this.avoidsWater, this.canBreakDoors, this.canEnterDoors);
    }
    
    private static boolean lllIlIllIIIlIll(final int lllllllllllllIIIlIlIlllIlIIllIll) {
        return lllllllllllllIIIlIlIlllIlIIllIll <= 0;
    }
    
    public void setBreakDoors(final boolean lllllllllllllIIIlIlIlllIllIIllII) {
        this.canBreakDoors = lllllllllllllIIIlIlIlllIllIIllII;
    }
}
