// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.pathfinder;

import net.minecraft.util.MathHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathPoint;

public class SwimNodeProcessor extends NodeProcessor
{
    private static final /* synthetic */ int[] lIlIIlIIlIlIlI;
    
    private static boolean lllIIlIllIIIIlI(final Object lllllllllllllIIIlllIIIIlIlllIIII) {
        return lllllllllllllIIIlllIIIIlIlllIIII != null;
    }
    
    @Override
    public int findPathOptions(final PathPoint[] lllllllllllllIIIlllIIIIllIllIllI, final Entity lllllllllllllIIIlllIIIIllIlllllI, final PathPoint lllllllllllllIIIlllIIIIllIllIlII, final PathPoint lllllllllllllIIIlllIIIIllIllllII, final float lllllllllllllIIIlllIIIIllIllIIlI) {
        int lllllllllllllIIIlllIIIIllIlllIlI = SwimNodeProcessor.lIlIIlIIlIlIlI[0];
        final String lllllllllllllIIIlllIIIIllIlIllIl;
        final double lllllllllllllIIIlllIIIIllIlIlllI = ((EnumFacing[])(Object)(lllllllllllllIIIlllIIIIllIlIllIl = (String)(Object)EnumFacing.values())).length;
        float lllllllllllllIIIlllIIIIllIlIllll = SwimNodeProcessor.lIlIIlIIlIlIlI[0];
        "".length();
        if ((0x71 ^ 0x75) <= -" ".length()) {
            return (0x97 ^ 0xA5) & ~(0x3A ^ 0x8);
        }
        while (!lllIIlIllIIIlIl((int)lllllllllllllIIIlllIIIIllIlIllll, (int)lllllllllllllIIIlllIIIIllIlIlllI)) {
            final EnumFacing lllllllllllllIIIlllIIIIllIlllIIl = lllllllllllllIIIlllIIIIllIlIllIl[lllllllllllllIIIlllIIIIllIlIllll];
            final PathPoint lllllllllllllIIIlllIIIIllIlllIII = this.getSafePoint(lllllllllllllIIIlllIIIIllIlllllI, lllllllllllllIIIlllIIIIllIllIlII.xCoord + lllllllllllllIIIlllIIIIllIlllIIl.getFrontOffsetX(), lllllllllllllIIIlllIIIIllIllIlII.yCoord + lllllllllllllIIIlllIIIIllIlllIIl.getFrontOffsetY(), lllllllllllllIIIlllIIIIllIllIlII.zCoord + lllllllllllllIIIlllIIIIllIlllIIl.getFrontOffsetZ());
            if (lllIIlIllIIIIlI(lllllllllllllIIIlllIIIIllIlllIII) && lllIIlIllIIIIll(lllllllllllllIIIlllIIIIllIlllIII.visited ? 1 : 0) && lllIIlIllIIIlII(lllIIlIllIIIIIl(lllllllllllllIIIlllIIIIllIlllIII.distanceTo(lllllllllllllIIIlllIIIIllIllllII), lllllllllllllIIIlllIIIIllIllIIlI))) {
                lllllllllllllIIIlllIIIIllIllIllI[lllllllllllllIIIlllIIIIllIlllIlI++] = lllllllllllllIIIlllIIIIllIlllIII;
            }
            ++lllllllllllllIIIlllIIIIllIlIllll;
        }
        return lllllllllllllIIIlllIIIIllIlllIlI;
    }
    
    static {
        lllIIlIllIIIIII();
    }
    
    private PathPoint getSafePoint(final Entity lllllllllllllIIIlllIIIIllIlIIlII, final int lllllllllllllIIIlllIIIIllIlIIIll, final int lllllllllllllIIIlllIIIIllIIlllII, final int lllllllllllllIIIlllIIIIllIlIIIIl) {
        final int lllllllllllllIIIlllIIIIllIlIIIII = this.func_176186_b(lllllllllllllIIIlllIIIIllIlIIlII, lllllllllllllIIIlllIIIIllIlIIIll, lllllllllllllIIIlllIIIIllIIlllII, lllllllllllllIIIlllIIIIllIlIIIIl);
        PathPoint openPoint;
        if (lllIIlIllIIIllI(lllllllllllllIIIlllIIIIllIlIIIII, SwimNodeProcessor.lIlIIlIIlIlIlI[1])) {
            openPoint = this.openPoint(lllllllllllllIIIlllIIIIllIlIIIll, lllllllllllllIIIlllIIIIllIIlllII, lllllllllllllIIIlllIIIIllIlIIIIl);
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else {
            openPoint = null;
        }
        return openPoint;
    }
    
    private static void lllIIlIllIIIIII() {
        (lIlIIlIIlIlIlI = new int[2])[0] = ((0xF6 ^ 0xA2) & ~(0x3C ^ 0x68));
        SwimNodeProcessor.lIlIIlIIlIlIlI[1] = -" ".length();
    }
    
    @Override
    public void postProcess() {
        super.postProcess();
    }
    
    @Override
    public void initProcessor(final IBlockAccess lllllllllllllIIIlllIIIIllllIIllI, final Entity lllllllllllllIIIlllIIIIllllIIlIl) {
        super.initProcessor(lllllllllllllIIIlllIIIIllllIIllI, lllllllllllllIIIlllIIIIllllIIlIl);
    }
    
    private static int lllIIlIllIIIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lllIIlIllIIIlII(final int lllllllllllllIIIlllIIIIlIllIllII) {
        return lllllllllllllIIIlllIIIIlIllIllII < 0;
    }
    
    private static boolean lllIIlIllIIIIll(final int lllllllllllllIIIlllIIIIlIllIlllI) {
        return lllllllllllllIIIlllIIIIlIllIlllI == 0;
    }
    
    private static boolean lllIIlIllIIIlll(final Object lllllllllllllIIIlllIIIIlIlllIIll, final Object lllllllllllllIIIlllIIIIlIlllIIlI) {
        return lllllllllllllIIIlllIIIIlIlllIIll != lllllllllllllIIIlllIIIIlIlllIIlI;
    }
    
    private static boolean lllIIlIllIIIllI(final int lllllllllllllIIIlllIIIIlIllllIll, final int lllllllllllllIIIlllIIIIlIllllIlI) {
        return lllllllllllllIIIlllIIIIlIllllIll == lllllllllllllIIIlllIIIIlIllllIlI;
    }
    
    private int func_176186_b(final Entity lllllllllllllIIIlllIIIIllIIIllll, final int lllllllllllllIIIlllIIIIllIIIlllI, final int lllllllllllllIIIlllIIIIllIIIIlII, final int lllllllllllllIIIlllIIIIllIIIIIll) {
        final BlockPos.MutableBlockPos lllllllllllllIIIlllIIIIllIIIlIll = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlllIIIIllIIIlIlI = lllllllllllllIIIlllIIIIllIIIlllI;
        "".length();
        if (" ".length() <= 0) {
            return (136 + 18 - 101 + 141 ^ 189 + 27 - 46 + 27) & (4 + 62 - 19 + 109 ^ 69 + 144 - 175 + 117 ^ -" ".length());
        }
        while (!lllIIlIllIIIlIl(lllllllllllllIIIlllIIIIllIIIlIlI, lllllllllllllIIIlllIIIIllIIIlllI + this.entitySizeX)) {
            int lllllllllllllIIIlllIIIIllIIIlIIl = lllllllllllllIIIlllIIIIllIIIIlII;
            "".length();
            if (((((0x5B ^ 0x70) & ~(0x12 ^ 0x39)) ^ (0x66 ^ 0x3A)) & (0xE4 ^ 0x81 ^ (0x34 ^ 0xD) ^ -" ".length())) == -" ".length()) {
                return (193 + 24 - 174 + 174 ^ 99 + 124 - 126 + 97) & (0x4F ^ 0x53 ^ (0x75 ^ 0x72) ^ -" ".length());
            }
            while (!lllIIlIllIIIlIl(lllllllllllllIIIlllIIIIllIIIlIIl, lllllllllllllIIIlllIIIIllIIIIlII + this.entitySizeY)) {
                int lllllllllllllIIIlllIIIIllIIIlIII = lllllllllllllIIIlllIIIIllIIIIIll;
                "".length();
                if (-"  ".length() >= 0) {
                    return (166 + 170 - 171 + 18 ^ 56 + 26 - 71 + 163) & (39 + 87 - 86 + 114 ^ 91 + 27 - 62 + 75 ^ -" ".length());
                }
                while (!lllIIlIllIIIlIl(lllllllllllllIIIlllIIIIllIIIlIII, lllllllllllllIIIlllIIIIllIIIIIll + this.entitySizeZ)) {
                    final Block lllllllllllllIIIlllIIIIllIIIIlll = this.blockaccess.getBlockState(lllllllllllllIIIlllIIIIllIIIlIll.func_181079_c(lllllllllllllIIIlllIIIIllIIIlIlI, lllllllllllllIIIlllIIIIllIIIlIIl, lllllllllllllIIIlllIIIIllIIIlIII)).getBlock();
                    if (lllIIlIllIIIlll(lllllllllllllIIIlllIIIIllIIIIlll.getMaterial(), Material.water)) {
                        return SwimNodeProcessor.lIlIIlIIlIlIlI[0];
                    }
                    ++lllllllllllllIIIlllIIIIllIIIlIII;
                }
                ++lllllllllllllIIIlllIIIIllIIIlIIl;
            }
            ++lllllllllllllIIIlllIIIIllIIIlIlI;
        }
        return SwimNodeProcessor.lIlIIlIIlIlIlI[1];
    }
    
    @Override
    public PathPoint getPathPointTo(final Entity lllllllllllllIIIlllIIIIlllIlllII) {
        return this.openPoint(MathHelper.floor_double(lllllllllllllIIIlllIIIIlllIlllII.getEntityBoundingBox().minX), MathHelper.floor_double(lllllllllllllIIIlllIIIIlllIlllII.getEntityBoundingBox().minY + 0.5), MathHelper.floor_double(lllllllllllllIIIlllIIIIlllIlllII.getEntityBoundingBox().minZ));
    }
    
    private static boolean lllIIlIllIIIlIl(final int lllllllllllllIIIlllIIIIlIlllIlll, final int lllllllllllllIIIlllIIIIlIlllIllI) {
        return lllllllllllllIIIlllIIIIlIlllIlll >= lllllllllllllIIIlllIIIIlIlllIllI;
    }
    
    @Override
    public PathPoint getPathPointToCoords(final Entity lllllllllllllIIIlllIIIIlllIlIIII, final double lllllllllllllIIIlllIIIIlllIlIlII, final double lllllllllllllIIIlllIIIIlllIIlllI, final double lllllllllllllIIIlllIIIIlllIIllIl) {
        return this.openPoint(MathHelper.floor_double(lllllllllllllIIIlllIIIIlllIlIlII - lllllllllllllIIIlllIIIIlllIlIIII.width / 2.0f), MathHelper.floor_double(lllllllllllllIIIlllIIIIlllIIlllI + 0.5), MathHelper.floor_double(lllllllllllllIIIlllIIIIlllIIllIl - lllllllllllllIIIlllIIIIlllIlIIII.width / 2.0f));
    }
}
