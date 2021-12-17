// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.heuristics;

import org.newdawn.slick.util.pathfinding.Mover;
import org.newdawn.slick.util.pathfinding.TileBasedMap;
import org.newdawn.slick.util.pathfinding.AStarHeuristic;

public class ManhattanHeuristic implements AStarHeuristic
{
    private /* synthetic */ int minimumCost;
    
    public ManhattanHeuristic(final int lllllllllllllIIlllIIIlIlIIIIIIll) {
        this.minimumCost = lllllllllllllIIlllIIIlIlIIIIIIll;
    }
    
    public float getCost(final TileBasedMap lllllllllllllIIlllIIIlIIlllllIlI, final Mover lllllllllllllIIlllIIIlIIlllllIIl, final int lllllllllllllIIlllIIIlIIllllIIll, final int lllllllllllllIIlllIIIlIIllllIlll, final int lllllllllllllIIlllIIIlIIllllIllI, final int lllllllllllllIIlllIIIlIIllllIlIl) {
        return (float)(this.minimumCost * (Math.abs(lllllllllllllIIlllIIIlIIllllIIll - lllllllllllllIIlllIIIlIIllllIllI) + Math.abs(lllllllllllllIIlllIIIlIIllllIlll - lllllllllllllIIlllIIIlIIllllIlIl)));
    }
}
