// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.pathfinder;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.IntHashMap;
import net.minecraft.world.IBlockAccess;

public abstract class NodeProcessor
{
    protected /* synthetic */ IBlockAccess blockaccess;
    protected /* synthetic */ int entitySizeZ;
    protected /* synthetic */ IntHashMap<PathPoint> pointMap;
    protected /* synthetic */ int entitySizeX;
    protected /* synthetic */ int entitySizeY;
    
    public void initProcessor(final IBlockAccess llllllllllllIlIlIlllllIllIlIIlII, final Entity llllllllllllIlIlIlllllIllIlIIllI) {
        this.blockaccess = llllllllllllIlIlIlllllIllIlIIlII;
        this.pointMap.clearMap();
        this.entitySizeX = MathHelper.floor_float(llllllllllllIlIlIlllllIllIlIIllI.width + 1.0f);
        this.entitySizeY = MathHelper.floor_float(llllllllllllIlIlIlllllIllIlIIllI.height + 1.0f);
        this.entitySizeZ = MathHelper.floor_float(llllllllllllIlIlIlllllIllIlIIllI.width + 1.0f);
    }
    
    private static boolean lIlIIllIIIlIIlII(final Object llllllllllllIlIlIlllllIllIIIllIl) {
        return llllllllllllIlIlIlllllIllIIIllIl == null;
    }
    
    public NodeProcessor() {
        this.pointMap = new IntHashMap<PathPoint>();
    }
    
    protected PathPoint openPoint(final int llllllllllllIlIlIlllllIllIIlIlII, final int llllllllllllIlIlIlllllIllIIlIIll, final int llllllllllllIlIlIlllllIllIIlIIlI) {
        final int llllllllllllIlIlIlllllIllIIlIlll = PathPoint.makeHash(llllllllllllIlIlIlllllIllIIlIlII, llllllllllllIlIlIlllllIllIIlIIll, llllllllllllIlIlIlllllIllIIlIIlI);
        PathPoint llllllllllllIlIlIlllllIllIIlIllI = this.pointMap.lookup(llllllllllllIlIlIlllllIllIIlIlll);
        if (lIlIIllIIIlIIlII(llllllllllllIlIlIlllllIllIIlIllI)) {
            llllllllllllIlIlIlllllIllIIlIllI = new PathPoint(llllllllllllIlIlIlllllIllIIlIlII, llllllllllllIlIlIlllllIllIIlIIll, llllllllllllIlIlIlllllIllIIlIIlI);
            this.pointMap.addKey(llllllllllllIlIlIlllllIllIIlIlll, llllllllllllIlIlIlllllIllIIlIllI);
        }
        return llllllllllllIlIlIlllllIllIIlIllI;
    }
    
    public abstract PathPoint getPathPointTo(final Entity p0);
    
    public abstract int findPathOptions(final PathPoint[] p0, final Entity p1, final PathPoint p2, final PathPoint p3, final float p4);
    
    public abstract PathPoint getPathPointToCoords(final Entity p0, final double p1, final double p2, final double p3);
    
    public void postProcess() {
    }
}
