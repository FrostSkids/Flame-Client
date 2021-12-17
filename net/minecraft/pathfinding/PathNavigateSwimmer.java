// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import net.minecraft.world.World;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.world.pathfinder.NodeProcessor;
import net.minecraft.world.pathfinder.SwimNodeProcessor;

public class PathNavigateSwimmer extends PathNavigate
{
    private static final /* synthetic */ int[] llllIllllIIIl;
    
    static {
        lIlIllIIIlIllll();
    }
    
    @Override
    protected void removeSunnyPath() {
        super.removeSunnyPath();
    }
    
    private static boolean lIlIllIIIllIlII(final int lllllllllllllIlIllIIIlllIIllllll, final int lllllllllllllIlIllIIIlllIIlllllI) {
        return lllllllllllllIlIllIIIlllIIllllll <= lllllllllllllIlIllIIIlllIIlllllI;
    }
    
    private static int lIlIllIIIllIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    protected PathFinder getPathFinder() {
        return new PathFinder(new SwimNodeProcessor());
    }
    
    @Override
    protected boolean canNavigate() {
        return this.isInLiquid();
    }
    
    @Override
    protected Vec3 getEntityPosition() {
        return new Vec3(this.theEntity.posX, this.theEntity.posY + this.theEntity.height * 0.5, this.theEntity.posZ);
    }
    
    private static boolean lIlIllIIIllIIlI(final int lllllllllllllIlIllIIIlllIIllIIlI) {
        return lllllllllllllIlIllIIIlllIIllIIlI <= 0;
    }
    
    @Override
    protected void pathFollow() {
        final Vec3 lllllllllllllIlIllIIIlllIlIllllI = this.getEntityPosition();
        final float lllllllllllllIlIllIIIlllIlIlllIl = this.theEntity.width * this.theEntity.width;
        final int lllllllllllllIlIllIIIlllIlIlllII = PathNavigateSwimmer.llllIllllIIIl[0];
        if (lIlIllIIIllIIIl(lIlIllIIIllIIII(lllllllllllllIlIllIIIlllIlIllllI.squareDistanceTo(this.currentPath.getVectorFromIndex(this.theEntity, this.currentPath.getCurrentPathIndex())), lllllllllllllIlIllIIIlllIlIlllIl))) {
            this.currentPath.incrementPathIndex();
        }
        int lllllllllllllIlIllIIIlllIlIllIll = Math.min(this.currentPath.getCurrentPathIndex() + lllllllllllllIlIllIIIlllIlIlllII, this.currentPath.getCurrentPathLength() - PathNavigateSwimmer.llllIllllIIIl[1]);
        "".length();
        if ("   ".length() != "   ".length()) {
            return;
        }
        while (!lIlIllIIIllIlII(lllllllllllllIlIllIIIlllIlIllIll, this.currentPath.getCurrentPathIndex())) {
            final Vec3 lllllllllllllIlIllIIIlllIlIllIlI = this.currentPath.getVectorFromIndex(this.theEntity, lllllllllllllIlIllIIIlllIlIllIll);
            if (lIlIllIIIllIIlI(lIlIllIIIllIIII(lllllllllllllIlIllIIIlllIlIllIlI.squareDistanceTo(lllllllllllllIlIllIIIlllIlIllllI), 36.0)) && lIlIllIIIllIIll(this.isDirectPathBetweenPoints(lllllllllllllIlIllIIIlllIlIllllI, lllllllllllllIlIllIIIlllIlIllIlI, PathNavigateSwimmer.llllIllllIIIl[2], PathNavigateSwimmer.llllIllllIIIl[2], PathNavigateSwimmer.llllIllllIIIl[2]) ? 1 : 0)) {
                this.currentPath.setCurrentPathIndex(lllllllllllllIlIllIIIlllIlIllIll);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            else {
                --lllllllllllllIlIllIIIlllIlIllIll;
            }
        }
        this.checkForStuck(lllllllllllllIlIllIIIlllIlIllllI);
    }
    
    private static boolean lIlIllIIIllIIIl(final int lllllllllllllIlIllIIIlllIIllIlII) {
        return lllllllllllllIlIllIIIlllIIllIlII < 0;
    }
    
    private static boolean lIlIllIIIllIIll(final int lllllllllllllIlIllIIIlllIIllIllI) {
        return lllllllllllllIlIllIIIlllIIllIllI != 0;
    }
    
    private static boolean lIlIllIIIllIlIl(final Object lllllllllllllIlIllIIIlllIIlllIII) {
        return lllllllllllllIlIllIIIlllIIlllIII != null;
    }
    
    private static void lIlIllIIIlIllll() {
        (llllIllllIIIl = new int[3])[0] = (0x4E ^ 0x48);
        PathNavigateSwimmer.llllIllllIIIl[1] = " ".length();
        PathNavigateSwimmer.llllIllllIIIl[2] = ((0xED ^ 0xA9) & ~(0xED ^ 0xA9));
    }
    
    private static boolean lIlIllIIIllIllI(final Object lllllllllllllIlIllIIIlllIIlllIll, final Object lllllllllllllIlIllIIIlllIIlllIlI) {
        return lllllllllllllIlIllIIIlllIIlllIll != lllllllllllllIlIllIIIlllIIlllIlI;
    }
    
    @Override
    protected boolean isDirectPathBetweenPoints(final Vec3 lllllllllllllIlIllIIIlllIlIIIlII, final Vec3 lllllllllllllIlIllIIIlllIlIIlIlI, final int lllllllllllllIlIllIIIlllIlIIlIIl, final int lllllllllllllIlIllIIIlllIlIIlIII, final int lllllllllllllIlIllIIIlllIlIIIlll) {
        final MovingObjectPosition lllllllllllllIlIllIIIlllIlIIIllI = this.worldObj.rayTraceBlocks(lllllllllllllIlIllIIIlllIlIIIlII, new Vec3(lllllllllllllIlIllIIIlllIlIIlIlI.xCoord, lllllllllllllIlIllIIIlllIlIIlIlI.yCoord + this.theEntity.height * 0.5, lllllllllllllIlIllIIIlllIlIIlIlI.zCoord), (boolean)(PathNavigateSwimmer.llllIllllIIIl[2] != 0), (boolean)(PathNavigateSwimmer.llllIllllIIIl[1] != 0), (boolean)(PathNavigateSwimmer.llllIllllIIIl[2] != 0));
        if (lIlIllIIIllIlIl(lllllllllllllIlIllIIIlllIlIIIllI) && lIlIllIIIllIllI(lllllllllllllIlIllIIIlllIlIIIllI.typeOfHit, MovingObjectPosition.MovingObjectType.MISS)) {
            return PathNavigateSwimmer.llllIllllIIIl[2] != 0;
        }
        return PathNavigateSwimmer.llllIllllIIIl[1] != 0;
    }
    
    public PathNavigateSwimmer(final EntityLiving lllllllllllllIlIllIIIlllIllIlllI, final World lllllllllllllIlIllIIIlllIlllIIII) {
        super(lllllllllllllIlIllIIIlllIllIlllI, lllllllllllllIlIllIIIlllIlllIIII);
    }
}
