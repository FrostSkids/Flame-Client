// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.Entity;
import net.minecraft.world.pathfinder.NodeProcessor;

public class PathFinder
{
    private /* synthetic */ NodeProcessor nodeProcessor;
    private static final /* synthetic */ int[] lIIlIllIIlIlIl;
    private /* synthetic */ Path path;
    private /* synthetic */ PathPoint[] pathOptions;
    
    private static int llIlIIIlllllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void llIlIIIllllllIl() {
        (lIIlIllIIlIlIl = new int[3])[0] = (0xA9 ^ 0x89);
        PathFinder.lIIlIllIIlIlIl[1] = " ".length();
        PathFinder.lIIlIllIIlIlIl[2] = ((0x3C ^ 0x12 ^ (0x7C ^ 0x8)) & (174 + 10 - 18 + 44 ^ 78 + 47 - 5 + 16 ^ -" ".length()));
    }
    
    static {
        llIlIIIllllllIl();
    }
    
    private static boolean llIlIIlIIIIIIll(final Object lllllllllllllIIllIIlIlIIIllllIll) {
        return lllllllllllllIIllIIlIlIIIllllIll == null;
    }
    
    private PathEntity addToPath(final Entity lllllllllllllIIllIIlIlIIlIlIlIII, final PathPoint lllllllllllllIIllIIlIlIIlIIlllII, final PathPoint lllllllllllllIIllIIlIlIIlIIllIll, final float lllllllllllllIIllIIlIlIIlIlIIlIl) {
        lllllllllllllIIllIIlIlIIlIIlllII.totalPathDistance = 0.0f;
        lllllllllllllIIllIIlIlIIlIIlllII.distanceToNext = lllllllllllllIIllIIlIlIIlIIlllII.distanceToSquared(lllllllllllllIIllIIlIlIIlIIllIll);
        lllllllllllllIIllIIlIlIIlIIlllII.distanceToTarget = lllllllllllllIIllIIlIlIIlIIlllII.distanceToNext;
        this.path.clearPath();
        this.path.addPoint(lllllllllllllIIllIIlIlIIlIIlllII);
        "".length();
        PathPoint lllllllllllllIIllIIlIlIIlIlIIlII = lllllllllllllIIllIIlIlIIlIIlllII;
        "".length();
        if ("   ".length() < 0) {
            return null;
        }
        while (!llIlIIIllllllll(this.path.isPathEmpty() ? 1 : 0)) {
            final PathPoint lllllllllllllIIllIIlIlIIlIlIIIll = this.path.dequeue();
            if (llIlIIIllllllll(lllllllllllllIIllIIlIlIIlIlIIIll.equals(lllllllllllllIIllIIlIlIIlIIllIll) ? 1 : 0)) {
                return this.createEntityPath(lllllllllllllIIllIIlIlIIlIIlllII, lllllllllllllIIllIIlIlIIlIIllIll);
            }
            if (llIlIIlIIIIIIII(llIlIIIlllllllI(lllllllllllllIIllIIlIlIIlIlIIIll.distanceToSquared(lllllllllllllIIllIIlIlIIlIIllIll), lllllllllllllIIllIIlIlIIlIlIIlII.distanceToSquared(lllllllllllllIIllIIlIlIIlIIllIll)))) {
                lllllllllllllIIllIIlIlIIlIlIIlII = lllllllllllllIIllIIlIlIIlIlIIIll;
            }
            lllllllllllllIIllIIlIlIIlIlIIIll.visited = (PathFinder.lIIlIllIIlIlIl[1] != 0);
            final int lllllllllllllIIllIIlIlIIlIlIIIlI = this.nodeProcessor.findPathOptions(this.pathOptions, lllllllllllllIIllIIlIlIIlIlIlIII, lllllllllllllIIllIIlIlIIlIlIIIll, lllllllllllllIIllIIlIlIIlIIllIll, lllllllllllllIIllIIlIlIIlIlIIlIl);
            int lllllllllllllIIllIIlIlIIlIlIIIIl = PathFinder.lIIlIllIIlIlIl[2];
            "".length();
            if (null != null) {
                return null;
            }
            while (!llIlIIlIIIIIIIl(lllllllllllllIIllIIlIlIIlIlIIIIl, lllllllllllllIIllIIlIlIIlIlIIIlI)) {
                final PathPoint lllllllllllllIIllIIlIlIIlIlIIIII = this.pathOptions[lllllllllllllIIllIIlIlIIlIlIIIIl];
                final float lllllllllllllIIllIIlIlIIlIIlllll = lllllllllllllIIllIIlIlIIlIlIIIll.totalPathDistance + lllllllllllllIIllIIlIlIIlIlIIIll.distanceToSquared(lllllllllllllIIllIIlIlIIlIlIIIII);
                if (llIlIIlIIIIIIII(llIlIIIlllllllI(lllllllllllllIIllIIlIlIIlIIlllll, lllllllllllllIIllIIlIlIIlIlIIlIl * 2.0f)) && (!llIlIIIllllllll(lllllllllllllIIllIIlIlIIlIlIIIII.isAssigned() ? 1 : 0) || llIlIIlIIIIIIII(llIlIIIlllllllI(lllllllllllllIIllIIlIlIIlIIlllll, lllllllllllllIIllIIlIlIIlIlIIIII.totalPathDistance)))) {
                    lllllllllllllIIllIIlIlIIlIlIIIII.previous = lllllllllllllIIllIIlIlIIlIlIIIll;
                    lllllllllllllIIllIIlIlIIlIlIIIII.totalPathDistance = lllllllllllllIIllIIlIlIIlIIlllll;
                    lllllllllllllIIllIIlIlIIlIlIIIII.distanceToNext = lllllllllllllIIllIIlIlIIlIlIIIII.distanceToSquared(lllllllllllllIIllIIlIlIIlIIllIll);
                    if (llIlIIIllllllll(lllllllllllllIIllIIlIlIIlIlIIIII.isAssigned() ? 1 : 0)) {
                        this.path.changeDistance(lllllllllllllIIllIIlIlIIlIlIIIII, lllllllllllllIIllIIlIlIIlIlIIIII.totalPathDistance + lllllllllllllIIllIIlIlIIlIlIIIII.distanceToNext);
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIllIIlIlIIlIlIIIII.distanceToTarget = lllllllllllllIIllIIlIlIIlIlIIIII.totalPathDistance + lllllllllllllIIllIIlIlIIlIlIIIII.distanceToNext;
                        this.path.addPoint(lllllllllllllIIllIIlIlIIlIlIIIII);
                        "".length();
                    }
                }
                ++lllllllllllllIIllIIlIlIIlIlIIIIl;
            }
        }
        if (llIlIIlIIIIIIlI(lllllllllllllIIllIIlIlIIlIlIIlII, lllllllllllllIIllIIlIlIIlIIlllII)) {
            return null;
        }
        return this.createEntityPath(lllllllllllllIIllIIlIlIIlIIlllII, lllllllllllllIIllIIlIlIIlIlIIlII);
    }
    
    public PathEntity createEntityPathTo(final IBlockAccess lllllllllllllIIllIIlIlIIllIlIllI, final Entity lllllllllllllIIllIIlIlIIllIlIlIl, final BlockPos lllllllllllllIIllIIlIlIIllIllIIl, final float lllllllllllllIIllIIlIlIIllIlIIll) {
        return this.createEntityPathTo(lllllllllllllIIllIIlIlIIllIlIllI, lllllllllllllIIllIIlIlIIllIlIlIl, lllllllllllllIIllIIlIlIIllIllIIl.getX() + 0.5f, lllllllllllllIIllIIlIlIIllIllIIl.getY() + 0.5f, lllllllllllllIIllIIlIlIIllIllIIl.getZ() + 0.5f, lllllllllllllIIllIIlIlIIllIlIIll);
    }
    
    private static boolean llIlIIIllllllll(final int lllllllllllllIIllIIlIlIIIllllIIl) {
        return lllllllllllllIIllIIlIlIIIllllIIl != 0;
    }
    
    private static boolean llIlIIlIIIIIIII(final int lllllllllllllIIllIIlIlIIIlllIlll) {
        return lllllllllllllIIllIIlIlIIIlllIlll < 0;
    }
    
    private PathEntity createEntityPathTo(final IBlockAccess lllllllllllllIIllIIlIlIIlIllllIl, final Entity lllllllllllllIIllIIlIlIIllIIIllI, final double lllllllllllllIIllIIlIlIIlIlllIll, final double lllllllllllllIIllIIlIlIIllIIIlII, final double lllllllllllllIIllIIlIlIIllIIIIll, final float lllllllllllllIIllIIlIlIIllIIIIlI) {
        this.path.clearPath();
        this.nodeProcessor.initProcessor(lllllllllllllIIllIIlIlIIlIllllIl, lllllllllllllIIllIIlIlIIllIIIllI);
        final PathPoint lllllllllllllIIllIIlIlIIllIIIIIl = this.nodeProcessor.getPathPointTo(lllllllllllllIIllIIlIlIIllIIIllI);
        final PathPoint lllllllllllllIIllIIlIlIIllIIIIII = this.nodeProcessor.getPathPointToCoords(lllllllllllllIIllIIlIlIIllIIIllI, lllllllllllllIIllIIlIlIIlIlllIll, lllllllllllllIIllIIlIlIIllIIIlII, lllllllllllllIIllIIlIlIIllIIIIll);
        final PathEntity lllllllllllllIIllIIlIlIIlIllllll = this.addToPath(lllllllllllllIIllIIlIlIIllIIIllI, lllllllllllllIIllIIlIlIIllIIIIIl, lllllllllllllIIllIIlIlIIllIIIIII, lllllllllllllIIllIIlIlIIllIIIIlI);
        this.nodeProcessor.postProcess();
        return lllllllllllllIIllIIlIlIIlIllllll;
    }
    
    public PathEntity createEntityPathTo(final IBlockAccess lllllllllllllIIllIIlIlIIlllIIlIl, final Entity lllllllllllllIIllIIlIlIIlllIlIIl, final Entity lllllllllllllIIllIIlIlIIlllIIIll, final float lllllllllllllIIllIIlIlIIlllIIlll) {
        return this.createEntityPathTo(lllllllllllllIIllIIlIlIIlllIIlIl, lllllllllllllIIllIIlIlIIlllIlIIl, lllllllllllllIIllIIlIlIIlllIIIll.posX, lllllllllllllIIllIIlIlIIlllIIIll.getEntityBoundingBox().minY, lllllllllllllIIllIIlIlIIlllIIIll.posZ, lllllllllllllIIllIIlIlIIlllIIlll);
    }
    
    private static boolean llIlIIlIIIIIIlI(final Object lllllllllllllIIllIIlIlIIIllllllI, final Object lllllllllllllIIllIIlIlIIIlllllIl) {
        return lllllllllllllIIllIIlIlIIIllllllI == lllllllllllllIIllIIlIlIIIlllllIl;
    }
    
    public PathFinder(final NodeProcessor lllllllllllllIIllIIlIlIIllllIIll) {
        this.path = new Path();
        this.pathOptions = new PathPoint[PathFinder.lIIlIllIIlIlIl[0]];
        this.nodeProcessor = lllllllllllllIIllIIlIlIIllllIIll;
    }
    
    private PathEntity createEntityPath(final PathPoint lllllllllllllIIllIIlIlIIlIIIlllI, final PathPoint lllllllllllllIIllIIlIlIIlIIIllIl) {
        int lllllllllllllIIllIIlIlIIlIIIllII = PathFinder.lIIlIllIIlIlIl[1];
        PathPoint lllllllllllllIIllIIlIlIIlIIIlIll = lllllllllllllIIllIIlIlIIlIIIllIl;
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlIIlIIIIIIll(lllllllllllllIIllIIlIlIIlIIIlIll.previous)) {
            ++lllllllllllllIIllIIlIlIIlIIIllII;
            lllllllllllllIIllIIlIlIIlIIIlIll = lllllllllllllIIllIIlIlIIlIIIlIll.previous;
        }
        final PathPoint[] lllllllllllllIIllIIlIlIIlIIIlIlI = new PathPoint[lllllllllllllIIllIIlIlIIlIIIllII];
        PathPoint lllllllllllllIIllIIlIlIIlIIIlIIl = lllllllllllllIIllIIlIlIIlIIIllIl;
        --lllllllllllllIIllIIlIlIIlIIIllII;
        lllllllllllllIIllIIlIlIIlIIIlIlI[lllllllllllllIIllIIlIlIIlIIIllII] = lllllllllllllIIllIIlIlIIlIIIllIl;
        "".length();
        if ("   ".length() == " ".length()) {
            return null;
        }
        while (!llIlIIlIIIIIIll(lllllllllllllIIllIIlIlIIlIIIlIIl.previous)) {
            lllllllllllllIIllIIlIlIIlIIIlIIl = lllllllllllllIIllIIlIlIIlIIIlIIl.previous;
            --lllllllllllllIIllIIlIlIIlIIIllII;
            lllllllllllllIIllIIlIlIIlIIIlIlI[lllllllllllllIIllIIlIlIIlIIIllII] = lllllllllllllIIllIIlIlIIlIIIlIIl;
        }
        return new PathEntity(lllllllllllllIIllIIlIlIIlIIIlIlI);
    }
    
    private static boolean llIlIIlIIIIIIIl(final int lllllllllllllIIllIIlIlIIlIIIIIlI, final int lllllllllllllIIllIIlIlIIlIIIIIIl) {
        return lllllllllllllIIllIIlIlIIlIIIIIlI >= lllllllllllllIIllIIlIlIIlIIIIIIl;
    }
}
