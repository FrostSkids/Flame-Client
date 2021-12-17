// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.heuristics;

import org.newdawn.slick.util.pathfinding.Mover;
import org.newdawn.slick.util.pathfinding.TileBasedMap;
import org.newdawn.slick.util.pathfinding.AStarHeuristic;

public class ClosestSquaredHeuristic implements AStarHeuristic
{
    public float getCost(final TileBasedMap llllllllllllIllIIIllllIIIIlIIlIl, final Mover llllllllllllIllIIIllllIIIIlIIlII, final int llllllllllllIllIIIllllIIIIlIIIll, final int llllllllllllIllIIIllllIIIIIlllII, final int llllllllllllIllIIIllllIIIIlIIIIl, final int llllllllllllIllIIIllllIIIIIllIlI) {
        final float llllllllllllIllIIIllllIIIIIlllll = (float)(llllllllllllIllIIIllllIIIIlIIIIl - llllllllllllIllIIIllllIIIIlIIIll);
        final float llllllllllllIllIIIllllIIIIIllllI = (float)(llllllllllllIllIIIllllIIIIIllIlI - llllllllllllIllIIIllllIIIIIlllII);
        return llllllllllllIllIIIllllIIIIIlllll * llllllllllllIllIIIllllIIIIIlllll + llllllllllllIllIIIllllIIIIIllllI * llllllllllllIllIIIllllIIIIIllllI;
    }
}
