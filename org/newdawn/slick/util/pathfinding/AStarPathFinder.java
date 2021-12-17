// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.util.pathfinding.heuristics.ClosestHeuristic;
import java.util.ArrayList;

public class AStarPathFinder implements PathFindingContext, PathFinder
{
    private static final /* synthetic */ int[] lIlIIllllIIIlI;
    private /* synthetic */ Node current;
    private /* synthetic */ TileBasedMap map;
    private /* synthetic */ AStarHeuristic heuristic;
    private /* synthetic */ int distance;
    private /* synthetic */ Node[][] nodes;
    private /* synthetic */ int maxSearchDistance;
    private /* synthetic */ int sourceY;
    private /* synthetic */ PriorityList open;
    private /* synthetic */ boolean allowDiagMovement;
    private /* synthetic */ int sourceX;
    private /* synthetic */ ArrayList closed;
    private /* synthetic */ Mover mover;
    
    private static void lllIlIIllIlIIII() {
        (lIlIIllllIIIlI = new int[4])[0] = ((0x77 ^ 0x2A ^ (0x65 ^ 0x61)) & (0x1A ^ 0x30 ^ (0x16 ^ 0x65) ^ -" ".length()));
        AStarPathFinder.lIlIIllllIIIlI[1] = -" ".length();
        AStarPathFinder.lIlIIllllIIIlI[2] = "  ".length();
        AStarPathFinder.lIlIIllllIIIlI[3] = " ".length();
    }
    
    protected boolean inOpenList(final Node lllllllllllllIIIlIllllIIIIlllIlI) {
        return lllllllllllllIIIlIllllIIIIlllIlI.isOpen();
    }
    
    protected void addToClosed(final Node lllllllllllllIIIlIllllIIIIllIIII) {
        lllllllllllllIIIlIllllIIIIllIIII.setClosed((boolean)(AStarPathFinder.lIlIIllllIIIlI[3] != 0));
        this.closed.add(lllllllllllllIIIlIllllIIIIllIIII);
        "".length();
    }
    
    public int getSearchDistance() {
        return this.distance;
    }
    
    static {
        lllIlIIllIlIIII();
    }
    
    private static boolean lllIlIIllIlllIl(final int lllllllllllllIIIlIlllIlllIllllII, final int lllllllllllllIIIlIlllIlllIlllIll) {
        return lllllllllllllIIIlIlllIlllIllllII != lllllllllllllIIIlIlllIlllIlllIll;
    }
    
    protected void addToOpen(final Node lllllllllllllIIIlIllllIIIIlllllI) {
        lllllllllllllIIIlIllllIIIIlllllI.setOpen((boolean)(AStarPathFinder.lIlIIllllIIIlI[3] != 0));
        this.open.add(lllllllllllllIIIlIllllIIIIlllllI);
    }
    
    protected void removeFromOpen(final Node lllllllllllllIIIlIllllIIIIllIlII) {
        lllllllllllllIIIlIllllIIIIllIlII.setOpen((boolean)(AStarPathFinder.lIlIIllllIIIlI[0] != 0));
        this.open.remove(lllllllllllllIIIlIllllIIIIllIlII);
    }
    
    public Path findPath(final Mover lllllllllllllIIIlIllllIIIlIllIlI, final int lllllllllllllIIIlIllllIIIlIllIIl, final int lllllllllllllIIIlIllllIIIlIllIII, final int lllllllllllllIIIlIllllIIIlIlIlll, final int lllllllllllllIIIlIllllIIIlIlllll) {
        this.current = null;
        this.mover = lllllllllllllIIIlIllllIIIlIllIlI;
        this.sourceX = lllllllllllllIIIlIllllIIIlIlIlll;
        this.sourceY = lllllllllllllIIIlIllllIIIlIlllll;
        this.distance = AStarPathFinder.lIlIIllllIIIlI[0];
        if (lllIlIIllIlIIll(this.map.blocked(this, lllllllllllllIIIlIllllIIIlIlIlll, lllllllllllllIIIlIllllIIIlIlllll) ? 1 : 0)) {
            return null;
        }
        int lllllllllllllIIIlIllllIIIllIllIl = AStarPathFinder.lIlIIllllIIIlI[0];
        while (lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIIllIllIl, this.map.getWidthInTiles())) {
            int lllllllllllllIIIlIllllIIIllIlllI = AStarPathFinder.lIlIIllllIIIlI[0];
            while (lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIIllIlllI, this.map.getHeightInTiles())) {
                this.nodes[lllllllllllllIIIlIllllIIIllIllIl][lllllllllllllIIIlIllllIIIllIlllI].reset();
                ++lllllllllllllIIIlIllllIIIllIlllI;
                "".length();
                if (-(113 + 39 - 112 + 100 ^ 89 + 52 - 27 + 22) > 0) {
                    return null;
                }
            }
            ++lllllllllllllIIIlIllllIIIllIllIl;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        this.nodes[lllllllllllllIIIlIllllIIIlIllIIl][lllllllllllllIIIlIllllIIIlIllIII].cost = 0.0f;
        "".length();
        this.nodes[lllllllllllllIIIlIllllIIIlIllIIl][lllllllllllllIIIlIllllIIIlIllIII].depth = AStarPathFinder.lIlIIllllIIIlI[0];
        "".length();
        this.closed.clear();
        this.open.clear();
        this.addToOpen(this.nodes[lllllllllllllIIIlIllllIIIlIllIIl][lllllllllllllIIIlIllllIIIlIllIII]);
        this.nodes[lllllllllllllIIIlIllllIIIlIlIlll][lllllllllllllIIIlIllllIIIlIlllll].parent = null;
        "".length();
        int lllllllllllllIIIlIllllIIIlIllllI = AStarPathFinder.lIlIIllllIIIlI[0];
        while (lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIIlIllllI, this.maxSearchDistance) && lllIlIIllIlIIll(this.open.size())) {
            int lllllllllllllIIIlIllllIIIllIIllI = lllllllllllllIIIlIllllIIIlIllIIl;
            int lllllllllllllIIIlIllllIIIllIIlIl = lllllllllllllIIIlIllllIIIlIllIII;
            if (lllIlIIllIlIlII(this.current)) {
                lllllllllllllIIIlIllllIIIllIIllI = this.current.x;
                lllllllllllllIIIlIllllIIIllIIlIl = this.current.y;
            }
            this.current = this.getFirstInOpen();
            this.distance = this.current.depth;
            if (lllIlIIllIlIlIl(this.current, this.nodes[lllllllllllllIIIlIllllIIIlIlIlll][lllllllllllllIIIlIllllIIIlIlllll]) && lllIlIIllIlIIll(this.isValidLocation(lllllllllllllIIIlIllllIIIlIllIlI, lllllllllllllIIIlIllllIIIllIIllI, lllllllllllllIIIlIllllIIIllIIlIl, lllllllllllllIIIlIllllIIIlIlIlll, lllllllllllllIIIlIllllIIIlIlllll) ? 1 : 0)) {
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
                break;
            }
            else {
                this.removeFromOpen(this.current);
                this.addToClosed(this.current);
                int lllllllllllllIIIlIllllIIIllIIlll = AStarPathFinder.lIlIIllllIIIlI[1];
                while (lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIIllIIlll, AStarPathFinder.lIlIIllllIIIlI[2])) {
                    int lllllllllllllIIIlIllllIIIllIlIII = AStarPathFinder.lIlIIllllIIIlI[1];
                    while (lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIIllIlIII, AStarPathFinder.lIlIIllllIIIlI[2])) {
                        if (lllIlIIllIlIllI(lllllllllllllIIIlIllllIIIllIIlll) && lllIlIIllIlIllI(lllllllllllllIIIlIllllIIIllIlIII)) {
                            "".length();
                            if (-" ".length() >= "   ".length()) {
                                return null;
                            }
                        }
                        else if (lllIlIIllIlIllI(this.allowDiagMovement ? 1 : 0) && lllIlIIllIlIIll(lllllllllllllIIIlIllllIIIllIIlll) && lllIlIIllIlIIll(lllllllllllllIIIlIllllIIIllIlIII)) {
                            "".length();
                            if (" ".length() < 0) {
                                return null;
                            }
                        }
                        else {
                            final int lllllllllllllIIIlIllllIIIllIlIlI = lllllllllllllIIIlIllllIIIllIIlll + this.current.x;
                            final int lllllllllllllIIIlIllllIIIllIlIIl = lllllllllllllIIIlIllllIIIllIlIII + this.current.y;
                            if (lllIlIIllIlIIll(this.isValidLocation(lllllllllllllIIIlIllllIIIlIllIlI, this.current.x, this.current.y, lllllllllllllIIIlIllllIIIllIlIlI, lllllllllllllIIIlIllllIIIllIlIIl) ? 1 : 0)) {
                                final float lllllllllllllIIIlIllllIIIllIllII = this.current.cost + this.getMovementCost(lllllllllllllIIIlIllllIIIlIllIlI, this.current.x, this.current.y, lllllllllllllIIIlIllllIIIllIlIlI, lllllllllllllIIIlIllllIIIllIlIIl);
                                final Node lllllllllllllIIIlIllllIIIllIlIll = this.nodes[lllllllllllllIIIlIllllIIIllIlIlI][lllllllllllllIIIlIllllIIIllIlIIl];
                                this.map.pathFinderVisited(lllllllllllllIIIlIllllIIIllIlIlI, lllllllllllllIIIlIllllIIIllIlIIl);
                                if (lllIlIIllIlIlll(lllIlIIllIlIIlI(lllllllllllllIIIlIllllIIIllIllII, lllllllllllllIIIlIllllIIIllIlIll.cost))) {
                                    if (lllIlIIllIlIIll(this.inOpenList(lllllllllllllIIIlIllllIIIllIlIll) ? 1 : 0)) {
                                        this.removeFromOpen(lllllllllllllIIIlIllllIIIllIlIll);
                                    }
                                    if (lllIlIIllIlIIll(this.inClosedList(lllllllllllllIIIlIllllIIIllIlIll) ? 1 : 0)) {
                                        this.removeFromClosed(lllllllllllllIIIlIllllIIIllIlIll);
                                    }
                                }
                                if (lllIlIIllIlIllI(this.inOpenList(lllllllllllllIIIlIllllIIIllIlIll) ? 1 : 0) && lllIlIIllIlIllI(this.inClosedList(lllllllllllllIIIlIllllIIIllIlIll) ? 1 : 0)) {
                                    lllllllllllllIIIlIllllIIIllIlIll.cost = lllllllllllllIIIlIllllIIIllIllII;
                                    "".length();
                                    lllllllllllllIIIlIllllIIIllIlIll.heuristic = this.getHeuristicCost(lllllllllllllIIIlIllllIIIlIllIlI, lllllllllllllIIIlIllllIIIllIlIlI, lllllllllllllIIIlIllllIIIllIlIIl, lllllllllllllIIIlIllllIIIlIlIlll, lllllllllllllIIIlIllllIIIlIlllll);
                                    "".length();
                                    lllllllllllllIIIlIllllIIIlIllllI = Math.max(lllllllllllllIIIlIllllIIIlIllllI, lllllllllllllIIIlIllllIIIllIlIll.setParent(this.current));
                                    this.addToOpen(lllllllllllllIIIlIllllIIIllIlIll);
                                }
                            }
                        }
                        ++lllllllllllllIIIlIllllIIIllIlIII;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    ++lllllllllllllIIIlIllllIIIllIIlll;
                    "".length();
                    if (((0x61 ^ 0x5A) & ~(0x71 ^ 0x4A)) != 0x0) {
                        return null;
                    }
                }
                "".length();
                if ((0xB3 ^ 0xB7) <= "   ".length()) {
                    return null;
                }
                continue;
            }
        }
        if (lllIlIIllIllIII(this.nodes[lllllllllllllIIIlIllllIIIlIlIlll][lllllllllllllIIIlIllllIIIlIlllll].parent)) {
            return null;
        }
        final Path lllllllllllllIIIlIllllIIIlIlllIl = new Path();
        Node lllllllllllllIIIlIllllIIIlIlllII = this.nodes[lllllllllllllIIIlIllllIIIlIlIlll][lllllllllllllIIIlIllllIIIlIlllll];
        while (lllIlIIllIllIIl(lllllllllllllIIIlIllllIIIlIlllII, this.nodes[lllllllllllllIIIlIllllIIIlIllIIl][lllllllllllllIIIlIllllIIIlIllIII])) {
            lllllllllllllIIIlIllllIIIlIlllIl.prependStep(lllllllllllllIIIlIllllIIIlIlllII.x, lllllllllllllIIIlIllllIIIlIlllII.y);
            lllllllllllllIIIlIllllIIIlIlllII = lllllllllllllIIIlIllllIIIlIlllII.parent;
            "".length();
            if (null != null) {
                return null;
            }
        }
        lllllllllllllIIIlIllllIIIlIlllIl.prependStep(lllllllllllllIIIlIllllIIIlIllIIl, lllllllllllllIIIlIllllIIIlIllIII);
        return lllllllllllllIIIlIllllIIIlIlllIl;
    }
    
    private static boolean lllIlIIllIlIllI(final int lllllllllllllIIIlIlllIllllIIIIll) {
        return lllllllllllllIIIlIlllIllllIIIIll == 0;
    }
    
    private static boolean lllIlIIllIlllII(final int lllllllllllllIIIlIlllIllllIlllII, final int lllllllllllllIIIlIlllIllllIllIll) {
        return lllllllllllllIIIlIlllIllllIlllII == lllllllllllllIIIlIlllIllllIllIll;
    }
    
    public Mover getMover() {
        return this.mover;
    }
    
    public float getMovementCost(final Mover lllllllllllllIIIlIllllIIIIIIIIIl, final int lllllllllllllIIIlIllllIIIIIIIIII, final int lllllllllllllIIIlIllllIIIIIIIlIl, final int lllllllllllllIIIlIllllIIIIIIIlII, final int lllllllllllllIIIlIllllIIIIIIIIll) {
        this.mover = lllllllllllllIIIlIllllIIIIIIIIIl;
        this.sourceX = lllllllllllllIIIlIllllIIIIIIIIII;
        this.sourceY = lllllllllllllIIIlIllllIIIIIIIlIl;
        return this.map.getCost(this, lllllllllllllIIIlIllllIIIIIIIlII, lllllllllllllIIIlIllllIIIIIIIIll);
    }
    
    protected void removeFromClosed(final Node lllllllllllllIIIlIllllIIIIlIIllI) {
        lllllllllllllIIIlIllllIIIIlIIllI.setClosed((boolean)(AStarPathFinder.lIlIIllllIIIlI[0] != 0));
        this.closed.remove(lllllllllllllIIIlIllllIIIIlIIllI);
        "".length();
    }
    
    public float getHeuristicCost(final Mover lllllllllllllIIIlIlllIllllllIlIl, final int lllllllllllllIIIlIlllIllllllIlII, final int lllllllllllllIIIlIlllIlllllIllIl, final int lllllllllllllIIIlIlllIllllllIIlI, final int lllllllllllllIIIlIlllIllllllIIIl) {
        return this.heuristic.getCost(this.map, lllllllllllllIIIlIlllIllllllIlIl, lllllllllllllIIIlIlllIllllllIlII, lllllllllllllIIIlIlllIlllllIllIl, lllllllllllllIIIlIlllIllllllIIlI, lllllllllllllIIIlIlllIllllllIIIl);
    }
    
    private static boolean lllIlIIllIllIll(final int lllllllllllllIIIlIlllIllllIllIII, final int lllllllllllllIIIlIlllIllllIlIlll) {
        return lllllllllllllIIIlIlllIllllIllIII >= lllllllllllllIIIlIlllIllllIlIlll;
    }
    
    private static boolean lllIlIIllIlIlIl(final Object lllllllllllllIIIlIlllIllllIIlIlI, final Object lllllllllllllIIIlIlllIllllIIlIIl) {
        return lllllllllllllIIIlIlllIllllIIlIlI == lllllllllllllIIIlIlllIllllIIlIIl;
    }
    
    public int getCurrentY() {
        if (lllIlIIllIllIII(this.current)) {
            return AStarPathFinder.lIlIIllllIIIlI[1];
        }
        return this.current.y;
    }
    
    private static boolean lllIlIIllIllIIl(final Object lllllllllllllIIIlIlllIllllIlIIII, final Object lllllllllllllIIIlIlllIllllIIllll) {
        return lllllllllllllIIIlIlllIllllIlIIII != lllllllllllllIIIlIlllIllllIIllll;
    }
    
    public AStarPathFinder(final TileBasedMap lllllllllllllIIIlIllllIIlIIllIIl, final int lllllllllllllIIIlIllllIIlIIllIII, final boolean lllllllllllllIIIlIllllIIlIIlIIll) {
        this(lllllllllllllIIIlIllllIIlIIllIIl, lllllllllllllIIIlIllllIIlIIllIII, lllllllllllllIIIlIllllIIlIIlIIll, new ClosestHeuristic());
    }
    
    private static boolean lllIlIIllIlIIll(final int lllllllllllllIIIlIlllIllllIIIlIl) {
        return lllllllllllllIIIlIlllIllllIIIlIl != 0;
    }
    
    private static boolean lllIlIIllIlIlII(final Object lllllllllllllIIIlIlllIllllIIllIl) {
        return lllllllllllllIIIlIlllIllllIIllIl != null;
    }
    
    protected boolean isValidLocation(final Mover lllllllllllllIIIlIllllIIIIIllIll, final int lllllllllllllIIIlIllllIIIIIlIIll, final int lllllllllllllIIIlIllllIIIIIlIIlI, final int lllllllllllllIIIlIllllIIIIIllIII, final int lllllllllllllIIIlIllllIIIIIlIlll) {
        int n;
        if (!lllIlIIllIllIlI(lllllllllllllIIIlIllllIIIIIllIII) || !lllIlIIllIllIlI(lllllllllllllIIIlIllllIIIIIlIlll) || !lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIIIIllIII, this.map.getWidthInTiles()) || lllIlIIllIllIll(lllllllllllllIIIlIllllIIIIIlIlll, this.map.getHeightInTiles())) {
            n = AStarPathFinder.lIlIIllllIIIlI[3];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x16 ^ 0x34) & ~(0x91 ^ 0xB3)) != 0x0;
            }
        }
        else {
            n = AStarPathFinder.lIlIIllllIIIlI[0];
        }
        boolean lllllllllllllIIIlIllllIIIIIlIllI = n != 0;
        if (lllIlIIllIlIllI(lllllllllllllIIIlIllllIIIIIlIllI ? 1 : 0) && (!lllIlIIllIlllII(lllllllllllllIIIlIllllIIIIIlIIll, lllllllllllllIIIlIllllIIIIIllIII) || lllIlIIllIlllIl(lllllllllllllIIIlIllllIIIIIlIIlI, lllllllllllllIIIlIllllIIIIIlIlll))) {
            this.mover = lllllllllllllIIIlIllllIIIIIllIll;
            this.sourceX = lllllllllllllIIIlIllllIIIIIlIIll;
            this.sourceY = lllllllllllllIIIlIllllIIIIIlIIlI;
            lllllllllllllIIIlIllllIIIIIlIllI = this.map.blocked(this, lllllllllllllIIIlIllllIIIIIllIII, lllllllllllllIIIlIllllIIIIIlIlll);
        }
        int n2;
        if (lllIlIIllIlIllI(lllllllllllllIIIlIllllIIIIIlIllI ? 1 : 0)) {
            n2 = AStarPathFinder.lIlIIllllIIIlI[3];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x4B ^ 0x79) & ~(0x1C ^ 0x2E)) != 0x0;
            }
        }
        else {
            n2 = AStarPathFinder.lIlIIllllIIIlI[0];
        }
        return n2 != 0;
    }
    
    protected boolean inClosedList(final Node lllllllllllllIIIlIllllIIIIlIlIll) {
        return lllllllllllllIIIlIllllIIIIlIlIll.isClosed();
    }
    
    private static int lllIlIIllIlIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public int getSourceX() {
        return this.sourceX;
    }
    
    private static boolean lllIlIIllIlIIIl(final int lllllllllllllIIIlIlllIllllIlIlII, final int lllllllllllllIIIlIlllIllllIlIIll) {
        return lllllllllllllIIIlIlllIllllIlIlII < lllllllllllllIIIlIlllIllllIlIIll;
    }
    
    private static boolean lllIlIIllIllIlI(final int lllllllllllllIIIlIlllIllllIIIIIl) {
        return lllllllllllllIIIlIlllIllllIIIIIl >= 0;
    }
    
    public int getSourceY() {
        return this.sourceY;
    }
    
    protected Node getFirstInOpen() {
        return (Node)this.open.first();
    }
    
    public int getCurrentX() {
        if (lllIlIIllIllIII(this.current)) {
            return AStarPathFinder.lIlIIllllIIIlI[1];
        }
        return this.current.x;
    }
    
    private static boolean lllIlIIllIllIII(final Object lllllllllllllIIIlIlllIllllIIIlll) {
        return lllllllllllllIIIlIlllIllllIIIlll == null;
    }
    
    private static boolean lllIlIIllIlIlll(final int lllllllllllllIIIlIlllIlllIllllll) {
        return lllllllllllllIIIlIlllIlllIllllll < 0;
    }
    
    public AStarPathFinder(final TileBasedMap lllllllllllllIIIlIllllIIlIIIIIll, final int lllllllllllllIIIlIllllIIlIIIIlll, final boolean lllllllllllllIIIlIllllIIlIIIIllI, final AStarHeuristic lllllllllllllIIIlIllllIIlIIIIIII) {
        this.closed = new ArrayList();
        this.open = new PriorityList();
        this.heuristic = lllllllllllllIIIlIllllIIlIIIIIII;
        this.map = lllllllllllllIIIlIllllIIlIIIIIll;
        this.maxSearchDistance = lllllllllllllIIIlIllllIIlIIIIlll;
        this.allowDiagMovement = lllllllllllllIIIlIllllIIlIIIIllI;
        this.nodes = new Node[lllllllllllllIIIlIllllIIlIIIIIll.getWidthInTiles()][lllllllllllllIIIlIllllIIlIIIIIll.getHeightInTiles()];
        int lllllllllllllIIIlIllllIIlIIIlIlI = AStarPathFinder.lIlIIllllIIIlI[0];
        while (lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIlIIIlIlI, lllllllllllllIIIlIllllIIlIIIIIll.getWidthInTiles())) {
            int lllllllllllllIIIlIllllIIlIIIlIll = AStarPathFinder.lIlIIllllIIIlI[0];
            while (lllIlIIllIlIIIl(lllllllllllllIIIlIllllIIlIIIlIll, lllllllllllllIIIlIllllIIlIIIIIll.getHeightInTiles())) {
                this.nodes[lllllllllllllIIIlIllllIIlIIIlIlI][lllllllllllllIIIlIllllIIlIIIlIll] = new Node(lllllllllllllIIIlIllllIIlIIIlIlI, lllllllllllllIIIlIllllIIlIIIlIll);
                ++lllllllllllllIIIlIllllIIlIIIlIll;
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            ++lllllllllllllIIIlIllllIIlIIIlIlI;
            "".length();
            if (" ".length() > "   ".length()) {
                throw null;
            }
        }
    }
    
    private class Node implements Comparable
    {
        private /* synthetic */ float heuristic;
        private /* synthetic */ int depth;
        private /* synthetic */ boolean closed;
        private static final /* synthetic */ String[] lllIIIlIIIlIIl;
        private /* synthetic */ int x;
        private /* synthetic */ float cost;
        private /* synthetic */ int y;
        private static final /* synthetic */ int[] lllIIIllIIlllI;
        private /* synthetic */ boolean open;
        private /* synthetic */ Node parent;
        
        private static String lIIlllIlIIlIIlll(final String llllllllllllIllIIIIIIIIIIlIIIlII, final String llllllllllllIllIIIIIIIIIIlIIIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIIIIIIIIIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIIIIIIIlIIIllI = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIIIIIIIlIIIllI.init(Node.lllIIIllIIlllI[3], llllllllllllIllIIIIIIIIIIlIIIlll);
                return new String(llllllllllllIllIIIIIIIIIIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIIIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIIIIIIIlIIIlIl) {
                llllllllllllIllIIIIIIIIIIlIIIlIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlllIlIIlIIllI(String llllllllllllIllIIIIIIIIIIIlIIIII, final String llllllllllllIllIIIIIIIIIIIlIIlIl) {
            llllllllllllIllIIIIIIIIIIIlIIIII = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIIIIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIIIIIIIIIlIIIll = new StringBuilder();
            final char[] llllllllllllIllIIIIIIIIIIIlIIIlI = llllllllllllIllIIIIIIIIIIIlIIlIl.toCharArray();
            int llllllllllllIllIIIIIIIIIIIlIIIIl = Node.lllIIIllIIlllI[2];
            final Exception llllllllllllIllIIIIIIIIIIIIlIlll = (Object)llllllllllllIllIIIIIIIIIIIlIIIII.toCharArray();
            final long llllllllllllIllIIIIIIIIIIIIlIlIl = llllllllllllIllIIIIIIIIIIIIlIlll.length;
            short llllllllllllIllIIIIIIIIIIIIlIIll = (short)Node.lllIIIllIIlllI[2];
            while (lIIlllIlllllllIl(llllllllllllIllIIIIIIIIIIIIlIIll, (int)llllllllllllIllIIIIIIIIIIIIlIlIl)) {
                final char llllllllllllIllIIIIIIIIIIIlIIlll = llllllllllllIllIIIIIIIIIIIIlIlll[llllllllllllIllIIIIIIIIIIIIlIIll];
                llllllllllllIllIIIIIIIIIIIlIIIll.append((char)(llllllllllllIllIIIIIIIIIIIlIIlll ^ llllllllllllIllIIIIIIIIIIIlIIIlI[llllllllllllIllIIIIIIIIIIIlIIIIl % llllllllllllIllIIIIIIIIIIIlIIIlI.length]));
                "".length();
                ++llllllllllllIllIIIIIIIIIIIlIIIIl;
                ++llllllllllllIllIIIIIIIIIIIIlIIll;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIIIIIIIIIlIIIll);
        }
        
        public int setParent(final Node llllllllllllIllIIIIIIIIIllIIlIII) {
            this.depth = llllllllllllIllIIIIIIIIIllIIlIII.depth + Node.lllIIIllIIlllI[0];
            this.parent = llllllllllllIllIIIIIIIIIllIIlIII;
            return this.depth;
        }
        
        private static void lIIlllIlIIlIlIII() {
            (lllIIIlIIIlIIl = new String[Node.lllIIIllIIlllI[4]])[Node.lllIIIllIIlllI[2]] = lIIlllIlIIlIIllI("FDcnNg9v", "OyHRj");
            Node.lllIIIlIIIlIIl[Node.lllIIIllIIlllI[0]] = lIIlllIlIIlIIlll("YWrcpxhT8ec=", "ZWJML");
            Node.lllIIIlIIIlIIl[Node.lllIIIllIIlllI[3]] = lIIlllIlIIlIIllI("Ng==", "kaujQ");
        }
        
        public boolean isOpen() {
            return this.open;
        }
        
        private static boolean lIIlllIllllllIII(final int llllllllllllIllIIIIIIIIIIIIIIlIl) {
            return llllllllllllIllIIIIIIIIIIIIIIlIl < 0;
        }
        
        public void setOpen(final boolean llllllllllllIllIIIIIIIIIlIllIIll) {
            this.open = llllllllllllIllIIIIIIIIIlIllIIll;
        }
        
        public int compareTo(final Object llllllllllllIllIIIIIIIIIllIIIIIl) {
            final Node llllllllllllIllIIIIIIIIIllIIIIII = (Node)llllllllllllIllIIIIIIIIIllIIIIIl;
            final float llllllllllllIllIIIIIIIIIlIllllll = this.heuristic + this.cost;
            final float llllllllllllIllIIIIIIIIIlIlllllI = llllllllllllIllIIIIIIIIIllIIIIII.heuristic + llllllllllllIllIIIIIIIIIllIIIIII.cost;
            if (lIIlllIllllllIII(lIIlllIlllllIlIl(llllllllllllIllIIIIIIIIIlIllllll, llllllllllllIllIIIIIIIIIlIlllllI))) {
                return Node.lllIIIllIIlllI[1];
            }
            if (lIIlllIllllllIlI(lIIlllIlllllIllI(llllllllllllIllIIIIIIIIIlIllllll, llllllllllllIllIIIIIIIIIlIlllllI))) {
                return Node.lllIIIllIIlllI[0];
            }
            return Node.lllIIIllIIlllI[2];
        }
        
        public Node(final int llllllllllllIllIIIIIIIIIllIIllll, final int llllllllllllIllIIIIIIIIIllIIlllI) {
            this.x = llllllllllllIllIIIIIIIIIllIIllll;
            this.y = llllllllllllIllIIIIIIIIIllIIlllI;
        }
        
        static {
            lIIlllIlllllIIll();
            lIIlllIlIIlIlIII();
        }
        
        private static int lIIlllIlllllIllI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        public void setClosed(final boolean llllllllllllIllIIIIIIIIIlIlIlIlI) {
            this.closed = llllllllllllIllIIIIIIIIIlIlIlIlI;
        }
        
        private static int lIIlllIlllllIlIl(final float n, final float n2) {
            return fcmpg(n, n2);
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder().append(Node.lllIIIlIIIlIIl[Node.lllIIIllIIlllI[2]]).append(this.x).append(Node.lllIIIlIIIlIIl[Node.lllIIIllIIlllI[0]]).append(this.y).append(Node.lllIIIlIIIlIIl[Node.lllIIIllIIlllI[3]]));
        }
        
        private static void lIIlllIlllllIIll() {
            (lllIIIllIIlllI = new int[5])[0] = " ".length();
            Node.lllIIIllIIlllI[1] = -" ".length();
            Node.lllIIIllIIlllI[2] = ((0xEE ^ 0xBC) & ~(0x5 ^ 0x57));
            Node.lllIIIllIIlllI[3] = "  ".length();
            Node.lllIIIllIIlllI[4] = "   ".length();
        }
        
        public void reset() {
            this.closed = (Node.lllIIIllIIlllI[2] != 0);
            this.open = (Node.lllIIIllIIlllI[2] != 0);
            this.cost = 0.0f;
            this.depth = Node.lllIIIllIIlllI[2];
        }
        
        private static boolean lIIlllIllllllIlI(final int llllllllllllIllIIIIIIIIIIIIIIIll) {
            return llllllllllllIllIIIIIIIIIIIIIIIll > 0;
        }
        
        public boolean isClosed() {
            return this.closed;
        }
        
        private static boolean lIIlllIlllllllIl(final int llllllllllllIllIIIIIIIIIIIIIlIII, final int llllllllllllIllIIIIIIIIIIIIIIlll) {
            return llllllllllllIllIIIIIIIIIIIIIlIII < llllllllllllIllIIIIIIIIIIIIIIlll;
        }
    }
    
    private class PriorityList
    {
        private static final /* synthetic */ String[] lllIIIlllIIllI;
        private /* synthetic */ List list;
        private static final /* synthetic */ int[] lllIIIlllIIlll;
        
        static {
            lIIllllIIlIIIIll();
            lIIllllIIlIIIIlI();
        }
        
        @Override
        public String toString() {
            String llllllllllllIlIllllllIllllIIIlII = PriorityList.lllIIIlllIIllI[PriorityList.lllIIIlllIIlll[0]];
            int llllllllllllIlIllllllIllllIIIllI = PriorityList.lllIIIlllIIlll[0];
            while (lIIllllIIlIIIlII(llllllllllllIlIllllllIllllIIIllI, this.size())) {
                llllllllllllIlIllllllIllllIIIlII = String.valueOf(new StringBuilder().append(llllllllllllIlIllllllIllllIIIlII).append(this.list.get(llllllllllllIlIllllllIllllIIIllI).toString()).append(PriorityList.lllIIIlllIIllI[PriorityList.lllIIIlllIIlll[1]]));
                ++llllllllllllIlIllllllIllllIIIllI;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            llllllllllllIlIllllllIllllIIIlII = String.valueOf(new StringBuilder().append(llllllllllllIlIllllllIllllIIIlII).append(PriorityList.lllIIIlllIIllI[PriorityList.lllIIIlllIIlll[2]]));
            return llllllllllllIlIllllllIllllIIIlII;
        }
        
        private static boolean lIIllllIIlIIIlIl(final int llllllllllllIlIllllllIlllIIIllIl) {
            return llllllllllllIlIllllllIlllIIIllIl > 0;
        }
        
        public Object first() {
            return this.list.get(PriorityList.lllIIIlllIIlll[0]);
        }
        
        public void remove(final Object llllllllllllIlIllllllIllllIlIIll) {
            this.list.remove(llllllllllllIlIllllllIllllIlIIll);
            "".length();
        }
        
        private static String lIIllllIIIllllll(String llllllllllllIlIllllllIlllIIlllIl, final String llllllllllllIlIllllllIlllIlIIIIl) {
            llllllllllllIlIllllllIlllIIlllIl = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllllIlllIIlllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllllllIlllIlIIIII = new StringBuilder();
            final char[] llllllllllllIlIllllllIlllIIlllll = llllllllllllIlIllllllIlllIlIIIIl.toCharArray();
            int llllllllllllIlIllllllIlllIIllllI = PriorityList.lllIIIlllIIlll[0];
            final Exception llllllllllllIlIllllllIlllIIllIII = (Object)((String)llllllllllllIlIllllllIlllIIlllIl).toCharArray();
            final Exception llllllllllllIlIllllllIlllIIlIlll = (Exception)llllllllllllIlIllllllIlllIIllIII.length;
            double llllllllllllIlIllllllIlllIIlIllI = PriorityList.lllIIIlllIIlll[0];
            while (lIIllllIIlIIIlII((int)llllllllllllIlIllllllIlllIIlIllI, (int)llllllllllllIlIllllllIlllIIlIlll)) {
                final char llllllllllllIlIllllllIlllIlIIIll = llllllllllllIlIllllllIlllIIllIII[llllllllllllIlIllllllIlllIIlIllI];
                llllllllllllIlIllllllIlllIlIIIII.append((char)(llllllllllllIlIllllllIlllIlIIIll ^ llllllllllllIlIllllllIlllIIlllll[llllllllllllIlIllllllIlllIIllllI % llllllllllllIlIllllllIlllIIlllll.length]));
                "".length();
                ++llllllllllllIlIllllllIlllIIllllI;
                ++llllllllllllIlIllllllIlllIIlIllI;
                "".length();
                if (-(0x91 ^ 0x94) >= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllllllIlllIlIIIII);
        }
        
        private static boolean lIIllllIIlIIIlII(final int llllllllllllIlIllllllIlllIIlIIlI, final int llllllllllllIlIllllllIlllIIlIIIl) {
            return llllllllllllIlIllllllIlllIIlIIlI < llllllllllllIlIllllllIlllIIlIIIl;
        }
        
        public boolean contains(final Object llllllllllllIlIllllllIllllIIlIlI) {
            return this.list.contains(llllllllllllIlIllllllIllllIIlIlI);
        }
        
        public int size() {
            return this.list.size();
        }
        
        public void add(final Object llllllllllllIlIllllllIllllIlllII) {
            int llllllllllllIlIllllllIllllIllllI = PriorityList.lllIIIlllIIlll[0];
            while (lIIllllIIlIIIlII(llllllllllllIlIllllllIllllIllllI, this.list.size())) {
                if (lIIllllIIlIIIlIl(this.list.get(llllllllllllIlIllllllIllllIllllI).compareTo(llllllllllllIlIllllllIllllIlllII))) {
                    this.list.add(llllllllllllIlIllllllIllllIllllI, llllllllllllIlIllllllIllllIlllII);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                else {
                    ++llllllllllllIlIllllllIllllIllllI;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                    continue;
                }
            }
            if (lIIllllIIlIIIllI(this.list.contains(llllllllllllIlIllllllIllllIlllII) ? 1 : 0)) {
                this.list.add(llllllllllllIlIllllllIllllIlllII);
                "".length();
            }
        }
        
        private static void lIIllllIIlIIIIlI() {
            (lllIIIlllIIllI = new String[PriorityList.lllIIIlllIIlll[3]])[PriorityList.lllIIIlllIIlll[0]] = lIIllllIIIllllll("Ag==", "ydmns");
            PriorityList.lllIIIlllIIllI[PriorityList.lllIIIlllIIlll[1]] = lIIllllIIlIIIIIl("BtNb53tLDIA=", "zqqda");
            PriorityList.lllIIIlllIIllI[PriorityList.lllIIIlllIIlll[2]] = lIIllllIIIllllll("BQ==", "xzKXP");
        }
        
        public void clear() {
            this.list.clear();
        }
        
        private static void lIIllllIIlIIIIll() {
            (lllIIIlllIIlll = new int[5])[0] = ((0xBC ^ 0x9D) & ~(0x9D ^ 0xBC));
            PriorityList.lllIIIlllIIlll[1] = " ".length();
            PriorityList.lllIIIlllIIlll[2] = "  ".length();
            PriorityList.lllIIIlllIIlll[3] = "   ".length();
            PriorityList.lllIIIlllIIlll[4] = (123 + 137 - 183 + 94 ^ 47 + 39 - 54 + 131);
        }
        
        private static boolean lIIllllIIlIIIllI(final int llllllllllllIlIllllllIlllIIIllll) {
            return llllllllllllIlIllllllIlllIIIllll == 0;
        }
        
        private static String lIIllllIIlIIIIIl(final String llllllllllllIlIllllllIlllIllIIII, final String llllllllllllIlIllllllIlllIlIllll) {
            try {
                final SecretKeySpec llllllllllllIlIllllllIlllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIlllIlIllll.getBytes(StandardCharsets.UTF_8)), PriorityList.lllIIIlllIIlll[4]), "DES");
                final Cipher llllllllllllIlIllllllIlllIllIlII = Cipher.getInstance("DES");
                llllllllllllIlIllllllIlllIllIlII.init(PriorityList.lllIIIlllIIlll[2], llllllllllllIlIllllllIlllIllIlIl);
                return new String(llllllllllllIlIllllllIlllIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIlllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllllllIlllIllIIll) {
                llllllllllllIlIllllllIlllIllIIll.printStackTrace();
                return null;
            }
        }
        
        private PriorityList() {
            this.list = new LinkedList();
        }
    }
}
