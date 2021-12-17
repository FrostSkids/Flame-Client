// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.navmesh;

import java.util.Collection;
import java.util.ArrayList;

public class NavMesh
{
    private static final /* synthetic */ int[] lIIlllIIlIllIl;
    private /* synthetic */ ArrayList spaces;
    
    private static boolean llIllIllIIIIIlI(final Object lllllllllllllIIlIlIIIIlIllllIlIl) {
        return lllllllllllllIIlIlIIIIlIllllIlIl != null;
    }
    
    public Space getSpace(final int lllllllllllllIIlIlIIIIllIllIlIII) {
        return this.spaces.get(lllllllllllllIIlIlIIIIllIllIlIII);
    }
    
    private static boolean llIllIllIIIIlII(final int lllllllllllllIIlIlIIIIlIlllIllll) {
        return lllllllllllllIIlIlIIIIlIlllIllll == 0;
    }
    
    public void addSpace(final Space lllllllllllllIIlIlIIIIllIllIIlII) {
        this.spaces.add(lllllllllllllIIlIlIIIIllIllIIlII);
        "".length();
    }
    
    private static boolean llIllIllIIIIIll(final Object lllllllllllllIIlIlIIIIlIllllIIll) {
        return lllllllllllllIIlIlIIIIlIllllIIll == null;
    }
    
    public int getSpaceCount() {
        return this.spaces.size();
    }
    
    private static void llIllIlIllllllI() {
        (lIIlllIIlIllIl = new int[3])[0] = ((0x85 ^ 0xB7) & ~(0xB5 ^ 0x87));
        NavMesh.lIIlllIIlIllIl[1] = " ".length();
        NavMesh.lIIlllIIlIllIl[2] = "  ".length();
    }
    
    public Space findSpace(final float lllllllllllllIIlIlIIIIllIlIlIllI, final float lllllllllllllIIlIlIIIIllIlIllIII) {
        int lllllllllllllIIlIlIIIIllIlIllIll = NavMesh.lIIlllIIlIllIl[0];
        while (llIllIlIlllllll(lllllllllllllIIlIlIIIIllIlIllIll, this.spaces.size())) {
            final Space lllllllllllllIIlIlIIIIllIlIlllII = this.getSpace(lllllllllllllIIlIlIIIIllIlIllIll);
            if (llIllIllIIIIIII(lllllllllllllIIlIlIIIIllIlIlllII.contains(lllllllllllllIIlIlIIIIllIlIlIllI, lllllllllllllIIlIlIIIIllIlIllIII) ? 1 : 0)) {
                return lllllllllllllIIlIlIIIIllIlIlllII;
            }
            ++lllllllllllllIIlIlIIIIllIlIllIll;
            "".length();
            if ("   ".length() >= (0x7E ^ 0x11 ^ (0x27 ^ 0x4C))) {
                return null;
            }
        }
        return null;
    }
    
    private static boolean llIllIlIlllllll(final int lllllllllllllIIlIlIIIIlIlllllIII, final int lllllllllllllIIlIlIIIIlIllllIlll) {
        return lllllllllllllIIlIlIIIIlIlllllIII < lllllllllllllIIlIlIIIIlIllllIlll;
    }
    
    public NavMesh(final ArrayList lllllllllllllIIlIlIIIIllIlllIIIl) {
        this.spaces = new ArrayList();
        this.spaces.addAll(lllllllllllllIIlIlIIIIllIlllIIIl);
        "".length();
    }
    
    private static boolean llIllIllIIIIIII(final int lllllllllllllIIlIlIIIIlIllllIIIl) {
        return lllllllllllllIIlIlIIIIlIllllIIIl != 0;
    }
    
    private boolean isClear(final float lllllllllllllIIlIlIIIIllIIIllIll, final float lllllllllllllIIlIlIIIIllIIlIIlII, final float lllllllllllllIIlIlIIIIllIIlIIIll, final float lllllllllllllIIlIlIIIIllIIIllIII, final float lllllllllllllIIlIlIIIIllIIIlIlll) {
        float lllllllllllllIIlIlIIIIllIIlIIIII = lllllllllllllIIlIlIIIIllIIlIIIll - lllllllllllllIIlIlIIIIllIIIllIll;
        float lllllllllllllIIlIlIIIIllIIIlllll = lllllllllllllIIlIlIIIIllIIIllIII - lllllllllllllIIlIlIIIIllIIlIIlII;
        final float lllllllllllllIIlIlIIIIllIIIllllI = (float)Math.sqrt(lllllllllllllIIlIlIIIIllIIlIIIII * lllllllllllllIIlIlIIIIllIIlIIIII + lllllllllllllIIlIlIIIIllIIIlllll * lllllllllllllIIlIlIIIIllIIIlllll);
        lllllllllllllIIlIlIIIIllIIlIIIII *= lllllllllllllIIlIlIIIIllIIIlIlll;
        lllllllllllllIIlIlIIIIllIIlIIIII /= lllllllllllllIIlIlIIIIllIIIllllI;
        lllllllllllllIIlIlIIIIllIIIlllll *= lllllllllllllIIlIlIIIIllIIIlIlll;
        lllllllllllllIIlIlIIIIllIIIlllll /= lllllllllllllIIlIlIIIIllIIIllllI;
        final int lllllllllllllIIlIlIIIIllIIIlllIl = (int)(lllllllllllllIIlIlIIIIllIIIllllI / lllllllllllllIIlIlIIIIllIIIlIlll);
        int lllllllllllllIIlIlIIIIllIIlIIlll = NavMesh.lIIlllIIlIllIl[0];
        while (llIllIlIlllllll(lllllllllllllIIlIlIIIIllIIlIIlll, lllllllllllllIIlIlIIIIllIIIlllIl)) {
            final float lllllllllllllIIlIlIIIIllIIlIlIIl = lllllllllllllIIlIlIIIIllIIIllIll + lllllllllllllIIlIlIIIIllIIlIIIII * lllllllllllllIIlIlIIIIllIIlIIlll;
            final float lllllllllllllIIlIlIIIIllIIlIlIII = lllllllllllllIIlIlIIIIllIIlIIlII + lllllllllllllIIlIlIIIIllIIIlllll * lllllllllllllIIlIlIIIIllIIlIIlll;
            if (llIllIllIIIIIll(this.findSpace(lllllllllllllIIlIlIIIIllIIlIlIIl, lllllllllllllIIlIlIIIIllIIlIlIII))) {
                return NavMesh.lIIlllIIlIllIl[0] != 0;
            }
            ++lllllllllllllIIlIlIIIIllIIlIIlll;
            "".length();
            if ("   ".length() == 0) {
                return ((0xE0 ^ 0xB6) & ~(0x4C ^ 0x1A)) != 0x0;
            }
        }
        return NavMesh.lIIlllIIlIllIl[1] != 0;
    }
    
    public NavMesh() {
        this.spaces = new ArrayList();
    }
    
    private void optimize(final NavPath lllllllllllllIIlIlIIIIllIIIIIIII) {
        int lllllllllllllIIlIlIIIIllIIIIIIlI = NavMesh.lIIlllIIlIllIl[0];
        while (llIllIlIlllllll(lllllllllllllIIlIlIIIIllIIIIIIlI, lllllllllllllIIlIlIIIIllIIIIIIII.length() - NavMesh.lIIlllIIlIllIl[2])) {
            final float lllllllllllllIIlIlIIIIllIIIIlIII = lllllllllllllIIlIlIIIIllIIIIIIII.getX(lllllllllllllIIlIlIIIIllIIIIIIlI);
            final float lllllllllllllIIlIlIIIIllIIIIIlll = lllllllllllllIIlIlIIIIllIIIIIIII.getY(lllllllllllllIIlIlIIIIllIIIIIIlI);
            final float lllllllllllllIIlIlIIIIllIIIIIllI = lllllllllllllIIlIlIIIIllIIIIIIII.getX(lllllllllllllIIlIlIIIIllIIIIIIlI + NavMesh.lIIlllIIlIllIl[2]);
            final float lllllllllllllIIlIlIIIIllIIIIIlIl = lllllllllllllIIlIlIIIIllIIIIIIII.getY(lllllllllllllIIlIlIIIIllIIIIIIlI + NavMesh.lIIlllIIlIllIl[2]);
            if (llIllIllIIIIIII(this.isClear(lllllllllllllIIlIlIIIIllIIIIlIII, lllllllllllllIIlIlIIIIllIIIIIlll, lllllllllllllIIlIlIIIIllIIIIIllI, lllllllllllllIIlIlIIIIllIIIIIlIl, 0.1f) ? 1 : 0)) {
                lllllllllllllIIlIlIIIIllIIIIIIII.remove(lllllllllllllIIlIlIIIIllIIIIIIlI + NavMesh.lIIlllIIlIllIl[1]);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else {
                ++lllllllllllllIIlIlIIIIllIIIIIIlI;
            }
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
    }
    
    private static int llIllIllIIIIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public NavPath findPath(final float lllllllllllllIIlIlIIIIllIIlllllI, final float lllllllllllllIIlIlIIIIllIIllllIl, final float lllllllllllllIIlIlIIIIllIIllllII, final float lllllllllllllIIlIlIIIIllIIlllIll, final boolean lllllllllllllIIlIlIIIIllIlIIIIll) {
        final Space lllllllllllllIIlIlIIIIllIlIIIIlI = this.findSpace(lllllllllllllIIlIlIIIIllIIlllllI, lllllllllllllIIlIlIIIIllIIllllIl);
        final Space lllllllllllllIIlIlIIIIllIlIIIIIl = this.findSpace(lllllllllllllIIlIlIIIIllIIllllII, lllllllllllllIIlIlIIIIllIIlllIll);
        if (!llIllIllIIIIIlI(lllllllllllllIIlIlIIIIllIlIIIIlI) || llIllIllIIIIIll(lllllllllllllIIlIlIIIIllIlIIIIIl)) {
            return null;
        }
        int lllllllllllllIIlIlIIIIllIlIIlIIl = NavMesh.lIIlllIIlIllIl[0];
        while (llIllIlIlllllll(lllllllllllllIIlIlIIIIllIlIIlIIl, this.spaces.size())) {
            this.spaces.get(lllllllllllllIIlIlIIIIllIlIIlIIl).clearCost();
            ++lllllllllllllIIlIlIIIIllIlIIlIIl;
            "".length();
            if (((0xF4 ^ 0xC0) & ~(0x8C ^ 0xB8)) > ((0x4C ^ 0x59) & ~(0x48 ^ 0x5D))) {
                return null;
            }
        }
        lllllllllllllIIlIlIIIIllIlIIIIIl.fill(lllllllllllllIIlIlIIIIllIlIIIIlI, lllllllllllllIIlIlIIIIllIIllllII, lllllllllllllIIlIlIIIIllIIlllIll, 0.0f);
        if (llIllIllIIIIlII(llIllIllIIIIIIl(lllllllllllllIIlIlIIIIllIlIIIIIl.getCost(), Float.MAX_VALUE))) {
            return null;
        }
        if (llIllIllIIIIlII(llIllIllIIIIIIl(lllllllllllllIIlIlIIIIllIlIIIIlI.getCost(), Float.MAX_VALUE))) {
            return null;
        }
        final NavPath lllllllllllllIIlIlIIIIllIlIIIIII = new NavPath();
        lllllllllllllIIlIlIIIIllIlIIIIII.push(new Link(lllllllllllllIIlIlIIIIllIIlllllI, lllllllllllllIIlIlIIIIllIIllllIl, null));
        if (llIllIllIIIIIII(lllllllllllllIIlIlIIIIllIlIIIIlI.pickLowestCost(lllllllllllllIIlIlIIIIllIlIIIIIl, lllllllllllllIIlIlIIIIllIlIIIIII) ? 1 : 0)) {
            lllllllllllllIIlIlIIIIllIlIIIIII.push(new Link(lllllllllllllIIlIlIIIIllIIllllII, lllllllllllllIIlIlIIIIllIIlllIll, null));
            if (llIllIllIIIIIII(lllllllllllllIIlIlIIIIllIlIIIIll ? 1 : 0)) {
                this.optimize(lllllllllllllIIlIlIIIIllIlIIIIII);
            }
            return lllllllllllllIIlIlIIIIllIlIIIIII;
        }
        return null;
    }
    
    static {
        llIllIlIllllllI();
    }
}
