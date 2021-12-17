// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.heuristics;

import org.newdawn.slick.util.pathfinding.Mover;
import org.newdawn.slick.util.pathfinding.TileBasedMap;
import org.newdawn.slick.util.pathfinding.AStarHeuristic;

public class ClosestHeuristic implements AStarHeuristic
{
    public float getCost(final TileBasedMap lllllllllllllIlIIIllIIIllIlIIlII, final Mover lllllllllllllIlIIIllIIIllIlIIIll, final int lllllllllllllIlIIIllIIIllIIllIll, final int lllllllllllllIlIIIllIIIllIIllIlI, final int lllllllllllllIlIIIllIIIllIlIIIII, final int lllllllllllllIlIIIllIIIllIIlllll) {
        final float lllllllllllllIlIIIllIIIllIIllllI = (float)(lllllllllllllIlIIIllIIIllIlIIIII - lllllllllllllIlIIIllIIIllIIllIll);
        final float lllllllllllllIlIIIllIIIllIIlllIl = (float)(lllllllllllllIlIIIllIIIllIIlllll - lllllllllllllIlIIIllIIIllIIllIlI);
        final float lllllllllllllIlIIIllIIIllIIlllII = (float)Math.sqrt(lllllllllllllIlIIIllIIIllIIllllI * lllllllllllllIlIIIllIIIllIIllllI + lllllllllllllIlIIIllIIIllIIlllIl * lllllllllllllIlIIIllIIIllIIlllIl);
        return lllllllllllllIlIIIllIIIllIIlllII;
    }
}
