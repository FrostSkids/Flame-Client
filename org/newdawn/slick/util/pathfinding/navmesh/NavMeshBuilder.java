// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.navmesh;

import org.newdawn.slick.util.pathfinding.Mover;
import java.util.ArrayList;
import org.newdawn.slick.util.pathfinding.TileBasedMap;
import org.newdawn.slick.util.pathfinding.PathFindingContext;

public class NavMeshBuilder implements PathFindingContext
{
    private /* synthetic */ boolean tileBased;
    private /* synthetic */ int sy;
    private static final /* synthetic */ int[] lIIllllIlIIIIl;
    private /* synthetic */ int sx;
    private /* synthetic */ float smallestSpace;
    
    private static boolean llIlllIlllIlIIl(final int lllllllllllllIIlIIlIlIllIIIllIlI) {
        return lllllllllllllIIlIIlIlIllIIIllIlI > 0;
    }
    
    public int getSourceX() {
        return this.sx;
    }
    
    private static int llIlllIlllIIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public NavMeshBuilder() {
        this.smallestSpace = 0.2f;
    }
    
    public NavMesh build(final TileBasedMap lllllllllllllIIlIIlIlIllIllllIIl, final boolean lllllllllllllIIlIIlIlIllIlllllII) {
        this.tileBased = lllllllllllllIIlIIlIlIllIlllllII;
        final ArrayList lllllllllllllIIlIIlIlIllIllllIll = new ArrayList();
        if (llIlllIlllIIIll(lllllllllllllIIlIIlIlIllIlllllII ? 1 : 0)) {
            int lllllllllllllIIlIIlIlIlllIIIIIII = NavMeshBuilder.lIIllllIlIIIIl[1];
            while (llIlllIlllIIlII(lllllllllllllIIlIIlIlIlllIIIIIII, lllllllllllllIIlIIlIlIllIllllIIl.getWidthInTiles())) {
                int lllllllllllllIIlIIlIlIlllIIIIIIl = NavMeshBuilder.lIIllllIlIIIIl[1];
                while (llIlllIlllIIlII(lllllllllllllIIlIIlIlIlllIIIIIIl, lllllllllllllIIlIIlIlIllIllllIIl.getHeightInTiles())) {
                    if (llIlllIlllIIlIl(lllllllllllllIIlIIlIlIllIllllIIl.blocked(this, lllllllllllllIIlIIlIlIlllIIIIIII, lllllllllllllIIlIIlIlIlllIIIIIIl) ? 1 : 0)) {
                        lllllllllllllIIlIIlIlIllIllllIll.add(new Space((float)lllllllllllllIIlIIlIlIlllIIIIIII, (float)lllllllllllllIIlIIlIlIlllIIIIIIl, 1.0f, 1.0f));
                        "".length();
                    }
                    ++lllllllllllllIIlIIlIlIlllIIIIIIl;
                    "".length();
                    if ((24 + 43 - 66 + 185 ^ 13 + 60 + 72 + 45) == 0x0) {
                        return null;
                    }
                }
                ++lllllllllllllIIlIIlIlIlllIIIIIII;
                "".length();
                if (((0x92 ^ 0x9C) & ~(0x4D ^ 0x43)) != 0x0) {
                    return null;
                }
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            final Space lllllllllllllIIlIIlIlIllIlllllll = new Space(0.0f, 0.0f, (float)lllllllllllllIIlIIlIlIllIllllIIl.getWidthInTiles(), (float)lllllllllllllIIlIIlIlIllIllllIIl.getHeightInTiles());
            this.subsection(lllllllllllllIIlIIlIlIllIllllIIl, lllllllllllllIIlIIlIlIllIlllllll, lllllllllllllIIlIIlIlIllIllllIll);
        }
        while (llIlllIlllIIIll(this.mergeSpaces(lllllllllllllIIlIIlIlIllIllllIll) ? 1 : 0)) {
            "".length();
            if (null != null) {
                return null;
            }
        }
        this.linkSpaces(lllllllllllllIIlIIlIlIllIllllIll);
        return new NavMesh(lllllllllllllIIlIIlIlIllIllllIll);
    }
    
    private static boolean llIlllIlllIIIll(final int lllllllllllllIIlIIlIlIllIIlIIIII) {
        return lllllllllllllIIlIIlIlIllIIlIIIII != 0;
    }
    
    private boolean mergeSpaces(final ArrayList lllllllllllllIIlIIlIlIllIllIlIIl) {
        int lllllllllllllIIlIIlIlIllIllIllII = NavMeshBuilder.lIIllllIlIIIIl[1];
        while (llIlllIlllIIlII(lllllllllllllIIlIIlIlIllIllIllII, lllllllllllllIIlIIlIlIllIllIlIIl.size())) {
            final Space lllllllllllllIIlIIlIlIllIllIllIl = lllllllllllllIIlIIlIlIllIllIlIIl.get(lllllllllllllIIlIIlIlIllIllIllII);
            int lllllllllllllIIlIIlIlIllIllIlllI = lllllllllllllIIlIIlIlIllIllIllII + NavMeshBuilder.lIIllllIlIIIIl[0];
            while (llIlllIlllIIlII(lllllllllllllIIlIIlIlIllIllIlllI, lllllllllllllIIlIIlIlIllIllIlIIl.size())) {
                final Space lllllllllllllIIlIIlIlIllIllIllll = lllllllllllllIIlIIlIlIllIllIlIIl.get(lllllllllllllIIlIIlIlIllIllIlllI);
                if (llIlllIlllIIIll(lllllllllllllIIlIIlIlIllIllIllIl.canMerge(lllllllllllllIIlIIlIlIllIllIllll) ? 1 : 0)) {
                    lllllllllllllIIlIIlIlIllIllIlIIl.remove(lllllllllllllIIlIIlIlIllIllIllIl);
                    "".length();
                    lllllllllllllIIlIIlIlIllIllIlIIl.remove(lllllllllllllIIlIIlIlIllIllIllll);
                    "".length();
                    lllllllllllllIIlIIlIlIllIllIlIIl.add(lllllllllllllIIlIIlIlIllIllIllIl.merge(lllllllllllllIIlIIlIlIllIllIllll));
                    "".length();
                    return NavMeshBuilder.lIIllllIlIIIIl[0] != 0;
                }
                ++lllllllllllllIIlIIlIlIllIllIlllI;
                "".length();
                if (" ".length() < 0) {
                    return ((0x9D ^ 0xAD) & ~(0x41 ^ 0x71)) != 0x0;
                }
            }
            ++lllllllllllllIIlIIlIlIllIllIllII;
            "".length();
            if (" ".length() == 0) {
                return ((0xBC ^ 0x94) & ~(0x59 ^ 0x71)) != 0x0;
            }
        }
        return NavMeshBuilder.lIIllllIlIIIIl[1] != 0;
    }
    
    public NavMesh build(final TileBasedMap lllllllllllllIIlIIlIlIlllIIIlIII) {
        return this.build(lllllllllllllIIlIIlIlIlllIIIlIII, (boolean)(NavMeshBuilder.lIIllllIlIIIIl[0] != 0));
    }
    
    private static boolean llIlllIlllIlIII(final int lllllllllllllIIlIIlIlIllIIIlllII) {
        return lllllllllllllIIlIIlIlIllIIIlllII < 0;
    }
    
    private static boolean llIlllIlllIIlII(final int lllllllllllllIIlIIlIlIllIIlIIIll, final int lllllllllllllIIlIIlIlIllIIlIIIlI) {
        return lllllllllllllIIlIIlIlIllIIlIIIll < lllllllllllllIIlIIlIlIllIIlIIIlI;
    }
    
    private void subsection(final TileBasedMap lllllllllllllIIlIIlIlIllIIllIIlI, final Space lllllllllllllIIlIIlIlIllIIllIIIl, final ArrayList lllllllllllllIIlIIlIlIllIIllIIII) {
        if (llIlllIlllIIlIl(this.clear(lllllllllllllIIlIIlIlIllIIllIIlI, lllllllllllllIIlIIlIlIllIIllIIIl) ? 1 : 0)) {
            final float lllllllllllllIIlIIlIlIllIIlllIIl = lllllllllllllIIlIIlIlIllIIllIIIl.getWidth() / 2.0f;
            final float lllllllllllllIIlIIlIlIllIIlllIII = lllllllllllllIIlIIlIlIllIIllIIIl.getHeight() / 2.0f;
            if (llIlllIlllIlIII(llIlllIlllIlIlI(lllllllllllllIIlIIlIlIllIIlllIIl, this.smallestSpace)) && llIlllIlllIlIII(llIlllIlllIlIlI(lllllllllllllIIlIIlIlIllIIlllIII, this.smallestSpace))) {
                return;
            }
            this.subsection(lllllllllllllIIlIIlIlIllIIllIIlI, new Space(lllllllllllllIIlIIlIlIllIIllIIIl.getX(), lllllllllllllIIlIIlIlIllIIllIIIl.getY(), lllllllllllllIIlIIlIlIllIIlllIIl, lllllllllllllIIlIIlIlIllIIlllIII), lllllllllllllIIlIIlIlIllIIllIIII);
            this.subsection(lllllllllllllIIlIIlIlIllIIllIIlI, new Space(lllllllllllllIIlIIlIlIllIIllIIIl.getX(), lllllllllllllIIlIIlIlIllIIllIIIl.getY() + lllllllllllllIIlIIlIlIllIIlllIII, lllllllllllllIIlIIlIlIllIIlllIIl, lllllllllllllIIlIIlIlIllIIlllIII), lllllllllllllIIlIIlIlIllIIllIIII);
            this.subsection(lllllllllllllIIlIIlIlIllIIllIIlI, new Space(lllllllllllllIIlIIlIlIllIIllIIIl.getX() + lllllllllllllIIlIIlIlIllIIlllIIl, lllllllllllllIIlIIlIlIllIIllIIIl.getY(), lllllllllllllIIlIIlIlIllIIlllIIl, lllllllllllllIIlIIlIlIllIIlllIII), lllllllllllllIIlIIlIlIllIIllIIII);
            this.subsection(lllllllllllllIIlIIlIlIllIIllIIlI, new Space(lllllllllllllIIlIIlIlIllIIllIIIl.getX() + lllllllllllllIIlIIlIlIllIIlllIIl, lllllllllllllIIlIIlIlIllIIllIIIl.getY() + lllllllllllllIIlIIlIlIllIIlllIII, lllllllllllllIIlIIlIlIllIIlllIIl, lllllllllllllIIlIIlIlIllIIlllIII), lllllllllllllIIlIIlIlIllIIllIIII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIlIllIIllIIII.add(lllllllllllllIIlIIlIlIllIIllIIIl);
            "".length();
        }
    }
    
    public int getSearchDistance() {
        return NavMeshBuilder.lIIllllIlIIIIl[1];
    }
    
    private static boolean llIlllIlllIIlIl(final int lllllllllllllIIlIIlIlIllIIIllllI) {
        return lllllllllllllIIlIIlIlIllIIIllllI == 0;
    }
    
    static {
        llIlllIlllIIIlI();
    }
    
    private static int llIlllIlllIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void llIlllIlllIIIlI() {
        (lIIllllIlIIIIl = new int[2])[0] = " ".length();
        NavMeshBuilder.lIIllllIlIIIIl[1] = ((0x93 ^ 0xA4) & ~(0x7E ^ 0x49));
    }
    
    public boolean clear(final TileBasedMap lllllllllllllIIlIIlIlIllIlIIIlIl, final Space lllllllllllllIIlIIlIlIllIlIIlIIl) {
        if (llIlllIlllIIIll(this.tileBased ? 1 : 0)) {
            return NavMeshBuilder.lIIllllIlIIIIl[0] != 0;
        }
        float lllllllllllllIIlIIlIlIllIlIIlIII = 0.0f;
        boolean lllllllllllllIIlIIlIlIllIlIIIlll = NavMeshBuilder.lIIllllIlIIIIl[1] != 0;
        while (llIlllIlllIlIII(llIlllIlllIIllI(lllllllllllllIIlIIlIlIllIlIIlIII, lllllllllllllIIlIIlIlIllIlIIlIIl.getWidth()))) {
            float lllllllllllllIIlIIlIlIllIlIIllIl = 0.0f;
            boolean lllllllllllllIIlIIlIlIllIlIIllII = NavMeshBuilder.lIIllllIlIIIIl[1] != 0;
            while (llIlllIlllIlIII(llIlllIlllIIllI(lllllllllllllIIlIIlIlIllIlIIllIl, lllllllllllllIIlIIlIlIllIlIIlIIl.getHeight()))) {
                this.sx = (int)(lllllllllllllIIlIIlIlIllIlIIlIIl.getX() + lllllllllllllIIlIIlIlIllIlIIlIII);
                this.sy = (int)(lllllllllllllIIlIIlIlIllIlIIlIIl.getY() + lllllllllllllIIlIIlIlIllIlIIllIl);
                if (llIlllIlllIIIll(lllllllllllllIIlIIlIlIllIlIIIlIl.blocked(this, this.sx, this.sy) ? 1 : 0)) {
                    return NavMeshBuilder.lIIllllIlIIIIl[1] != 0;
                }
                lllllllllllllIIlIIlIlIllIlIIllIl += 0.1f;
                if (!llIlllIlllIlIIl(llIlllIlllIIlll(lllllllllllllIIlIIlIlIllIlIIllIl, lllllllllllllIIlIIlIlIllIlIIlIIl.getHeight())) || !llIlllIlllIIlIl(lllllllllllllIIlIIlIlIllIlIIllII ? 1 : 0)) {
                    continue;
                }
                lllllllllllllIIlIIlIlIllIlIIllIl = lllllllllllllIIlIIlIlIllIlIIlIIl.getHeight();
                lllllllllllllIIlIIlIlIllIlIIllII = (NavMeshBuilder.lIIllllIlIIIIl[0] != 0);
                "".length();
                if ((0xC6 ^ 0xC2) <= ((0xB2 ^ 0x8E) & ~(0xA ^ 0x36))) {
                    return ((0x2 ^ 0x55) & ~(0xCC ^ 0x9B)) != 0x0;
                }
            }
            lllllllllllllIIlIIlIlIllIlIIlIII += 0.1f;
            if (llIlllIlllIlIIl(llIlllIlllIIlll(lllllllllllllIIlIIlIlIllIlIIlIII, lllllllllllllIIlIIlIlIllIlIIlIIl.getWidth())) && llIlllIlllIIlIl(lllllllllllllIIlIIlIlIllIlIIIlll ? 1 : 0)) {
                lllllllllllllIIlIIlIlIllIlIIlIII = lllllllllllllIIlIIlIlIllIlIIlIIl.getWidth();
                lllllllllllllIIlIIlIlIllIlIIIlll = (NavMeshBuilder.lIIllllIlIIIIl[0] != 0);
            }
            "".length();
            if (((0x3C ^ 0x67 ^ (0x10 ^ 0x5C)) & (43 + 102 + 5 + 29 ^ 143 + 131 - 151 + 41 ^ -" ".length())) != 0x0) {
                return ((59 + 142 - 37 + 17 ^ 133 + 124 - 120 + 35) & (107 + 14 + 50 + 4 ^ 142 + 30 - 21 + 31 ^ -" ".length())) != 0x0;
            }
        }
        return NavMeshBuilder.lIIllllIlIIIIl[0] != 0;
    }
    
    private static int llIlllIlllIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public Mover getMover() {
        return null;
    }
    
    public int getSourceY() {
        return this.sy;
    }
    
    private void linkSpaces(final ArrayList lllllllllllllIIlIIlIlIllIlIllIlI) {
        int lllllllllllllIIlIIlIlIllIlIlllII = NavMeshBuilder.lIIllllIlIIIIl[1];
        while (llIlllIlllIIlII(lllllllllllllIIlIIlIlIllIlIlllII, lllllllllllllIIlIIlIlIllIlIllIlI.size())) {
            final Space lllllllllllllIIlIIlIlIllIlIlllIl = lllllllllllllIIlIIlIlIllIlIllIlI.get(lllllllllllllIIlIIlIlIllIlIlllII);
            int lllllllllllllIIlIIlIlIllIlIllllI = lllllllllllllIIlIIlIlIllIlIlllII + NavMeshBuilder.lIIllllIlIIIIl[0];
            while (llIlllIlllIIlII(lllllllllllllIIlIIlIlIllIlIllllI, lllllllllllllIIlIIlIlIllIlIllIlI.size())) {
                final Space lllllllllllllIIlIIlIlIllIlIlllll = lllllllllllllIIlIIlIlIllIlIllIlI.get(lllllllllllllIIlIIlIlIllIlIllllI);
                if (llIlllIlllIIIll(lllllllllllllIIlIIlIlIllIlIlllIl.hasJoinedEdge(lllllllllllllIIlIIlIlIllIlIlllll) ? 1 : 0)) {
                    lllllllllllllIIlIIlIlIllIlIlllIl.link(lllllllllllllIIlIIlIlIllIlIlllll);
                    lllllllllllllIIlIIlIlIllIlIlllll.link(lllllllllllllIIlIIlIlIllIlIlllIl);
                }
                ++lllllllllllllIIlIIlIlIllIlIllllI;
                "".length();
                if (-" ".length() >= " ".length()) {
                    return;
                }
            }
            ++lllllllllllllIIlIIlIlIllIlIlllII;
            "".length();
            if (((0xA4 ^ 0xAC ^ (0xD6 ^ 0x80)) & (0x7B ^ 0x31 ^ (0xA4 ^ 0xB0) ^ -" ".length())) != 0x0) {
                return;
            }
        }
    }
}
