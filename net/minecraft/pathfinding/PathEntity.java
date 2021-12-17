// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import net.minecraft.util.Vec3;
import net.minecraft.entity.Entity;

public class PathEntity
{
    private final /* synthetic */ PathPoint[] points;
    private static final /* synthetic */ int[] lIIlIllllIIIlI;
    private /* synthetic */ int pathLength;
    private /* synthetic */ int currentPathIndex;
    
    public Vec3 getPosition(final Entity lllllllllllllIIllIIIIIIlIIIIIllI) {
        return this.getVectorFromIndex(lllllllllllllIIllIIIIIIlIIIIIllI, this.currentPathIndex);
    }
    
    public boolean isSamePath(final PathEntity lllllllllllllIIllIIIIIIIllllllll) {
        if (llIlIlIIIIllIll(lllllllllllllIIllIIIIIIIllllllll)) {
            return PathEntity.lIIlIllllIIIlI[1] != 0;
        }
        if (llIlIlIIIIlllII(lllllllllllllIIllIIIIIIIllllllll.points.length, this.points.length)) {
            return PathEntity.lIIlIllllIIIlI[1] != 0;
        }
        int lllllllllllllIIllIIIIIIIlllllllI = PathEntity.lIIlIllllIIIlI[1];
        "".length();
        if ("  ".length() != "  ".length()) {
            return ((108 + 185 - 178 + 130 ^ 55 + 32 - 34 + 98) & (0xB ^ 0x67 ^ (0x7B ^ 0x75) ^ -" ".length())) != 0x0;
        }
        while (!llIlIlIIIIllIIl(lllllllllllllIIllIIIIIIIlllllllI, this.points.length)) {
            if (!llIlIlIIIIlllIl(this.points[lllllllllllllIIllIIIIIIIlllllllI].xCoord, lllllllllllllIIllIIIIIIIllllllll.points[lllllllllllllIIllIIIIIIIlllllllI].xCoord) || !llIlIlIIIIlllIl(this.points[lllllllllllllIIllIIIIIIIlllllllI].yCoord, lllllllllllllIIllIIIIIIIllllllll.points[lllllllllllllIIllIIIIIIIlllllllI].yCoord) || llIlIlIIIIlllII(this.points[lllllllllllllIIllIIIIIIIlllllllI].zCoord, lllllllllllllIIllIIIIIIIllllllll.points[lllllllllllllIIllIIIIIIIlllllllI].zCoord)) {
                return PathEntity.lIIlIllllIIIlI[1] != 0;
            }
            ++lllllllllllllIIllIIIIIIIlllllllI;
        }
        return PathEntity.lIIlIllllIIIlI[0] != 0;
    }
    
    private static boolean llIlIlIIIIllIIl(final int lllllllllllllIIllIIIIIIIlllIlIll, final int lllllllllllllIIllIIIIIIIlllIlIlI) {
        return lllllllllllllIIllIIIIIIIlllIlIll >= lllllllllllllIIllIIIIIIIlllIlIlI;
    }
    
    public Vec3 getVectorFromIndex(final Entity lllllllllllllIIllIIIIIIlIIIlIlII, final int lllllllllllllIIllIIIIIIlIIIlIIll) {
        final double lllllllllllllIIllIIIIIIlIIIlIIlI = this.points[lllllllllllllIIllIIIIIIlIIIlIIll].xCoord + (int)(lllllllllllllIIllIIIIIIlIIIlIlII.width + 1.0f) * 0.5;
        final double lllllllllllllIIllIIIIIIlIIIlIIIl = this.points[lllllllllllllIIllIIIIIIlIIIlIIll].yCoord;
        final double lllllllllllllIIllIIIIIIlIIIlIIII = this.points[lllllllllllllIIllIIIIIIlIIIlIIll].zCoord + (int)(lllllllllllllIIllIIIIIIlIIIlIlII.width + 1.0f) * 0.5;
        return new Vec3(lllllllllllllIIllIIIIIIlIIIlIIlI, lllllllllllllIIllIIIIIIlIIIlIIIl, lllllllllllllIIllIIIIIIlIIIlIIII);
    }
    
    public boolean isFinished() {
        if (llIlIlIIIIllIIl(this.currentPathIndex, this.pathLength)) {
            return PathEntity.lIIlIllllIIIlI[0] != 0;
        }
        return PathEntity.lIIlIllllIIIlI[1] != 0;
    }
    
    public PathEntity(final PathPoint[] lllllllllllllIIllIIIIIIlIIllllIl) {
        this.points = lllllllllllllIIllIIIIIIlIIllllIl;
        this.pathLength = lllllllllllllIIllIIIIIIlIIllllIl.length;
    }
    
    private static boolean llIlIlIIIIlllIl(final int lllllllllllllIIllIIIIIIIlllIllll, final int lllllllllllllIIllIIIIIIIlllIlllI) {
        return lllllllllllllIIllIIIIIIIlllIllll == lllllllllllllIIllIIIIIIIlllIlllI;
    }
    
    public PathPoint getFinalPathPoint() {
        PathPoint pathPoint;
        if (llIlIlIIIIllIlI(this.pathLength)) {
            pathPoint = this.points[this.pathLength - PathEntity.lIIlIllllIIIlI[0]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            pathPoint = null;
        }
        return pathPoint;
    }
    
    private static boolean llIlIlIIIIlllII(final int lllllllllllllIIllIIIIIIIlllIIIll, final int lllllllllllllIIllIIIIIIIlllIIIlI) {
        return lllllllllllllIIllIIIIIIIlllIIIll != lllllllllllllIIllIIIIIIIlllIIIlI;
    }
    
    public void setCurrentPathIndex(final int lllllllllllllIIllIIIIIIlIIIllllI) {
        this.currentPathIndex = lllllllllllllIIllIIIIIIlIIIllllI;
    }
    
    public void incrementPathIndex() {
        this.currentPathIndex += PathEntity.lIIlIllllIIIlI[0];
    }
    
    public int getCurrentPathIndex() {
        return this.currentPathIndex;
    }
    
    public void setCurrentPathLength(final int lllllllllllllIIllIIIIIIlIIlIIlll) {
        this.pathLength = lllllllllllllIIllIIIIIIlIIlIIlll;
    }
    
    public PathPoint getPathPointFromIndex(final int lllllllllllllIIllIIIIIIlIIllIIII) {
        return this.points[lllllllllllllIIllIIIIIIlIIllIIII];
    }
    
    private static void llIlIlIIIIllIII() {
        (lIIlIllllIIIlI = new int[2])[0] = " ".length();
        PathEntity.lIIlIllllIIIlI[1] = ((0x4 ^ 0x4D) & ~(0xD5 ^ 0x9C));
    }
    
    private static boolean llIlIlIIIIllIll(final Object lllllllllllllIIllIIIIIIIlllIlIII) {
        return lllllllllllllIIllIIIIIIIlllIlIII == null;
    }
    
    private static boolean llIlIlIIIIllIlI(final int lllllllllllllIIllIIIIIIIlllIIllI) {
        return lllllllllllllIIllIIIIIIIlllIIllI > 0;
    }
    
    public int getCurrentPathLength() {
        return this.pathLength;
    }
    
    static {
        llIlIlIIIIllIII();
    }
    
    public boolean isDestinationSame(final Vec3 lllllllllllllIIllIIIIIIIllllIIll) {
        final PathPoint lllllllllllllIIllIIIIIIIllllIlIl = this.getFinalPathPoint();
        int n;
        if (llIlIlIIIIllIll(lllllllllllllIIllIIIIIIIllllIlIl)) {
            n = PathEntity.lIIlIllllIIIlI[1];
            "".length();
            if ((0xD2 ^ 0xB5 ^ (0xE4 ^ 0x87)) > (56 + 36 - 63 + 116 ^ 104 + 136 - 93 + 2)) {
                return ((96 + 175 - 179 + 94 ^ 80 + 11 - 23 + 91) & (79 + 107 - 184 + 183 ^ 62 + 101 - 146 + 139 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIlIlIIIIlllIl(lllllllllllllIIllIIIIIIIllllIlIl.xCoord, (int)lllllllllllllIIllIIIIIIIllllIIll.xCoord) && llIlIlIIIIlllIl(lllllllllllllIIllIIIIIIIllllIlIl.zCoord, (int)lllllllllllllIIllIIIIIIIllllIIll.zCoord)) {
            n = PathEntity.lIIlIllllIIIlI[0];
            "".length();
            if (null != null) {
                return ((0x45 ^ 0x66 ^ (0x69 ^ 0x7)) & (0xF9 ^ 0xBB ^ (0xBD ^ 0xB2) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = PathEntity.lIIlIllllIIIlI[1];
        }
        return n != 0;
    }
}
